package com.bingxi.sellergoods.service;

import java.util.List;

import com.bingxi.entity.PageResult;
import com.bingxi.pojo.TbBrand;

//品牌接口
public interface BrandService {
	
	public List<TbBrand> findAll();
	
	//分页
	public PageResult findPage(int pageNum,int pageSize);
	
	//增加
	public void add(TbBrand tbBrand);

}
