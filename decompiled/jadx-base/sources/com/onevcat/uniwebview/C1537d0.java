package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1537d0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537d0(java.lang.String str) {
        super(1);
        this.f3714a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.C1593w c1593w = it.p;
        java.lang.String domain = this.f3714a;
        c1593w.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        c1593w.e.i.add(domain);
        return kotlin.Unit.INSTANCE;
    }
}
