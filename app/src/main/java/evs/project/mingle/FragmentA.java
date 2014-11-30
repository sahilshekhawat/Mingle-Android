package evs.project.mingle;

//import android.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View;

/**
 * Created by ra12 on 11/29/2014.
 */
public class FragmentA extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        return inflater.inflate(R.layout.cycle, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public void onStart() {
        super.onStart();

    }


    @Override
    public void onResume() {
        super.onResume();

    }


    @Override
    public void onPause() {
        super.onPause();

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }


    @Override
    public void onStop() {
        super.onStop();

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

    }


    @Override
    public void onDetach() {
        super.onDetach();

    }
}
