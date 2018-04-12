package com.example.administrator.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by apple on 2018/4/9.
 */

public class XMLMenu extends Activity{
    private EditText ed1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        ed1=(EditText)findViewById(R.id.ed1);
        String text = ed1.getText().toString().trim();
        SpannableString span = new SpannableString(text);
        switch (item.getItemId()){
            case R.id.red:
                span.setSpan(new ForegroundColorSpan(Color.RED), 0, span.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed1.setText(span);
                break;
            case R.id.black:
                span.setSpan(new ForegroundColorSpan(Color.BLACK), 0, span.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed1.setText(span);
                break;
            case R.id.small:
                span.setSpan(new AbsoluteSizeSpan(10,true), 0, span.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed1.setText(span);
                break;
            case R.id.big:
                span.setSpan(new AbsoluteSizeSpan(20,true), 0, span.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed1.setText(span);
                break;
            case R.id.middle:
                span.setSpan(new AbsoluteSizeSpan(16,true), 0, span.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed1.setText(span);
                break;
            case R.id.help:
                Toast.makeText(XMLMenu.this,"点击了普通菜单项",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
