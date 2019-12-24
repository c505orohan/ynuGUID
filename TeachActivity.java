package com.example.godproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;

public class TeachActivity extends AppCompatActivity {
    private Button Button003;
    private ListView LV3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //数据库
        SQLiteDatabase db;

        File storagePath = getApplication().getFilesDir();
        String myDbPath = storagePath + "/" + "testdb";

        try{
            //打开数据库
            db = SQLiteDatabase.openDatabase(myDbPath,null,SQLiteDatabase.CREATE_IF_NECESSARY);
            //查询，宿舍对应id:1-4
            String mySQL = "select count(*) as Count " + " from tblFriend" + " where recID > ? " + " and recID < ?";
            String[] args = {"4","12"};
            Cursor c1 = db.rawQuery(mySQL, args);

            //游标移动到头
            c1.moveToFirst();
            //对id，名称，内容进行遍历
            while (!(c1.isFirst())){
                int recID = c1.getInt(0);
                String name = c1.getString(1);
                String content = c1.getString(2);
            }

        }catch (SQLiteException e){

        }
        setContentView(R.layout.activity_teach);
        Button003 = (Button) findViewById(R.id.button7);
        LV3 = findViewById(R.id.lv3);
        LV3.setAdapter(new teachlistAdpter(TeachActivity.this));
        Button003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TeachActivity.this,MainActivity.class);
                startActivity(intent);
                Button003 = (Button) findViewById(R.id.button7);
            }
        });
    }
}
