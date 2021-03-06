package emhastings.lotrstats;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainPage extends AppCompatActivity {

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // recovering the instance state
        if (savedInstanceState != null) {
            Gson gson = new Gson();
            game = gson.fromJson(savedInstanceState.getString("GAME"), Game.class);
        }

        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set up game
        game = new Game();

        TextView txt = (TextView) findViewById(R.id.title);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "hobbitonbrushhand.ttf");
        txt.setTypeface(typeface, Typeface.BOLD);

        final TextView table = (TextView) findViewById(R.id.table);
        table.setText(game.toString());
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "ringbearer.TTF");
        table.setTypeface(typeface2);

        //Button handlers
        final Game finalGame = game; //final reference for inner classes-- should work right?
        Button editButton = (Button) findViewById(R.id.editButton);
        editButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO
                Character theoden = game.getChars().get("Theoden");
                theoden.setPowerModifier(10);
                table.setText(game.toString());
            }
        });

        Button gameButton = (Button) findViewById(R.id.gameButton);
        gameButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO
                game.changeGame("TT");
                table.setText(game.toString());
            }
        });

        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalGame.clearStats();
                table.setText(game.toString());
            }
        });


    }

    // invoked when the activity may be temporarily destroyed, save the instance state here
    @Override
    public void onSaveInstanceState(Bundle outState) {

        Gson gson = new Gson();
        String json = gson.toJson(game);
        outState.putString("GAME", json);

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResume()  {
        super.onResume();

        //hide the app bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
