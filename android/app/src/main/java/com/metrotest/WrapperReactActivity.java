package com.metrotest;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;

public abstract class WrapperReactActivity extends ReactActivity {

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ReactInstanceManager manager = getReactInstanceManager();
        if(manager.hasStartedCreatingInitialContext()) {
            loadScript();
            loadApp(getMainComponentName());
        }else {
            manager.addReactInstanceEventListener(new ReactInstanceManager.ReactInstanceEventListener() {
                @Override
                public void onReactContextInitialized(ReactContext context) {
                    manager.removeReactInstanceEventListener(this::onReactContextInitialized);
                    loadScript();
                    loadApp(getMainComponentName());
                }
            });
            ((ReactApplication)getApplication()).getReactNativeHost().getReactInstanceManager().createReactContextInBackground();
        }
    }

    protected abstract String getScriptPath();

    protected void loadScript(){
        /** all buz module is loaded when in debug mode*/
        if(ScriptLoadUtil.MULTI_DEBUG){//当设置成debug模式时，所有需要的业务代码已经都加载好了
            return;
        }
        String scriptPath = getScriptPath();
        CatalystInstance instance = ScriptLoadUtil.getCatalystInstance(getReactNativeHost());
        ScriptLoadUtil.loadScriptFromAsset(getApplicationContext(), instance, scriptPath,false);
    }
}
