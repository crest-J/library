package com.library.dao;

import com.library.model.User;
import org.springframework.stereotype.Repository;


@Repository
public abstract class UserMapper {
    public abstract int deleteByPrimaryKey(Integer id);

    public abstract int insert(User record);

    public abstract int insertSelective(User record);

    public abstract User selectByPrimaryKey(Integer id);

    public abstract int updateByPrimaryKeySelective(User record);

    public abstract int updateByPrimaryKey(User record);
}