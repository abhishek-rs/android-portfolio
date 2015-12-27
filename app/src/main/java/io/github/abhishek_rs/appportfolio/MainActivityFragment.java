package io.github.abhishek_rs.appportfolio;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Context c;
    public MainActivityFragment() {

    }




    public View getViewByPosition(int pos, ListView listView) {
        final int firstListItemPosition = listView.getFirstVisiblePosition();
        final int lastListItemPosition = firstListItemPosition + listView.getChildCount() - 1;

        if (pos < firstListItemPosition || pos > lastListItemPosition ) {
            return listView.getAdapter().getView(pos, null, listView);
        } else {
            final int childIndex = pos - firstListItemPosition;
            return listView.getChildAt(childIndex);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final String[] data = {
                "Spotify Streamer",
                "Super Duo",
                "Build It Bigger",
                "XYZ Reader",
                "Capstone"
        };



        List<String> apps = new ArrayList<String>(Arrays.asList(data));
        //List<String> specialApps = new ArrayList<String>(Arrays.asList(data2));
        ArrayAdapter buttonAdapter = new ArrayAdapter<String>(
                getActivity(), // The current context (this activity)
                R.layout.list_item_button, // The name of the layout ID.
                R.id.list_item_button_textview, // The ID of the textview to populate.
                apps);
        /*ArrayAdapter buttonAdapter2 = new ArrayAdapter<String>(--
                getActivity(), // The current context (this activity)
                R.layout.list_item_button_2, // The name of the layout ID.
                R.id.list_item_button_2_textview, // The ID of the textview to populate.
                specialApps);*/
        ListView buttonList = (ListView) rootView.findViewById(R.id.listview_buttons);
        buttonList.setAdapter(buttonAdapter);
/*
        buttonList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                String value = (String) adapter.getItemAtPosition(position);
                Toast.makeText(getActivity().getApplicationContext(), "hfhjfh", Toast.LENGTH_LONG).show();
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
            }
        });  */


        return rootView;
    }






}
