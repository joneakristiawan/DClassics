package com.example.dclassicsbooks.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dclassicsbooks.R;
import com.example.dclassicsbooks.adapter.BookAdapter;
import com.example.dclassicsbooks.model.Book;
import com.example.dclassicsbooks.utils.ToastHelper;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        String message = getIntent().getStringExtra("toast_message");
        if(message != null){
            ToastHelper.show(
                    this,
                    message,
                    R.drawable.ic_success
            );
        }

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book(
                "The Living Economics",
                "Peter J. Boettke",
                4.8f,
                R.drawable.book1));

        bookList.add(new Book(
                "Christopher Columbus",
                "Kristal Zahide",
                4.7f,
                R.drawable.book2));

        bookList.add(new Book(
                "Atomic Habits",
                "James Clear",
                4.8f,
                R.drawable.book3));

        bookList.add(new Book(
                "Adventure of Sherlock Holmes",
                "Arthur Conan Doyle",
                4.6f,
                R.drawable.book4));

        RecyclerView recyclerView = findViewById(R.id.bookRecycler);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.HORIZONTAL,
                        false));

        BookAdapter adapter = new BookAdapter(bookList);

        recyclerView.setAdapter(adapter);
    }
}