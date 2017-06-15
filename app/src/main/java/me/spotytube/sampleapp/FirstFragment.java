package me.spotytube.sampleapp;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    private TabLayout tabLayout;
    private ViewPager firstViewPager;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        firstViewPager = (ViewPager) rootView.findViewById(R.id.viewpager_content);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(firstViewPager);

        setupViewPager(firstViewPager);
        return rootView;
    }

    private void setupViewPager(ViewPager viewPager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Tab 1");
        adapter.addFragment(new Tab1Fragment(), "Tab 2");
        adapter.addFragment(new Tab1Fragment(), "Tab 3");
        adapter.addFragment(new Tab1Fragment(), "Tab 4");
        viewPager.setAdapter(adapter);
    }
}
