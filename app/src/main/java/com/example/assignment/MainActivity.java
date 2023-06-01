package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.assignment.databinding.ActivityMainBinding;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<String> tags = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tags.add("#2023");
        tags.add("#TODAYISMONDAY");
        tags.add("#TOP");
        tags.add("#POPS!");
        tags.add("#WOW");
        tags.add("#ROW");

        binding.descTxt.setText(getResources().getText(R.string.txt7) + "\n\n" + getResources().getText(R.string.txt8) + "\n\n" + getResources().getText(R.string.txt9));
        binding.chip1.setText(tags.get(0));
        binding.chip2.setText(tags.get(1));
        binding.chip3.setText(tags.get(2));
        binding.chip4.setText(tags.get(3));
        binding.chip5.setText(tags.get(4));
        binding.chip6.setText(tags.get(5));

        String imageUrl = "https://wjddnjs754.cafe24.com/web/product/small/202303/5b9279582db2a92beb8db29fa1512ee9.jpg"; // URL of the image you want to load


        Glide.with(this)
                .load(imageUrl)
                .into(binding.image);
    }
}