package be.ehb.oeffragments.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

import be.ehb.oeffragments.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BillFragment extends Fragment {

    private TextView tvEach;
    private EditText etAmount, etTip, etParty;
    private Button splitBtn;

    public BillFragment() {
        // Required empty public constructor
    }

    public static BillFragment newInstance() {
        return new BillFragment();
    }


    View.OnClickListener billListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (etAmount.getText() != null && etTip.getText() != null && etParty.getText() != null) {

                double amount = Double.parseDouble(etAmount.getText().toString());
                double tip = Double.parseDouble(etTip.getText().toString());
                double party = Double.parseDouble(etParty.getText().toString());
                double each = (amount + tip) / party;
                tvEach.setText(String.format(Locale.getDefault(), "%.2f", each));


            }
        }

    };


        //factory method


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment

            View rootView = inflater.inflate(R.layout.fragment_bill, container, false);

            etAmount = rootView.findViewById(R.id.et_Amount);
            etTip = rootView.findViewById(R.id.et_Tip);
            etParty = rootView.findViewById(R.id.et_Party);
            tvEach = rootView.findViewById(R.id.tv_Each);
            splitBtn = rootView.findViewById(R.id.btn_Split);
            splitBtn.setOnClickListener(billListener);

            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
            String TipKey = getResources().getString(R.string.pref_et_tip);
            String tip = prefs.getString(TipKey,"");
            etTip.setText(tip);




            return rootView;

        }


    };

