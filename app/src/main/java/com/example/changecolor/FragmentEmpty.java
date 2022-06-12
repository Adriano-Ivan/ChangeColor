package com.example.changecolor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class FragmentEmpty extends Fragment {
    private LinearLayout internFragmentEmpty;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_empty,container, false);

        internFragmentEmpty = (LinearLayout) view.findViewById(R.id.intern_fragment_empty);

        return view;
    }

    public void updateColor(int color){
        internFragmentEmpty.setBackgroundColor(color);
    }
}
