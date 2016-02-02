package com.amg.wm.project3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

import com.amg.wm.project3.fragments.Fragment_Detail;

public class DetailActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		/*Intent i = getIntent();
		String titulo = i.getStringExtra(MainActivity.TAG_TITLE);
		FragmentManager fm = getSupportFragmentManager();
		Fragment_Detail frag = (Fragment_Detail) fm.findFragmentById(R.id.detail_fragment);
		frag.setTitulo(titulo);*/

		if (savedInstanceState == null) {
			// Crea el fragmento del detalle de la entrada y lo a�ade a la actividad
			Bundle arguments = new Bundle();
			arguments.putString(MainActivity.TAG_TITLE, getIntent().getStringExtra(MainActivity.TAG_TITLE));
			arguments.putInt(MainActivity.TAG_ID, getIntent().getIntExtra(MainActivity.TAG_ID,0));
			Fragment_Detail fragment = new Fragment_Detail();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction().add(R.id.detail_fragment, fragment).commit();
		}
	}
}