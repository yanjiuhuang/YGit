package com.enqu.ygit;

import android.util.Log;

public class GitManager {
	
	private static final String TAG = GitManager.class.getSimpleName();

	public GitManager(){
		load();
	}
	
	protected void load() {
		try {
			Log.i(TAG, "Loading the YGit library !");
			System.loadLibrary("ygit");
		} catch (Throwable t) {
			Log.e(TAG, "There is some error in loading library: " + t.getMessage());
		}
	}
	
	public int testInJni(){
		return test(1, 1);
	}
	
	private static native int test(int x, int y);

}
