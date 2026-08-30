package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05599x {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"RyLzjdLQFjwZTdMvpkfsGkyXtigedAZm", "a8YW2dbTuaP7uxeT", "o5bkY8KFpJEQCNeM0dZmTeV4kkPAZKmk", "Q9RCD7qWGcJuxCqJvF4GpBBcr652bG1U", "tH7JEQklX9QCJW", "WW", "I6Pdghhth7MCm7mFqOOdQdykNBKXXKMd", "Itt3Lc9JEUc7FKwrTTHvB6h8wU"};
    public long A00;
    public com.facebook.ads.redexgen.core.C05599x A01;
    public com.facebook.ads.redexgen.core.C05609y A02;
    public com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A03;
    public com.facebook.ads.redexgen.core.C0714Gp A04;
    public boolean A05;
    public boolean A06;
    public com.facebook.ads.redexgen.core.C0714Gp A07;
    public final com.facebook.ads.redexgen.core.XU A08;
    public final java.lang.Object A09;
    public final com.facebook.ads.redexgen.core.FG[] A0A;
    public final boolean[] A0B;
    public final com.facebook.ads.redexgen.core.Ev A0C;
    public final com.facebook.ads.redexgen.core.AbstractC0713Go A0D;
    public final com.facebook.ads.redexgen.core.AF[] A0E;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{6, 46, 47, 34, 42, 27, 46, 57, 34, 36, 47, 3, 36, 39, 47, 46, 57, 58, 15, 24, 3, 5, 14, 74, 24, 15, 6, 15, 11, 25, 15, 74, 12, 11, 3, 6, 15, 14, 68};
        if (A0G[2].charAt(0) != 'o') {
            throw new java.lang.RuntimeException();
        }
        A0G[0] = "kxSsjrUkGIE6MbLKOa3REuzZfRos40mi";
    }

    static {
        A01();
    }

    public C05599x(com.facebook.ads.redexgen.core.AF[] afArr, long j, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC0716Gr interfaceC0716Gr, com.facebook.ads.redexgen.core.Ev ev, java.lang.Object obj, com.facebook.ads.redexgen.core.C05609y c05609y) {
        this.A0E = afArr;
        this.A00 = j - c05609y.A03;
        this.A0D = abstractC0713Go;
        this.A0C = ev;
        this.A09 = com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(obj);
        this.A02 = c05609y;
        this.A0A = new com.facebook.ads.redexgen.core.FG[afArr.length];
        this.A0B = new boolean[afArr.length];
        com.facebook.ads.redexgen.core.XU xuA56 = ev.A56(c05609y.A04, interfaceC0716Gr);
        this.A08 = c05609y.A02 != Long.MIN_VALUE ? new com.facebook.ads.redexgen.core.E5(xuA56, true, 0L, c05609y.A02) : xuA56;
    }

    private void A02(com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = c0714Gp.A00(i);
            com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710GlA00 = c0714Gp.A01.A00(i);
            if (rendererEnabled && interfaceC0710GlA00 != null) {
                interfaceC0710GlA00.A5q();
            }
        }
    }

    private void A03(com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        com.facebook.ads.redexgen.core.C0714Gp c0714Gp2 = this.A07;
        this.A07 = c0714Gp;
        if (this.A07 != null) {
            A02(this.A07);
        }
    }

    private void A04(com.facebook.ads.redexgen.core.FG[] fgArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0E[i].A8a() == 5 && this.A04.A00(i)) {
                fgArr[i] = new com.facebook.ads.redexgen.core.XZ();
            }
        }
    }

    private void A05(com.facebook.ads.redexgen.core.FG[] fgArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0E[i].A8a() == 5) {
                fgArr[i] = null;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7s();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j) {
        return j - A07();
    }

    public final long A09(long j) {
        return A07() + j;
    }

    public final long A0A(long j, boolean z) {
        return A0B(j, z, new boolean[this.A0E.length]);
    }

    public final long A0B(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            int i2 = this.A04.A00;
            boolean z2 = false;
            if (i >= i2) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z && this.A04.A02(this.A07, i)) {
                z2 = true;
            }
            zArr2[i] = z2;
            i++;
        }
        A05(this.A0A);
        A03(this.A04);
        com.facebook.ads.redexgen.core.C0711Gm c0711Gm = this.A04.A01;
        long jAGC = this.A08.AGC(c0711Gm.A01(), this.A0B, this.A0A, zArr, j);
        A04(this.A0A);
        this.A05 = false;
        for (int i3 = 0; i3 < this.A0A.length; i3++) {
            if (this.A0A[i3] != null) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A04.A00(i3));
                int i4 = this.A0E[i3].A8a();
                if (i4 != 5) {
                    this.A05 = true;
                }
            } else {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(c0711Gm.A00(i3) == null);
            }
        }
        return jAGC;
    }

    public final long A0C(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long jA6b = this.A08.A6b();
        if (A0G[4].length() != 14) {
            throw new java.lang.RuntimeException();
        }
        A0G[1] = "fHwS3MIsR68PKOkuOsC9LjREFNCLxqD";
        if (jA6b == Long.MIN_VALUE && z) {
            return this.A02.A01;
        }
        return jA6b;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AF3(((com.facebook.ads.redexgen.core.E5) this.A08).A05);
            } else {
                this.A0C.AF3(this.A08);
            }
        } catch (java.lang.RuntimeException e) {
            android.util.Log.e(A00(0, 17, 59), A00(17, 22, 26), e);
        }
    }

    public final void A0E(float f) throws com.facebook.ads.redexgen.core.C05449h {
        this.A06 = true;
        this.A03 = this.A08.A8Z();
        A0I(f);
        long jA0A = A0A(this.A02.A03, false);
        long j = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j + (newStartPositionUs - jA0A);
        this.A02 = this.A02.A01(jA0A);
    }

    public final void A0F(long j) {
        this.A08.A4p(A08(j));
    }

    public final void A0G(long j) {
        if (this.A06) {
            this.A08.AEu(A08(j));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A6b() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.C0714Gp c0714GpA0T = this.A0D.A0T(this.A0E, this.A03);
        com.facebook.ads.redexgen.core.C0714Gp selectorResult = this.A07;
        if (c0714GpA0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = c0714GpA0T;
        com.facebook.ads.redexgen.core.C0714Gp selectorResult2 = this.A04;
        for (com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl : selectorResult2.A01.A01()) {
            if (interfaceC0710Gl != null) {
                interfaceC0710Gl.AD5(f);
            }
        }
        return true;
    }
}
