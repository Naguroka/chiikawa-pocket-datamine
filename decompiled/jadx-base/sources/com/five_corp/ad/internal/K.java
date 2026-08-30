package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1787a;
    public final java.lang.String b;

    public K(android.content.Context context) {
        this.f1787a = context;
        this.b = com.five_corp.ad.internal.tracking_data.c.a(context);
    }

    public final int a(int i) {
        return (int) android.util.TypedValue.applyDimension(1, i, this.f1787a.getResources().getDisplayMetrics());
    }

    public final android.graphics.Rect b() {
        if (android.os.Build.VERSION.SDK_INT > 30) {
            return ((android.view.WindowManager) this.f1787a.getSystemService("window")).getCurrentWindowMetrics().getBounds();
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.f1787a.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        return new android.graphics.Rect(0, 0, point.x, point.y);
    }

    public final com.five_corp.ad.internal.util.f a() {
        try {
            android.content.pm.PackageInfo packageInfoA = com.five_corp.ad.internal.system.j.a(this.f1787a, "com.google.android.gms");
            return android.os.Build.VERSION.SDK_INT < 28 ? new com.five_corp.ad.internal.util.f(true, null, java.lang.Integer.valueOf(packageInfoA.versionCode)) : new com.five_corp.ad.internal.util.f(true, null, java.lang.Integer.valueOf((int) (packageInfoA.getLongVersionCode() & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE)));
        } catch (java.lang.Exception e) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.H, "Unknown error occurred when fetching Google Play Services version.", e, null), null);
        }
    }
}
