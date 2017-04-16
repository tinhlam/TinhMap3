package com.example.tinh.tinhmap3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class ThemeActivity extends AppCompatActivity {
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        v = this.getWindow().getDecorView();
        v.setBackgroundResource(R.color.colorPrimaryDark);

    }
    public void selectTheme(View view)
    {

        //boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.red_radio:
                v.setBackgroundResource(R.color.red);
                break;
            case R.id.blue_radio:
                v.setBackgroundResource(R.color.blue);
                break;
            case R.id.green_radio:
                v.setBackgroundResource(R.color.green);
                break;
            case R.id.title_radio:
                updateTheme();
                break;

        }


    }
    public void updateTheme()
    {
        TitleActivity.colorTheme = "yellow";

    }
}
