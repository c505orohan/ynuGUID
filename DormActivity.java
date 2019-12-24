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

import java.io.File;

public class DormActivity extends AppCompatActivity {

    private Button Button001;
    private ListView LV1;

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
            String[] args = {"0","5"};
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

        setContentView(R.layout.activity_dorm);
        Button001 = (Button) findViewById(R.id.button);
        LV1 = (ListView) findViewById(R.id.lv1);
        LV1.setAdapter(new dormlistAdpter(DormActivity.this));
        Button001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(DormActivity.this,MainActivity.class);
                startActivity(intent);
                Button001 = (Button) findViewById(R.id.button);
            }
        });

    }

}