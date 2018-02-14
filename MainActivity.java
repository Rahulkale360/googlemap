package com.example.rahul.mpc;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private float y[]={10.5f,11.8f,50.0f,20.0f};
    private String x[]={"Mango","Apple","Banana","Orange"};
    PieChart pie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pie=findViewById(R.id.pie);
        pie.setCenterText("Fruits");
        pie.setRotationEnabled(true);
        pie.setCenterTextSize(20);
        pie.setDrawEntryLabels(true);
        addDataSet();
    }
    public void addDataSet()
    {
        ArrayList<PieEntry> ylist=new ArrayList<>();
        ArrayList<String> xlist=new ArrayList<>();
        for(int i=0;i<y.length;i++)
        {
            ylist.add(new PieEntry(y[i]) );
        }
        for(int i=0;i<x.length;i++)
        {
            xlist.add(x[i]);
        }
        PieDataSet set=new PieDataSet(ylist,"Fruit sales");
        set.setSliceSpace(5);
        set.setValueTextSize(10);
        ArrayList<Integer> color=new ArrayList<>();
        color.add(Color.CYAN);
        color.add(Color.GRAY);
        color.add(Color.GREEN);
        color.add(Color.RED);
        set.setColors(color);
        PieData data=new PieData(set);
        pie.setData(data);
        pie.invalidate();

    }
}
