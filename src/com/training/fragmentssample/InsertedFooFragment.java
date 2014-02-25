package com.training.fragmentssample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InsertedFooFragment extends Fragment {
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup root, Bundle savedInstanceState) {
//	      View fragment = inflater.inflate(R.layout.inserted_fragment, root, false);
//	      return fragment;
	      
	      View fragment = inflater.inflate(R.layout.inserted_fragment, root, false);
	        FragmentManager fm = getFragmentManager();
	        FragmentTransaction transaction = fm.beginTransaction();
	        transaction.replace(R.id.test_fragment2, new FooFragment());
	        transaction.addToBackStack(null);
	        transaction.commit();
	        return fragment;

	  }
}
