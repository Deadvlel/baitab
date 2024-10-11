package com.example.baitab.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.example.baitab.R;
import com.example.baitab.thanhtoan.thanhtoanViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class thanhtoanFragment extends Fragment {

    private ViewPager2 viewPager;
    private View mview;

    public thanhtoanFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview = inflater.inflate(R.layout.fragment_thanhtoan, container, false);
        viewPager = mview.findViewById(R.id.thanhtoan_pager);
        TabLayout tabLayout = mview.findViewById(R.id.tab_layout);

        thanhtoanViewPagerAdapter adapter = new thanhtoanViewPagerAdapter(getActivity());
        viewPager.setAdapter(adapter);

        // Thiết lập TabLayout với ViewPager2
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText(adapter.getPageTitle(position)) // Thiết lập tiêu đề cho từng tab
        ).attach();

        return mview;
    }
}
