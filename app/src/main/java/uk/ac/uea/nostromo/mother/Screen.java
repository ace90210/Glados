package uk.ac.uea.nostromo.mother;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

/**
 * Simple representation of the screen on which the app is being
 * displayed on.
 *
 * @author	Unascribed
 * @version	v1.0.0
 * @since	!_TODO__ [Alex Melbourne <a.melbourne@uea.ac.uk>] : Update this label before new release.
 */
public abstract class Screen {
    protected TableLayout screenLayout;

	/**
	 * The game that is being rendered to this screen.
	 */
    protected final Game game;
    protected final Context context;

	/**
	 * Construct a new {@code Screen} object.
	 *
	 * @param	game	The game that should be shown on this screen.
	 */
    public Screen( Game game, Context context) {
        this.game = game;
        this.context = context;
        if(screenLayout == null)
            screenLayout = new TableLayout(context);
        else
            screenLayout.removeAllViews();
    }

	/**
	 * Update the game internally.
	 *
	 * @param	deltaTime	The number of seconds that have passed since
	 *						we last updated.
	 */
    public abstract void update(float deltaTime);

	/**
	 * Draw the game to this screen.
	 *
	 * @param	deltaTime	The number of seconds that have passed since
	 *						our last paint.
	 */
    public abstract void paint(float deltaTime);

	/**
	 * Pause the game.
	 */
    public abstract void pause();

	/**
	 * Resume the game.
	 */
    public abstract void resume();

	/**
	 * Dispose of the internal memory.
	 */
    public abstract void dispose();
    
	/**
	 * Go back.
	 */
    public abstract void backButton();

    public TableLayout getTableLayout(){
        return screenLayout;
    }
}
