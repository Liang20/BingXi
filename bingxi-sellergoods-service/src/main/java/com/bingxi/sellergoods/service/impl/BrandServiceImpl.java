package com.bingxi.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.alibaba.dubbo.config.annotation.Service;
import com.bingxi.mapper.TbBrandMapper;
import com.bingxi.pojo.TbBrand;
import com.bingxi.sellergoods.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private TbBrandMapper brandMapper;
	@Override
	public List<TbBrand> findAll() {
		// TODO Auto-generated method stub
		return brandMapper.selectByExample(null);
	}

}
