package com.example.whatsappclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    //data source
    List<Contact>items;
    public ContactsAdapter(List<Contact>items){
        this.items=items;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //<viewHolder-><view><inflater><context>
        LayoutInflater inflater=LayoutInflater.from( parent.getContext());
        View view=inflater.inflate(R.layout.activity_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
        // View view=LayoutInflater.from(parent.getContext())
         //       .inflate(R.layout.activity_item,parent,false);
       // return new ViewHolder(view);


    }

    @Override
    public int getItemCount() {
        if (items==null)return 0;
        return items.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Contact contact=items.get(position);
        holder.name.setText(contact.getName());
        holder.status.setText(contact.getStatus());

        if (onImageClickListener!=null){
            holder.image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //action
                    onImageClickListener.onItemClick(holder.getAdapterPosition(),contact);
                }
            });
        }

    }

    //1-interface 2- make object 3- make setter
    onItemClickListener onImageClickListener;

    public void setOnImageClickListener(onItemClickListener onImageClickListener) {
        this.onImageClickListener = onImageClickListener;
    }

    interface onItemClickListener{
        void onItemClick(int position,Contact contact);
    }

    class  ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView status;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            status=itemView.findViewById(R.id.status);
            image=itemView.findViewById(R.id.image);
        }
    }
}
