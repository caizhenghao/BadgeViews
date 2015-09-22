package com.guangdong.caizhenghao.BadgeViewsMaster;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.guangdong.caizhenghao.BadgeViewsMaster.widget.BadgeLinearLayout;
import com.guangdong.caizhenghao.BadgeViewsMaster.widget.BadgeTextView;
import com.guangdong.caizhenghao.BadgeViewsMaster.widget.utils.ConfigOptions;

public class MyActivity extends Activity implements View.OnClickListener{
    private BadgeTextView badgeTextView;
    private Button button;
    private BadgeLinearLayout badgeLinearLayout;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ConfigOptions configOptions=new ConfigOptions();
        configOptions.setBgColor(Color.RED);
        configOptions.setDistSize(2);
        configOptions.setModel(ConfigOptions.MODEL_RIGHT_TOP);
        configOptions.setSize(15);
        configOptions.setTextColor(Color.WHITE);
        configOptions.setTextSize(12);
//        configOptions.setTextSizePx();

        badgeTextView= (BadgeTextView) findViewById(R.id.textview);

        badgeTextView.setConfigOptions(configOptions);
//        badgeTextView.setContentText("2");
        badgeTextView.show();

        badgeLinearLayout= (BadgeLinearLayout) findViewById(R.id.linearlayout);
        badgeLinearLayout.setConfigOptions(configOptions);
        badgeLinearLayout.show();

        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                badgeTextView.setContentText("4");
                break;
            default:

                break;
        }
    }
}
