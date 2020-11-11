package com.wang.android_01.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class ResolutionUtil {

    public static int dip2px(Context context, float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        int pxValue = (int)(dpValue*scale+0.5f);
        return pxValue;
    }

    public static int px2dip(Context context, float pxValue){
        float scale = context.getResources().getDisplayMetrics().density;
        int dpValue = (int)(pxValue/scale +0.5f);
        return dpValue;
    }


    // todo 需要简化
    public static int getScreenWidth(Context context){
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    public static int getScreenHeight(Context context){
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    public static float getScreenDensity(Context context){
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.density;
    }

}
