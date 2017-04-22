package com.example.palani.mycontactscall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static ListView listView1;
    String contacts[]={"Ajay","Sachin","Sumit","Tarun","Yogesh","Gokul"};
    String number[]={"1475856935","1254789658","1457896532","2582224487","7856023145","4561234758"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter adapter = new CustomListAdapter(this, contacts, number);
        listView1=(ListView)findViewById(R.id.listview);
        listView1.setAdapter(adapter);
        registerForContextMenu(listView1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0,v.getId(), 0,"CALL");
        menu.add(0, v.getId(),0,"SMS");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="CALL"){
            Toast.makeText(getApplicationContext(),"Calling ",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"Sending Sms ",Toast.LENGTH_LONG).show();
        }else {
            return false;
        }
        return true;
    }
}
