package com.example.bai1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bai1.databinding.FragmentDanhGiaBinding;

public class DanhGiaFragment extends Fragment {

    FragmentDanhGiaBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDanhGiaBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}