package com.bingxi.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bingxi.pojo.TbBrand;
import com.bingxi.sellergoods.service.BrandService;

@Controller
@ResponseBody
@RequestMapping("/brand")
public class BrandController {
	
	@Reference
	private BrandService brandService;
	@RequestMapping("/findall")
	public List<TbBrand> findAll(){
		return brandService.findAll();
		
	}
	

}
