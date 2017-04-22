package com.example.palani.mycontactscall;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Palani on 21-04-2017.
 */

class CustomListAdapter extends ArrayAdapter<String>{

    public final Activity context;
    private final String[] contacts;
    private final String[] number;

    public CustomListAdapter(Activity context, String[] contacts, String[] number) {
        super(context, R.layout.mylist, contacts);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.contacts=contacts;
        this.number=number;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(contacts[position]);
        extratxt.setText(number[position]);
        return rowView;

    };
}
