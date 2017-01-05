package com.webdesarrollador.vectorestutorial;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView flecha,logo_android,logo,cruz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flecha = (ImageView) findViewById( R.id.flecha );
        logo_android = (ImageView) findViewById( R.id.logo_android );
        logo = (ImageView) findViewById( R.id.logo);
        cruz = (ImageView) findViewById( R.id.cruz);

        Drawable drawable = flecha.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }

        drawable = logo_android.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }

        drawable = logo.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }

        drawable = cruz.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
