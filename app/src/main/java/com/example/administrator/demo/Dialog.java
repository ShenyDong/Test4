package com.example.administrator.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by apple on 2018/4/9.
 */
public class Dialog extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interactivity);
    }
    public void customView(View v)
    {
        LinearLayout loginform=(LinearLayout) getLayoutInflater().inflate(R.layout.login,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //LayoutInflater inflater = LayoutInflater.from(this);
       // AlertDialog.Builder builder=new AlertDialog.Builder(this);
       // builder.setTitle("自定义View对话框");
        builder.setView(loginform)
                .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog viewdialog=builder.create();
        viewdialog.show();

        //return builder.create();
    }
}


