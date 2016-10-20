package com.qf.expandabletextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseBooleanArray;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {

    SparseBooleanArray mCollapsedStatus;


    private ExpandableTextView expTv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expTv1 = (ExpandableTextView) findViewById(R.id.expand_text_view);
        mCollapsedStatus = new SparseBooleanArray();

        expTv1.setText("截至今天中午12时，我市海域2219艘渔船已全部回港或就近避风、" +
                "180名渔排人员全部上岸。今天9:50“莎莉嘉”登陆海南，" +
                "午后我市风力逐渐减弱，全市普遍出现降雨天气。11时至17时，" +
                "全市平均降雨约42毫米，最大降雨量为90毫米（梧桐村），" +
                "最大1小时降雨量40.9毫米。罗湖、光明、龙华、宝安已启动防汛Ⅳ级应急响应",mCollapsedStatus,0);
    }


}
