package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1550h1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1550h1(boolean z) {
        super(1);
        this.f3727a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.setDragInteractionEnabled(this.f3727a);
        return kotlin.Unit.INSTANCE;
    }
}
