package com.dugu.dev.mtom.client.locator;

import org.example.uploadfile.mtom.service.UploadFile;
import org.example.uploadfile.mtom.service.UploadService;
import org.springframework.stereotype.Component;

@Component
public class ServiceInvoker {

	public UploadService getPort() {
		UploadService port = null;
		try {
			UploadFile service = new UploadFile();
			port = service.getUploadServiceSOAPPort();
			System.out.println(port);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return port;
	}
}
