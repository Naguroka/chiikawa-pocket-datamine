package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1535c1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535c1(boolean z) {
        super(1);
        this.f3712a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i;
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.C1593w c1593w = it.p;
        boolean z = this.f3712a;
        if (z) {
            i = 0;
        } else {
            if (z) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = 2;
        }
        c1593w.setOverScrollMode(i);
        return kotlin.Unit.INSTANCE;
    }
}
