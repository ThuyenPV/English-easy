package com.thuyenpham.englishapp.presenter;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.englishapp.R;
import com.thuyenpham.englishapp.view.CoursesFragment;
import com.thuyenpham.englishapp.view.ExercisesFragment;
import com.thuyenpham.englishapp.view.ExplanationFragment;
import com.thuyenpham.englishapp.view.TranslateFragment;

public class MainActivity extends AppCompatActivity {


    //------------
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    //--------
//    private ExercisesFragment exercisesFragment;
//    private ExplanationFragment explanationFragment;
//    private CoursesFragment coursesFragment;
//    private TranslateFragment translateFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        setFragment(new CoursesFragment());
                        return true;

                    case R.id.nav_notifi:
                        setFragment(new ExercisesFragment());
                        return true;

                    case R.id.nav_account:
                        setFragment(new ExplanationFragment());
                        return true;
                    case R.id.nav_translate:
                        setFragment(new TranslateFragment());
                        return true;

                    default:
                        return false;
                }
            }
        });

    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();

    }


    private void addControls() {
        mMainFrame = findViewById(R.id.main_frame);
        mMainNav = findViewById(R.id.nav_main);

        setFragment(new CoursesFragment());

    }
}
