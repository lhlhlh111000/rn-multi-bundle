package com.metrotest.act;

import androidx.annotation.Nullable;

import com.metrotest.WrapperReactActivity;

public class Page3Activity extends WrapperReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "page3";
    }

    @Override
    protected String getScriptPath() {
        return "index3.android.bundle";
    }
}
