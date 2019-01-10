package com.v5.catv5productservices.impl;

import com.cat.commons.base.dao.IBaseDao;
import com.cat.commons.base.service.IBaseService;
import com.cat.commons.base.service.Impl.IBaseServiceImpl;
import com.cat.v5.entity.TProductType;
import com.cat.v5.mapper.TProductTypeMapper;
import com.cat.v5.product.interfaces.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeImpl extends IBaseServiceImpl<TProductType> implements IProductTypeService {

    @Autowired
    private TProductTypeMapper tProductTypeMapper;
    @Override
    public IBaseDao<TProductType> getBase() {
        return tProductTypeMapper;
}

    @Override
    public List<TProductType> list() {
        return tProductTypeMapper.list();
    }
}
