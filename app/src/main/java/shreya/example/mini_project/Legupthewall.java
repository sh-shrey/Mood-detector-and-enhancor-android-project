package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Legupthewall extends AppCompatActivity {
    Button button,b2,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legupthewall);
        VideoView videoView = findViewById(R.id.vd);
        button = findViewById(R.id.button3);
        b2 = findViewById(R.id.button2);
        b4 = findViewById(R.id.button4);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.legupthewall));
        videoView.requestFocus();
        videoView.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Yoga4timer.class));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EnhancingScreen.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.healthshots.com/fitness/staying-fit/benefits-of-doing-leg-up-the-wall-daily/"));
                startActivity(browserIntent);
            }
        });
    }
}