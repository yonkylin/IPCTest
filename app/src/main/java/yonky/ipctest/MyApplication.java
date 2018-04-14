package yonky.ipctest;

import android.app.Application;
import android.util.Log;

/**
 * Created by Administrator on 2018/4/14.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("yonky","create MyApplication");
    }
}
