package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J0 implements com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"mk4JADweKGMdEipgs7lqzWCmp9MhwBVd", "7Ny", "iKbrrxCAW5LmmXQLv4pN0A2xOojW5LEh", "hTGooAwgeIivj8mmjwzyxJz5o5QVTAJv", "t2q", "TYEvFDV2ICGQhAA5rVoFfbgoEst1cigG", "6Z5Mtc9AK5a0redP3ZVrPDgigSlCVve8", "dEPXAz2Hd7rZMNq86xusU7gw49uZCQrL"};
    public final android.app.Activity A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -12, -6, 5, -8, -4, 5, -25, -10, -10, 5, -11, -8, -17, -21, -12, -6, -25, -6, -17, -11, -12, 5, -15, -21, -1, -44, -43, -45, -32, -62, -59, -32, -54, -59, -32, -52, -58, -38};
    }

    static {
        A01();
    }

    public J0(android.app.Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i) {
        this.A00.setResult(i);
        this.A00.finish();
    }

    private boolean A03(com.facebook.ads.redexgen.core.C0773Iz c0773Iz) {
        java.lang.String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            java.lang.String callingPackage2 = c0773Iz.A03;
            if (callingPackage.equals(callingPackage2)) {
                if (A02[6].charAt(24) != 'N') {
                    java.lang.String[] strArr = A02;
                    strArr[3] = "K8elIBMg7jYz2h1Vp3N7ST3gxgb7rcrL";
                    strArr[2] = "atbN7xR2A34bPDsarDq1XfYhUcdmo37f";
                    return true;
                }
                java.lang.String[] strArr2 = A02;
                strArr2[3] = "WL8DJ1n8qMW41xfoDndW3QEL4VTWFS4X";
                strArr2[2] = "L472DFJOuggr64sYy3SVVGT8Lyt3cNtD";
                return true;
            }
        }
        A02(12);
        if (c0773Iz.A00 instanceof com.facebook.ads.redexgen.core.C1303bb) {
            ((com.facebook.ads.redexgen.core.C1303bb) c0773Iz.A00).A0F().A0E().AFC();
        }
        if (c0773Iz.A00 instanceof com.facebook.ads.redexgen.core.C1300bY) {
            com.facebook.ads.redexgen.core.C0S c0sA0E = ((com.facebook.ads.redexgen.core.C1300bY) c0773Iz.A00).A0H().A0E();
            if (A02[6].charAt(24) == 'N') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A02;
            strArr3[3] = "KnmB7vQIkrX7k7dgjGlnkXpo8slRCHvd";
            strArr3[2] = "L31mVvLUBUTWDHfS0xNAbfc4Adshav9b";
            c0sA0E.AFC();
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA05 = com.facebook.ads.redexgen.core.C04465b.A05(this.A00, java.util.UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            c1199ZsA05.A0E().AF5();
            A02(10);
            return;
        }
        java.lang.String stringExtra = this.A00.getIntent().getStringExtra(A00(26, 13, 64));
        if (stringExtra == null) {
            c1199ZsA05.A0E().AF8();
            A02(11);
            return;
        }
        com.facebook.ads.redexgen.core.C1107Wb c1107WbA00 = com.facebook.ads.redexgen.core.C1107Wb.A00();
        java.lang.String[] strArr = A02;
        java.lang.String adId = strArr[3];
        if (adId.charAt(2) == strArr[2].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        A02[6] = "lksFSMsleDiju0zPRojKCtBItYjbAveN";
        com.facebook.ads.redexgen.core.C0773Iz c0773IzA04 = c1107WbA00.A04(stringExtra);
        com.facebook.ads.redexgen.core.AnonymousClass22 anonymousClass22 = c0773IzA04 != null ? c0773IzA04.A00 : null;
        if (c0773IzA04 != null && (anonymousClass22 instanceof com.facebook.ads.redexgen.core.C1300bY)) {
            boolean zA03 = A03(c0773IzA04);
            java.lang.String[] strArr2 = A02;
            java.lang.String adId2 = strArr2[3];
            if (adId2.charAt(2) == strArr2[2].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "e1bxVkSqO5M4Y9q0gpYlqAB3DYjxjVYF";
            if (!zA03) {
                return;
            }
            com.facebook.ads.redexgen.core.C1300bY c1300bY = (com.facebook.ads.redexgen.core.C1300bY) anonymousClass22;
            c1300bY.A0G().A01().A0I(this.A00);
            c1300bY.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 101), -1), 0L);
        } else if (c0773IzA04 != null && (anonymousClass22 instanceof com.facebook.ads.redexgen.core.C1303bb)) {
            if (!A03(c0773IzA04)) {
                return;
            }
            com.facebook.ads.redexgen.core.C1303bb c1303bb = (com.facebook.ads.redexgen.core.C1303bb) anonymousClass22;
            c1303bb.A0E().A05().A0I(this.A00);
            c1303bb.A0J();
        } else {
            c1199ZsA05.A0E().AFY();
            A02(13);
            return;
        }
        this.A00.setResult(-1);
        this.A00.finish();
    }
}
