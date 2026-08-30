package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class F0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.F0 f3657a = new com.onevcat.uniwebview.F0();

    public F0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        try {
            int i = com.onevcat.uniwebview.C1593w.i;
            android.webkit.WebSettings.getDefaultUserAgent(com.unity3d.player.UnityPlayer.currentActivity);
        } catch (java.lang.Exception e) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message = "Exception when preparing web view. This usually means there is no web view on the device and the whole UniWebView won't work. " + e.getMessage();
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
        }
        return kotlin.Unit.INSTANCE;
    }
}
