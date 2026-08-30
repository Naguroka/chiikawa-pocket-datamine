package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z9 implements com.facebook.ads.redexgen.core.Ii, com.facebook.ads.redexgen.core.InterfaceC0576Ao, com.facebook.ads.redexgen.core.InterfaceC0697Fw, com.facebook.ads.redexgen.core.InterfaceC0641De, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {
    public static java.lang.String[] A01 = {"s1XoKYuOWujOozdgD26BdexE0JndoY0p", "ug", "yyipXdVJL0NW5jruXnuLHtd7HNthnOQs", "Np", "T3S7xgCH4xR7Lhcdh7IaJmLB92LvoGO6", "Lv6Qm0KobCIJpmcapSGTsoPqXtQ8zU", "F4ppLo9DkT8dpVqKTMmIcH3FimXW4jNn", "MKgJM"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0663Eb A00;

    public Z9(com.facebook.ads.redexgen.core.C0663Eb c0663Eb) {
        this.A00 = c0663Eb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABE(java.lang.String str, long j, long j2) {
        java.util.Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0576Ao) it.next()).ABE(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABF(com.facebook.ads.redexgen.core.BH bh) {
        java.util.Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0576Ao) it.next()).ABF(bh);
        }
        this.A00.A06 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABG(com.facebook.ads.redexgen.core.BH bh) {
        this.A00.A09 = bh;
        java.util.Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0576Ao) it.next()).ABG(bh);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABH(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        this.A00.A06 = format;
        java.util.Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0576Ao) it.next()).ABH(format);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABI(int i) {
        this.A00.A01 = i;
        java.util.Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0576Ao) it.next()).ABI(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABJ(int i, long j, long j2) {
        java.util.Iterator it = this.A00.A0I.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                throw new java.lang.RuntimeException();
            }
            A01[5] = "pWHwh8J2y";
            if (zHasNext) {
                ((com.facebook.ads.redexgen.core.InterfaceC0576Ao) it.next()).ABJ(i, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0697Fw
    public final void ABg(java.util.List<com.facebook.ads.redexgen.core.C0693Fs> list) {
        this.A00.A0C = list;
        for (java.lang.Object obj : this.A00.A0K) {
            java.lang.String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "lmorwd809xRnhQYXqopS36rQVvvPOgfq";
            ((com.facebook.ads.redexgen.core.InterfaceC0697Fw) obj).ABg(list);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ABo(int i, long j) {
        java.util.Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.Ii) it.next()).ABo(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0641De
    public final void ACl(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        java.util.Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0641De) it.next()).ACl(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADM(android.view.Surface surface) {
        if (this.A00.A03 == surface) {
            java.util.Iterator it = this.A00.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        java.util.Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((com.facebook.ads.redexgen.core.Ii) it2.next()).ADM(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADx(java.lang.String str, long j, long j2) {
        for (com.facebook.ads.redexgen.core.Ii ii : this.A00.A0L) {
            java.lang.String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[6] = "98uEWQJnNgSuENriuK2INOdUeiEIyWaZ";
            strArr2[4] = "eHkHjIDMEmUBDLT9VWPNpXXI3kSowk0p";
            ii.ADx(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADy(com.facebook.ads.redexgen.core.BH bh) {
        java.util.Iterator it = this.A00.A0L.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[2].charAt(5) == 'd') {
                A01[2] = "JrZfHdmFrRR6AyhIh3YYEfnATxgqdiz0";
                if (!zHasNext) {
                    com.facebook.ads.redexgen.core.C0663Eb c0663Eb = this.A00;
                    java.lang.String[] strArr = A01;
                    if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                        break;
                    }
                    A01[0] = "lOLMdoznQQ3DqAD1wG39jRlc0poGBnju";
                    c0663Eb.A07 = null;
                    this.A00.A0A = null;
                    return;
                }
                com.facebook.ads.redexgen.core.Ii ii = (com.facebook.ads.redexgen.core.Ii) it.next();
                if (A01[2].charAt(5) != 'd') {
                    break;
                }
                java.lang.String[] strArr2 = A01;
                strArr2[3] = "VQ";
                strArr2[1] = "Nl";
                ii.ADy(bh);
            } else {
                break;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADz(com.facebook.ads.redexgen.core.BH bh) {
        this.A00.A0A = bh;
        java.util.Iterator it = this.A00.A0L.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            java.lang.String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "IZFKv";
            if (!zHasNext) {
                return;
            }
            java.lang.Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                A01[2] = "cfU7KdfDtZpXBm3qFW7t619pDkxhYS61";
                ((com.facebook.ads.redexgen.core.Ii) next).ADz(bh);
            } else {
                A01[5] = "KzmuGXxm";
                ((com.facebook.ads.redexgen.core.Ii) next).ADz(bh);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void AE3(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        this.A00.A07 = format;
        java.util.Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.Ii) it.next()).AE3(format);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void AE8(int i, int i2, int i3, float f) {
        for (java.lang.Object obj : this.A00.A0M) {
            if (A01[0].charAt(24) != '0') {
                throw new java.lang.RuntimeException();
            }
            A01[5] = "XVq90yYfVTt0";
            ((com.facebook.ads.redexgen.core.IZ) obj).AE8(i, i2, i3, f);
        }
        for (java.lang.Object obj2 : this.A00.A0L) {
            if (A01[2].charAt(5) != 'd') {
                ((com.facebook.ads.redexgen.core.Ii) obj2).AE8(i, i2, i3, f);
            } else {
                A01[0] = "EzBATBLX59597vwh6aXI5FCM0yhDVwG8";
                ((com.facebook.ads.redexgen.core.Ii) obj2).AE8(i, i2, i3, f);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0G(new android.view.Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}
