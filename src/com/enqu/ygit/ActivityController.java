package com.enqu.ygit;

import android.app.Activity;

public class ActivityController {
	
	private static final String TAG = ActivityController.class.getSimpleName();
	
	protected Activity mManagedActivity;
	
	public ActivityController(){
		
	}
	
	

	//public Activity getmManagedActivity() {
	//	return mManagedActivity;
	//}

	public void setmManagedActivity(Activity mManagedActivity) {
		this.mManagedActivity = mManagedActivity;
	}
	
	

}
