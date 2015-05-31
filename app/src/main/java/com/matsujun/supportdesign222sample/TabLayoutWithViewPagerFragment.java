package com.matsujun.supportdesign222sample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by junya on 15/05/30.
 */
public class TabLayoutWithViewPagerFragment extends Fragment {

    public static TabLayoutWithViewPagerFragment newInstance() {
        TabLayoutWithViewPagerFragment frag = new TabLayoutWithViewPagerFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_layout_with_viewpager, null);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);

        viewPager.setAdapter(new MyFragmentPagerAdapter(getFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    public class MyFragmentPagerAdapter extends FragmentPagerAdapter{

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return SimpleFragment.newInstance("Simple Fragment "+position);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab "+position;
        }

    }
}