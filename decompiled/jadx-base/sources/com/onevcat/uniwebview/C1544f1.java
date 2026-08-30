package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1544f1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544f1(int i) {
        super(1);
        this.f3721a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.setDefaultFontSize(this.f3721a);
        return kotlin.Unit.INSTANCE;
    }
}
