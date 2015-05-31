package com.matsujun.supportdesign222sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by junya on 15/05/31.
 */
public class CoordinatorLayoutFragment extends Fragment {

    public static CoordinatorLayoutFragment newInstance() {
        CoordinatorLayoutFragment frag = new CoordinatorLayoutFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coordinator_layout, null);
        return view;
    }
}
