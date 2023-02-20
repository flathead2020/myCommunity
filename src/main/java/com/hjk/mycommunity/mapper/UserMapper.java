package com.hjk.mycommunity.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * userMapper
 *
 * @author 20886 Email:
 * @since 2023/02/20 22:49
 */
@Mapper
public interface UserMapper {
    public void insert(User user);
}
