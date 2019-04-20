package com.wind.auth.authorization.dao;

import com.wind.auth.core.base.BaseDao;
import com.wind.auth.core.base.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Document(collection="user")
public class UserDao extends BaseDao<User> {
}