package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1538d1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3715a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538d1(int i) {
        super(1);
        this.f3715a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.webkit.WebSettings settings = it.p.getSettings();
        int i = com.onevcat.uniwebview.C1593w.i;
        int i2 = this.f3715a;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = -1;
                }
            } else {
                i3 = 1;
            }
        }
        settings.setCacheMode(i3);
        return kotlin.Unit.INSTANCE;
    }
}
