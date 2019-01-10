package com.cat.v5.product.interfaces;

import com.cat.commons.base.service.IBaseService;
import com.cat.v5.entity.TProduct;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IProductService extends IBaseService<TProduct> {
    List<TProduct> list();

    PageInfo<TProduct> getPage(Integer pageIndex, Integer pageSize);
}
