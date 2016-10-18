package com.qf.moretextactivy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private CollapsedTextView mTvCollapsedTextView;
    private Button mBt1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBt1Button = (Button) findViewById(R.id.bt1);
        mTvCollapsedTextView = (CollapsedTextView) findViewById(R.id.tv);

        mBt1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean collapsed = mTvCollapsedTextView.isCollapsed;
                if (collapsed) {//如果折叠了,就展开
                    mTvCollapsedTextView.collapse();
                    mBt1Button.setText("收起文章");
                } else {//如果没折叠,就折叠
                    mTvCollapsedTextView.collapse();
                    mBt1Button.setText("查看全文");
                }
            }
        });

    }
}
