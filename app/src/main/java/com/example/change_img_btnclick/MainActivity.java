package com.example.change_img_btnclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;
//    int imageIndex = 0; // 0 for image1, 1 for image2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);

//        setImage(imageIndex);  // Set initial image

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.img2);
//                imageIndex = (imageIndex + 1) % 2;
//                setImage(imageIndex);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    private void setImage(int index) {
//        if (index == 0) {
//            img.setImageResource(R.drawable.img1); // Replace with your first image resource
//        } else {
//            img.setImageResource(R.drawable.img2); // Replace with your second image resource
//        }
//    }
}