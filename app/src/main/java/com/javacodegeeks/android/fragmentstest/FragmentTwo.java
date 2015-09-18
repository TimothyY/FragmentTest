package com.javacodegeeks.android.fragmentstest;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentTwo extends Fragment implements View.OnClickListener{

   Button btnToast;

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.fragment_two, container, false);
      btnToast = (Button)v.findViewById(R.id.buttonToast);
      btnToast.setOnClickListener(this);
      return v;
   }

   @Override
   public void onClick(View v) {
       Log.v("tes","yeeeaaahh");
       Toast.makeText(this.getActivity(), "Holllyyy", Toast.LENGTH_SHORT).show();
   }
}
