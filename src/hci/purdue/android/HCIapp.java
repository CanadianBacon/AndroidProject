package hci.purdue.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HCIapp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String x = "FINALY!!!";
        Toast.makeText(getBaseContext(), x, Toast.LENGTH_LONG).show();
    }
}