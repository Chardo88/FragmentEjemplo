package com.example.chardo.fragmentejemplo;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Chardo on 3/19/2018.
 */

public class FragmentOne extends Fragment {
    EditText editText;
    Button button;
    OnNameSetListener onNameSetListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout,container,false);
        editText = (EditText) view.findViewById(R.id.name);
        button = (Button)view.findViewById(R.id.submit_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = editText.getText().toString();
                onNameSetListener.setName(Name);
            }
        });
        return  view;
    }

    public interface OnNameSetListener
    {
        public void setName(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onNameSetListener = (OnNameSetListener) activity;
        } catch (Exception e) {}
    }
}
