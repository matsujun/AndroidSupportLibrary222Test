package com.matsujun.supportdesign222sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by junya on 15/05/29.
 */
public class TextInputLayoutFragment extends Fragment {

    public static TextInputLayoutFragment newInstance() {
        TextInputLayoutFragment frag = new TextInputLayoutFragment();
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text_input_layout, null);

        TextInputLayout userId = (TextInputLayout)view.findViewById(R.id.user_id);
        final TextInputLayout pass = (TextInputLayout)view.findViewById(R.id.password);
        final TextInputLayout passConfirm = (TextInputLayout)view.findViewById(R.id.password_confirmation);
        final TextInputLayout text1 = (TextInputLayout)view.findViewById(R.id.text1);
        final TextInputLayout text2 = (TextInputLayout)view.findViewById(R.id.text2);

        pass.setErrorEnabled(true);
        passConfirm.setErrorEnabled(false);
        text1.setErrorEnabled(false);
        text2.setErrorEnabled(true);

        TextWatcher textWatcher =  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!pass.getEditText().getText().toString().isEmpty() &&
                        !passConfirm.getEditText().getText().toString().isEmpty() &&
                        !pass.getEditText().getText().toString().equals(passConfirm.getEditText().getText().toString())){
                    pass.setError(getResources().getText(R.string.password_not_match));
                    passConfirm.setError(getResources().getText(R.string.password_not_match));
                }else{
                    pass.setError("");
                    passConfirm.setError("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };
        pass.getEditText().addTextChangedListener(textWatcher);
        passConfirm.getEditText().addTextChangedListener(textWatcher);
        text1.setError("error1");
        text2.setError("error2");

        return view;
    }
}
