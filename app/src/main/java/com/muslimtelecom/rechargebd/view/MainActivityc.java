package com.muslimtelecom.rechargebd.view;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.muslimtelecom.rechargebd.R;
import com.muslimtelecom.rechargebd.databinding.ActivityMaincBinding;

public class MainActivityc extends AppCompatActivity {
    public final int REQUEST_CODE = 1;
    ActivityMaincBinding binding;

    /* developer by  sabbir */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityMaincBinding inflate = ActivityMaincBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView((View) inflate.getRoot());
        getSupportFragmentManager().beginTransaction().replace(R.id.container, ContactListFragment.newInstance()).setCustomAnimations(R.anim.slide_in, R.anim.slide_out).commitNow();
    }
}
