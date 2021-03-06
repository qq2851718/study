package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

	int[] msgIds={1,2,3};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Spinner spinner = (Spinner) this.findViewById(R.id.spinner);
		
		BaseAdapter adapter = new BaseAdapter() {
			
			@Override
			public View getView(int arg0, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				
				LinearLayout layout = new LinearLayout(MainActivity.this);
				layout.setOrientation(LinearLayout.HORIZONTAL);
				
				TextView textView = new TextView(MainActivity.this);
				textView.setText(" "+getResources().getText(msgIds[arg0]));
				
				layout.addView(textView);
				
				return layout;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 3;
			}
		};
		
		spinner.setAdapter(adapter);
		
	}



}
