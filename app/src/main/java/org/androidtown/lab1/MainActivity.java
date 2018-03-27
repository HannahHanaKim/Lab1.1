package org.androidtown.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView; //img1
    ImageView imageView2; //img2
    int imageIndex = 0; // meaning of flag

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.img1);  //create an object
        imageView2 = (ImageView)findViewById(R.id.img2);  //create an object
    }

    public void onButtonClicked(View v) { //if the button is clicked
        changeImage();   //change image
    }

    private void changeImage() {
        if (imageIndex == 0) {  //when img1 is visible
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        }
        else if (imageIndex == 1) {  //when img2 is visible
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }
    }
}

