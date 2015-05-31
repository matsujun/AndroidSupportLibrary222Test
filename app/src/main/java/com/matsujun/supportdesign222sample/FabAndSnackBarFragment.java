package com.matsujun.supportdesign222sample;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by junya on 15/05/30.
 */
public class FabAndSnackBarFragment extends Fragment {

    public static FabAndSnackBarFragment newInstance() {
        FabAndSnackBarFragment frag = new FabAndSnackBarFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fab_and_snackbar, null);

        final View layout1 = view.findViewById(R.id.layout1);
        final View layout2 = view.findViewById(R.id.layout2);

        FloatingActionButton fab1 = (FloatingActionButton)view.findViewById(R.id.fab1);
        FloatingActionButton fab2 = (FloatingActionButton)view.findViewById(R.id.fab2);
        FloatingActionButton fab11 = (FloatingActionButton)view.findViewById(R.id.fab11);
        FloatingActionButton fab12 = (FloatingActionButton)view.findViewById(R.id.fab12);

        fab1.setRippleColor(getResources().getColor(R.color.accentColor));
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(layout1, "fab1 is clicked", Snackbar.LENGTH_LONG);
                snackbar.setAction("ACTION", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity().getApplicationContext(), "ACTION executed", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(layout2, "fab2 is clicked", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
        fab11.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.accentColor)));
        fab11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(layout2, "Long text. This is very long text for snackbar. will be cropped. hahahahahahahahhahahahahahahahahahahahahahahahahahahahahahahahahahahahaha", Snackbar.LENGTH_LONG);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.MAGENTA);
                snackbar.setActionTextColor(Color.WHITE);
                snackbar.setAction("ACTION", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity().getApplicationContext(), "Action Executed", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });
        fab12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(layout2, "Long text. This is very long text for snackbar. will be cropped. hahahahahahahahhahahahahahahahahahahahahahahahahahahahahahahahahahahahaha", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

        return view;
    }
}
