package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class C0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.C0 f3648a = new com.onevcat.uniwebview.C0();

    public C0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        boolean z;
        int i = com.onevcat.uniwebview.C1593w.i;
        android.app.Activity activity = com.unity3d.player.UnityPlayer.currentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            new android.webkit.WebView(activity).destroy();
            z = true;
        } catch (java.lang.Exception unused) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
