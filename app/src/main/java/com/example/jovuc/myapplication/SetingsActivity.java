package com.example.jovuc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setings);

    }

    public class SettingsActivityImplement extends Activity{
        public void finishSettingsActivity(){
            Intent intent = new Intent();

            setResult(Activity.RESULT_OK);
            finish();
        }

    }


}
