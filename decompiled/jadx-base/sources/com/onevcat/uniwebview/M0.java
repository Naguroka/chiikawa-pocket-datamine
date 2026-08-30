package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class M0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f3675a;
    public final /* synthetic */ kotlin.jvm.functions.Function0 b;
    public final /* synthetic */ java.util.concurrent.CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.functions.Function0 function0, java.util.concurrent.CountDownLatch countDownLatch) {
        super(0);
        this.f3675a = objectRef;
        this.b = function0;
        this.c = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        this.f3675a.element = this.b.invoke();
        this.c.countDown();
        return kotlin.Unit.INSTANCE;
    }
}
