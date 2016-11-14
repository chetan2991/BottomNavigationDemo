package chetan.com.bottomnavigationdemo;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavigationView = ( BottomNavigationView )findViewById( R.id.bottomNavigationView );
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch ( item.getItemId() )
                {
                    case R.id.item_one:
                                        displayToast("Button One Is Click");
                                        break;

                    case R.id.item_two:
                                        displayToast( "Button Two Is Click");
                                        break;

                    case R.id.item_three:

                                        displayToast( "Button Three Is Click" );
                                        break;

                }
                return false;
            }
        });
    }
    private void displayToast( String msg )
    {
        Toast.makeText( getApplicationContext(), ""+msg, Toast.LENGTH_LONG ).show();
    }

}
