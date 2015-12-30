package com.example.barry.testmultiactivityswitcher;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.ac.uea.nostromo.mother.Game;
import uk.ac.uea.nostromo.mother.Screen;
import uk.ac.uea.nostromo.mother.implementation.AndroidGame;


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

        //test text view
        screenLayout.addView(this.game.getGraphics().newTextView("testing new textview", true, false, true));
        Display display = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;


        LinearLayout ll = this.game.getGraphics().newLinearLayout((int)(width * 0.75f), (int)(height * 0.5f));

        screenLayout.addView(ll);

        //test google map
        this.game.getGraphics().newMap((AndroidGame) game, ll.getId());
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
