package yonky.ipctest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

/**
 * Created by Administrator on 2018/4/13.
 */

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e("yonky","create ThirdActivity");
        Intent intent = new Intent(this,MainActivity.class);
        Button bt= (Button)findViewById(R.id.bt_third);
        bt.setOnClickListener((v)->startActivity(intent));
    }
}
