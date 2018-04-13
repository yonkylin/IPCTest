package yonky.ipctest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent= new Intent(this,SecondActivity.class);
        Button mButton= (Button)findViewById(R.id.bt_main);
        mButton.setOnClickListener((v)->startActivity(intent));
    }
}
