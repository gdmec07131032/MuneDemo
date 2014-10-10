package com.example.menudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTx;

    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
    	super.onOptionsItemSelected(item);
    	switch (item.getItemId()) {
    		case R.id.item1:     
    			myTx.setText("aaa");
    			break;
 		case R.id.item2:  
    			myTx.setText("bbb");
    			break;
		case R.id.item3:    
			myTx.setText("ccc");
			break;	
			}
    	return super.onMenuItemSelected(featureId, item);
    }

		


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTx=(TextView) findViewById(R.id.textView1);
    }


    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		super.onPrepareOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;

	}
    
}
