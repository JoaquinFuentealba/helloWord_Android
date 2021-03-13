package com.example.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG="MainActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView =(TextView) findViewById( R.id.text_view);
        Log.d(TAG, "onCreate: "+ getString(R.string.app_name));
        Toast.makeText(this,"son las 14:30 y tengo un hambre que me muero", Toast.LENGTH_LONG).show();
    }



    public void topClick(View view){
        Toast.makeText(this, "He pulsado el boton de arriba", Toast.LENGTH_LONG).show();
        this.textView.setText("HOLLLLLLLLLLLLLLLLAAAAA MMMUUUUUNNNNDDDDOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!!!");
    }

    public void bottomClick(View view){
        Toast.makeText(this, "He pulsado el boton de abajo", Toast.LENGTH_LONG).show();
    }
}