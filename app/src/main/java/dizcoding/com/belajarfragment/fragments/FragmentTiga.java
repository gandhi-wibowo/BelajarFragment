package dizcoding.com.belajarfragment.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dizcoding.com.belajarfragment.R;
import dizcoding.com.belajarfragment.listeners.FragmentNavigationListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTiga extends Fragment {


    public FragmentTiga() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_tiga, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}
