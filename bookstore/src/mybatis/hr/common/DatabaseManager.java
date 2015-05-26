package mybatis.hr.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//db매니저
public class DatabaseManager {
	private SqlSessionFactory sessionFactory;
	private static DatabaseManager instance = new DatabaseManager();
	private DatabaseManager(){
		InputStream is = null;
		try{
			is = Resources.getResourceAsStream("config.xml");
		}catch(IOException e){
			e.printStackTrace();
		}
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		sessionFactory = builder.build(is);
	}
	public SqlSessionFactory getSqlSessionFactory(){
		return sessionFactory;
	}
	
	public static DatabaseManager getInstance(){
		return instance;
	}
}

