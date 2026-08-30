package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04304k {
    public static byte[] A06;
    public static java.lang.String[] A07 = {com.json.Cdo.e, "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public com.facebook.ads.redexgen.core.InterfaceC04284i A04 = null;
    public java.util.ArrayList<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new java.util.ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
            java.lang.String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{76, 75, 30, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract boolean A0D(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56);

    public abstract boolean A0E(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2);

    public abstract boolean A0F(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2);

    public abstract boolean A0G(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2);

    public abstract boolean A0H(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        int i = anonymousClass56.A0C & 14;
        if (anonymousClass56.A0Z()) {
            return 4;
        }
        int flags = i & 4;
        if (flags == 0) {
            int pos = anonymousClass56.A0J();
            int oldPos = anonymousClass56.A0G();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i | 2048;
            }
            return i;
        }
        return i;
    }

    private final com.facebook.ads.redexgen.core.C04294j A01() {
        return new com.facebook.ads.redexgen.core.C04294j();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.C04294j A08(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return A01().A01(anonymousClass56);
    }

    public final com.facebook.ads.redexgen.core.C04294j A09(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i, java.util.List<java.lang.Object> payloads) {
        return A01().A01(anonymousClass56);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new java.lang.NullPointerException(A02(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0B(com.facebook.ads.redexgen.core.InterfaceC04284i interfaceC04284i) {
        this.A04 = interfaceC04284i;
    }

    public final void A0C(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        if (this.A04 != null) {
            this.A04.AB9(anonymousClass56);
        }
    }

    public boolean A0M(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, java.util.List<java.lang.Object> payloads) {
        return A0D(anonymousClass56);
    }
}
