package com.example.barry.testmultiactivityswitcher;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import uk.ac.uea.nostromo.mother.Game;
import uk.ac.uea.nostromo.mother.Screen;


public class FirstScreen extends Screen {

    FirstScreen(Game game, Context context){
        super(game, context);

        TextView title = new TextView(context);
        title.setText("we are in first view");
        title.setTextColor(Color.BLACK);
        screenLayout.addView(title);

        Button secondScreenButton = new Button(context);
        secondScreenButton.setText("Goto Second Screen");
        secondScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSecondView(v);
            }
        });
        screenLayout.addView(secondScreenButton);
    }
    public void onClickSecondView(View view) {
        game.setScreen(new SecondScreen(game, context));
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
    }
}
