package chetan.com.bottomnavigationdemo;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBottomNavigationView;
    ImageView mHeaderImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        mHeaderImage = (ImageView) findViewById(R.id.headerImage);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_one:

                        mHeaderImage.setImageDrawable(getImage("@drawable/menu_one_image"));
                        displayToast("Button One Is Click");
                        break;

                    case R.id.item_two:
                        mHeaderImage.setImageDrawable(getImage("@drawable/menu_two_image"));

                        displayToast("Button Two Is Click");
                        break;

                    case R.id.item_three:
                        mHeaderImage.setImageDrawable(getImage("@drawable/menu_three_image"));

                        displayToast("Button Three Is Click");
                        break;

                }
                return false;
            }
        });
    }

    public Drawable getImage(String uri) {
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        return res;
    }

    private void displayToast(String msg) {
        Toast.makeText(getApplicationContext(), "" + msg, Toast.LENGTH_LONG).show();
    }

}
