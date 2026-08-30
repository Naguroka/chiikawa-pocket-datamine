package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0791Jt implements com.facebook.ads.redexgen.core.InterfaceC0994Rr {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass71 A00;
    public final /* synthetic */ java.util.concurrent.CountDownLatch A01;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference A02;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference A03;

    public C0791Jt(com.facebook.ads.redexgen.core.AnonymousClass71 anonymousClass71, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.util.concurrent.CountDownLatch countDownLatch) {
        this.A00 = anonymousClass71;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0994Rr
    public final void ABa(com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992Rp) {
        com.facebook.ads.redexgen.core.AnonymousClass71.A06(interfaceC0992Rp.A6X(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0994Rr
    public final void ABt(java.lang.Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
