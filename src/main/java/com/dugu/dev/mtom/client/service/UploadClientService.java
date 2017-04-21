package com.dugu.dev.mtom.client.service;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.example.uploadfile.mtom.types.InputRequest;
import org.example.uploadfile.mtom.types.UploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dugu.dev.mtom.client.dto.UploadFileDto;
import com.dugu.dev.mtom.client.locator.ServiceInvoker;

@Service
public class UploadClientService {
	@Autowired(required = true)
	private ServiceInvoker invoker;

	public UploadResponse upload(UploadFileDto uploadFile) {
		UploadResponse response = null;
		InputRequest request = new InputRequest();
		request.setFilePath(uploadFile.getFilePath());
		request.setFileType(uploadFile.getFileName());
		DataSource source = new FileDataSource(
				new File(uploadFile.getNewFile()));
		request.setFile(((new DataHandler(source))));
		response = invoker.getPort().upload(request);
		return response;
	}
}
