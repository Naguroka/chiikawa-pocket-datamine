package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YC implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"N3GpeYjJMdKFRv0SshHJKYsMOuO8p0tA", "wiC15XfKNpxiBv337rdfaN7iMk56huNL", "A3rsL6GYIxDIsUnc56leVSLnuuwWJE", "ZqwBdGbE4SmgDsULJVLTHbFOP2ezpJEQ", "xoPpoqfJCAQQdXeq5BVdnLmzIY6pHKhI", "B8ZA", "v1zw", "7spihzsXhr8LXNxcY6XClUbYBtHjjuHe"};
    public static final com.facebook.ads.redexgen.core.C0 A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final com.facebook.ads.redexgen.core.YB A02;
    public final com.facebook.ads.redexgen.core.I4 A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A05[2].length() != 30) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[3] = "3ZPkzOiGV9NVnE4h3utFZ5OzDgmotOaN";
            strArr[1] = "eEVTlcljeWNjgsJMtw5K8hnVppEY0YPV";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 91);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{79, 66, 53};
    }

    static {
        A01();
        A06 = new com.facebook.ads.redexgen.core.YD();
        A07 = com.facebook.ads.redexgen.core.IK.A08(A00(0, 3, 93));
    }

    public YC() {
        this(0L);
    }

    public YC(long j) {
        this.A01 = j;
        this.A02 = new com.facebook.ads.redexgen.core.YB(true);
        this.A03 = new com.facebook.ads.redexgen.core.I4(200);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A02.A5B(interfaceC0611Bz, new com.facebook.ads.redexgen.core.DH(0, 1));
        interfaceC0611Bz.A5u();
        interfaceC0611Bz.AG8(new com.facebook.ads.redexgen.core.C1169Yo(androidx.media3.common.C.TIME_UNSET));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        int i = interfaceC0610By.read(this.A03.A00, 0, 200);
        if (i == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i);
        if (!this.A00) {
            com.facebook.ads.redexgen.core.YB yb = this.A02;
            long j = this.A01;
            java.lang.String[] strArr = A05;
            java.lang.String str = strArr[3];
            java.lang.String str2 = strArr[1];
            int iCharAt = str.charAt(14);
            int bytesRead = str2.charAt(14);
            if (iCharAt == bytesRead) {
                throw new java.lang.RuntimeException();
            }
            A05[6] = "35by";
            yb.AEM(j, true);
            this.A00 = true;
        }
        this.A02.A4n(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A00 = false;
        this.A02.AG6();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(10);
        com.facebook.ads.redexgen.core.I3 i3 = new com.facebook.ads.redexgen.core.I3(i4.A00);
        int startPosition = 0;
        while (true) {
            interfaceC0610By.AEO(i4.A00, 0, 10);
            i4.A0Y(0);
            if (i4.A0G() != A07) {
                break;
            }
            i4.A0Z(3);
            int iA0D = i4.A0D();
            startPosition += iA0D + 10;
            interfaceC0610By.A3s(iA0D);
        }
        interfaceC0610By.AFq();
        interfaceC0610By.A3s(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i = 0;
        while (true) {
            interfaceC0610By.AEO(i4.A00, 0, 2);
            i4.A0Y(0);
            int headerPosition = 65526 & i4.A0I();
            if (headerPosition != 65520) {
                i = 0;
                validFramesCount = 0;
                interfaceC0610By.AFq();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0610By.A3s(syncBytes);
            } else {
                i++;
                if (i >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC0610By.AEO(i4.A00, 0, 4);
                i3.A07(14);
                int headerPosition3 = i3.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC0610By.A3s(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
