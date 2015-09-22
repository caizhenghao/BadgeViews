package com.guangdong.caizhenghao.BadgeViewsMaster.widget.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/**
 * Created by zhenghao on 15/9/22.
 * 所有控件最终都是调用这个方法画角标
 */
public class DrawBadgeUtils {

    public static void drawBadge(View view, Canvas canvas, ConfigOptions configOptions, String contentText) {
        configOptions.tranSize(view.getContext());

        int model = configOptions.getModel();

        float x = 0, y = 0;

        if (model == ConfigOptions.MODEL_LEFT_TOP) {

            x = configOptions.getDistSizePx();
            y = configOptions.getDistSizePx();

        } else if (model == ConfigOptions.MODEL_RIGHT_BOTTOM) {

            x = view.getWidth() - configOptions.getDistSizePx() - configOptions.getSizePx();
            y = view.getHeight() - configOptions.getDistSizePx() - configOptions.getSizePx();

        } else if (model == ConfigOptions.MODEL_LEFT_BOTTOM) {

            x = configOptions.getDistSizePx();
            y = view.getHeight() - configOptions.getDistSizePx() - configOptions.getSizePx();

        } else {//右上角作为默认方向

            x = view.getWidth() - configOptions.getDistSizePx() - configOptions.getSizePx();
            y = configOptions.getDistSizePx();

        }

        Paint paint = new Paint();

        if (configOptions.getBgColor() != 0) {
            paint.setColor(configOptions.getBgColor());
            canvas.drawCircle(x + configOptions.getSizePx() / 2, y + configOptions.getSizePx() / 2,
                    configOptions.getSizePx() / 2, paint);
        }

        if (contentText != null && contentText.length() > 0) {
            paint.setTextSize(configOptions.getTextSizePx());
            paint.setColor(configOptions.getTextColor());
            float textDist = (configOptions.getSizePx() - configOptions.getTextSizePx()) / 2f;
            Log.d("test","textDist="+textDist+",x="+x+",y="+y);

            canvas.drawText(contentText, x + textDist, y + textDist, paint);
        }


//        canvas.drawText();
//        canvas.drawText();

    }


    public static int dipToPixels(Context context, int dip) {
        Resources r = context.getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, r.getDisplayMetrics());
        return (int) px;
    }
}
