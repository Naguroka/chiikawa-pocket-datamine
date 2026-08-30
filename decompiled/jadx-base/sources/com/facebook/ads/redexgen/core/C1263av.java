package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1263av implements com.facebook.ads.redexgen.core.C4W {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"t5607oHfL2MNwmRFcsOr1jnyxzutumg5", "jNVCF7hNBx7qTlxJtSxtZf62y0YMH9ti", "vdh53KDEVDvYPF4U9zJ9CmemLfeqkfcW", "xmowDJGre", "ZTG0qcJaBRai17vkpDLZ7jbeFwjjrIPL", "kzc7Q54viT3CLivIFTQawvhHzc5bSJU6", "6m9Kb2lg4QS4P0ZcGJ2XwsRwfv4UyCAv", "gH"};
    public int A00;
    public com.facebook.ads.redexgen.core.InterfaceC03942z<com.facebook.ads.redexgen.core.AnonymousClass49> A01;
    public final com.facebook.ads.redexgen.core.AnonymousClass48 A02;
    public final com.facebook.ads.redexgen.core.C4X A03;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass49> A04;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass49> A05;
    public final boolean A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{23, 25, 16, 19, 2, 26, 15, 12, 2, 7};
    }

    static {
        A02();
    }

    public C1263av(com.facebook.ads.redexgen.core.AnonymousClass48 anonymousClass48) {
        this(anonymousClass48, false);
    }

    public C1263av(com.facebook.ads.redexgen.core.AnonymousClass48 anonymousClass48, boolean z) {
        this.A01 = new com.facebook.ads.redexgen.core.C1275b9(30);
        this.A04 = new java.util.ArrayList<>();
        this.A05 = new java.util.ArrayList<>();
        this.A00 = 0;
        this.A02 = anonymousClass48;
        this.A06 = z;
        this.A03 = new com.facebook.ads.redexgen.core.C4X(this);
    }

    private final int A00(int i, int i2) {
        int count = this.A05.size();
        if (i2 < count) {
            this.A05.get(i2);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        return i;
    }

    private final void A03(java.util.List<com.facebook.ads.redexgen.core.AnonymousClass49> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
            A0A(null);
        }
        list.clear();
        if (A08[1].charAt(29) != '9') {
            throw new java.lang.RuntimeException();
        }
        A08[2] = "ayjYK9F9Z6sDhNCNS52R1Qcr5XRGx639";
    }

    public final int A04(int i) {
        return A00(i, 0);
    }

    public final int A05(int i) {
        int size = this.A04.size();
        if (0 < size) {
            this.A04.get(0);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        return i;
    }

    public final void A06() {
        int count = this.A05.size();
        if (0 < count) {
            com.facebook.ads.redexgen.core.AnonymousClass48 anonymousClass48 = this.A02;
            this.A05.get(0);
            java.lang.String[] strArr = A08;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[4];
            int i = str.charAt(3);
            int count2 = str2.charAt(3);
            if (i != count2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[0] = "Yhl0jQrdp33aIQ4Nx5XRCxKVlJRMQ99k";
            strArr2[4] = "te80aWrb7iKuE4ta48s0tNKQ3kiAwVCD";
            anonymousClass48.ABl(null);
            throw null;
        }
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A07() {
        A06();
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        int count = this.A04.size();
        if (0 < count) {
            this.A04.get(0);
            throw new java.lang.NullPointerException(A01(0, 3, 126));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(com.facebook.ads.redexgen.core.AnonymousClass49 anonymousClass49) {
        if (!this.A06) {
            throw new java.lang.NullPointerException(A01(3, 7, 105));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i) {
        return (this.A00 & i) != 0;
    }
}
