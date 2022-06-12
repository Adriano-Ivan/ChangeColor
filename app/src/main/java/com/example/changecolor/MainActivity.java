package com.example.changecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragmentButtons.OnColorSetListener {

    private FragmentButtons fragmentButtons;
    private FragmentEmpty fragmentEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();

        fragmentButtons = new FragmentButtons();
        fragmentEmpty = new FragmentEmpty();


        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_left, fragmentButtons);
        ft.add(R.id.fragment_right, fragmentEmpty);
        ft.commit();
    }

    @Override
    public void setColor(int color) {
        FragmentEmpty fragmentyEmpty = (FragmentEmpty) getFragmentManager()
                .findFragmentById(R.id.fragment_right);

        fragmentyEmpty.updateColor(color);
    }
}