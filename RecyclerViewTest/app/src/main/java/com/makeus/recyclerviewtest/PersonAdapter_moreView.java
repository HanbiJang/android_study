package com.makeus.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeus.recyclerviewtest.View.CenterViewHolder;
import com.makeus.recyclerviewtest.View.MyChatStartViewHolder;
import com.makeus.recyclerviewtest.View.OtherChatStartViewHolder;
import com.makeus.recyclerviewtest.View.ViewHolder;

import java.util.ArrayList;

public class PersonAdapter_moreView extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<Person> items = new ArrayList<>();

    @NonNull
    @Override //뷰홀더 객체의 생성,재사용시 자동으로 호출
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //xml 레이아웃으로 뷰객체를 생성, 뷰홀더 객체에 담아 반환
        //여러가지 뷰타입을 나눠 경우마다 다르게 만들 수 있음

        //인플레이션
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
//        View itemView = inflater.inflate(R.layout.view, viewGroup, false);
        View itemView;


        //뷰 홀더 구분
        //뷰 코드에 따라서 다르게 뷰를 인플레이트하고, 만들어 주겠다
        if(viewType == ViewTypeCode.VIEW_CENTER)
        {
            itemView = inflater.inflate(R.layout.view_center, viewGroup, false);
            return new CenterViewHolder(itemView);
        }
        else if(viewType == ViewTypeCode.VIEW_MY_CHAT)
        {
            itemView = inflater.inflate(R.layout.view_my_chat, viewGroup, false);
            return new MyChatStartViewHolder(itemView);
        }
        else if(viewType == ViewTypeCode.VIEW_MY_CHAT_START)
        {
            itemView = inflater.inflate(R.layout.view_my_chat_start, viewGroup, false);
            return new MyChatStartViewHolder(itemView);
        }
        else if(viewType == ViewTypeCode.VIEW_OTHER_CHAT)
        {
            itemView = inflater.inflate(R.layout.view_other_chat, viewGroup, false);
            return new MyChatStartViewHolder(itemView);
        }
        else
        {
            itemView = inflater.inflate(R.layout.view_other_chat_start, viewGroup, false);
            return new OtherChatStartViewHolder(itemView);
        }


    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Person item= items.get(position); //기존 뷰객체의 데이터를 position 변수에 맞게 꺼냄
        viewHolder.setItem(viewHolder,item); //ViewHolder를 상속받은 각각의 뷰타입 홀더 클래스들에게 데이터를 설정함

    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getViewType();
    }

/*
    public void setItem(ViewHolder viewHolder,Person item){

        //ViewHolder를 상속받은 각각의 뷰타입 홀더 클래스들에게 데이터를 설정함
        viewHolder.setItem(item);


        if(viewHolder instanceof CenterViewHolder)
        {
            ((CenterViewHolder) viewHolder).setItem(item);
        }
        else if(viewHolder instanceof MyChatStartViewHolder)
        {
            ((MyChatStartViewHolder) viewHolder).setItem(item);
        }
        else if(viewHolder instanceof MyChatViewHolder)
        {
            ((MyChatViewHolder) viewHolder).setItem(item);
        }
        else if(viewHolder instanceof OtherChatStartViewHolder)
        {
            ((OtherChatStartViewHolder) viewHolder).setItem(item);
        }
        else
        {
            ((OtherChatViewHolder) viewHolder).setItem(item);
        }


    }
*/
    @Override
    public int getItemCount() { //어댑터에서 관리하는 아이템 개수 반환
        return items.size();
    }

    //어댑터에서 NewLetter 객체를 사용할 수 있도록하는 함수들
    public void addItem(Person item){
        items.add(item);
    }
    public void setItems(ArrayList<Person> items){
        this.items=items;
    }
    public Person getItem(int position){
        return items.get(position);
    }
    public void setItem(int position, Person item){
        items.set(position,item);
    }


}
