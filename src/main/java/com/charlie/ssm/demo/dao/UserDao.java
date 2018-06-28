package com.charlie.ssm.demo.dao;

import com.charlie.ssm.demo.entity.UserEntity;

public interface UserDao {
    /**
     *
     * @mbg.generated 2018-06-28
     */
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbg.generated 2018-06-28
     */
    int insert(UserEntity record);

    /**
     *
     * @mbg.generated 2018-06-28
     */
    int insertSelective(UserEntity record);

    /**
     *
     * @mbg.generated 2018-06-28
     */
    UserEntity selectByPrimaryKey(Long userId);

    /**
     *
     * @mbg.generated 2018-06-28
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     *
     * @mbg.generated 2018-06-28
     */
    int updateByPrimaryKey(UserEntity record);
}