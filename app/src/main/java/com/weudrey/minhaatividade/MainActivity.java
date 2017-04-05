package com.weudrey.minhaatividade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaGridLay(View view){
        Intent intent =  new Intent(this,GridLayout.class);
        startActivity(intent);
    }

    public void irParaLinearLay(View view){
        Intent intent =  new Intent(this,LinearLayout.class);
        startActivity(intent);
    }
}
