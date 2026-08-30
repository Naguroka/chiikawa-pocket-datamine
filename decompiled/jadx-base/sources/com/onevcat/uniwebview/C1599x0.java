package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1599x0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3769a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599x0(boolean z, int i, float f, java.lang.String str) {
        super(1);
        this.f3769a = z;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Boolean.valueOf(it.a(false, this.f3769a, this.b, this.c, this.d));
    }
}
