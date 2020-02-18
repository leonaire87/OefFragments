package be.ehb.oeffragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.oeffragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {

    public static InfoFragment newInstance(){
        return new InfoFragment();

    }
    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        return rootView;
    }

}
