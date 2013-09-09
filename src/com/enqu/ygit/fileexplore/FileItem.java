package com.enqu.ygit.fileexplore;

public class FileItem {
	
	private String fileName;
	private String fullPath;
	private boolean isDir;
	
	public FileItem() {
		super();
	}

	public FileItem(String fileName, String fullPath, boolean isDir) {
		super();
		this.fileName = fileName;
		this.fullPath = fullPath;
		this.isDir = isDir;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	public boolean isDir() {
		return isDir;
	}
	public void setDir(boolean isDir) {
		this.isDir = isDir;
	}
	
	
	
}
