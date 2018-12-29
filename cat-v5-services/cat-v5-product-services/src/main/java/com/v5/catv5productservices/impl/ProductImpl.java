package com.v5.catv5productservices.impl;
import com.cat.commons.base.dao.IBaseDao;
import com.cat.commons.base.service.Impl.IBaseServiceImpl;
import com.cat.v5.entity.TProduct;
import com.cat.v5.mapper.TProductMapper;
import com.cat.v5.product.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl extends IBaseServiceImpl<TProduct> implements IProductService {
    @Autowired
    private TProductMapper productMapper;

    @Override
    public IBaseDao getBase() {
        return productMapper;
    }


    @Override
    public List<TProduct> list() {
        return null;
    }
}
