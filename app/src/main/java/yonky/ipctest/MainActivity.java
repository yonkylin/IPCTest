package yonky.ipctest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import yonky.ipctest.bean.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("yonky","create MainActivity");
        Intent intent= new Intent(this,SecondActivity.class);
        Button mButton= (Button)findViewById(R.id.bt_main);
        mButton.setOnClickListener((v)->startActivity(intent));
        String filePath= getExternalCacheDir().toString()+File.pathSeparator+"cache.txt";

           File file = new File(filePath);

           if(!file.exists()){
               try{
              boolean status= file.createNewFile();
               }catch(Exception e){
                   Log.e("yonky",e.toString());
               }
           }



        User user = new User(0,"Lucy",false);
        try{
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(user);
            out.close();
            Log.e("yonky",user.getName()+"\t"+user.getUserId());
    }catch (IOException ex){
        Log.e("yonky",ex.toString());
    }

        try{
        ObjectInputStream in= new ObjectInputStream(new FileInputStream(file));
        User newUser=(User)in.readObject();
        in.close();
        Log.e("yonky",newUser.getName()+"\t"+user.getUserId()+"\n"+getExternalCacheDir().toString());
    }catch (Exception ex){
        Log.e("yonky",ex.toString());
    }



}
}
