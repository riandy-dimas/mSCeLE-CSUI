package in.co.praveenkumar.mdroid.activity;

import in.co.praveenkumar.R;
import in.co.praveenkumar.mdroid.helper.AppInterface.UserIdInterface;
import in.co.praveenkumar.mdroid.helper.AppNavigationDrawer;
import android.os.Bundle;

public class MessagingActivity extends AppNavigationDrawer implements
		UserIdInterface {
	int userid;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_messaging);
		setUpDrawer();
		getSupportActionBar().setTitle("Messaging");
		getSupportActionBar().setIcon(R.drawable.icon_message);
	}

	@Override
	public int getUserId() {
		return this.userid;
	}

	@Override
	public void setUserId(int userid) {
		this.userid = userid;
	}

}