package com.example.messages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        //Create Data
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(R.drawable.mika_perlado_worker,"Mika Perlado","Thank you!", "Today 12:00pm" ));
        arrayList.add(new Person(R.drawable.philip_screw_worker,"Philip Screw","Let's meet up at the cit...", "yesterday 12:45pm" ));
        arrayList.add(new Person(R.drawable.felix_navidad_worker,"Felix Navidad","Sure I would be glad to...", "Monday 8:25am" ));
        arrayList.add(new Person(R.drawable.eloisa_soberano_worker,"Eloisa Soberano","Hello I have Work Experi...", "A month ago 19:07 pm" ));

        //We make custom adapter
        PersonAdapter perosonAdapter = new PersonAdapter(this,R.layout.listview,arrayList);
        listView.setAdapter(perosonAdapter);



    }

}