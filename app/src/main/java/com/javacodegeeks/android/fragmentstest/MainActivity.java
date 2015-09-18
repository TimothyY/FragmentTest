package com.javacodegeeks.android.fragmentstest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;


public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      	super.onCreate(savedInstanceState);
      	setContentView(R.layout.activity_main);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		 if(view == findViewById(R.id.button1)) {
			 fr = new FragmentOne();
		 }else {
			 fr = new FragmentTwo();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place, fr);
	     fragmentTransaction.commit();
		 
	}

}
