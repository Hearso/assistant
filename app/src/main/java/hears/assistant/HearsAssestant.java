package hears.assistant;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public class HearsAssestant extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.assistant);
		findViewById(R.id.CoordinatorLayout).setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					finish();
				}
			});
		
	}
    
    
}
