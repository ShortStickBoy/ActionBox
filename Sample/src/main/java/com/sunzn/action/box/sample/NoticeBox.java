package com.sunzn.action.box.sample;

import android.content.Context;
import android.view.View;

import com.sunzn.action.box.library.ActionBox;

/**
 * Created by sunzn on 2017/2/17.
 */

public class NoticeBox extends ActionBox {

    public static NoticeBox newBox(Context context) {
        return new NoticeBox(context, R.layout.notice_box);
    }

    public static NoticeBox newBox(Context context, int resource) {
        return new NoticeBox(context, resource);
    }

    private NoticeBox(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void onActionBoxCreated() {
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                MessageBox.newBox(getContext()).setCancelable(true).setCanceledOnTouch(true).create().show();
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

}
