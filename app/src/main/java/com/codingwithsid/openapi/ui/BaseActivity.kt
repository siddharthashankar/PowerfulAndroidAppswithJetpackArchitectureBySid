package com.codingwithsid.openapi.ui

import com.codingwithsid.openapi.session.SessionManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity: DaggerAppCompatActivity() {
    val TAG: String = "AppDebug"


    @Inject
    lateinit var sessionManager: SessionManager
}