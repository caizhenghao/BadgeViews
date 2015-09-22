package com.guangdong.caizhenghao.BadgeViewsMaster.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.guangdong.caizhenghao.BadgeViewsMaster.widget.impl.BadgeViewImpl;
import com.guangdong.caizhenghao.BadgeViewsMaster.widget.utils.ConfigOptions;
import com.guangdong.caizhenghao.BadgeViewsMaster.widget.utils.DrawBadgeUtils;

/**
 * Created by caizhenghao on 2015/8/29.
 */
public class BadgeLinearLayout extends LinearLayout implements BadgeViewImpl {
    private ConfigOptions configOptions;
    private String contentText;
    private boolean isShowBadge;

    public BadgeLinearLayout(Context context) {
        super(context);
    }

    public BadgeLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BadgeLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public void show() {
        isShowBadge=true;
        invalidate();
    }

    @Override
    public void hide() {
        isShowBadge=false;
        invalidate();
    }

    @Override
    public void setConfigOptions(ConfigOptions configOptions) {
        this.configOptions = configOptions;
    }

    @Override
    public void setContentText(String contentText) {
        this.contentText = contentText;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(isShowBadge) {
            DrawBadgeUtils.drawBadge(this, canvas, configOptions, contentText);
        }
    }
}
