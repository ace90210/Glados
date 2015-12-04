package com.example.barry.testmultiactivityswitcher;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import uk.ac.uea.nostromo.mother.Game;
import uk.ac.uea.nostromo.mother.Screen;


public class SecondScreen extends Screen {

    SecondScreen(Game game,Context context){
        super(game, context);

        TextView title = new TextView(context);
        title.setText("we are in second view");
        title.setTextColor(Color.BLACK);
        screenLayout.addView(title);

        Button firstScreenButton = new Button(context);
        firstScreenButton.setText("Goto Home Screen");
        firstScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickHomeView(v);
            }
        });
        screenLayout.addView(firstScreenButton);
    }

    public void onClickHomeView(View view) {
        game.setScreen(new FirstScreen(game, context));
    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void paint(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {
        game.setScreen(new FirstScreen(game, context));
    }
}
