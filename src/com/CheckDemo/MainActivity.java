package com.CheckDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
    CheckBox c1,c2;
    Button b1;
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    b1=(Button)findViewById(R.id.button1);
    c1=(CheckBox)findViewById(R.id.checkBox1);
    c2=(CheckBox)findViewById(R.id.checkBox2);
  b1.setOnClickListener(new OnClickListener() {
	
	public void onClick(View arg0) {
		  if(c1.isChecked()&&c2.isChecked())
		    {
		    	String s1=c1.getText().toString();
		    	String s2=c2.getText().toString();
		    	Toast.makeText(getApplicationContext(), "c1", Toast.LENGTH_SHORT).show();
		    	
		    }
		    else if(c1.isChecked())
		    {
		    	String s1=c1.getText().toString();
		    //	String s2=c2.getText().toString();
		    	Toast.makeText(getApplicationContext(), "c1", Toast.LENGTH_SHORT).show();
		    	
		    }
		    if(c2.isChecked())
		    {
		    	//String s1=c1.getText().toString();
		    	String s2=c2.getText().toString();
		    	Toast.makeText(getApplicationContext(), "c1", Toast.LENGTH_SHORT).show();
		    	
		    }
		    else
		    {
		    	String s1=c1.getText().toString();
		    	String s2=c2.getText().toString();
		    	Toast.makeText(getApplicationContext(), "c1"+s1+"  "+s2, Toast.LENGTH_SHORT).show();
		    }
		
	}
});
    }
    
}