package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1560l {
    public static final com.onevcat.uniwebview.C1560l b = new com.onevcat.uniwebview.C1560l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3736a;

    public C1560l() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("UniWebView", "tag");
        this.f3736a = 80;
    }

    public final void a(com.onevcat.uniwebview.EnumC1557k enumC1557k, java.lang.String str) {
        if (enumC1557k.f3733a < this.f3736a) {
            return;
        }
        if (enumC1557k == com.onevcat.uniwebview.EnumC1557k.CRITICAL) {
            android.util.Log.e("UniWebView", "<UniWebView-Android> " + str);
        } else if (enumC1557k == com.onevcat.uniwebview.EnumC1557k.WARNING) {
            android.util.Log.w("UniWebView", "<UniWebView-Android> " + str);
        } else {
            android.util.Log.d("UniWebView", "<UniWebView-Android> " + str);
        }
    }

    public static void a(com.onevcat.uniwebview.EnumC1557k level, java.lang.String mark, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mark, "mark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        int iOrdinal = level.ordinal();
        if (iOrdinal == 3) {
            android.util.Log.w("UniWebView", mark + " <UniWebView-Web> " + message);
        } else if (iOrdinal != 4) {
            android.util.Log.d("UniWebView", mark + " <UniWebView-Web> " + message);
        } else {
            android.util.Log.e("UniWebView", mark + " <UniWebView-Web> " + message);
        }
    }
}
