package dizcoding.com.belajarfragment.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dizcoding.com.belajarfragment.MainActivity;
import dizcoding.com.belajarfragment.R;
import dizcoding.com.belajarfragment.listeners.FragmentNavigationListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment implements View.OnClickListener {


    private FragmentNavigationListener fragmentNavigationListener;

    public FragmentSatu() {}

    public  void setFragmentNavigationListener(FragmentNavigationListener fragmentNavigationListener){
        this.fragmentNavigationListener = fragmentNavigationListener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_satu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button gotoDua = view.findViewById(R.id.buttonToDua);
        gotoDua.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        fragmentNavigationListener.FragmentOpenListener(2);
    }
}
