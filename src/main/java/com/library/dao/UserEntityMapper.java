package com.library.dao;

import com.library.model.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author xueyuan
 * @dater 2016-11-23 0023.
 */

@Repository
public interface UserEntityMapper {

    UserEntity selectById(int id);

    int insertUser(UserEntity entity);
}
