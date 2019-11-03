package com.example.inclusionesati;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class GroupAdapter extends ArrayAdapter<Group> {

    public GroupAdapter(Context context, List<Group> source) {
        super(context, 0, source);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_group, parent, false);
        }

        return convertView;
    }
}
