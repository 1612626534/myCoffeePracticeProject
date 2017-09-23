package com.service.ticket;

import com.bean.ticket.TicketPO;
import com.dao.ticket.ITicketManageDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class TicketServiceImpl implements TicketService{

    private SqlSessionFactory sqlSessionFactory;

    @Override
    public boolean createTicket(TicketPO ticketPO) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.getMapper(ITicketManageDAO.class).createTicket(ticketPO);
    }

    @Override
    public List<TicketPO> getMyTicket(String assigneeId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.getMapper(ITicketManageDAO.class).getAllMyTickets(assigneeId);
    }


    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
