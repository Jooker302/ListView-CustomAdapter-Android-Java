package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//public class MainActivity extends AppCompatActivity {
//
//    private ListView contactListView;
//    private List<Contact> contactList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Create sample contacts
//        contactList = new ArrayList<>();
//        contactList.add(new Contact("Abdul Moeed", "420"));
//        contactList.add(new Contact("Omer Farooq", "123"));
//        contactList.add(new Contact("M. Shahzaib", "567"));
//
//        // Set up the ListView
//        contactListView = findViewById(R.id.contactListView);
//        ArrayAdapter<Contact> contactAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text1, contactList);
//        contactListView.setAdapter(contactAdapter);
//
//        // Handle click events on ListView items
//        contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Contact selectedContact = contactList.get(position);
//                String message = "Name: " + selectedContact.getName() + "\nPhone: " + selectedContact.getPhoneNumber();
//                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
public class MainActivity extends AppCompatActivity {

    private ListView contactListView;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create sample contacts
        contactList = new ArrayList<>();
        contactList.add(new Contact("Abdul Moeed", "420"));
        contactList.add(new Contact("Omer Farooq", "123"));
        contactList.add(new Contact("M. Shahzaib", "456"));

        // Set up the ListView
        contactListView = findViewById(R.id.contactListView);
        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);
        contactListView.setAdapter(contactAdapter);

        // Handle click events on ListView items
        contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact selectedContact = contactList.get(position);
                String message = "Name: " + selectedContact.getName() + "\nPhone: " + selectedContact.getPhoneNumber();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

