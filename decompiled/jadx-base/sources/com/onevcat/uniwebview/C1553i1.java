package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1553i1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3730a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1553i1(float f, float f2, float f3, float f4) {
        super(1);
        this.f3730a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.q.a(this.f3730a, this.b, this.c, this.d);
        return kotlin.Unit.INSTANCE;
    }
}
