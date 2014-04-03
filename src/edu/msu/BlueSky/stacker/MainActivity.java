package edu.msu.BlueSky.stacker;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
	
	private String player1Name;
	private String player2Name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in);
	}
	
	public void onStartGame(View view) {
		Intent intent = new Intent(this, GameActivity.class);
		player1Name = ((EditText)this.findViewById(R.id.player1Name)).getText().toString();
		player2Name = ((EditText)this.findViewById(R.id.player2Name)).getText().toString();
		intent.putExtra ( "player1Name", player1Name );
		intent.putExtra ( "player2Name", player2Name );
		startActivity(intent);
	}
	
	public void onCreateUser(View view) {
		Intent intent = new Intent(this, CreateUserActivity.class);
		startActivity(intent);
		
	}
}
