package com.makeus.recyclerviewtest.View;

import android.view.View;
import android.widget.TextView;

import com.makeus.recyclerviewtest.Person;
import com.makeus.recyclerviewtest.R;

public class OtherChatViewHolder extends ViewHolder {

    TextView tv_chat;

    public OtherChatViewHolder(View itemView){ //아이템을 위한 뷰를 담아두는곳
        super(itemView);

        tv_chat = itemView.findViewById(R.id.tv_chat);
    }

    public void setItem(ViewHolder viewHolder,Person item){ //뷰 객체의 데이터를 다른 것으로 보이도록함

        tv_chat.setText(item.getMemo());
    }

}
