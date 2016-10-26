package com.ycx.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ycx.mvvmdemo.databinding.ActivityMainBinding;
import com.ycx.mvvmdemo.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);
        User user = new User();
        user.setName("lxmmmm");
        user.setAge(13);
        binding.setUser(user);

        binding.setButtonName("點我");
    }
}
