package com.cat.v5.product.interfaces;

import com.cat.commons.base.service.IBaseService;
import com.cat.v5.entity.TProduct;

import java.util.List;

public interface IProductService extends IBaseService<TProduct> {
    List<TProduct> list();
}
