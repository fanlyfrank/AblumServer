package com.fanly.model;

import org.springframework.stereotype.Service;

import com.qiniu.util.Auth;

@Service
public class QiniuClient {

	public static String ACCESS_KEY = "SwUk49vEBkJGOCTS38vWYBIbc7vTDueuyD1IolVk";
	public static String SECRET_KEY = "lE96VC5qlHGRDgmN3LgAPKUIaxCWPlMpm7XDWjKx";
	public static String ALBUM_BUCKET = "vbuy";
	
	public String qiniuUploadToken() {
		
		String result = "";
		
		Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
		result = auth.uploadToken(ALBUM_BUCKET);
		
		return result;
	}
}
