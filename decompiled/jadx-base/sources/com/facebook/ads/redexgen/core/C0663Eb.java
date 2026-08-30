package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0663Eb implements com.facebook.ads.redexgen.core.ZB {
    public static byte[] A0O;
    public static java.lang.String[] A0P = {"XWeSpGD", "4qgR8lijDNBVXz9BioKUh69RZRfb7E2", "Q4SMfBcJ0bt0", "T", "TfY1BMlFFTNL7vzfskwyUKT4ej", "mKGGB3e4ANI8fD2ERhdb4BtSA2E0ESmz", "CjFdQ0AURNTGZtxre29PnmyrB2gjoGci", "x"};
    public float A00;
    public int A01;
    public int A02;
    public android.view.Surface A03;
    public android.view.SurfaceHolder A04;
    public android.view.TextureView A05;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A06;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A07;
    public com.facebook.ads.redexgen.core.AY A08;
    public com.facebook.ads.redexgen.core.BH A09;
    public com.facebook.ads.redexgen.core.BH A0A;
    public com.facebook.ads.redexgen.core.Ev A0B;
    public java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A0C;
    public boolean A0D;
    public final android.os.Handler A0E;
    public final com.facebook.ads.redexgen.core.ZB A0F;
    public final com.facebook.ads.redexgen.core.Z9 A0G;
    public final com.facebook.ads.redexgen.core.Z7 A0H;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.InterfaceC0576Ao> A0I;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.InterfaceC0641De> A0J;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.InterfaceC0697Fw> A0K;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.Ii> A0L;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.IZ> A0M;
    public final com.facebook.ads.redexgen.core.ZA[] A0N;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{-79, -57, -53, -50, -54, -61, -93, -42, -51, -82, -54, -65, -41, -61, -48, -93, -59, -62, -74, -79, -77, -75, -92, -75, -56, -60, -59, -62, -75, -100, -71, -61, -60, -75, -66, -75, -62, 112, -79, -68, -62, -75, -79, -76, -55, 112, -59, -66, -61, -75, -60, 112, -65, -62, 112, -62, -75, -64, -68, -79, -77, -75, -76, 126, -120, -117, -117, 115, -112, -102, -101, -116, -107, -116, -103};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0663Eb(com.facebook.ads.redexgen.core.AH ah, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh) {
        this(ah, abstractC0713Go, interfaceC05589w, interfaceC0593Bh, new com.facebook.ads.redexgen.core.AN());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0663Eb(com.facebook.ads.redexgen.core.AH ah, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, com.facebook.ads.redexgen.core.AN an) {
        this(ah, abstractC0713Go, interfaceC05589w, interfaceC0593Bh, an, com.facebook.ads.redexgen.core.InterfaceC0733Hi.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0663Eb(com.facebook.ads.redexgen.core.AH ah, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, com.facebook.ads.redexgen.core.AN an, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        this.A0G = new com.facebook.ads.redexgen.core.Z9(this);
        this.A0M = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0K = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0J = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0L = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0I = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.A0E = new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper());
        this.A0N = ah.A57(this.A0E, this.A0G, this.A0G, this.A0G, this.A0G, interfaceC0593Bh);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = com.facebook.ads.redexgen.core.AY.A04;
        this.A02 = 1;
        this.A0C = java.util.Collections.emptyList();
        this.A0F = A02(this.A0N, abstractC0713Go, interfaceC05589w, interfaceC0733Hi);
        this.A0H = an.A00(this.A0F, interfaceC0733Hi);
        A3m(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (0 != 0) {
            throw new java.lang.NullPointerException(A07(64, 11, 6));
        }
    }

    private final com.facebook.ads.redexgen.core.C0665Ed A02(com.facebook.ads.redexgen.core.ZA[] zaArr, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC05589w interfaceC05589w, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        return new com.facebook.ads.redexgen.core.C0665Ed(zaArr, abstractC0713Go, interfaceC05589w, interfaceC0733Hi);
    }

    private void A0E() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0G) {
                android.util.Log.w(A07(0, 15, 61), A07(15, 49, 47));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(android.view.Surface surface, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.facebook.ads.redexgen.core.ZA za : this.A0N) {
            if (za.A8a() == 2) {
                arrayList.add(this.A0F.A51(za).A06(1).A07(surface).A05());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.facebook.ads.redexgen.core.AD) it.next()).A0C();
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                if (A0P[6].charAt(9) != 'N') {
                    throw new java.lang.RuntimeException();
                }
                A0P[0] = "72REcLj";
                threadCurrentThread.interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z;
    }

    private final void A0I(com.facebook.ads.redexgen.core.InterfaceC0641De interfaceC0641De) {
        this.A0J.add(interfaceC0641De);
    }

    public final int A0J() {
        return this.A01;
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0K() {
        return this.A06;
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AH2(false);
    }

    public final void A0N(float f) {
        this.A00 = f;
        for (com.facebook.ads.redexgen.core.ZA za : this.A0N) {
            java.lang.String[] strArr = A0P;
            if (strArr[3].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0P;
            strArr2[4] = "DgH7fRCeCljpIo3I4J1ewSbeY9";
            strArr2[1] = "bAFJiNVMQ89hFktOZXBfzPUbCDSZU9u";
            if (za.A8a() == 1) {
                this.A0F.A51(za).A06(2).A07(java.lang.Float.valueOf(f)).A05();
            }
        }
    }

    public final void A0O(android.view.Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(com.facebook.ads.redexgen.core.Ev ev) {
        AEY(ev, true, true);
    }

    public final void A0Q(com.facebook.ads.redexgen.core.IZ iz) {
        this.A0M.add(iz);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void A3m(com.facebook.ads.redexgen.core.A5 a5) {
        this.A0F.A3m(a5);
    }

    @Override // com.facebook.ads.redexgen.core.ZB
    public final com.facebook.ads.redexgen.core.AD A51(com.facebook.ads.redexgen.core.AC ac) {
        return this.A0F.A51(ac);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A6Z() {
        return this.A0F.A6Z();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A6a() {
        return this.A0F.A6a();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A6w() {
        return this.A0F.A6w();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A6y() {
        return this.A0F.A6y();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A6z() {
        return this.A0F.A6z();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A71() {
        return this.A0F.A71();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final com.facebook.ads.redexgen.core.AM A73() {
        return this.A0F.A73();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final int A74() {
        return this.A0F.A74();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final long A7E() {
        return this.A0F.A7E();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final boolean A84() {
        return this.A0F.A84();
    }

    @Override // com.facebook.ads.redexgen.core.ZB
    public final void AEY(com.facebook.ads.redexgen.core.Ev ev, boolean z, boolean z2) {
        if (this.A0B != ev) {
            if (this.A0B != null) {
                this.A0B.AFa(this.A0H);
                this.A0H.A09();
            }
            ev.A3k(this.A0E, this.A0H);
            this.A0B = ev;
        }
        this.A0F.AEY(ev, z, z2);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AEy() {
        this.A0F.AEy();
        A0E();
        if (this.A03 != null) {
            if (this.A0D) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AFa(this.A0H);
        }
        this.A0C = java.util.Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AG9(long j) {
        this.A0H.A08();
        this.A0F.AG9(j);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AGA() {
        this.A0H.A08();
        this.A0F.AGA();
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AGZ(boolean z) {
        this.A0F.AGZ(z);
    }

    @Override // com.facebook.ads.redexgen.core.AA
    public final void AH2(boolean z) {
        this.A0F.AH2(z);
        if (this.A0B != null) {
            this.A0B.AFa(this.A0H);
            this.A0B = null;
            this.A0H.A09();
        }
        this.A0C = java.util.Collections.emptyList();
    }
}
