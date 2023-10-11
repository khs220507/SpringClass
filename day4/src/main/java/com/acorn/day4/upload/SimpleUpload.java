package com.acorn.day4.upload;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

 


@Controller
public class SimpleUpload {

	String fileDir = "c:\\test\\upload\\"; // 물리적인 폴더를 만들어야 함
	@GetMapping("/upload")
	public String uploadForm() {
		return "upload-form";
	}
	
	@PostMapping("/upload")
	public String upload(String goodsCode, MultipartFile file, Model model) throws IllegalStateException, IOException {
		if(!file.isEmpty()) {
			String fileRealName = file.getOriginalFilename();
			String fullPath = fileDir + fileRealName;
			file.transferTo(new File(fullPath));
			model.addAttribute("fileName", fileRealName);
		}
		return "upload-ok";
	}
	
	@ResponseBody
	@GetMapping(value="/images/{fileName:.*}" )
	public Resource imageView(@PathVariable String fileName) throws MalformedURLException { 
		return new UrlResource("file:c:\\test\\upload\\" + fileName);
	}
		
	 
}
