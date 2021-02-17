package com.makeus.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    ArrayList<Person> items = new ArrayList<>();

    @NonNull
    @Override //뷰홀더 객체의 생성,재사용시 자동으로 호출
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //xml 레이아웃으로 뷰객체를 생성, 뷰홀더 객체에 담아 반환
        //여러가지 뷰타입을 나눠 경우마다 다르게 만들 수 있음

        //인플레이션
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.view, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        //기존 뷰객체의 데이터를 position 변수에 맞게 꺼냄

        Person item= items.get(position);
        viewHolder.setItem(item);

    }

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


    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_date;
        TextView tv_memo;
        TextView tv_name;

        ImageView img_view;

        public ViewHolder(View itemView){ //아이템을 위한 뷰를 담아두는곳
            super(itemView);

            tv_date = itemView.findViewById(R.id.tv_date);
            tv_memo = itemView.findViewById(R.id.tv_memo);
            tv_name = itemView.findViewById(R.id.tv_name);

            img_view= itemView.findViewById(R.id.img_view);

        }

        public void setItem(Person item){ //뷰 객체의 데이터를 다른 것으로 보이도록함
            tv_date.setText(item.getDate());
            tv_memo.setText(item.getMemo());
            tv_name.setText(item.getName());

            img_view.setBackground(item.getImage());
        }
    }




}
