package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1559k1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559k1(java.lang.String str) {
        super(1);
        this.f3735a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.q.setDoneButtonText(this.f3735a);
        return kotlin.Unit.INSTANCE;
    }
}
