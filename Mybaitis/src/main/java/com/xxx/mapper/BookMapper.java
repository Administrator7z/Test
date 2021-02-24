package com.xxx.mapper;

import com.xxx.pojo.Book;

import java.util.List;

public interface BookMapper {
    List<Book> getAll();
    List<Book> getAllByResultMap();
}
