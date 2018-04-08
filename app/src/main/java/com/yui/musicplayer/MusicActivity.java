package com.yui.musicplayer;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 音乐播放器主页面
 *
 * @author liaoyuhuan
 * @name ${PROJECT_NAME}
 * @class
 * @time 2018/4/8  10:38
 * @description
 */
public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideActionbar();
        setContentView(R.layout.activity_music);
    }

    /**
     * 隐藏ActionBar
     */
    private void hideActionbar() {
        ActionBar actionBar = getActionBar();
        android.support.v7.app.ActionBar actionBarV7 = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        } else if (actionBarV7 != null) {
            actionBarV7.hide();
        }
    }
}
