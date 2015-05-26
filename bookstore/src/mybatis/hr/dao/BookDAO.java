package mybatis.hr.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mybatis.hr.common.DatabaseManager;
import mybatis.hr.vo.Book;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BookDAO {
	private static BookDAO instance = new BookDAO();
	private SqlSessionFactory sessionFactory;
	private String namespace = "mybatis.hr.dao.book.";
	private BookDAO() {
		sessionFactory = DatabaseManager.getInstance().getSqlSessionFactory();
	}
	
	public static BookDAO getInstance(){
		return instance;
	}
	
	public int insertBook(Book book){
		SqlSession session = sessionFactory.openSession();
		try{
			int cnt = session.insert("mybatis.hr.dao.book.insertBook", book);
			session.commit();
			return cnt;
		}finally{
			session.close();//DB관련 자원 반납.
		}
	}
	
	public List<Book> selectBookListByDate(int startdate, int enddate){
		SqlSession session = sessionFactory.openSession();
		try{
			HashMap map = new HashMap<String,String>();
			map.put("startDate", startdate+"");
			map.put("endDate", enddate+"");
			
			return session.selectList(namespace+"selectBookListByDate", map);
		}finally{
			session.close();//DB관련 자원 반납.
		}
	}
	
	public List<Book> selectBookListByIsbn(String isbn){
		SqlSession session = sessionFactory.openSession();
		try{
			return session.selectList(namespace+"selectBookListByIsbn", isbn);
		}finally{
			session.close();
		}
	}
}

