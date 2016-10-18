package com.qf.moretexta2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import z.collapsedtextviewlibrary.CollapsedTextView;

public class MainActivity extends AppCompatActivity {

    private CollapsedTextView mTvCollapsedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvCollapsedTextView = (CollapsedTextView) findViewById(R.id.tv);
        mTvCollapsedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean collapsed = mTvCollapsedTextView.isCollapsed;
                if (collapsed) {//如果折叠了,就展开
                    mTvCollapsedTextView.collapse();
                } else {//如果没折叠,就折叠
                    mTvCollapsedTextView.collapse();

                }
            }
        });

    }
}
