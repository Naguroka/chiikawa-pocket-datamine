package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class L1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(boolean z) {
        super(0);
        this.f3674a = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.webkit.WebView.setWebContentsDebuggingEnabled(this.f3674a);
        return kotlin.Unit.INSTANCE;
    }
}
