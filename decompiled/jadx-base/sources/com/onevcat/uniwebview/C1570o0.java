package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1570o0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3746a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570o0(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f3746a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        int i = com.onevcat.uniwebview.C1593w.i;
        android.app.Activity currentActivity = com.unity3d.player.UnityPlayer.currentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentActivity, "currentActivity");
        com.onevcat.uniwebview.AbstractC1587u.a(currentActivity, this.f3746a, this.b);
        return kotlin.Unit.INSTANCE;
    }
}
