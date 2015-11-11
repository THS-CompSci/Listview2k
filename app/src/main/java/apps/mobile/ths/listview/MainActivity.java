package apps.mobile.ths.listview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity implements OnItemClickListener {
    private ListView listView1;
    private ArrayAdapter<String> listAdapter1;
    private String [] someColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = (ListView) findViewById(R.id.listView);
        someColors = new String[]{"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "White"};
        ArrayList<String> colorArrayList = new ArrayList<String>();
        colorArrayList.addAll(Arrays.asList(someColors));
        listAdapter1 = new ArrayAdapter<String>(this, R.layout.simple_list_item_1, colorArrayList);
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemValue = (String) listView1.getItemAtPosition((int)id);
        Log.i("MainActivity", "position: " + position);
        Log.i("MainActivity", "id: " + id);
        Toast.makeText(getApplicationContext(),someColors[position] , Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_LONG).show();
    }
}