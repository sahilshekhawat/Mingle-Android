package evs.project.mingle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ra12 on 11/29/2014.
 */
class KunalAdapter extends FragmentStatePagerAdapter
{


    public KunalAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
        if(i==0)
        {
            fragment=new FragmentA();
        }
        if(i==1)
        {
            fragment=new FragmentB();
        }
        return fragment;
    }


    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Tab 1";
        }
        if(position==1)
        {
            return "Tab 2";
        }
        return null;
    }
}
