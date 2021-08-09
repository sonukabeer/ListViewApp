package com.sonukumariit8.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class KabeerAdapter extends ArrayAdapter<String> {

    private String arr[];
    private Context context;
    public KabeerAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.context=context;
        this.arr=arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_kabeer_layout,parent,false);
        TextView t=convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        // before returnig the view , add click listener
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Clicked On:"+ position, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
