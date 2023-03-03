package com.allenlucas.allenlucaslib

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.allenlucas.allenlucaslib.databinding.FragmentHomeBinding
import com.allenlucas.androidlib.base.BaseFragment

/**
 * @author: AllenLucas
 * @telegram: t.me/AllenLucas
 */
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun initBind(): (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding =
        FragmentHomeBinding::inflate

    override fun initView(savedBundle: Bundle?) {
    }

    override fun initListener() {
    }

    override fun initObserver() {
    }

    override fun initData() {
    }
}