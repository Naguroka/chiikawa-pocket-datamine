package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1565m1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565m1(java.lang.String str) {
        super(1);
        this.f3741a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.q.setGoForwardButtonText(this.f3741a);
        return kotlin.Unit.INSTANCE;
    }
}
