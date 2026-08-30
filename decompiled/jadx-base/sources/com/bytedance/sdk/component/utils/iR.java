package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    private static volatile android.os.Handler bg;

    public static android.os.Handler bg() {
        return com.bytedance.sdk.component.Kg.bg.bg.bg().IL();
    }

    public static android.os.Handler IL() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.utils.iR.class) {
                if (bg == null) {
                    bg = new android.os.Handler(android.os.Looper.getMainLooper());
                }
            }
        }
        return bg;
    }
}
