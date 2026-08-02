package com.cms.investigate_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cases")
public class Case {

    @Id
    private String caseId;

    private String title;
    private String complainant;
    private String phone;
    private String priority;
    private String status;
    private String description;

    public Case() {
    }

    public Case(String caseId, String title, String complainant,
            String phone, String priority,
            String status, String description) {

        this.caseId = caseId;
        this.title = title;
        this.complainant = complainant;
        this.phone = phone;
        this.priority = priority;
        this.status = status;
        this.description = description;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComplainant() {
        return complainant;
    }

    public void setComplainant(String complainant) {
        this.complainant = complainant;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
