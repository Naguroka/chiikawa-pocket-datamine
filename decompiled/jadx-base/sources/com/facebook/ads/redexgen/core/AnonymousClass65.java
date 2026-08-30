package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.65, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass65 {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"AnF1hfDBxlCdLbiDFLPUuTr8rEIYbsCs", "DcTEZsyKQaFycdRSUI2qHgy2Whp5epDQ", "oumPRRvCFD06iOY6OIziseOiJT3r0Y1F", "T68w1lZpg2aHhxWtuqshCv95QbfqOWN4", "NXTzrqYb1pzocIC4FPaomVlkuxRd4v50", "22ngLnp9x9FhYwfhJQ2wIkSm", "Bx3CPZoq94eNKBlojUhsqxvx", "nU7JTpeEhpBFqPr5yRkbJ9HjbOYUZCS7"};
    public final android.os.Handler A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass64 A01;
    public final com.facebook.ads.redexgen.core.C04766f A02;
    public final java.lang.String A03;
    public final java.lang.String A04;
    public final org.json.JSONObject A05;
    public final boolean A06;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{14, 32, 32, 18, 33, 32, -85, -82, -79, -86, -37, -33, -45, -39, -41, -61, -74, -79, -78, -68};
    }

    static {
        A07();
    }

    public AnonymousClass65(com.facebook.ads.redexgen.core.C04766f c04766f, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, boolean z, com.facebook.ads.redexgen.core.AnonymousClass64 anonymousClass64) {
        this.A02 = c04766f;
        this.A05 = jSONObject;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z && A0A(this.A05);
        this.A01 = anonymousClass64;
        this.A00 = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z, com.facebook.ads.redexgen.core.AnonymousClass63 anonymousClass63) {
        java.lang.String strA03 = A03(6, 4, 8);
        java.lang.String strA04 = A03(15, 5, 16);
        java.lang.String strA05 = A03(10, 5, 53);
        if (z) {
            if (strA05.equals(anonymousClass63.A02)) {
                this.A02.A0c(new com.facebook.ads.redexgen.core.C04746d(anonymousClass63.A03, -1, -1, this.A04, this.A03));
                return;
            } else if (strA04.equals(anonymousClass63.A02)) {
                this.A02.A0Z(new com.facebook.ads.redexgen.core.C04726b(anonymousClass63.A03, this.A04, this.A03));
                return;
            } else {
                if (!strA03.equals(anonymousClass63.A02)) {
                    return;
                }
                this.A02.A0Y(new com.facebook.ads.redexgen.core.C04726b(anonymousClass63.A03, this.A04, this.A03));
                return;
            }
        }
        boolean zEquals = strA05.equals(anonymousClass63.A02);
        java.lang.String[] strArr = A08;
        if (strArr[0].charAt(19) == strArr[7].charAt(19)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A08;
        strArr2[1] = "flwbx6LrQCqeci7k9ke6latQGKdtr0Wf";
        strArr2[4] = "KvRVuDaSTwPscix8AFjTqHYTdR1zRqiC";
        if (zEquals) {
            this.A02.A0b(new com.facebook.ads.redexgen.core.C04746d(anonymousClass63.A03, -1, -1, this.A04, this.A03));
        } else if (strA04.equals(anonymousClass63.A02)) {
            this.A02.A0a(new com.facebook.ads.redexgen.core.C04726b(anonymousClass63.A03, this.A04, this.A03));
        } else {
            if (!strA03.equals(anonymousClass63.A02)) {
                return;
            }
            this.A02.A0X(new com.facebook.ads.redexgen.core.C04726b(anonymousClass63.A03, this.A04, this.A03));
        }
    }

    public static boolean A0A(org.json.JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has(A03(0, 6, 112));
    }

    public final void A0B() {
        if (!this.A06) {
            this.A01.ABC();
        }
        com.facebook.ads.redexgen.core.M8.A06.execute(new com.facebook.ads.redexgen.core.C1217aA(this));
    }
}
