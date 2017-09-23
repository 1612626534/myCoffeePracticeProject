package com.service.ticket;

import com.bean.ticket.TicketPO;

import java.util.List;

public interface TicketService {

    boolean createTicket(TicketPO ticketPO);

    List<TicketPO> getMyTicket(String assigneeId);
}
