package com.tab.TabActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tab_host = (TabHost) findViewById(R.id.tab_host);
      
        tab_host.setup();

        TabSpec tabspec1 = tab_host.newTabSpec("TAB_1");
        tabspec1.setIndicator("Tab 1");
        tabspec1.setContent(R.id.first_tab);
        tab_host.addTab(tabspec1);
        TabSpec tabspec2 = tab_host.newTabSpec("TAB_2");
        tabspec2.setIndicator("Tab 2");
        tabspec2.setContent(R.id.second_tab);
        tab_host.addTab(tabspec2);

        TabSpec tabspec3 = tab_host.newTabSpec("TAB_3");
        tabspec3.setIndicator("Tab 3");
        tabspec3.setContent(R.id.third_tab);
        tab_host.addTab(tabspec3);

        
        tab_host.setCurrentTab(0);
        
    }
}