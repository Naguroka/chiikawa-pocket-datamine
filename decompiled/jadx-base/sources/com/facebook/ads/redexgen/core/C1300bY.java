package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1300bY implements com.facebook.ads.redexgen.core.AnonymousClass22 {
    public static byte[] A0A;
    public static final java.lang.String A0B;
    public long A02;
    public com.facebook.ads.RewardedVideoAd A03;
    public com.facebook.ads.redexgen.core.C1E A04;
    public com.facebook.ads.redexgen.core.C0681Fe A05;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final com.facebook.ads.S2SRewardedVideoAdExtendedListener A08;
    public final com.facebook.ads.redexgen.core.C1290bO A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, 127, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0B = com.facebook.ads.redexgen.core.C1300bY.class.getSimpleName();
    }

    public C1300bY(com.facebook.ads.redexgen.core.C1290bO c1290bO, com.facebook.ads.redexgen.core.C2I c2i, java.lang.String str) {
        this.A09 = c1290bO;
        this.A07 = c1290bO.A0B;
        this.A08 = new com.facebook.ads.redexgen.core.C1287bL(str, c2i, this, c1290bO);
    }

    private void A0C(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        java.lang.String extraHints;
        if (!this.A06 && this.A05 != null) {
            android.util.Log.w(A0B, A09(0, 78, 37));
        }
        A0D(false);
        this.A06 = false;
        com.facebook.ads.redexgen.core.C03621t c03621t = new com.facebook.ads.redexgen.core.C03621t(this.A09.A0D, com.facebook.ads.redexgen.core.EnumC0783Jl.A07, com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO, com.facebook.ads.redexgen.core.EnumC0781Jj.A08, 1, this.A09.A0C);
        c03621t.A08(z);
        if (com.facebook.ads.redexgen.core.C0762Im.A2T(this.A07) && (extraHints = com.facebook.ads.redexgen.core.L6.A02(this.A07, this.A09.A06)) != null) {
            this.A09.A06 = extraHints;
        }
        c03621t.A06(this.A09.A06);
        c03621t.A07(this.A09.A07);
        this.A05 = new com.facebook.ads.redexgen.core.C0681Fe(this.A09.A0B, c03621t);
        this.A05.A0R(new com.facebook.ads.redexgen.core.C1302ba(this));
        this.A05.A0W(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (this.A05 != null) {
            this.A05.A0R(new com.facebook.ads.redexgen.core.C1301bZ(this));
            this.A05.A0X(z);
            this.A05.A0J();
            this.A05 = null;
        }
    }

    public final long A0F() {
        if (this.A05 != null) {
            return this.A05.A0F();
        }
        return -1L;
    }

    public final com.facebook.ads.redexgen.core.C1290bO A0G() {
        return this.A09;
    }

    public final com.facebook.ads.redexgen.core.C1199Zs A0H() {
        return this.A07;
    }

    public final void A0I(com.facebook.ads.RewardData rewardData) {
        this.A09.A03 = rewardData;
        if (this.A06 && this.A05 != null) {
            this.A05.A0Z(rewardData);
        }
    }

    public final void A0J(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        this.A01 = java.lang.System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (java.lang.Exception e) {
            android.util.Log.e(A0B, A09(78, 31, 113), e);
            this.A09.A0B.A07().AA0(A09(109, 3, 126), com.facebook.ads.redexgen.core.C8E.A0b, new com.facebook.ads.redexgen.core.C8F(e));
            com.facebook.ads.AdError adErrorInternalError = com.facebook.ads.AdError.internalError(2004);
            this.A09.A0B.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A08.onError(this.A09.A6E(), adErrorInternalError);
        }
    }

    public final boolean A0K() {
        return this.A05 == null || this.A05.A0Y();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A06) {
            this.A08.onError(this.A09.A6E(), com.facebook.ads.AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = java.lang.System.currentTimeMillis();
            this.A05.A08.A02(i);
            this.A05.A08.A03(j);
            this.A05.A0L();
            this.A06 = false;
            return true;
        }
        this.A06 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass22
    public final void destroy() {
        A0D(true);
    }
}
