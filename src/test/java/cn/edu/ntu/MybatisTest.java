package cn.edu.ntu;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.ntu.entity.User;
import cn.edu.ntu.inerface.UserMapper;

public class MybatisTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test(){
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			User user = (User)sqlSession.selectOne("cn.edu.ntu.inerface.UserMapper.queryUserById", 93);
			
			System.out.println("userid : " + user.getUserId() + "userName : "+user.getUserName());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(inputStream!=null){
					inputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	@Test
	public void test2(){
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.queryUserById(93);
			
			System.out.println("userid : " + user.getUserId() + "userName : "+user.getUserName());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(inputStream!=null){
					inputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void test3(){
		
		User user = userMapper.queryUserById(93);
		
		System.out.println("userid : " + user.getUserId() + "userName : "+user.getUserName());
		
	}
	
}
