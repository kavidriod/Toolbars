package myandroidninja.wordpress.toolbars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  ContextualToolbar(View view)
    {
        Intent intent = new Intent(getApplicationContext(),ContextualToolbar.class);
        startActivity(intent);
    }

    public  void toolbarAsActionBar(View view)
    {
        Intent intent = new Intent(getApplicationContext(),toolbarAsActionBar.class);
        startActivity(intent);
    }

    public void  standaloneToolbar(View view)
    {
        Intent intent = new Intent(getApplicationContext(),StandaloneToolbar.class);
        startActivity(intent);
    }
}
