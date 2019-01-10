package com.cat.v5.mapper;

import com.cat.commons.base.dao.IBaseDao;
import com.cat.v5.entity.TProduct;

import java.util.List;
public interface TProductMapper extends IBaseDao {

    List<TProduct> getAllProduct();
}