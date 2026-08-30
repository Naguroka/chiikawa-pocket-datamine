package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1543f0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3720a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543f0(int i, int i2, int i3, int i4, float f, float f2, java.lang.String str) {
        super(1);
        this.f3720a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
        this.g = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Boolean.valueOf(it.a(this.f3720a, this.b, this.c, this.d, this.e, this.f, this.g));
    }
}
