package com.metrotest.act;

import com.metrotest.WrapperReactActivity;

public class Page2Activity extends WrapperReactActivity {

    @Override
    protected String getMainComponentName() {
        return "page2";
    }

    @Override
    protected String getScriptPath() {
        return "index2.android.bundle";
    }
}
