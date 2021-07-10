package com.masai.a118july_recyclerview_1_idendity_card_css_you_2;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView mTvAge;
    private TextView mTvItemName;
    private TextView mTvCompany;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public MenuViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        imageView = itemView.findViewById(R.id.ivItem);
        mTvAge = itemView.findViewById(R.id.tvItemAge);
        mTvItemName = itemView.findViewById(R.id.tvProfession);
        mTvCompany = itemView.findViewById(R.id.tvCompany);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }

    //setting of data here
    public void setData(Menu menu) {
        imageView.setImageResource(menu.getImage());
        mTvAge.setText(menu.getAge());
        mTvItemName.setText(menu.getProfession());
        mTvCompany.setText(menu.getCompany());

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(menu, getAdapterPosition());
            }
        });
    }
}
