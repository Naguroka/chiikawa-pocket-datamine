package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1531b0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3707a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531b0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f3707a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.a(this.f3707a, this.b);
        return kotlin.Unit.INSTANCE;
    }
}
