package com.dao.ticket;

import com.bean.ticket.TicketPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITicketManageDAO {

    List<TicketPO> getAllMyTickets(@Param("assigneeId")String assignId);

    boolean createTicket(@Param("ticket") TicketPO ticket);

    boolean deleteTicket(@Param("ticketId") int ticketId);

    boolean updateTicket(@Param("ticket") TicketPO ticket);
}
