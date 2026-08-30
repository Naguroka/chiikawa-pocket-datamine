package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1546g0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3723a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546g0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f3723a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.app.Activity activity = com.unity3d.player.UnityPlayer.currentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
        new com.onevcat.uniwebview.A(activity, this.f3723a, this.b, this.c, new com.onevcat.uniwebview.C1542f());
        return kotlin.Unit.INSTANCE;
    }
}
