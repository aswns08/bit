/* 페이징 처리
 * => DBMS마다 처리하는 방법이 다르다.    
 */
package java02.test20.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class MemberDao {
  SqlSessionFactory sqlSessionFactory;

  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }


  public MemberDao() {}

  public Member selectOne(String uid) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      return sqlSession
          .selectOne(
              "java02.test20.server.MemberDao.selectOne",uid);/* new Integer(no) */
    } finally {
      sqlSession.close();
    }
  }
  
  public void update(Member member) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.update("java02.test20.server.MemberDao.update", member);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }
  }
  
  public void delete(String uid) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.delete("java02.test20.server.MemberDao.delete", uid);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }
  }
  
  public List<Member> selectList(int pageNo, int pageSize) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    HashMap<String, Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", ((pageNo - 1) * pageSize));
    paramMap.put("pageSize", pageSize);

    try {
      return sqlSession
          .selectList(
              "java02.test20.server.MemberDao.selectList",
              paramMap);

    } finally {
      sqlSession.close();
    }
  }

  public void insert(Member member) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.insert("java02.test20.server.MemberDao.insert", member);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }

  }
}


















