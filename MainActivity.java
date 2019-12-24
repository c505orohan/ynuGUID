package com.example.godproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;

import java.io.File;
import java.util.List;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.app.ActivityManager;
public class MainActivity extends AppCompatActivity {
    //数据库
    SQLiteDatabase db;

    private Button Button00;
    private Button Button01;//定义规范
    private Button Button02;
    private Button Button03;
    private Button Button04;
    private Button Button05;
    private ListView lvi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //获取路径
        File storagePath = getApplication().getFilesDir();
        String myDbPath = storagePath + "/" + "testdb";

        //创建数据库
        try{
            db = SQLiteDatabase.openDatabase(myDbPath,null,SQLiteDatabase.CREATE_IF_NECESSARY);
            //创建表，其中有主键，名称，内容
            db.execSQL("create table tblFriend (" + " recID integer PRIMARY KEY autoincrement, "
                    + " name text, " + "conten text );" );

            //向表中插入元素，插入的为名称，内容
            //第一部分：宿舍，4，id:1-4
            db.execSQL( "insert into tblFreind(name, content) values ('楸苑','云南大学呈贡校区楸苑');");
            db.execSQL( "insert into tblFreind(name, content) values ('楠苑','云南大学呈贡校区楠苑');");
            db.execSQL( "insert into tblFreind(name, content) values ('桦苑','云南大学呈贡校区桦苑');");
            db.execSQL( "insert into tblFreind(name, content) values ('梓苑','云南大学呈贡校区梓苑');");
            //第二部分：教学行政楼,7，id:5-11
            db.execSQL( "insert into tblFreind(name, content) values ('图书馆','占地58000平方米，图书馆藏书2766592册，资料室藏书242018册，开放时间周一至周四，周六，周日早八点至晚十点，周五早八点至午十二点');");
            db.execSQL( "insert into tblFreind(name, content) values ('力行楼','云南大学呈贡校区力行楼');");
            db.execSQL( "insert into tblFreind(name, content) values ('格物楼','云南大学呈贡校区格物楼');");
            db.execSQL( "insert into tblFreind(name, content) values ('中山邦翰楼','云南大学呈贡校区中山邦翰楼');");
            db.execSQL( "insert into tblFreind(name, content) values ('文汇楼','云南大学呈贡校区文汇楼');");
            db.execSQL( "insert into tblFreind(name, content) values ('学生会堂','云南大学呈贡校区学生会堂');");
            db.execSQL( "insert into tblFreind(name, content) values ('明远楼','云南大学呈贡校区明远楼');");
            //第三部分：学院，id:15,12-26
            db.execSQL( "insert into tblFreind(name, content) values ('文学院','现辖中国语言文学系，新闻学系，历史学系，哲学系和人文素质教育部');");
            db.execSQL( "insert into tblFreind(name, content) values ('新闻学院','始于1985年，办学历史超过30年，是西南地区最早的新闻传播教育机构之一');");
            db.execSQL( "insert into tblFreind(name, content) values ('经济学院','前身为1923年的云南大学经济系，是我国大学中最早成立的经济系之一');");
            db.execSQL( "insert into tblFreind(name, content) values ('法学院','始建与1931年，是西南地区最早的法科之一，1933年成立法律系');");
            db.execSQL( "insert into tblFreind(name, content) values ('外国语学院','外国语学院目前拥有近65名教师，其中教授9名，副教授20名，是学校培养高层次、国际性人才的一个重要组成部分');");
            db.execSQL( "insert into tblFreind(name, content) values ('马克思主义学院','始建与20世纪50年代，始称“政治课教研室”，后改为“马列主义教研室”');");
            db.execSQL( "insert into tblFreind(name, content) values ('商旅学院','云南大学工商管理教育创始于20世纪40年代，1979年开设“企业管理”本科专业，成为我国改革开放以来最早兴办工商管理教育的高校之一');");
            db.execSQL( "insert into tblFreind(name, content) values ('体育学院','云南大学于1990年开设体育教育专科专业，2001年开设社会体育本科专业');");
            db.execSQL( "insert into tblFreind(name, content) values ('数学与统计学院','前身为数学系，创立于1933年，统计系创立于1989年');");
            db.execSQL( "insert into tblFreind(name, content) values ('物理与天文学院','于1933年创立数理系，至今已有八十多年，后与1945年成立物理系');");
            db.execSQL( "insert into tblFreind(name, content) values ('化学科学与工程学院','创建于1937年，时任校长、著名数学家熊庆来聘请法国国家博士赵雁来先生担任理化系系主任，主持化学学科的教学和科研工作');");
            db.execSQL( "insert into tblFreind(name, content) values ('生命科学学院','云南大学呈贡校区生命科学学院，发轫于1937年，其前身为植物学系。');");
            db.execSQL( "insert into tblFreind(name, content) values ('信息学院','整合了原有的信息与电子科学系、计算机科学系和云南大学计算中心的基础上于1998年4月组建成立');");
            db.execSQL( "insert into tblFreind(name, content) values ('软件学院','是经国家教育部和发改委批准建立的全国首批35所国家示范性软件学院之一。学院拥有“计算机科学与技术”、“信息通信工程”博士学位授权点');");
            db.execSQL( "insert into tblFreind(name, content) values ('建筑与规划学院','起源于20世纪20年代的土木系，后于2001年开办了其他相关专业');");
            //第四部分：大门，4,id:27-30
            db.execSQL( "insert into tblFreind(name, content) values ('南门','云南大学呈贡校区南门，南一门现处于关闭状态');");
            db.execSQL( "insert into tblFreind(name, content) values ('北门','云南大学呈贡校区北门，云南大学的正门');");
            db.execSQL( "insert into tblFreind(name, content) values ('西门','云南大学呈贡校区西门，云南大学西侧门');");
            db.execSQL( "insert into tblFreind(name, content) values ('东门','云南大学呈贡校区东门，由于施工处于关闭状态');");
            //第五部分：其他设施，5，id:31-35
            db.execSQL( "insert into tblFreind(name, content) values ('校医院','创建于1999年，是一所综合性医院');");
            db.execSQL( "insert into tblFreind(name, content) values ('馀味堂','云南大学呈贡校区馀味堂，靠近泽胡的食堂');");
            db.execSQL( "insert into tblFreind(name, content) values ('知味堂','云南大学呈贡校区知味堂，靠近南门的食堂');");
            db.execSQL( "insert into tblFreind(name, content) values ('钟楼','云南大学呈贡校区钟楼，在学生会堂旁');");
            db.execSQL( "insert into tblFreind(name, content) values ('时光影城','云南大学呈贡校区时光影城，在图书馆旁');");

            db.close();
        }catch (SQLiteException e){

        }

        setContentView(R.layout.activity_main);
        lvi = (ListView) findViewById(R.id.listView);
        Button00 = (Button) findViewById(R.id.button0);
        Button01 = (Button) findViewById(R.id.button1);//id后面为上方button的id
        Button02 = (Button) findViewById(R.id.button2);
        Button03 = (Button) findViewById(R.id.button3);
        Button04 = (Button) findViewById(R.id.button4);
        Button05 = (Button) findViewById(R.id.button5);
        Button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,DormActivity.class);
                startActivity(intent);
                Button00 = (Button) findViewById(R.id.button0);
            }
        });
        Button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,CollegeActivity.class);
                startActivity(intent);
                Button01 = (Button) findViewById(R.id.button1);
            }
        });
        Button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TeachActivity.class);
                startActivity(intent);
                Button02 = (Button) findViewById(R.id.button2);
            }
        });
        Button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,DoorActivity.class);
                startActivity(intent);
                Button03 = (Button) findViewById(R.id.button3);
            }
        });
        Button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,OtherActivity.class);
                startActivity(intent);
                Button04 = (Button) findViewById(R.id.button4);
            }
        });
        Button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,OtherActivity.class);
                startActivity(intent);
                Button05 = (Button) findViewById(R.id.button5);
            }
        });
    }



}
