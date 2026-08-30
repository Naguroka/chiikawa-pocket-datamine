package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class H0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.onevcat.uniwebview.U1 f3661a;
    public final /* synthetic */ com.onevcat.uniwebview.UniWebViewNativeChannel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(com.onevcat.uniwebview.U1 u1, com.onevcat.uniwebview.UniWebViewNativeChannel uniWebViewNativeChannel) {
        super(0);
        this.f3661a = u1;
        this.b = uniWebViewNativeChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        com.onevcat.uniwebview.U1 u1 = this.f3661a;
        com.onevcat.uniwebview.UniWebViewNativeChannel uniWebViewNativeChannel = this.b;
        u1.getClass();
        com.onevcat.uniwebview.UniWebViewInterface.channel = uniWebViewNativeChannel;
        return kotlin.Unit.INSTANCE;
    }
}
