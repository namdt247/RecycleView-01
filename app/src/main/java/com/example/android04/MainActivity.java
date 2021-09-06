package com.example.android04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // b1: data source
        initData();

        // b2: adapter
        ProductAdapter adapter = new ProductAdapter(this, listProduct);

        // b3: layout manager
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        // b4: recyclerview
        RecyclerView rvProduct = findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }

    private void initData() {
        listProduct.add(new Product("Product 01", "500.000", R.drawable.p1));
        listProduct.add(new Product("Product 02", "600.000", R.drawable.p2));
        listProduct.add(new Product("Product 03", "700.000", R.drawable.p3));
        listProduct.add(new Product("Product 04", "800.000", R.drawable.p4));
        listProduct.add(new Product("Product 05", "900.000", R.drawable.p5));
        listProduct.add(new Product("Product 06", "990.000", R.drawable.p6));
    }
}