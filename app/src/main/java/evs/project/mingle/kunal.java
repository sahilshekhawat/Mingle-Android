package evs.project.mingle;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentActivity;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;
        import android.support.v4.view.ViewPager;


/**
 * Created by ra12 on 11/29/2014.
 */

public class kunal extends FragmentActivity {


    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kunal_main);
        viewPager= (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new KunalAdapter(fragmentManager));
    }

}

class MyAdapter extends FragmentStatePagerAdapter
{


    public MyAdapter(FragmentManager fm) {
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


