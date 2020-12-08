package hears.assistant;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.SearchView.OnCloseListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
        
		
		findViewById(R.id.activitymainButton1).setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					startActivity(new Intent(MainActivity.this,HearsAssestant.class));
				}
			});
    }
    
}
