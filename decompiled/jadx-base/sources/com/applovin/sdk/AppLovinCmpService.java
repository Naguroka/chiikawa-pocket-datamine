package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinCmpService {

    public interface OnCompletedListener {
        void onCompleted(com.applovin.sdk.AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(android.app.Activity activity, com.applovin.sdk.AppLovinCmpService.OnCompletedListener onCompletedListener);
}
