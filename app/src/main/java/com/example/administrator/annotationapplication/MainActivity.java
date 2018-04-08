package com.example.administrator.annotationapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.chiclaim.processor.generated.GeneratedClass;
import com.example.annotation.BindView;

public class MainActivity extends AppCompatActivity{
    @BindView(R.id.textview)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GeneratedClass generatedClass = new GeneratedClass();
        Toast.makeText(this,generatedClass.getMessage(),Toast.LENGTH_SHORT).show();
    }
}
