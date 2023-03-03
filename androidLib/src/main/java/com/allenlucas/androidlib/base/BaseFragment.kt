package com.allenlucas.androidlib.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * @author: AllenLucas
 * @telegram: t.me/AllenLucas
 */

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    abstract fun initBind(): ((LayoutInflater, ViewGroup?, Boolean) -> VB)
    abstract fun initView(savedBundle: Bundle?)
    abstract fun initListener()
    abstract fun initObserver()
    abstract fun initData()

    private var _bind: VB? = null
    protected val mBind: VB get() = _bind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _bind = initBind()(inflater, container, false)
        return mBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(savedInstanceState)
        initListener()
        initObserver()
        initData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _bind = null
    }
}