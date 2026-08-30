package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1549h0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3726a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1549h0(java.lang.String str, boolean z) {
        super(0);
        this.f3726a = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        com.onevcat.uniwebview.C1536d c1536d = com.onevcat.uniwebview.C1536d.b;
        java.lang.String name = this.f3726a;
        c1536d.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.A a2 = (com.onevcat.uniwebview.A) c1536d.f3713a.get(name);
        if (a2 != null) {
            a2.i = this.b;
        }
        return kotlin.Unit.INSTANCE;
    }
}
