package com.hexaware.email;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class BugRequest {
	private Long id;
	@NotNull
	@NotBlank(message = "Email cannot be Blank.")
	private String emailAddress;
	private String owner;
//	@NotNull
	private String priority;
//	private STATUS status;
	private String ownerProject;//TODO need Project as an entity ??
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdDate = new Date();
	private Date completionDate;
	private String description;
	private boolean attachedfiles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getOwnerProject() {
		return ownerProject;
	}

	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAttachedfiles() {
		return attachedfiles;
	}

	public void setAttachedfiles(boolean attachedfiles) {
		this.attachedfiles = attachedfiles;
	}

	@Override
	public String toString() {
		return "BugRequest [emailAddress=" + emailAddress + ", owner=" + owner + ", priority=" + priority + ", status=" + ", ownerProject=" + ownerProject + ", createdDate=" + createdDate + ", completionDate="
				+ completionDate + ", description=" + description + ", attachedfiles=" + attachedfiles + "]";
	}

}
