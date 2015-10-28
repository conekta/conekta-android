package com.conekta.conektasdk;

import android.os.AsyncTask;

/**
 * Created by picharras on 27/10/15.
 */
public class Connection extends  AsyncTask<Void, Integer, Boolean> {

    @Override
    protected Boolean doInBackground(Void... params) {
        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

    }

    @Override
    protected void onPreExecute() {
        //progress = ProgressDialog.show(Main.this, getString(R.string.looking),getString(R.string.looking_wait));
    }

    @Override
    protected void onPostExecute(Boolean result) {

    }

}
