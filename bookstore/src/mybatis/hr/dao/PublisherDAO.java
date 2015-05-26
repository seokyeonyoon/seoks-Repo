package mybatis.hr.dao;

import java.util.List;
import java.util.Map;

import mybatis.hr.common.DatabaseManager;
import mybatis.hr.vo.Publisher;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PublisherDAO {
	private static PublisherDAO instance = new PublisherDAO();
	private SqlSessionFactory sessionFactory;
	private String namespace = "mybatis.hr.dao.publisher.";
	private PublisherDAO() {
		sessionFactory = DatabaseManager.getInstance().getSqlSessionFactory();
	}
	
	public static PublisherDAO getInstance(){
		return instance;
	}
	
	public int insertPublisher(Publisher publisher){
		SqlSession session = sessionFactory.openSession(true);
		try{
			return session.insert(namespace+"insertPublisherSequence", publisher);
		}finally{
			session.close();
		}
	}
	
	public int updatePublisher(Publisher publisher){
		SqlSession session = sessionFactory.openSession(true);
		try{
			return session.update(namespace+"updatePublisher", publisher);
		}finally{
			session.close();
		}
	}
	
	public int deletePublisherByNo(int number){
		SqlSession session = sessionFactory.openSession(true);
		try{
			return session.delete(namespace+"deletePublisher", number);
		}finally{
			session.close();
		}
	}
	
	
	public List<Publisher> selectPublisherList(){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(namespace+"selectPublisherList");
		}finally{
			session.close();
		}
	}
	
	public List<Publisher> selectPublisherByAddress(String address){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(namespace+"selectPublisherByAddress", address);
		}finally{
			session.close();
		}
	}
	
	public List<Publisher> selectPublisherByNo(int num){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(namespace+"selectPublisherByNo", num);
		}finally{
			session.close();
		}
	}
}
