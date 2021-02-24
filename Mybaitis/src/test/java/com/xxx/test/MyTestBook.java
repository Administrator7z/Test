package com.xxx.test;

import com.xxx.mapper.BookMapper;
import com.xxx.mapper.CustomerMapper;
import com.xxx.mapper.OrdersMapper;
import com.xxx.pojo.Book;
import com.xxx.pojo.Customer;
import com.xxx.pojo.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTestBook {
    SqlSession session;
    BookMapper bookMapper;
    CustomerMapper customerMapper;
    OrdersMapper ordersMapper;
    @Before
    public void openSession() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        session = factory.openSession();
        bookMapper = session.getMapper(BookMapper.class);
        customerMapper = session.getMapper(CustomerMapper.class);
        ordersMapper = session.getMapper(OrdersMapper.class);

    }
    @After
    public void closeSeesion(){
        session.close();
    }
    @Test
    public void getAll(){
        List<Book> list = bookMapper.getAll();
        list.forEach(all -> System.out.println(all));

    }
    @Test
    public void getByResultMap(){
        List<Book> list = bookMapper.getAllByResultMap();
        list.forEach(all -> System.out.println(all));
    }
    @Test
    public void getById(){
        Customer byId = customerMapper.getById(1);
        System.out.println(byId);
    }
    @Test
    public void getById1(){
        Orders byId = ordersMapper.getById(11);
        System.out.println(byId);
    }
}
