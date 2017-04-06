package com.library.service.impl;

import com.library.dao.UserEntityMapper;
import com.library.model.UserEntity;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueyuan
 * @dater 2016-11-23 0023.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserEntityMapper userEntityMapper;

    public int isUser(UserEntity entity) {

        UserEntity userEntity = userEntityMapper.selectById(entity.getId());
        if (userEntity != null) {
            return 1;
        }
        return 0;
    }
}
