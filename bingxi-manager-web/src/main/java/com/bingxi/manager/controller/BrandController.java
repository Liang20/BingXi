package com.bingxi.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bingxi.entity.PageResult;
import com.bingxi.entity.Result;
import com.bingxi.pojo.TbBrand;
import com.bingxi.sellergoods.service.BrandService;

//品牌
@Controller
@ResponseBody
@RequestMapping("/brand")
public class BrandController {
	
	@Reference
	private BrandService brandService;
	@RequestMapping("/findaAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();	
	}
	
	//分页
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int size){
		return brandService.findPage(page, size);	
	}
	
	//增加
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand brand){
		try {
			brandService.add(brand);
			return new Result(true, "添加成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败！");
		}
		
	}

}
