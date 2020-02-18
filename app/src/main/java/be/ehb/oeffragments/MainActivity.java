package be.ehb.oeffragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import be.ehb.oeffragments.Util.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //verwijzen naar componenten in UI
        Toolbar mToolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(mToolbar);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.frag_container);



        //omschrijven hoe alles opgevuld moet worden
        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager(), 0);


        //alles instellen
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
