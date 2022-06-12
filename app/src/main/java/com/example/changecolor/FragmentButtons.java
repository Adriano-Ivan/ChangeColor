package com.example.changecolor;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

public class FragmentButtons extends Fragment implements View.OnClickListener {

    private Button blackButton;
    private Button blueButton;
    private Button greenButton;
    private Button redButton;
    private Button yellowButton;
    private OnColorSetListener onColorSetListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons, container, false);

        blackButton = (Button)view.findViewById(R.id.buttonBlack);
        blueButton =  (Button)view.findViewById(R.id.buttonBlue);
        greenButton =  (Button) view.findViewById(R.id.buttonGreen);
        redButton =  (Button)view.findViewById(R.id.buttonRed);
        yellowButton =  (Button)view.findViewById(R.id.buttonYellow);

        blackButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int idButton = v.getId();

        if(idButton == R.id.buttonBlack){
            onColorSetListener.setColor(Color.parseColor("#000000"));
        } else if(idButton == R.id.buttonBlue){
            onColorSetListener.setColor(Color.parseColor("#0000FF"));
        } else if (idButton == R.id.buttonGreen){
            onColorSetListener.setColor(Color.parseColor("#008000"));
        } else if (idButton == R.id.buttonRed){
            onColorSetListener.setColor(Color.parseColor("#FF0000"));
        } else if(idButton == R.id.buttonYellow){
            onColorSetListener.setColor(Color.parseColor("#E6E600"));
        }
    }

    public interface OnColorSetListener{
        void setColor(int color);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            onColorSetListener = (OnColorSetListener) context;
        }catch(Exception e){

        }

    }
}
