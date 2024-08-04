package integration.core.domain.messaging;

import integration.core.domain.BaseIntegrationDomain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 * Filtered messages.
 * 
 * @author Brendan Douglas
 */
@Entity
@Table(name = "message_flow_step_filtered")
public class MessageFlowStepFiltered extends BaseIntegrationDomain {
	private MessageFlowStep messageFlowStep;
	private String description;
	private String filterName;

	
	@ManyToOne
	@JoinColumn(name = "message_flow_step_id")
	public MessageFlowStep getMessageFlowStep() {
		return messageFlowStep;
	}

	
	public void setMessageFlowStep(MessageFlowStep messageFlowStep) {
		this.messageFlowStep = messageFlowStep;
	}

	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name = "filter_name")
	public String getFilterName() {
		return filterName;
	}


	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
}
