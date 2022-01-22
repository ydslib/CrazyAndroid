package com.yds.crazyandroid

import com.crystallake.base.app.BaseApplication
import com.crystallake.base.utils.Util

class App : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        Util.setUp(this)
    }
}