package com.guangdong.caizhenghao.BadgeViewsMaster.widget.impl;

import com.guangdong.caizhenghao.BadgeViewsMaster.widget.utils.ConfigOptions;

/**
 * Created by zhenghao on 15/9/21.
 * 角标控件的接口
 */
public interface BadgeViewImpl {

    void show();

    void hide();

    void setConfigOptions(ConfigOptions configOptions);

    /**
     * 设置角标控件上面显示的文字
     * @param contentText
     */
    void setContentText(String contentText);
}
