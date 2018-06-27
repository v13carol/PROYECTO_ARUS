package ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaD;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ds6.dpc.fisc.utp.arus.R;

public class ZonaDActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager mViewPager;
    SectionsPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonad);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager = (ViewPager) findViewById(R.id.container3);

        tabLayout.setupWithViewPager(mViewPager);
        SetUpViewPager(mViewPager);

    }

    private void SetUpViewPager(ViewPager viewPager) {

        adapter = new SectionsPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new LunesDFragment(), "L");
        adapter.AddFragment(new LunesDFragment(), "M");
        adapter.AddFragment(new LunesDFragment(), "M");
        adapter.AddFragment(new LunesDFragment(), "J");
        adapter.AddFragment(new LunesDFragment(), "V");
        adapter.AddFragment(new LunesDFragment(), "S");
        adapter.AddFragment(new LunesDFragment(), "D");

        viewPager.setAdapter(adapter);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> frag = new ArrayList<>();
        private List<String> page = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void AddFragment(Fragment f, String Title)
        { frag.add(f);
            page.add(Title);
        }

        @Override
        public Fragment getItem(int position) {

            return frag.get(position);
        }


        @Override
        public CharSequence getPageTitle(int position) {

            return page.get(position);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 7;
        }
    }
}
