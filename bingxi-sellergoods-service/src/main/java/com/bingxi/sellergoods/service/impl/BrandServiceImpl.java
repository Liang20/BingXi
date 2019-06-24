package com.bingxi.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.alibaba.dubbo.config.annotation.Service;
import com.bingxi.entity.PageResult;
import com.bingxi.mapper.TbBrandMapper;
import com.bingxi.pojo.TbBrand;
import com.bingxi.sellergoods.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private TbBrandMapper brandMapper;
	@Override
	public List<TbBrand> findAll() {
		// TODO Auto-generated method stub
		return brandMapper.selectByExample(null);
	}
	
	//分页
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		
		Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);
		
		return new PageResult(page.getTotal(),page.getResult());
	}

	//增加
	@Override
	public void add(TbBrand tbBrand) {
		// TODO Auto-generated method stub
		brandMapper.insert(tbBrand);
	}

}
