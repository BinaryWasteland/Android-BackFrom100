package com.gregrjacobs;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.gregrjacobs.Encrypter;;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        final EditText txtStart = (EditText) findViewById(R.id.txtStartNumber);
        final EditText txtDecre = (EditText) findViewById(R.id.txtDecrementVariable);
        final EditText txtResult = (EditText) findViewById(R.id.txtResultSet);
        
        
        final Button btnLogin = (Button) findViewById(R.id.btnSubmit);
        btnLogin.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Encrypter java = new Encrypter();
				txtResult.append(java.encrypt("Hello World").toString());
				
//				for(int i = Integer.parseInt(txtStart.getText().toString()); i >= 0; i -= Integer.parseInt(txtDecre.getText().toString()))
//					txtResult.append( i + "~");
			}
		});
    }
}