package com.yds.main.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crystallake.base.activity.BaseActivity
import com.crystallake.base.vm.BaseViewModel

class SplashActivity : BaseActivity<BaseViewModel> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}