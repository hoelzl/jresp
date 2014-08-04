package org.cmg.resp.examples.disaster.rescuer.policy;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.ActionID;
import org.cmg.resp.policy.StructName;
import org.cmg.resp.policy.facpl.IFacplElement;
import org.cmg.resp.policy.facpl.RuleEffect;
import org.cmg.resp.policy.facpl.algorithm.DenyUnlessPermit;
import org.cmg.resp.policy.facpl.algorithm.PermitOverrides;
import org.cmg.resp.policy.facpl.elements.Policy;
import org.cmg.resp.policy.facpl.elements.Rule;
import org.cmg.resp.policy.facpl.elements.ScelObligationExpression;
import org.cmg.resp.policy.facpl.elements.TargetConnector;
import org.cmg.resp.policy.facpl.elements.TargetExpression;
import org.cmg.resp.policy.facpl.elements.util.TargetTreeRepresentation;
import org.cmg.resp.policy.facpl.function.Equal;
import org.cmg.resp.policy.facpl.function.PatternMatch;
import org.cmg.resp.topology.Self;

public class Explorer extends Agent {

	private int robotId;
	private Scenario scenario;

	public Explorer(int robotId, Scenario scenario2) {
		super("Explorer");
		this.robotId = robotId;
		this.scenario = scenario2;
	}

	@Override
	protected void doRun() throws IOException, InterruptedException {
		boolean found = false;
		while (!found) {
			Tuple t = query(new Template(new ActualTemplateField(
					"VICTIM_PERCEIVED"), new ActualTemplateField(true)),
					Self.SELF);
			found = t.getElementAt(Boolean.class, 1);
			if (found) {
			
//				// TODO robot must stop by using POLICY !!!
//				put(new Tuple("stop"), Self.SELF);
//				
				// Pass to RESCUER state
				put(new Tuple("role", Scenario.RESCUER), Self.SELF);

				System.out.print("Robot " + robotId + " has become RESCUER\n");

				found();
				put(new Tuple("rescue", scenario.getPosition(robotId).getX(),
						scenario.getPosition(robotId).getY()), Self.SELF);
			}
		}
		System.out.println("Fine Explorer");
	}

	private void found() throws InterruptedException, IOException {
		put(new Tuple("victim", scenario.getPosition(robotId).getX(), scenario
				.getPosition(robotId).getY(),
				scenario.getRescuersSwarmSize() - 1), Self.SELF);
	}

	/**
	 * Return the policy in force in the explorer state
	 * 
	 * @return
	 */
	public IFacplElement getPolicyExplorer() {
		return new Policy_Explorer();
	}

	/**
	 * Return the policy in force in the rescuer state
	 * 
	 * @return
	 */

	public IFacplElement getPolicyRescuer() {
		return new Policy_Rescuer();
	}
	
	private class Policy_Explorer extends Policy {

		public Policy_Explorer() {

			addCombiningAlg(PermitOverrides.class);

			addTarget(null);

			addRule(new Rule1());

			addObligation(null);
		}

		class Rule1 extends Rule {

			Rule1() {
				addEffect(RuleEffect.PERMIT);

				addTarget(new TargetTreeRepresentation(TargetConnector.AND,
						new TargetTreeRepresentation(new TargetExpression(
								Equal.class, ActionID.QRY, new StructName(
										"action", "action-id"))),
						new TargetTreeRepresentation(new TargetExpression(
								PatternMatch.class, new Template(
										new ActualTemplateField(
												"VICTIM_PERCEIVED"),
										new ActualTemplateField(true)),
								new StructName("action", "item")))));

				addConditionExpression(null);

				addObligation(new ScelObligationExpression(RuleEffect.PERMIT,
						ActionID.PUT, new Tuple("stop")));
			}
		}

	}
	
	private class Policy_Rescuer extends Policy {

		public Policy_Rescuer() {

			addCombiningAlg(PermitOverrides.class);

			addTarget(null);

			addRule(new RuleAllPermit());

			addObligation(null);

		}

		
		class RuleAllPermit extends Rule{
			
			RuleAllPermit(){
			
				addEffect(RuleEffect.PERMIT);
				
			}
		}

	}
	
	
}
