package com.matsujun.supportdesign222sample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by junya on 15/05/30.
 */
public class TabLayoutFragment extends Fragment{

    public static TabLayoutFragment newInstance() {
        TabLayoutFragment frag = new TabLayoutFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_layout, null);

        TabLayout tabLayout1 = (TabLayout)view.findViewById(R.id.tab_layout1);
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 1"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 2"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 3"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 4"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 5"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 6"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 7"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 8"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 9"));


        TabLayout tabLayout2 = (TabLayout)view.findViewById(R.id.tab_layout2);
        tabLayout2.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab 1"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab 2"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab 3"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab 4"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab 5"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab 6"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 7"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 8"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab 9"));


        TabLayout tabLayout3 = (TabLayout)view.findViewById(R.id.tab_layout3);
        tabLayout3.addTab(tabLayout3.newTab().setText("Tab 1"));
        tabLayout3.addTab(tabLayout3.newTab().setText("Tab 2"));
        tabLayout3.addTab(tabLayout3.newTab().setText("Tab 3"));

        TabLayout tabLayout4 = (TabLayout)view.findViewById(R.id.tab_layout4);
        tabLayout4.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout4.addTab(tabLayout4.newTab().setText("Tab 1"));
        tabLayout4.addTab(tabLayout4.newTab().setText("Tab 2"));
        tabLayout4.addTab(tabLayout4.newTab().setText("Tab 3"));


        TabLayout tabLayout5 = (TabLayout)view.findViewById(R.id.tab_layout5);
        tabLayout5.addTab(tabLayout5.newTab().setText("Tab 1"));
        tabLayout5.addTab(tabLayout5.newTab().setText("Tab 2"));
        tabLayout5.addTab(tabLayout5.newTab().setText("Tab 3"));
        return view;
    }
}
