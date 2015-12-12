package com.rosenberg.shaul.ex3recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shaul on 12/12/15.
 */



public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.CustomViewHolder>{

    private List<TaskItem> taskItemList;

    public MyRecyclerAdapter(List<TaskItem> taskItemList){
        this.taskItemList = taskItemList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);

        CustomViewHolder viewHolder = new CustomViewHolder(view);
        //viewHolder.textView.setText();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int position) {
        TaskItem taskItem = taskItemList.get(position);
        //customViewHolder.imageView.setImageResource(R.drawable.dot);
        customViewHolder.textView.setText(taskItem.getItemName());

        //creating the click Listener
        /*View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomViewHolder holder = (CustomViewHolder) view.getTag();
                int position = holder.getAdapterPosition();

                TaskItem taskItem = taskItemList.get(position);
                Toast.makeText(mContext, taskItem.getItemName(), Toast.LENGTH_SHORT).show();
            }
        };

        customViewHolder.textView.setOnClickListener(clickListener);
        customViewHolder.imageView.setOnClickListener(clickListener);

        customViewHolder.textView.setTag(customViewHolder);
        customViewHolder.imageView.setTag(customViewHolder); */
    }

    @Override
    public int getItemCount() {
        return (null != taskItemList ? taskItemList.size() : 0);
    }


    //CustomViewHolder Class
    public class CustomViewHolder extends RecyclerView.ViewHolder{

        protected ImageView imageView;
        protected TextView textView;

        public CustomViewHolder(View view){
            super(view);
            //this.imageView = (ImageView)view.findViewById(R.id.thumbnail); for adding pictures to tasks
            this.textView = (TextView)view.findViewById(R.id.title);
        }
    }
}
