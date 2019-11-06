package edu.floridapoly.mobiledeviceapp.fall19.toptiertabletop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    /*
    This function will display what games the player is in.
     */
    public void gameList()
    {
        //If there is some data
            //Open up the example list of games in the data base
        //Else
            //Empty
    }

    //
    public void createGame()
    {

        //Moves the user to the game making screen
    }

   
/*
    public void searchGame()
    {
        //When the button is clicked, this moves into the search game
        //
        Intent searchGameIntent = new Intent(this, SearchGame.class);
        startActivity(searchGameIntent);

    }
*/

    private void selectedGame()
    {
        //this function will move the player to the new gamePage


    }
}
