package com.example.flipkartrecvw;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView mimageView;
    TextView mTitle,mPrice,mWeight,mStrikeprice;
    Button mAdditem;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mimageView=itemView.findViewById(R.id.imageiv);
        this.mTitle=itemView.findViewById(R.id.title_tv);
        this.mPrice=itemView.findViewById(R.id.pricetv);
        this.mWeight=itemView.findViewById(R.id.weighttv);
        this.mAdditem=itemView.findViewById(R.id.additem_btn);
        this.mStrikeprice=itemView.findViewById(R.id.strikepricetv);
        mStrikeprice.setPaintFlags(mStrikeprice.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);

    }
}
