package com.example.chardo.fragmentejemplo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Chardo on 3/19/2018.
 */

public class FragmentTwo extends Fragment{
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_layout,container,false);
        textView = (TextView)view.findViewById(R.id.display_name);
        textView.setVisibility(View.GONE);
        return view;
    }

    public void updateInfo(String name)
    {
        textView.setText("Welcome "+name);
        textView.setVisibility(View.VISIBLE);
    }
}
