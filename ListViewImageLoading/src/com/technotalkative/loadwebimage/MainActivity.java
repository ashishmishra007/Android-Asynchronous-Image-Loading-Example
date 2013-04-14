package com.technotalkative.loadwebimage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    
    ListView list;
    LazyAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list=(ListView)findViewById(R.id.listView1);
        adapter=new LazyAdapter(this, imageUrls);
        list.setAdapter(adapter);
    }
    
    @Override
    public void onDestroy()
    {
        list.setAdapter(null);
        super.onDestroy();
    }
    
    private String imageUrls[] = {
    		"https://si0.twimg.com/profile_images/2053165008/ac-new_bigger.jpg",
    		"https://si0.twimg.com/profile_images/1751120073/green-android-rotate-02__1__copy_9_bigger.jpeg",
    		"https://si0.twimg.com/profile_images/2508170683/m8jf0po4imu8t5eemjdd_bigger.png",
    		"https://si0.twimg.com/profile_images/1517737798/aam-twitter-right-final_bigger.png",
    		"https://si0.twimg.com/profile_images/1265264136/twitter_bg3_bigger.png",
    		"https://si0.twimg.com/profile_images/64827025/android-wallpaper6_2560x160_bigger.png",
    		"https://si0.twimg.com/profile_images/839219643/gals_twitter_bigger.png",
    		"https://si0.twimg.com/profile_images/2244328948/ADC4_Twitter_128_bigger.jpg",
    		"https://si0.twimg.com/profile_images/956404323/androinica-avatar_bigger.png",
    		"https://si0.twimg.com/profile_images/1417650153/android-hug_bigger.png",
    		"https://si0.twimg.com/profile_images/1084169260/twitter_logo3_bigger.png",
    		"https://si0.twimg.com/profile_images/895713856/android_large_bigger.png",
    		"https://si0.twimg.com/profile_images/328066023/droid_con150_bigger.jpg",
    		"https://si0.twimg.com/profile_images/909231146/Android_Biz_Man_bigger.png",
    		"https://si0.twimg.com/profile_images/77641093/AndroidPlanet_bigger.png",
    		"https://si0.twimg.com/profile_images/60788468/androffice_bigger.png",
    		"https://si0.twimg.com/profile_images/262620111/logodroid_bigger.png",
    		"https://si0.twimg.com/profile_images/1024243227/Android-Apps_bigger.jpg",
    		"https://si0.twimg.com/profile_images/2172264088/logo-testa-quad_bigger.png",
    		"https://si0.twimg.com/profile_images/1186449790/mestre-android-twitter_bigger.jpg",
    		"https://si0.twimg.com/profile_images/1785885571/androidvenezuela_bigger.png"
    		
    }; 
}