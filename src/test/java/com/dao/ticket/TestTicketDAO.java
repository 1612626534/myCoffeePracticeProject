package com.dao.ticket;

import com.bean.ticket.TicketPO;
import com.bean.user.UserPO;
import com.dao.TestBasicDAO;
import com.dao.user.IUserDAO;
import com.enumeration.TicketStatusEnum;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

public class TestTicketDAO extends TestBasicDAO {

    @Test
    public void testCreateTicket() {
        TicketPO ticketPO = new TicketPO();
        ticketPO.setTitle("Java 1.8 knowledge explore");
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();
        UserPO assignee = sqlSession.getMapper(IUserDAO.class).getUserByEmail("caesar@dev.local.xx");
        ticketPO.setAssignee(assignee);
        ticketPO.setCreator(assignee);
        ticketPO.setDescription("this ticket is the basic course for java developer.");
        ticketPO.setCreatedDate(new Date());
        ticketPO.setModifiedDate(new Date());
        ticketPO.setStatus(TicketStatusEnum.TO_DO);

        sqlSession.getMapper(ITicketManageDAO.class).createTicket(ticketPO);
    }

    public List<TicketPO> testGetMyTicket() {
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();
        UserPO assignee = sqlSession.getMapper(IUserDAO.class).getUserByEmail("caesar@dev.local.xx");
        Assert.assertNotNull(assignee);
        return sqlSession.getMapper(ITicketManageDAO.class).getAllMyTickets(assignee.getId());
    }

    @Test
    public void testDeleteTicket() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        sqlSession.getMapper(ITicketManageDAO.class).deleteTicket(1001);
    }

    @Test
    public void testUpdateTicket() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        List<TicketPO> tickets = this.testGetMyTicket();
        if (!CollectionUtils.isEmpty(tickets)) {
            TicketPO ticket = tickets.get(0);
            ticket.setModifiedDate(new Date());
            sqlSession.getMapper(ITicketManageDAO.class).updateTicket(ticket);
        }
    }
}
