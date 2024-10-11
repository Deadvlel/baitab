// thanhtoanViewPagerAdapter.java
package com.example.baitab.thanhtoan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class thanhtoanViewPagerAdapter extends FragmentStateAdapter {

    public thanhtoanViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity); // Khởi tạo với FragmentActivity
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new tab1Fragment();
            case 1:
                return new tab2Fragment();
            case 2:
                return new tab3Fragment();
            default:
                return new tab1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Số lượng tab
    }

    // Phương thức để lấy tiêu đề của trang
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            case 2:
                return "Tab 3";
            default:
                return "Tab 1";
        }
    }
}
