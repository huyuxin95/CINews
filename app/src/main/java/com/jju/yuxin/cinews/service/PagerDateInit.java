package com.jju.yuxin.cinews.service;

import android.content.Context;

import com.jju.yuxin.cinews.R;

import java.util.ArrayList;

/**
 * =============================================================================
 * Copyright (c) 2016 yuxin All rights reserved.
 * Packname com.jju.yuxin.cinews.service
 * Created by yuxin.
 * Created time 2016/11/14 0014 上午 10:06.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public class PagerDateInit {

    /**
     * 根据传入的viewtag,判断需要加载那个模块的viewpager信息
     *
     * @param context
     * @param viewtag
     * @return
     */
    public static ArrayList<Integer> getInnerPagerdata(Context context, String viewtag) {

        ArrayList<Integer> picList = new ArrayList<Integer>();

        //获取ViewPager对应的导航栏的文字信息
        String[] stringArray = context.getResources().getStringArray(R.array.new_title_list);

        //加载产业新闻的viewpager
        if (stringArray[0].equals(viewtag)) {
            //数据的初始化
            picList.add(R.drawable.ab);
            picList.add(R.drawable.ae);
            picList.add(R.drawable.ah);
            picList.add(R.drawable.bi);

        }

        return picList;


    }

    /**
     * 根据传入的viewtag,需要加载哪个模块的ListView内容
     *
     * @param context
     * @param viewtag
     * @return
     */
    public static String[] getItemListdata(Context context, String viewtag) {

        /**
         * 这里是模拟加载
         *
         *
         <item>产业新闻</item>
         <item>动漫游戏</item>
         <item>工艺美术</item>
         <item>休闲旅游</item>
         <item>园区基地</item>
         <item>演艺传媒</item>
         <item>文化金融</item>
         <item>协会动态</item>
         */
        //获取ViewPager对应的导航栏的文字信息
        String[] stringArray = context.getResources().getStringArray(R.array.new_title_list);

        //加载产业新闻的ListViewn内容
        if (stringArray[0].equals(viewtag)) {
            return stringArray;

            //加载动漫游戏的ListViewn内容
        } else if (stringArray[1].equals(viewtag)) {
            return stringArray;

            //加载工艺美术的ListViewn内容
        } else if (stringArray[2].equals(viewtag)) {
            return stringArray;

            //加载休闲旅游的ListViewn内容
        } else if (stringArray[3].equals(viewtag)) {
            return stringArray;

            //加载园区基地的ListViewn内容
        } else if (stringArray[4].equals(viewtag)) {
            return stringArray;

            //加载演艺传媒的ListViewn内容
        } else if (stringArray[5].equals(viewtag)) {
            return stringArray;

            //加载文化金融的ListViewn内容
        } else if (stringArray[6].equals(viewtag)) {
            return stringArray;

            //加载协会动态的ListViewn内容
        } else if (stringArray[7].equals(viewtag)) {
            return stringArray;

        }else{
            return stringArray;
        }
    }
}
