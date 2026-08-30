package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0619Ch {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"LDHS3H9YnUh7C7BCkh", "wC9e9nnwReFs9ZTI4bgFhMBKq7UfutKa", "dOVlFJvoAdJbJQKRw8v4NRbH1WbgG8Lt", "DZWYNPZ", "BS0YbHQAO0VU4qHMbgdjqGwsVP1Lt8hI", "pFDu33085QdGuzrGUL", "zTHWwR6874BSc50B06ceZtd8OhPobwtD", "iUZAADc"};
    public static final int[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 95);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{118, 34, 119, 36, 1, 85, 0, 80, 31, 75, 73, 26, 33, 117, 117, 36, 115, 39, 48, 16, 68, 81, 21, 31, 75, 95, 26, 21, 108, 25, 120, 69, 60, 94, 40, 123, 2, 96, 102, 122, 100, 121, 97, 49, 38, 51, 97, 17, 67, 1, 87, 108, 97, 114, 53, 58, 36, 49, 99, 102, 124, 96, kotlin.io.encoding.Base64.padSymbol, 75, 81, 77, 17, 66, 88, 68, 31, 73, 83, 79, 21, 100, 126, 98, 59, 31, 5, 25, 27, 20, 27, 27, 22, 91, 70, 2, 7, 22, 11, 79, 73, 88, 93, 9, 9};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A05(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        boolean z2;
        long jA7g = interfaceC0610By.A7g();
        long j = 4096;
        long j2 = -1;
        if (jA7g != -1 && jA7g <= 4096) {
            j = jA7g;
        }
        int i = (int) j;
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(64);
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                z2 = false;
                break;
            }
            int i3 = 8;
            i4.A0W(8);
            interfaceC0610By.AEO(i4.A00, 0, 8);
            long jA0M = i4.A0M();
            int iA08 = i4.A08();
            if (jA0M == 1) {
                i3 = 16;
                interfaceC0610By.AEO(i4.A00, 8, 8);
                i4.A0X(16);
                jA0M = i4.A0N();
            } else if (jA0M == 0) {
                long jA7g2 = interfaceC0610By.A7g();
                if (jA7g2 != j2) {
                    jA0M = (jA7g2 - interfaceC0610By.A86()) + ((long) 8);
                }
            }
            if (jA0M < i3) {
                return false;
            }
            i2 += i3;
            if (iA08 != com.facebook.ads.redexgen.core.CO.A0j) {
                if (iA08 == com.facebook.ads.redexgen.core.CO.A0i) {
                    z2 = false;
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0m) {
                    z2 = false;
                } else {
                    if ((((long) i2) + jA0M) - ((long) i3) >= i) {
                        z2 = false;
                        break;
                    }
                    int i5 = (int) (jA0M - ((long) i3));
                    i2 += i5;
                    if (iA08 == com.facebook.ads.redexgen.core.CO.A0U) {
                        if (i5 < 8) {
                            return false;
                        }
                        i4.A0W(i5);
                        interfaceC0610By.AEO(i4.A00, 0, i5);
                        if (A01[4].charAt(8) == 'R') {
                            throw new java.lang.RuntimeException();
                        }
                        A01[4] = "vTpU17iWMYsrTUgkFMYDQI1PnnxMgubG";
                        int i6 = i5 / 4;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if (i7 != 1) {
                                if (A02(i4.A08())) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                i4.A0Z(4);
                            }
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        interfaceC0610By.A3s(i5);
                    }
                    j2 = -1;
                }
                z4 = true;
                break;
            }
            j2 = -1;
        }
        if (z3 && z == z4) {
            return true;
        }
        return z2;
    }

    static {
        A01();
        A02 = new int[]{com.facebook.ads.redexgen.core.IK.A08(A00(79, 4, 41)), com.facebook.ads.redexgen.core.IK.A08(A00(59, 4, 80)), com.facebook.ads.redexgen.core.IK.A08(A00(63, 4, 125)), com.facebook.ads.redexgen.core.IK.A08(A00(67, 4, 116)), com.facebook.ads.redexgen.core.IK.A08(A00(71, 4, 127)), com.facebook.ads.redexgen.core.IK.A08(A00(75, 4, 82)), com.facebook.ads.redexgen.core.IK.A08(A00(43, 4, 15)), com.facebook.ads.redexgen.core.IK.A08(A00(55, 4, 13)), com.facebook.ads.redexgen.core.IK.A08(A00(51, 4, 91)), com.facebook.ads.redexgen.core.IK.A08(A00(87, 4, 105)), com.facebook.ads.redexgen.core.IK.A08(A00(91, 4, 36)), com.facebook.ads.redexgen.core.IK.A08(A00(0, 4, 26)), com.facebook.ads.redexgen.core.IK.A08(A00(4, 4, 109)), com.facebook.ads.redexgen.core.IK.A08(A00(19, 4, 124)), com.facebook.ads.redexgen.core.IK.A08(A00(23, 4, 115)), com.facebook.ads.redexgen.core.IK.A08(A00(8, 4, 115)), com.facebook.ads.redexgen.core.IK.A08(A00(12, 4, 77)), com.facebook.ads.redexgen.core.IK.A08(A00(31, 4, 87)), com.facebook.ads.redexgen.core.IK.A08(A00(27, 4, 7)), com.facebook.ads.redexgen.core.IK.A08(A00(47, 4, 40)), com.facebook.ads.redexgen.core.IK.A08(A00(83, 4, 32)), com.facebook.ads.redexgen.core.IK.A08(A00(35, 4, 105)), com.facebook.ads.redexgen.core.IK.A08(A00(95, 4, 118)), com.facebook.ads.redexgen.core.IK.A08(A00(39, 4, 104))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == com.facebook.ads.redexgen.core.IK.A08(A00(16, 3, 31))) {
            return true;
        }
        for (int i2 : A02) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return A05(interfaceC0610By, true);
    }

    public static boolean A04(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return A05(interfaceC0610By, false);
    }
}
