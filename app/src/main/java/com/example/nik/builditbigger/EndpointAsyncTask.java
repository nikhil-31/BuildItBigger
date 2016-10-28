package com.example.nik.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;

import com.example.itsajoke.JokeActivity;
import com.example.nik.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by nik on 10/28/2016.
 */

class EndpointAsyncTask extends AsyncTask<Context, Void, String> {

    private MyApi myApiService = null;
    private Context context;

    @Override
    protected void onPreExecute() {
//        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onProgressUpdate(Void... values) {

    }

    @Override
    protected String doInBackground(Context... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://builditbigger-147719.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        context = params[0];

        try {
            return myApiService.tellJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
//        Toast.makeText(context,result+" woo",Toast.LENGTH_LONG).show();
//        progressBar.setProgress(100);
//        progressBar.setVisibility(View.GONE);
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra("Joke",result);
        context.startActivity(intent);


    }
}
