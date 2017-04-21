package com.dugu.dev.mtom.client.controller;

import org.example.uploadfile.mtom.types.UploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dugu.dev.mtom.client.dto.UploadFileDto;
import com.dugu.dev.mtom.client.service.UploadClientService;

@Controller
public class FileHandlerController {
	@Autowired(required = true)
	private UploadClientService service;

	@RequestMapping(value = "/upload")
	public String uploadFile(
			@ModelAttribute("uploadFileDto") UploadFileDto uploadFileDto,Model model) {
		UploadResponse response=service.upload(uploadFileDto);
		String value=response.getResponse();
		model.addAttribute("value", value);
		return "upload";
	}
}
