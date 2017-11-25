package com.studios.flytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayList<OrderClass> list;

    private OrderAdapter adapter;
    private ArrayList<String> names;
    private ArrayList<String> travels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        listView = findViewById(R.id.orders_list);
        list = new ArrayList<>();
        adapter = new OrderAdapter(this, list);

        names = new ArrayList<>();
        travels = new ArrayList<>();

        names.add("MAZENTSEV");
        names.add("MUKHORYAPOV");

        travels.add("Астана - Алма-ата / 01.01.2017");
        travels.add("Москва - Санкт-Петербург / 03.03.2017");

        list.add(new OrderClass("№ 201245123", "23.10.2016", "1", names, travels));

        list.add(new OrderClass("№ 201245123", "23.10.2016", "0", names, travels));
        list.add(new OrderClass("№ 201245123", "23.10.2016", "2", names, travels));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(OrdersActivity.this, DetailsActivity.class));
            }
        });

    }
}
