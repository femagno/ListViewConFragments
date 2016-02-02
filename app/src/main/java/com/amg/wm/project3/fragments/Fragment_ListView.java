package com.amg.wm.project3.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.amg.wm.project3.DetailActivity;
import com.amg.wm.project3.MainActivity;
import com.amg.wm.project3.R;
import com.amg.wm.project3.utils.ArrayAdapterobj;
import com.amg.wm.project3.utils.LVObjects;

import java.util.ArrayList;

public class Fragment_ListView extends Fragment {
    private View mView;
    private ListView lvobjs;

    private ArrayList<LVObjects> objetos;
    private ArrayAdapterobj adapter;

    public static Fragment_ListView newInstance() {
        Fragment_ListView fragment_listView = new Fragment_ListView();
        return fragment_listView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mView = inflater.inflate(R.layout.fragment_listview, null);
        lvobjs = (ListView) mView.findViewById(R.id.lvObjects);

        objetos = new ArrayList<LVObjects>();
        insertValues(objetos);
        adapter = new ArrayAdapterobj(getContext(), objetos);

        lvobjs.setAdapter(adapter);
        lvobjs.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                LVObjects clicked_obj = (LVObjects)lvobjs.getItemAtPosition(position);
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra(MainActivity.TAG_TITLE, clicked_obj.getTitle());
                i.putExtra(MainActivity.TAG_ID, position);
                startActivity(i);
            }
        });
        return mView;
    }

    private void insertValues(ArrayList<LVObjects> objetos) {
        objetos.add(new LVObjects("Caballo", R.drawable.caballo));
        objetos.add(new LVObjects("Elefante", R.drawable.elefante));
        objetos.add(new LVObjects("jirafa", R.drawable.jirafa));
        objetos.add(new LVObjects("Leona", R.drawable.leona));
        objetos.add(new LVObjects("Mono", R.drawable.mono));
        objetos.add(new LVObjects("Oso", R.drawable.oso));
        objetos.add(new LVObjects("Tigre", R.drawable.tigre));
        objetos.add(new LVObjects("Zorro", R.drawable.zorro));
        objetos.add(new LVObjects("Tortuga", R.drawable.tortuga));
        objetos.add(new LVObjects("Loro", R.drawable.loro));
        objetos.add(new LVObjects("Mariposa", R.drawable.mariposa));
    }
}