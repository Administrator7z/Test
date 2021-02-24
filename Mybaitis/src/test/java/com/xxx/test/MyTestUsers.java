package com.xxx.test;

import com.xxx.mapper.UsersMapper;
import com.xxx.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyTestUsers {
    SqlSession session;

    @Before
    public void openSession() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        session = factory.openSession();
    }
    @After
    public void closeSession(){
        session.close();
    }
    @Test
    public void  getAll(){
        UsersMapper  mapper = session.getMapper(UsersMapper.class);
        List<Users> list = mapper.getAll();
        for (Users users : list) {
            System.out.println(users);
        }

    }
    @Test
    public void  getById(){
        UsersMapper  mapper = session.getMapper(UsersMapper.class);
        Users user = mapper.getById(1);
        System.out.println(user);


    }
    @Test
    public void getByName(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Users> list = mapper.getByName("小");
        for (Users users : list) {
            System.out.println(users);

        }
    }
    @Test
    public void insert() throws ParseException {
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user = new Users("张三",new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-10"),"男","北京");
        int num = mapper.insert(user);
        session.commit();
        System.out.println(num);
        System.out.println(user.getId());

    }
    @Test
    public void getByColumn(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Users> list = mapper.getByColumn("address", "市");
        for (Users byColumn : list) {
            System.out.println(byColumn);
        }
    }
    @Test
    public void getByCondition(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user = new Users();
        user.setAddress("市");
        List<Users> list = mapper.getByCondition(user);
        for (Users users : list) {
            System.out.println(users);
        }
    }
    @Test
    public void updateCondition(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user = new Users();
        user.setId(28);
        user.setUsername("张五");
        int num = mapper.updateCondition(user);
        session.commit();
        System.out.println(num);
    }
    @Test
    public void getByAddress(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<String>  list = new ArrayList<>();
        list.add("辽宁");
        list.add("北京");
        List<Users> byAddress = mapper.getByAddress(list);
        for (Users address : byAddress) {
            System.out.println(address);
        }

    }
    @Test
    public void deleteById(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        int [] array = {34};
        int num = mapper.deleteById(array);
        session.commit();
        System.out.println(num);
    }
    @Test
    public void insertBatch() throws ParseException {
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Users> list = new ArrayList<>();
        Users user1= new Users("王五",new SimpleDateFormat("yyyy-MM-dd").parse("2021-1-1"),"男","北京");
        Users user2= new Users("王六",new SimpleDateFormat("yyyy-MM-dd").parse("2021-1-2"),"男","北京");
        Users user3= new Users("王七",new SimpleDateFormat("yyyy-MM-dd").parse("2021-1-3"),"男","北京");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        int num = mapper.insertBatch(list);
        System.out.println(num);
    }
    @Test
    public void getByLocation() throws ParseException {
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Users> list = mapper.getByLocation(new SimpleDateFormat("yyyy-MM-dd").parse("2020-1-12"), new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-12"));
        for (Users users : list) {
            System.out.println(users);
        }
    }
    @Test
    public void getByMap() throws ParseException {
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Map<String,Date> map = new HashMap<>();
        map.put("birbegin",new SimpleDateFormat("yyyy-MM-dd").parse("2020-1-1"));
        map.put("birend",new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-10"));
        List<Users> list = mapper.getByMap(map);
        list.forEach(users -> System.out.println(users));
    }
    @Test
    public void getReturnMap(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Map<String, Object> returnMap = mapper.getReturnMap(1);
        System.out.println(returnMap);
    }
    @Test
    public void ReturnMapMany(){
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Map<String, Object>> list = mapper.getReturnMapMany();
        list.forEach(map -> System.out.println(map));

    }
}
