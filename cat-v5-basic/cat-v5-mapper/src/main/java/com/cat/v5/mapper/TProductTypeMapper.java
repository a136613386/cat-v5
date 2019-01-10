package com.cat.v5.mapper;

import com.cat.commons.base.dao.IBaseDao;
import com.cat.v5.entity.TProductType;

import java.util.List;

public interface TProductTypeMapper extends IBaseDao{

    List<TProductType> list();
}