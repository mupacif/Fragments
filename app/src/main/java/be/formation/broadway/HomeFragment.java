package be.formation.broadway;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private static HomeFragment instance;

    private  HomeFragmentCallback callback;
    public void setCallback(HomeFragmentCallback callback)
    {
        this.callback = callback;
    }
    public interface HomeFragmentCallback
    {
        void toastFromFragment();
    }

    public static HomeFragment getInstance()
    {
        if(instance==null)
            instance = new HomeFragment();

        return instance;
    }
    private TextView home;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);
        home = (TextView) v.findViewById(R.id.tv_home_title);
        return v;
    }
    public void setHome(String home)
    {
        this.home.setText(home);
    }
}
