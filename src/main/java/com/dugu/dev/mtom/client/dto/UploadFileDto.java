package com.dugu.dev.mtom.client.dto;

import java.io.File;

public class UploadFileDto {
	private String filePath;
	private String fileName;
	private String newFile;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNewFile() {
		return newFile;
	}

	public void setNewFile(String newFile) {
		this.newFile = newFile;
	}

}
