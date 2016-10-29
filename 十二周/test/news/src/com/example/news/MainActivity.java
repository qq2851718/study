package com.example.news;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {
	
	ListView listView;
	List<NewsInfo> data;
	BaseAdapter adapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

	private void init() {
		// TODO Auto-generated method stub
		
		listView = (ListView) findViewById(R.id.list);
		data = new ArrayList<NewsInfo>();
		
		for (int i = 0; i < 10; i++) {
			String titleString ="标题 "+i;
			String conString ="内容内容内容"+i;
			String urlString ="";
						NewsInfo temp = new NewsInfo(i, titleString, conString, urlString);
			data.add(temp);//数据添加到列表
			
		}

		
		adapter = new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				View view = View.inflate(MainActivity.this, R.layout.news_item, null);
				
				//获取 数据列表中的数据
				NewsInfo info =data.get(position);
				
				//获取 视图 view里面的图片控件和文本控件
				TextView titleView =(TextView)view.findViewById(R.id.newTitle);
				
				//根据数据内容设置控制的显示内容
				titleView.setText(info.getTitleString());
				
				TextView contentView =(TextView)view.findViewById(R.id.newCentent);
				titleView.setText(info.getConterString());
				
				ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
				imageView.setImageResource(R.drawable.image0+position);
				
				return view;
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
				return data.size();
			}
		};listView.setAdapter(adapter);
	}

  
    
}
