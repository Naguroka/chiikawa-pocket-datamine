package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1579r0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f3753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579r0(android.graphics.Rect rect) {
        super(1);
        this.f3753a = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.graphics.Rect rect = this.f3753a;
        if (it.e.getHeight() > 0 && it.e.getWidth() > 0) {
            it.n = it.a(rect);
        }
        return kotlin.Unit.INSTANCE;
    }
}
