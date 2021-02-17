package com.makeus.recyclerviewtest.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeus.recyclerviewtest.Person;
import com.makeus.recyclerviewtest.R;

public class OtherChatStartViewHolder extends ViewHolder {

    ImageView img_view;
    TextView tv_other_name;
    TextView tv_chat;

    public OtherChatStartViewHolder(View itemView){ //아이템을 위한 뷰를 담아두는곳
        super(itemView);

        img_view = itemView.findViewById(R.id.img_view);
        tv_other_name = itemView.findViewById(R.id.tv_other_name);
        tv_chat = itemView.findViewById(R.id.tv_chat);
    }

    public void setItem(ViewHolder viewHolder,Person item){ //뷰 객체의 데이터를 다른 것으로 보이도록함

        img_view.setBackground(item.getImage());
        tv_other_name.setText(item.getName());
        tv_chat.setText(item.getMemo());
    }

}
