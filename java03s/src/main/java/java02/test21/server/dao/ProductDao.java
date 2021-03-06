/* 페이징 처리
 * => DBMS마다 처리하는 방법이 다르다.    
 */
package java02.test21.server.dao;

import java.util.HashMap;
import java.util.List;
import java02.test21.server.domain.Product;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	@Autowired
	SqlSessionFactory sqlSessionFactory;


  public ProductDao() {}

  public Product selectOne(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      return sqlSession
          .selectOne(
              "java02.test21.server.ProductDao.selectOne",no);/* new Integer(no) */
    } finally {
      sqlSession.close();
    }
  }
  
  public void update(Product product) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.update("java02.test21.server.ProductDao.update", product);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }
  }
  
  public void delete(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.delete("java02.test21.server.ProductDao.delete", no);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }
  }
  
  public List<Product> selectList(int pageNo, int pageSize) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    HashMap<String, Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", ((pageNo - 1) * pageSize));
    paramMap.put("pageSize", pageSize);

    try {
      return sqlSession
          .selectList(
              "java02.test21.server.ProductDao.selectList",
              paramMap);

    } finally {
      sqlSession.close();
    }
  }

  public void insert(Product product) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.insert("java02.test21.server.ProductDao.insert", product);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }

  }
}


















