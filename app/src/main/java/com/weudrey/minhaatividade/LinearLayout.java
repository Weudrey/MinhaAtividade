package com.weudrey.minhaatividade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinearLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void voltarRelativeLay(View view){
        Intent intent =  new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
