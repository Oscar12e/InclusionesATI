package com.example.inclusionesati;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<Group> groupsAdapter;
    private List<Group> groups;
    private ListView groupList;
    private int selectedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupList = findViewById(R.id.dlist_groups);
        groups = new ArrayList<>();
        Group soDesign = new Group();
        soDesign.name = "Disenio de software";
        groupsAdapter = new GroupAdapter(this, groups);
        groupList.setAdapter(groupsAdapter);
    }

    protected void onStart() {
        super.onStart();
        selectedValue = -1;
    }

    public void addRow(View view){

    }


}
