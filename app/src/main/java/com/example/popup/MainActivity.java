package com.example.popup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);
    }
    public void ShowPopUp(View view){
        TextView txtFechar;
        myDialog.setContentView(R.layout.custompopup);
        txtFechar = (TextView) myDialog.findViewById(R.id.txtClose);


       txtFechar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               myDialog.dismiss();
           }
       });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
