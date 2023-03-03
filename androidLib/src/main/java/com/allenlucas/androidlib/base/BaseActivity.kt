package com.allenlucas.androidlib.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @author: AllenLucas
 * @telegram: t.me/AllenLucas
 */

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract fun initBind(): ((LayoutInflater) -> VB)
    abstract fun initView(saveBundle: Bundle?)
    abstract fun initListener()
    abstract fun initData()
    abstract fun initObserver()

    protected lateinit var mBind: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBind = initBind()(layoutInflater)
        setContentView(mBind.root)
        initView(savedInstanceState)
        initListener()
        initObserver()
        initData()
    }
}