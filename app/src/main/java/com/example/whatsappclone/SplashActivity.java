package com.example.whatsappclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ContactsAdapter contactsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView=findViewById(R.id.recycler_view);
        List<Contact>data=createContactsList();
        contactsAdapter=new ContactsAdapter(data);
       recyclerView.setAdapter(contactsAdapter);
       // activity make callback
        contactsAdapter.setOnImageClickListener(new ContactsAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position, Contact contact) {
                Log.e("pos",""+position);
                Toast.makeText(SplashActivity.this,contact.getName(),Toast.LENGTH_LONG).show();
            }
        });

    }
    List<Contact> createContactsList(){
        List<Contact>contacts=new ArrayList<>();
        contacts.add(new Contact("mahmoud","online"));
        contacts.add(new Contact("shimaa","online"));
        contacts.add(new Contact("eman","online"));
        contacts.add(new Contact("antar","online"));
        contacts.add(new Contact("nor","online"));
        contacts.add(new Contact("farida","online"));
        contacts.add(new Contact("ahmed","online"));
        contacts.add(new Contact("mohamed","online"));
        contacts.add(new Contact("yara","online"));
        for (int i=0;i<1000;i++){
            contacts.add(new Contact("contacts","Buse"));
        }
        return contacts;
    }

}