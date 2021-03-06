package com.example.user.eshtri_first_pafge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstPage extends AppCompatActivity {

    //Our database
    int idCounter = 0;
    ArrayList<User> users = new ArrayList<User>();

    int productCounter = 0;
    ArrayList<Product> products = new ArrayList<Product>();

    User activeUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        User admin = new User(idCounter++, "admin", "01226006598", "heshammedhat@acm.org", "admin");
        users.add(0, admin);

    }

    public void contactUs(View v) {
        Intent intent = new Intent(this, ContactUs.class);

        startActivity(intent);
    }

    public void aboutUs(View v) {
        //TODO
    }

    public void register(View v) {
        Intent intent = new Intent(this, SignUp.class);

        startActivity(intent);
    }

    public void signIn(View v) {
        Intent intent = new Intent(this, LoginActivity.class);

        startActivity(intent);
    }


    public void functionUserYaSajed() {

        EditText nameText = (EditText)findViewById(R.id.name);
        String name = nameText.getText().toString();

        EditText usernameText = (EditText) findViewById(R.id.username);
        String username = usernameText.getText().toString();

        EditText phone_numberText = (EditText) findViewById(R.id.phone);
        String number = phone_numberText.getText().toString();

        EditText emailText = (EditText) findViewById(R.id.email);
        String email =  emailText.getText().toString();

        users.add(idCounter, new User(idCounter, name, number, email, username));
        idCounter++;


    }

    public void functionProductYaSajed() {

        EditText nameText = (EditText) findViewById(R.id.name);
        String name = nameText.getText().toString();

        EditText descriptionText = (EditText) findViewById(R.id.description);
        String description = descriptionText.getText().toString();

        EditText detailsText = (EditText) findViewById(R.id.details);
        String details = detailsText.getText().toString();

        EditText addressText = (EditText) findViewById(R.id.address);
        String address = addressText.getText().toString();

        EditText priceText = (EditText) findViewById(R.id.price);
        String priceString = priceText.getText().toString();
        int price = Integer.parseInt(priceString);



        products.add(productCounter, new Product(name, price, 0, address, description, details, 1));
        //TODO
        productCounter++;


    }

}
