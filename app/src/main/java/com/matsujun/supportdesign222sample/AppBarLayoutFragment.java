package com.matsujun.supportdesign222sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by junya on 15/06/01.
 */
public class AppBarLayoutFragment extends Fragment {

    public static AppBarLayoutFragment newInstance() {
        AppBarLayoutFragment frag = new AppBarLayoutFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_app_bar_layout, null);

        //雑です。すいません。
        Toolbar tb2 = (Toolbar)view.findViewById(R.id.toolbar2);
        tb2.setTitle(R.string.title_app_bar_layout);
        ((AppCompatActivity)getActivity()).setSupportActionBar(tb2);
        return view;
    }

}
