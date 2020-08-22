package com.anisdroid.Simple_Login_App;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	EditText nnn,ppp;
	Button lll;
	TextView ttt;
	int ccc = 3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		nnn = findViewById(R.id.nnn);
		ppp = findViewById(R.id.ppp);
		lll = findViewById(R.id.loginbtn);
		ttt = findViewById(R.id.info);
		
		lll.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View p1)
			{
				// TODO: Implement this method		
				
				vvv(nnn.getText().toString(),ppp.getText().toString());
				
			}
			
			public void vvv(String n,String p){
				
				if((n.equals("admin"))&&(p.equals("123"))){
					
					Intent iii = new Intent(MainActivity.this,welcome.class);
					startActivity(iii);
					
				}else{
					
					ccc --;
					ttt.setText("Number of remaining attempts : " +String.valueOf(ccc));
					
					if(ccc == 0){
						
						lll.setEnabled(false);
						lll.setBackgroundColor(Color.RED);
						
					}
					
				}
				
			}
			
		});
		
    }
}
