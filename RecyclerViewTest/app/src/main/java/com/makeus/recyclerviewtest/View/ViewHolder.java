package com.makeus.recyclerviewtest.View;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.makeus.recyclerviewtest.Person;

public abstract class ViewHolder extends RecyclerView.ViewHolder{

    //아이템을 위한 뷰를 담아두는곳
    public ViewHolder(View itemView){
        super(itemView);
    }
    public abstract void setItem(ViewHolder viewHolder,Person item); //뷰 객체의 데이터를 다른 것으로 보이도록함

}
