/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.omg.sysml.adapter.UsageAdapter;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.FramedConcernMembership;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;

public class UsageUtil {
	
	private UsageUtil() {
	}

	protected static UsageAdapter getUsageAdapter(Usage usage) {
		return (UsageAdapter)ElementUtil.getElementAdapter(usage);
	}
	
	// References
	
	public static boolean isReference(Usage usage, boolean isComposite) {
		return usage.getOwningFeatureMembership() == null || usage.getDirection() != null || usage.isEnd() || !isComposite;
	}
	
	// Variants
	
	public static boolean isVariant(Usage usage) {
		return usage.getOwningMembership() instanceof VariantMembership;
	}

	public static Definition getOwningVariationDefinitionFor(Usage usage) {
		Namespace owner = usage.getOwningNamespace();
		return owner instanceof Definition && ((Definition)owner).isVariation()? ((Definition)owner): null;
	}

	public static Usage getOwningVariationUsageFor(Usage usage) {
		Namespace owner = usage.getOwningNamespace();
		return owner instanceof Usage && ((Usage)owner).isVariation()? ((Usage)owner): null;
	}

	public static VariantMembership getOwningVariantMembershipFor(Usage usage) {
		Membership owningMembership = usage.getOwningMembership();
		return owningMembership instanceof VariantMembership? (VariantMembership)owningMembership: null;
	}

	// Subjects

	public static boolean isSubjectParameter(Usage usage) {
		return usage.getOwningFeatureMembership() instanceof SubjectMembership;
	}

	public static boolean hasRelevantSubjectParameter(Usage usage) {
		return getUsageAdapter(usage).hasRelevantSubjectParameter();
	}

	public static FeatureValue getSatisfyingFeatureValueOf(SatisfyRequirementUsage usage) {
		Feature subject = usage.getSubjectParameter();
		return subject == null? null:  FeatureUtil.getValuationFor(subject);
	}
	
	// Actors
	
	public static boolean isActorParameter(Usage usage) {
		return usage.getOwningFeatureMembership() instanceof ActorMembership;
	}

	// Stakeholders
	
	public static boolean isStakeholderParameter(Usage usage) {
		return usage.getOwningFeatureMembership() instanceof StakeholderMembership;
	}	
	
	// Send and Accept Actions
	
	public static Feature getItemsParameterOf(ActionUsage action) {
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(action);
		return parameters.isEmpty()? null: parameters.get(0);
	}

	public static Feature getReceiverParameterOf(ActionUsage action) {
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(action);
		return parameters.size() < 2? null: parameters.get(1);
	}
	
	// Constraints
	
	public static boolean isAssumptionConstraint(ConstraintUsage constraint) {
		return getRequirementConstraintKindOf(constraint) == RequirementConstraintKind.ASSUMPTION;
	}
	
	public static boolean isRequirementConstraint(ConstraintUsage constraint) {
		return getRequirementConstraintKindOf(constraint) == RequirementConstraintKind.REQUIREMENT;
	}
	
	public static RequirementConstraintKind getRequirementConstraintKindOf(ConstraintUsage constraint) {
		FeatureMembership owningMembership = constraint.getOwningFeatureMembership();
		return owningMembership instanceof RequirementConstraintMembership? 
				((RequirementConstraintMembership)owningMembership).getKind(): null;
	}
	
	// Requirements
	
	public static boolean isSubrequirement(RequirementUsage requirement) {
		Type owningType = requirement.getOwningType();
		return !isAssumptionConstraint(requirement) &&
			   (owningType instanceof RequirementDefinition || 
			    owningType instanceof RequirementUsage);
	}

	public static boolean isObjective(RequirementUsage requirement) {
		return requirement.getOwningFeatureMembership() instanceof ObjectiveMembership;
	}	

	public static boolean isVerifiedRequirement(RequirementUsage requirement) {
		FeatureMembership membership = requirement.getOwningFeatureMembership();
		return membership instanceof RequirementVerificationMembership &&
			   isLegalVerification((RequirementVerificationMembership)membership);
	}
	
	public static boolean isLegalVerification(RequirementVerificationMembership membership) {
		Type owningType = membership.getOwningType();
		if (owningType instanceof RequirementUsage && isObjective((RequirementUsage)owningType)) {
			owningType = ((RequirementUsage)owningType).getOwningType();
			return owningType instanceof VerificationCaseDefinition || 
				   owningType instanceof VerificationCaseUsage;
		} else {
			return false;
		}
	}
	
	public static boolean isAddressedConcern(ConcernUsage concern) {
		return concern.getOwningFeatureMembership() instanceof FramedConcernMembership;
	}
	
	// States
	
	public static boolean isParallelState(Type type) {
		return type instanceof StateDefinition && ((StateDefinition)type).isParallel() ||
			   type instanceof StateUsage && ((StateUsage)type).isParallel();
	}
	
	public static boolean isNonParallelState(Type type) {
		return type instanceof StateDefinition && !((StateDefinition)type).isParallel() ||
			   type instanceof StateUsage && !((StateUsage)type).isParallel();
	}
	
	public static ActionUsage getEntryActionOf(Type type) {
		return type instanceof StateDefinition? ((StateDefinition)type).getEntryAction():
			   type instanceof StateUsage? ((StateUsage)type).getEntryAction():
			   null;
	}
	
	public static List<StateSubactionMembership> getStateSubactionMembershipsOf(Type type, StateSubactionKind kind) {
		return type.getFeatureMembership().stream().
				filter(StateSubactionMembership.class::isInstance).
				map(StateSubactionMembership.class::cast).
				filter(m->m.getKind() == kind).
				collect(Collectors.toList());
				
	}
	
	public static boolean hasInitialTransition(Type type) {
		Feature entryAction = getEntryActionOf(type);
		return entryAction != null &&
			   type.getOwnedFeature().stream().
				map(f->f instanceof Succession? 
						((Succession)f).getSourceFeature(): 
					   f instanceof TransitionUsage? 
						((TransitionUsage)f).getSource(): null).
				anyMatch(source->source == entryAction);
	}
	
	public static boolean hasIncomingTransitions(StateUsage state) {
		return hasIncomingTransitions(state, state.getOwningType());
	}
	
	private static boolean hasIncomingTransitions(StateUsage state, Type container) {
		return container instanceof StateDefinition &&
						hasIncomingTransitionsIn(container, state) ||
			   container instanceof StateUsage &&
					   	(hasIncomingTransitionsIn(container, state) ||
					     hasIncomingTransitions(state, ((StateUsage)container).getOwningType()));

	}
	
	private static boolean hasIncomingTransitionsIn(Type container, StateUsage state) {
		return container.getOwnedFeature().stream().
				map(UsageUtil::getTransitionTargetOf).
				anyMatch(target->target == state);
	}
	
	// Transitions
	
	public static Feature getTransitionSourceOf(Feature transition) {
		return transition instanceof TransitionUsage? ((TransitionUsage)transition).getSource():
			   transition instanceof Succession? ((Succession)transition).getSourceFeature():
			   null;
	}
	
	public static Feature getTransitionTargetOf(Feature transition) {
		return transition instanceof TransitionUsage? ((TransitionUsage)transition).getTarget():
			   transition instanceof Succession? ((Succession)transition).getTargetFeature().stream().findFirst().orElse(null):
			   null;
	}
	
	public static Stream<Feature> getTransitionFeaturesOf(TransitionUsage usage, TransitionFeatureKind kind) {
		return usage.getOwnedFeatureMembership().stream().
				filter(mem->(mem instanceof TransitionFeatureMembership) && ((TransitionFeatureMembership)mem).getKind() == kind).
				map(mem->mem.getMemberFeature()).
				filter(f->f != null);
	}
	
	public static Feature getPayloadParameterOf(TransitionUsage transition) {
		return TypeUtil.getFeaturesByMembershipIn(transition, ParameterMembership.class).skip(1).findFirst().orElse(null);
	}
	
	public static Feature getAccepterPayloadParameterOf(TransitionUsage transition) {
		List<AcceptActionUsage> triggers = transition.getTriggerAction();
		if (triggers.isEmpty()) {
			return null;
		} else {
			AcceptActionUsage accepter = triggers.get(0);
			return TypeUtil.getOwnedParametersOf(accepter).stream().findFirst().orElse(null);
		}
	}
	
	public static Feature getTransitionLinkFeatureOf(TransitionUsage transition) {
		return transition.getOwnedFeatureMembership().stream().
				filter(m->!(m instanceof TransitionFeatureMembership || m instanceof ParameterMembership)).
				map(FeatureMembership::getMemberFeature).
				findFirst().orElse(null);
	}
	
	// Views
	
	public static RenderingUsage getViewRenderingOf(Type view) {
		return view.getOwnedMembership().stream().
				filter(ViewRenderingMembership.class::isInstance).
				map(ViewRenderingMembership.class::cast).
				map(ViewRenderingMembership::getReferencedRendering).
				findFirst().
				orElse(null);
	}
		
}
