package leave;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class LeaveActionTest {

    public  void mybatisConnectionTest() throws IOException {
        SqlSession sqlSession = getSqlSession(true);
        System.out.println(sqlSession);
    }

    public SqlSession getSqlSession(boolean autoCommit) throws IOException {
        String resourceStr = "applicationContext-orm.xml";
        InputStream resourceStream = Resources.getResourceAsStream(resourceStr);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);
        return sqlSessionFactory.openSession(autoCommit);
    }
}
