package io.github.abhishek_rs.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ListView list = (ListView) findViewById(R.id.listview_buttons);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                String value = (String) adapter.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "hfhjfh", Toast.LENGTH_LONG).show();
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
            }
        });

*/



    }

    public void sendMessage(View view){
        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        SpannableStringBuilder buttonText = (SpannableStringBuilder) button.getText();
        Context context = getApplicationContext();
        String buttonTxt = buttonText.toString();
        //make toast and show it
        Toast toast = Toast.makeText(context, "This button will launch my " +buttonTxt+ " app!", Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
