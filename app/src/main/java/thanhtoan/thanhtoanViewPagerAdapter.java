package thanhtoan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.baitab.fragment.trangchuFragment;

public class thanhtoanViewPagerAdapter extends FragmentStateAdapter {

    private final String[] pageTitles = new String[]{"Tab 1", "Tab 2", "Tab 3"};

    public thanhtoanViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
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
                return "Tab q";

        }

    }
}
