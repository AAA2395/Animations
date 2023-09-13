package aaa163.csci366au22.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView Image = findViewById(R.id.Image);

        findViewById(R.id.FadingOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),R.anim.fading_out));


            }
        });
        findViewById(R.id.Translate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),R.anim.translate));



            }
        });
        findViewById(R.id.Rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),R.anim.rotate));


            }
        });
        findViewById(R.id.Scale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),R.anim.scale));


            }
        });    }
}