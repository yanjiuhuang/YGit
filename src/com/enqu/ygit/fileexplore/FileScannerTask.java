package com.enqu.ygit.fileexplore;

import java.io.File;

import com.enqu.ygit.fileexplore.FileScanResult.FileScanStatus;

import android.os.AsyncTask;
import android.util.Log;

public class FileScannerTask extends AsyncTask<File, Integer, FileScanResult>{
	
	private static final String TAG = FileScannerTask.class.getSimpleName();
	
	@Override
	protected FileScanResult doInBackground(File... params) {
		
		if(params.length != 1){
			return null;
		}
		
		File target = params[0];
		if(target == null){
			// the target file doesn't not exist
			Log.e(TAG, "The target directory doesn't not exist!");
			return null;
		}
		
		FileScanResult result = new FileScanResult(target.getAbsolutePath());
		if(!target.exists()){
			result.setScanResultStatus(FileScanStatus.FILE_NOT_EXIST_RESULT);
			return result;
		}
		
		if(!target.isDirectory()){
			result.setScanResultStatus(FileScanStatus.NOT_A_DIRECTORY_RESULT);
			return result;
		}
		
		File[] fs = target.listFiles();
		for(int i = 0; i < fs.length; i++){
			FileItem item = new FileItem();
			item.setDir(fs[i].isDirectory());
			item.setFileName(fs[i].getName());
			item.setFullPath(fs[i].getAbsolutePath());
			
			result.insertFile(item);
		}
		return result;
	}
	
	@Override
	protected void onPostExecute(FileScanResult result) {
		
	}

}
