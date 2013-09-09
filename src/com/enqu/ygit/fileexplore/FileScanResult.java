package com.enqu.ygit.fileexplore;

import java.util.LinkedList;
import java.util.List;

public class FileScanResult {
	
	
	private String baseDir;
	private List<FileItem> subFiles;
	
	private FileScanStatus searchResultStatus;
	
	public FileScanResult(String path) {
		this.baseDir = path;
		subFiles = new LinkedList<FileItem>();
	}
	
	public String getBaseDir(){
		return this.baseDir;
	}
	
	public void insertFile(FileItem item){
		if (item == null) {
			return;// just do nothing
		}
		
		subFiles.add(item);
	}
	
	public FileScanStatus getScanStatus(){
		return searchResultStatus;
	}
	
	public void setScanResultStatus(FileScanStatus status){
		this.searchResultStatus = status;
	}
	
	public enum FileScanStatus{
		
		NOT_START(-1, "Just not start to scan files"),
		OK_RESULT(0, "The result is ready now"),
		NONE_FILES_THERE_RESULT(1, "There is no file in target directory"),
		NOT_A_DIRECTORY_RESULT(2, "The target is not a directory"),
		FILE_NOT_EXIST_RESULT(3, "The target file does not exist");
		
		
		private final int status;
		private final String desc;
		FileScanStatus(int status, String desc){
			this.status = status;
			this.desc = desc;
		}
		
		public int status(){
			return status;
		}
		
		public String desc(){
			return desc;
		}
	}

}
