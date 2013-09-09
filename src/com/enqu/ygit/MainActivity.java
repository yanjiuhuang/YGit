package com.enqu.ygit;

import android.os.Bundle;
import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Loader;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements LoaderCallbacks<Object>{

	private static final String TAG = MainActivity.class.getSimpleName();

	private GitManager mManager = new GitManager();

	private TextView mText;
	private ListView mFileList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i(TAG, "Start to test jni test");
		mText = (TextView) findViewById(R.id.result_txt);
		mText.setText("The jni result: " + mManager.testInJni());

		mFileList = (ListView) findViewById(R.id.files_list);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public Loader<Object> onCreateLoader(int id, Bundle args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onLoadFinished(Loader<Object> arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoaderReset(Loader<Object> arg0) {
		// TODO Auto-generated method stub
		
	}

}
