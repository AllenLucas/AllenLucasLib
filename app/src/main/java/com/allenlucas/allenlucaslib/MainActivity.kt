package com.allenlucas.allenlucaslib

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.allenlucas.allenlucaslib.databinding.ActivityMainBinding
import com.allenlucas.androidlib.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun initBind(): (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun initView(saveBundle: Bundle?) {
    }

    override fun initListener() {
    }

    override fun initData() {
        startActivity(Intent(this, FragmentActivity::class.java))
    }

    override fun initObserver() {
    }
}