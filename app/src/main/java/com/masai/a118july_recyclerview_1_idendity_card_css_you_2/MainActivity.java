package com.masai.a118july_recyclerview_1_idendity_card_css_you_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvRecyclerView);
        buildRecyclerviewData();
        setRecyclerViewAdapter();
        initViews();
    }

    private void setRecyclerViewAdapter() {
        MenuAdapter menuAdapter = new MenuAdapter(menuList, this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false); //this or MainActivity.this
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(menuAdapter);
    }

    private void buildRecyclerviewData() {
        menuList = new ArrayList<>();
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1, "Age :  64", "Profession : Buisness", "Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1, "Age :  56", "Profession : Buisness", "Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1, "Age :  31", "Profession : Buisness", "Masai School"));

    }

    private void initViews() {
        recyclerView = findViewById(R.id.rvRecyclerView);
    }

    @Override
    public void onItemClicked(Menu menu, int position) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        menu.getCompany() + "\n"
                                + menu.getAge()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();
    }

}