package com.xxx.mapper;

import com.xxx.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UsersMapper {
    List<Users> getAll();
    Users getById(int id);
    List<Users> getByName(String name);
    int insert(Users users);
    List<Users> getByColumn(@Param("columnName") String columnName, @Param("columnValue") String columnValue);

    List<Users> getByCondition(Users user);
    int updateCondition(Users user);
    List<Users> getByAddress(List<String> list);
    int deleteById(int[] id);
    int insertBatch(List<Users> list);
    List<Users> getByLocation(Date begin,Date end);
    List<Users> getByMap(Map<String,Date> map);
    Map<String,Object> getReturnMap(int id);
    List<Map<String,Object>> getReturnMapMany();
}
