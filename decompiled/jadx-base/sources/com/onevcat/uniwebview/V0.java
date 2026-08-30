package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class V0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(boolean z) {
        super(1);
        this.f3695a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.getSettings().setAllowFileAccessFromFileURLs(this.f3695a);
        return kotlin.Unit.INSTANCE;
    }
}
