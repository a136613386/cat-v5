package com.cat.commons.base.dao;

public interface IBaseDao <T>{
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T  record);

    T  selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T  record);

    int updateByPrimaryKey(T  record);

}
