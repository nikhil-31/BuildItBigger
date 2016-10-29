package com.example.itsajoke;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragment_joke, container, false);
        //Recieve the intent and display the joke in the textview
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra("Joke");

        TextView textView= (TextView) rootview.findViewById(R.id.joke);

        if (joke != null && joke.length() != 0) {
            textView.setText(joke);
        }


        return rootview;
    }
}
