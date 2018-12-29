package com.cat.commons.base.service.Impl;

import com.cat.commons.base.dao.IBaseDao;
import com.cat.commons.base.service.IBaseService;

public abstract  class IBaseServiceImpl<T> implements IBaseService<T> {

    public abstract IBaseDao<T> getBase();

    public int deleteByPrimaryKey(Integer id) {
        return getBase().deleteByPrimaryKey(id);
    }

    public int insert(T record) {
        return getBase().insert(record);
    }

    public int insertSelective(T record) {
        return getBase().insertSelective(record);
    }

    public T selectByPrimaryKey(Integer id) {
        return getBase().selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T record) {
        return getBase().updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return getBase().updateByPrimaryKey(record);
    }
}
