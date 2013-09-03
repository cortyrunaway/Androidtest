package com.example.tester;


import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() 
        {
           public void onClick(View v) {
        	   Intent i = new Intent(Intent.ACTION_MAIN);
               PackageManager manager = getPackageManager();
               i = manager.getLaunchIntentForPackage("com.unity3d.player");
               i.addCategory(Intent.CATEGORY_LAUNCHER);
               startActivity(i);
            }
       });
        
    	
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
