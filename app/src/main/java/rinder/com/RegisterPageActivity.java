package rinder.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegisterPageActivity extends AppCompatActivity {

    Button backButton;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        init();

        backButton.setOnClickListener(e -> {
            Intent homePage = new Intent(this, MainActivity.class);
            startActivity(homePage);
        });

        registerButton.setOnClickListener(e -> {
            Intent homePage = new Intent(this, MainActivity.class);
            startActivity(homePage);
        });
    }

    private void init(){
        backButton = findViewById(R.id.backBtn);
        registerButton = findViewById(R.id.registerBtn);
    }
}