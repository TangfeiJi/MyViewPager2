package com.example.myviewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager2 viewpager;
private List<String> evenList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabLayout);
        viewpager=findViewById(R.id.viewpager);
        evenList.add("0");
        evenList.add("1");
        evenList.add("2");

//        正常的用法
        viewpager.setAdapter(new MainAdapter(MainActivity.this,evenList));

//        TabLayout和ViewPager的绑定
        TabLayoutMediator  tabLayoutMediator=  new TabLayoutMediator(tabLayout, viewpager, new TabLayoutMediator.OnConfigureTabCallback() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Tab"+position);
            }
        });
        tabLayoutMediator.attach();




    }
}
