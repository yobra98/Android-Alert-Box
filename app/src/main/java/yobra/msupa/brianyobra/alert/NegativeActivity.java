package yobra.msupa.brianyobra.alert;

/**
 * Created by brianyobra on 8/27/18.
 */


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
public class NegativeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negative);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar
// if it is present.
        getMenuInflater().inflate(R.menu.negative, menu);
        return true;
    }
}