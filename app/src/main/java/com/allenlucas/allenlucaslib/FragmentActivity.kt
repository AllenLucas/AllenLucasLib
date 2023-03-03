package com.allenlucas.allenlucaslib

import android.os.Bundle
import android.view.LayoutInflater
import com.allenlucas.allenlucaslib.databinding.ActivityFragmentBinding
import com.allenlucas.androidlib.base.BaseActivity

/**
 * @author: AllenLucas
 * @telegram: t.me/AllenLucas
 */
class FragmentActivity : BaseActivity<ActivityFragmentBinding>() {
    override fun initBind(): (LayoutInflater) -> ActivityFragmentBinding =
        ActivityFragmentBinding::inflate

    override fun initView(saveBundle: Bundle?) {
        supportFragmentManager.beginTransaction().add(R.id.fl_layout, HomeFragment())
            .commitNowAllowingStateLoss()
    }

    override fun initListener() {
    }

    override fun initData() {
    }

    override fun initObserver() {
    }
}