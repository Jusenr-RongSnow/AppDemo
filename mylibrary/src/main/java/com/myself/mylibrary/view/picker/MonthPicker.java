package com.myself.mylibrary.view.picker;

import android.app.Activity;


/**
 * 月份选择器
 *
 * Created By guchenkai
 */
public class MonthPicker extends OptionPicker {

    public MonthPicker(Activity activity) {
        super(activity, new String[]{});
        for (int i = 1; i <= 12; i++) {
            options.add(i < 10 ? "0" + i : "" + i);
        }
    }
}