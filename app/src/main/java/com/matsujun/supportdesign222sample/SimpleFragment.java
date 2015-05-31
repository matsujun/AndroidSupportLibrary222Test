package com.matsujun.supportdesign222sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by junya on 15/05/30.
 */
public class SimpleFragment extends Fragment {

    public static SimpleFragment newInstance(String label) {
        SimpleFragment frag = new SimpleFragment();
        Bundle args = new Bundle();
        args.putString("label", label);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String label = getArguments().getString("label");

        View view = inflater.inflate(R.layout.fragment_simple, null);

        TextView textView = (TextView)view.findViewById(R.id.text);
        textView.setText(label);

        return view;
    }
}
