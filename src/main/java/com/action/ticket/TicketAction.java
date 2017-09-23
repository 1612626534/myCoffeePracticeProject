package com.action.ticket;

import com.bean.ticket.TicketPO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ticket.TicketService;
import com.utils.IOUtils;

import java.io.InputStream;
import java.util.List;

public class TicketAction extends ActionSupport implements ModelDriven<TicketPO> {
    private TicketPO ticket = new TicketPO();
    private TicketService ticketService;
    private InputStream inputStream;
    private String assigneeId;

    public String createTicket() {


        return SUCCESS;
    }

    public String getMyTicket() {
        List<TicketPO> myTicket = this.ticketService.getMyTicket(this.assigneeId);
        this.inputStream = IOUtils.convertObjectToStream(myTicket);
        return SUCCESS;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public TicketPO getModel() {
        return this.ticket;
    }

    public TicketService getTicketService() {
        return ticketService;
    }

    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }
}
