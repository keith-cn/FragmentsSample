package com.training.fragmentssample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FooFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup root,
			Bundle savedInstanceState) {
		View fragment = inflater.inflate(R.layout.fragment_layout, root, false);
		return fragment;
	}
}