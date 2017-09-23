package com.bean.ticket;

import com.bean.user.UserPO;
import com.enumeration.TicketStatusEnum;

import java.io.Serializable;
import java.util.Date;

public class TicketPO implements Serializable{

    private int id;
    private String title;
    private UserPO assignee;
    private UserPO creator;
    private TicketStatusEnum status;
    private String description;
    private Date createdDate;
    private Date modifiedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserPO getAssignee() {
        return assignee;
    }

    public void setAssignee(UserPO assignee) {
        this.assignee = assignee;
    }

    public UserPO getCreator() {
        return creator;
    }

    public void setCreator(UserPO creator) {
        this.creator = creator;
    }

    public TicketStatusEnum getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = TicketStatusEnum.getTicketStatusEnumByCode(status);
    }

    public void setStatus(TicketStatusEnum status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "TicketPO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", assignee=" + assignee +
                ", creator=" + creator +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
