package com.cat.v5.product.interfaces;

import com.cat.commons.base.service.IBaseService;
import com.cat.v5.entity.TProductType;

import java.util.List;

public interface IProductTypeService extends IBaseService<TProductType> {
    List<TProductType> list();
}
