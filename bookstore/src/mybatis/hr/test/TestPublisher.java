package mybatis.hr.test;

import java.util.List;

import mybatis.hr.dao.BookDAO;
import mybatis.hr.dao.PublisherDAO;
import mybatis.hr.vo.Publisher;

public class TestPublisher {
	public static void main(String[] args) {
		PublisherDAO publisherDAO = PublisherDAO.getInstance();
		Publisher publisher = new Publisher(0,"국민출판사","서울","010-111-1122", null);
		publisherDAO.insertPublisher(publisher);
		
		List<Publisher> pblist = publisherDAO.selectPublisherByAddress("서");
		System.out.println(pblist);
		
		pblist = publisherDAO.selectPublisherByNo(2);
		System.out.println(pblist);
		
		
	}
}
