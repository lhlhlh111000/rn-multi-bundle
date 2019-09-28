package com.metrotest.act;

import androidx.annotation.Nullable;

import com.metrotest.WrapperReactActivity;

public class Page4Activity extends WrapperReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "page4";
    }

    @Override
    protected String getScriptPath() {
        return "index4.android.bundle";
    }
}
