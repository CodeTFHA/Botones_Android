package com.example.tomas.botones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MyActivity extends ActionBarActivity implements Button.OnClickListener {

    private ImageView fondo;
    private Button amy,aerosmith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        fondo=(ImageView)findViewById(R.id.fondo);
        amy=(Button) findViewById(R.id.amy_winehouse);
        aerosmith=(Button) findViewById(R.id.aerosmith);
        aerosmith.setOnClickListener(this);
        amy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fondo.setImageResource(R.drawable.amy);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    public void mieventoclick(View view)
    {
        int resId = getResources().getIdentifier("acdc", "drawable", getPackageName());
        fondo.setImageResource(resId);
        //fondo.setImageResource(R.drawable.acdc);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        fondo.setImageResource(R.drawable.aerosmith);
    }
}
