package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03792k {
    public static android.util.TypedValue A00;
    public static final java.lang.Object A01 = new java.lang.Object();

    public static final android.graphics.drawable.Drawable A00(android.content.Context context, int i) {
        int resolvedId;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (A01) {
            if (A00 == null) {
                A00 = new android.util.TypedValue();
            }
            context.getResources().getValue(i, A00, true);
            resolvedId = A00.resourceId;
        }
        return context.getResources().getDrawable(resolvedId);
    }
}
