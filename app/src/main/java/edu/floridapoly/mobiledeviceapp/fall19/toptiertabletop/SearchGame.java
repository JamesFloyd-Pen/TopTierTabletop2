package edu.floridapoly.mobiledeviceapp.fall19.toptiertabletop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SearchGame extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthStateListener;

    @InjectView(R.id.frame) SwipeFlingAdapterView swipeContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_game);

        firebaseAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if(user !=null){
                    Intent goToHomePage = new Intent(SearchGame.this, HomePage.class);
                    startActivity(goToHomePage);
                    finish();
                    return;
                }
            }
        };

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, penguin);

        swipeContainer.setAdapter(arrayAdapter);
        swipeContainer.setFlingListener( new SwipeFlingAdapterVieew.onFlingListener()
        {
          @Override
                  public void removeFirstObject()
            {
                Log.d("list", "Bye Bye!");
                al.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                makeToast(SearchGame.this, "Left!");
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                makeToast(SearchGame.this, "Right!");
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                // Ask for more data here
                al.add("XML ".concat(String.valueOf(i)));
                arrayAdapter.notifyDataSetChanged();
                Log.d("LIST", "notified");
                i++;
            }

            @Override
            public void onScroll(float scrollProgressPercent) {
                View view = flingContainer.getSelectedView();
                view.findViewById(R.id.item_swipe_right_indicator).setAlpha(scrollProgressPercent < 0 ? -scrollProgressPercent : 0);
                view.findViewById(R.id.item_swipe_left_indicator).setAlpha(scrollProgressPercent > 0 ? scrollProgressPercent : 0);
            }


        };


    }


    // TODO: 11/17/2019
    /*
        1. Setup the swipecard functions
       2.Call the database to get the items in an Array List
       3.Clean up all of the errors to make it work!


        Possible Template Values:
        game

     */

    void loadGame()
    {
        //

    }

    @OnClick(R.id.right)
    public void right()
    {


    }

    @onClick(R.id.left)
    public void left()
    {

    }



}
