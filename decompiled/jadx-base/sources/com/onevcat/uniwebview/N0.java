package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class N0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f3678a;
    public final /* synthetic */ kotlin.jvm.functions.Function1 b;
    public final /* synthetic */ java.util.concurrent.CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.functions.Function1 function1, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f3678a = objectRef;
        this.b = function1;
        this.c = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this.f3678a.element = this.b.invoke(it);
        this.c.countDown();
        return kotlin.Unit.INSTANCE;
    }
}
