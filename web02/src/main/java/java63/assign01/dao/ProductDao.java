/* 페이징 처리
 * => DBMS마다 처리하는 방법이 다르다.    
 */
package java63.assign01.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java63.assign01.domain.Product;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

	SqlSessionFactory sqlSessionFactory;

	public ProductDao() throws IOException {
		
		String resource = "java63/assign01/dao/mybatis-config.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
	}
  

public Product selectOne(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      return sqlSession
          .selectOne( 
              "java63.assign01.dao.ProductDao.selectOne",no);/* new Integer(no) */
    } finally {
      sqlSession.close();
    }
  }
  
  public void update(Product product) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.update("java63.assign01.dao.ProductDao.update", product);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }
  }
  
  public void delete(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.delete("java63.assign01.dao.ProductDao.delete", no);
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
              "java63.assign01.dao.ProductDao.selectList",
              paramMap);

    } finally {
      sqlSession.close();
    }
  }

  public void insert(Product product) {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      sqlSession.insert("java63.assign01.dao.ProductDao.insert", product);
      sqlSession.commit();

    } finally {
      sqlSession.close();
    }

  }
}


















