package evs.project.mingle;

/**
 * Created by DEEPANSHU on 30-11-2014.
 */
//
        import java.util.ArrayList;
        import java.util.List;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;

public class SampleListView extends Activity
{
    private List<User> allusers = new ArrayList<User>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel);

        populateUserList();
        populateListView();
        registerclicks();
    }


    private void registerclicks() {
        ListView list = (ListView)findViewById(R.id.list_of_travels);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
            }
        });
        // TODO Auto-generated method stub

    }


    private void populateUserList() {
        allusers.add(new User("DeepanshuArora", R.drawable.deepanshu, "GovindPuri", "Pitampura"));
        allusers.add(new User("SahilShekhawat", R.drawable.sahil, "GovindPuri", "Dwarka"));
        allusers.add(new User("Sahilbabbar", R.drawable.sahilb, "GovindPuri", "lajpatnagar"));
        allusers.add(new User("kapilKhatri", R.drawable.kapil, "GovindPuri", "moolchand"));
        allusers.add(new User("SambhavSatija",R.drawable.sambhav, "GovindPuri", "Jangpura"));
        allusers.add(new User("ShubhamChauhan", R.drawable.shubham, "GovindPuri", "JLNstadium"));
        allusers.add(new User("kunalChoudhary", R.drawable.kunal, "GovindPuri", "Dilshadgarden"));
        allusers.add(new User("PrikanshitMor", R.drawable.mor, "GovindPuri", "Mornihouse"));

    }

    private void populateListView() {
        ArrayAdapter<User> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.list_of_travels);
        list.setAdapter(adapter);
    }

    private class MyListAdapter extends ArrayAdapter<User>
    {
        public MyListAdapter()
        {
            super(SampleListView.this,R.layout.userview,allusers);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View itemView = convertView;
            if (itemView == null)
            {
                itemView = getLayoutInflater().inflate(R.layout.userview, parent ,false);
            }
            //Find the user to work with
            User currentuser = allusers.get(position);
            //Fill the view
            //image part
            ImageView imageView = (ImageView)findViewById(R.id.imageicon);
            imageView.setImageResource(currentuser.getimgid());
            //source part
            TextView srctext = (TextView)findViewById(R.id.src);
            srctext.setText(currentuser.getSource());
            //destination part
            TextView desttext = (TextView)findViewById(R.id.dest);
            desttext.setText(currentuser.getSource());

            return itemView;
        }

    }



}

