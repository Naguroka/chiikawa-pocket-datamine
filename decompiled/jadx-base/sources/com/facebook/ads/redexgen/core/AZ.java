package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AZ {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"YhFZQFr5dax73ozSX3y7z", "0btPcBid", "ccoOANicPnMaV5nGgfUfxklFPaiOf", "EI4dAbYlql723fSQ7wPmX", "GMl1WwxQIEaOrmGnDE2kCLCvMTZHsy6h", "mJA5IgjVymHjj3K0kYceOrCjwxroXsXj", "PK6Ri7QZ9VeoID4nNvuWqmskCo8ysON", "6oX6tIACB6eNkHgkORRDTyBhnrBo8d"};
    public static final com.facebook.ads.redexgen.core.AZ A04;
    public final int A00;
    public final int[] A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[3].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[3] = "b4a6tq0rhenSiy1wxrgE6";
            strArr2[0] = "JlQN55oRRBTOQ1CUDCmRG";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{74, 62, -111, -109, -114, -114, -115, -112, -110, -125, -126, 99, -116, -127, -115, -126, -121, -116, -123, -111, 91, -67, -15, -32, -27, -21, -65, -35, -20, -35, -34, -27, -24, -27, -16, -27, -31, -17, -41, -23, -35, -12, -65, -28, -35, -22, -22, -31, -24, -65, -21, -15, -22, -16, -71, -40, -99, -86, -96, -82, -85, -91, -96, 106, -87, -95, -96, -91, -99, 106, -99, -97, -80, -91, -85, -86, 106, -124, -128, -119, -123, -101, 125, -111, -128, -123, -117, -101, -116, -120, -111, -125, -58, -45, -55, -41, -44, -50, -55, -109, -46, -54, -55, -50, -58, -109, -54, -35, -39, -41, -58, -109, -90, -70, -87, -82, -76, -60, -75, -79, -70, -84, -60, -72, -71, -90, -71, -86, -106, -93, -103, -89, -92, -98, -103, 99, -94, -102, -103, -98, -106, 99, -102, -83, -87, -89, -106, 99, 122, -125, 120, -124, 121, 126, -125, 124, -120, -50, -37, -47, -33, -36, -42, -47, -101, -38, -46, -47, -42, -50, -101, -46, -27, -31, -33, -50, -101, -70, -82, -59, -52, -80, -75, -82, -69, -69, -78, -71, -52, -80, -68, -62, -69, -63};
    }

    static {
        A03();
        A04 = new com.facebook.ads.redexgen.core.AZ(new int[]{2}, 2);
    }

    public AZ(int[] iArr, int i) {
        if (iArr != null) {
            this.A01 = java.util.Arrays.copyOf(iArr, iArr.length);
            java.util.Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public static com.facebook.ads.redexgen.core.AZ A00(android.content.Context context) {
        return A01(com.facebook.ads.redexgen.core.L4.A00(context, null, new android.content.IntentFilter(A02(56, 36, 42))));
    }

    public static com.facebook.ads.redexgen.core.AZ A01(android.content.Intent intent) {
        if (intent == null || intent.getIntExtra(A02(92, 36, 83), 0) == 0) {
            return A04;
        }
        return new com.facebook.ads.redexgen.core.AZ(intent.getIntArrayExtra(A02(128, 29, 35)), intent.getIntExtra(A02(157, 37, 91), 0));
    }

    public final boolean A04(int i) {
        return java.util.Arrays.binarySearch(this.A01, i) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[PHI: r6
  0x0050: PHI (r6v2 com.facebook.ads.redexgen.X.AZ) = (r6v1 com.facebook.ads.redexgen.X.AZ), (r6v3 com.facebook.ads.redexgen.X.AZ) binds: [B:20:0x006d, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[ORIG_RETURN, RETURN] */
    public final boolean equals(java.lang.Object obj) {
        com.facebook.ads.redexgen.core.AZ az;
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof com.facebook.ads.redexgen.core.AZ;
        java.lang.String[] strArr = A03;
        if (strArr[4].charAt(22) != strArr[5].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[4] = "w1USCXg8ZjnjNvDZ7X2MerCQwxzm0Nu8";
        strArr2[5] = "U4AkfkKqs2F6cZLTDE14qhCk0AeglZbB";
        if (!z) {
            return false;
        }
        if (A03[1].length() != 16) {
            A03[1] = "";
            az = (com.facebook.ads.redexgen.core.AZ) obj;
            if (java.util.Arrays.equals(this.A01, az.A01)) {
                if (this.A00 == az.A00) {
                    return true;
                }
            }
        } else {
            java.lang.String[] strArr3 = A03;
            strArr3[6] = "wah0xQyFlUnv3HrXTdrAvgDlPnbONWV";
            strArr3[2] = "LcutVO6kpZJheUIWjBQzEq2ri8qFF";
            az = (com.facebook.ads.redexgen.core.AZ) obj;
            if (java.util.Arrays.equals(this.A01, az.A01)) {
                if (this.A00 == az.A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00 + (java.util.Arrays.hashCode(this.A01) * 31);
    }

    public final java.lang.String toString() {
        return A02(21, 34, 106) + this.A00 + A02(0, 21, 12) + java.util.Arrays.toString(this.A01) + A02(55, 1, 105);
    }
}
