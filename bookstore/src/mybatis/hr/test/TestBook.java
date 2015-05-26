package mybatis.hr.test;

import java.util.Date;
import java.util.List;

import mybatis.hr.dao.BookDAO;
import mybatis.hr.dao.PublisherDAO;
import mybatis.hr.vo.Book;
import mybatis.hr.vo.Publisher;

public class TestBook {
	public static void main(String[] args) {
		BookDAO bookdao = BookDAO.getInstance();
//		Book book = new Book("ADd","자바으ㅣ정석","윤석",11, 11,new Date(),3);
//		bookdao.insertBook(book);
//		System.out.println(book);
//		List list = bookdao.selectBookListByIsbn("ADd");
//		System.out.println(list);
		List list = bookdao.selectBookListByDate(20150101, 20160101);
		System.out.println(list);
	}
}
