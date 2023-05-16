package com.example.assignment3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private List<Contact> contactList;

    public ContactAdapter(Context context, List<Contact> contactList) {
        super(context, 0, contactList);
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_list_item, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.contactNameTextView);
        TextView phoneTextView = convertView.findViewById(R.id.contactPhoneTextView);

        Contact contact = contactList.get(position);

        nameTextView.setText(contact.getName());
        phoneTextView.setText(contact.getPhoneNumber());

        return convertView;
    }
}

