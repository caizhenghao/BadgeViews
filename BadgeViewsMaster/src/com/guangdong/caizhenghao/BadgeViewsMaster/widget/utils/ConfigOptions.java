package com.guangdong.caizhenghao.BadgeViewsMaster.widget.utils;

import android.content.Context;

/**
 * Created by zhenghao on 15/9/21.
 * 角标控件的实体类，以此实现
 */
public class ConfigOptions {

    public static final int MODEL_LEFT_TOP = 1;
    public static final int MODEL_RIGHT_TOP = 2;
    public static final int MODEL_LEFT_BOTTOM = 3;
    public static final int MODEL_RIGHT_BOTTOM = 4;

    private boolean isTranSize;
    private int model;//模式,分别是上面的四中模式，决定了角标画在控件的什么位置
    private int size; //尺寸，单位dp
    private int distSize; //尺寸，单位dp
    private int bgColor; //底色
    private int textColor;//文字颜色
    private int textSize;  //文字大小，为了保证体验一致，统一使用dp为单位
    private int textSizePx; //文字大小，以px
    private int bgResId;


    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

//    public int getWidthPx() {
//        return size;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeightPx() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }


    public int getSizePx() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }


    public int getTextSizePx() {
        return textSizePx;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

//    public void setTextSizePx(int textSize) {
//        this.textSize = textSize;
//    }

    public int getBgResId() {
        return bgResId;
    }

    public void setBgResId(int bgResId) {
        this.bgResId = bgResId;
    }

    public int getDistSizePx() {
        return distSize;
    }

    public void setDistSize(int distSize) {
        this.distSize = distSize;
    }

    /**
     * 转换尺寸到px单位，以减少在绘制过程中的转换
     */
    public void tranSize(Context context) {
        if (!isTranSize) {
            isTranSize = true;
            this.size = DrawBadgeUtils.dipToPixels(context, size);
//            this.height = DrawBadgeUtils.dipToPixels(context, height);
            this.distSize = DrawBadgeUtils.dipToPixels(context, distSize);
            this.textSizePx = DrawBadgeUtils.dipToPixels(context, textSize);
        }
    }
}
