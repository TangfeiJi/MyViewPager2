package com.example.myviewpager2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class MainAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private Context mContext;

    public MainAdapter(Context context, @Nullable List<String> data) {
        super(R.layout.item_main_text, data);
        mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        TextView tvContent=helper.getView(R.id.tvContent);
        tvContent.setText("Pager"+item);
    }
}
