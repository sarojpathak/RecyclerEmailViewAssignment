package com.saroj.recycleremailviewassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class GmailAdapter extends RecyclerView.Adapter<GmailAdapter.ContactViewHolder>{

    Context context;
    List<Gmails> gmailsList;

    public GmailAdapter(Context mContext, List<Gmails> gmailsList) {
        this.context = mContext;
        this.gmailsList = gmailsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_gmail,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Gmails gmails = gmailsList.get(position);
        holder.imageView.setImageResource(gmails.getImageId());
        holder.textView.setText(gmails.getName());
        holder.textView2.setText(gmails.getMessage());
        holder.textView3.setText(gmails.getData());

    }

    @Override
    public int getItemCount() {
        return gmailsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        TextView textView, textView2,textView3;

        public ContactViewHolder(View itemView){
            super(itemView);
        imageView=itemView.findViewById(R.id.imageView);
        textView=itemView.findViewById(R.id.textView);
        textView2=itemView.findViewById(R.id.textView2);
        textView3=itemView.findViewById(R.id.textView3);
        }

    }
}
