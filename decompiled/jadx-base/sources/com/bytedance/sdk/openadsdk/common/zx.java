package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    private static boolean bg = false;

    public static void bg(boolean z) {
        bg = z;
    }

    public static com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory bg(com.bytedance.sdk.openadsdk.api.PAGLoadListener pAGLoadListener) {
        if (bg) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, com.bytedance.sdk.openadsdk.api.PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory sdkTypeFactory = com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory != null) {
            return sdkTypeFactory;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(5000, com.bytedance.sdk.openadsdk.api.PAGErrorCode.LOAD_FACTORY_NULL_MSG);
        }
        return null;
    }

    public static boolean bg() {
        return bg;
    }
}
