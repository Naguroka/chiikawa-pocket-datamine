package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class O0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3680a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f3680a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.app.Activity activity = com.unity3d.player.UnityPlayer.currentActivity;
        java.lang.String str = this.f3680a;
        if (str == null) {
            str = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
        new com.onevcat.uniwebview.b2(activity, this.b, str, new com.onevcat.uniwebview.C1542f());
        return kotlin.Unit.INSTANCE;
    }
}
