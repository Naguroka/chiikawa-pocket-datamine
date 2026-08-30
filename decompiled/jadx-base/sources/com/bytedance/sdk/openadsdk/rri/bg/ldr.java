package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    public static boolean bg(android.view.View view, int i) {
        return bg(view, false, i);
    }

    public static boolean bg(android.view.View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.core.VW.bg(view, z ? 30 : 50, i);
    }
}
