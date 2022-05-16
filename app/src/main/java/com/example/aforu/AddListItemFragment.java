package com.example.aforu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class AddListItemFragment extends Fragment {
    Button btnSave;
    Button btnDelete;
    TextView textTask;
    TextView textSubTask;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddListItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddListItemFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddListItemFragment newInstance(String param1, String param2) {
        AddListItemFragment fragment = new AddListItemFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           mParam1 = getArguments().getString(ARG_PARAM1);
           mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View inflaterView =inflater.inflate(R.layout.fragment_add_list_item, container, false);

        btnSave = (Button) inflaterView.findViewById(R.id.buttonSaveItem);
        btnDelete = (Button) inflaterView.findViewById(R.id.buttonDeleteItem);
        textTask = (TextView) inflaterView.findViewById(R.id.textTask);
        textSubTask= (TextView) inflaterView.findViewById(R.id.textSubTask);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //funSaveItem
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //funDeleteItem
            }
        });

        // Inflate the layout for this fragment
        return inflaterView;
    }

    void funSaveItem()
    {

    }
}