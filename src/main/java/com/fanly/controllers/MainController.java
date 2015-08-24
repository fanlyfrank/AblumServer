package com.fanly.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fanly.model.QiniuClient;

@Controller
@RequestMapping("/api")
public class MainController {

	@Autowired 
	private QiniuClient qiniuClient;
	
	@RequestMapping("/qiniu-token")
	@ResponseBody
	public Object qiniuToken(Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("token", qiniuClient.qiniuUploadToken());
		
		return map;
	}
}
