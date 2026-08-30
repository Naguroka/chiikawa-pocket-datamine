package com.bytedance.sdk.openadsdk.api.factory;

/* JADX INFO: loaded from: classes4.dex */
public class SDKTypeConfig {
    private static com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory bg;

    public static com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory getSdkTypeFactory() {
        android.util.Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return bg;
    }

    public static void setSdkTypeFactory(com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory iSDKTypeFactory) {
        android.util.Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        bg = iSDKTypeFactory;
    }
}
