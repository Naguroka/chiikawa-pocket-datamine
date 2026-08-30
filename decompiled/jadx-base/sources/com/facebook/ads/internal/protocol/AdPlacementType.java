package com.facebook.ads.internal.protocol;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AdPlacementType {
    BANNER(A00(74, 6, 36)),
    MEDIUM_RECTANGLE(A00(92, 16, 88)),
    INTERSTITIAL(A00(80, 12, 40)),
    NATIVE(A00(108, 6, 13)),
    NATIVE_BANNER(A00(114, 13, 119)),
    REWARDED_VIDEO(A00(127, 14, 85)),
    UNKNOWN(A00(141, 7, 17));

    public static byte[] A01;
    public static java.lang.String[] A02 = {"CWC1iyAzuHCyWu1B0SYAHTA3miIxyRDu", "FO468KlqU7YYiE83Le7T5pQKY2foYhCa", "4lSmmc8pBcjbV0on62ZikVJFYVLsdMQp", "9H0k66zkYNaHG7pLFG5T73JVLywfdj", "IkTzUK68woTPnHHBk", "q5XpLTEZbHtnyzZXCKIvrGbFL2My8Wb0", "rdQ7fJEKRbVHtvxpiCxMwn5qtJ9qGM1n", "xGvuYGSPJhOX4"};
    public java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[6].charAt(3) != '7') {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "CTk8rnXs6cBCh";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-35, -36, -23, -23, -32, -19, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, 23, 15, 14, 19, 31, 23, 41, 28, 15, 13, 30, 11, 24, 17, 22, 15, -33, -46, -27, -38, -25, -42, -13, -26, -7, -18, -5, -22, 4, -25, -26, -13, -13, -22, -9, 44, 31, 49, 27, 44, 30, 31, 30, 57, 48, 35, 30, 31, 41, 16, 9, 6, 9, 10, 18, 9, 5, 4, 17, 17, 8, 21, 16, 21, 27, 12, 25, 26, 27, 16, 27, 16, 8, 19, 68, 60, 59, 64, 76, 68, 54, 73, 60, 58, 75, 56, 69, 62, 67, 60, -6, -19, 0, -11, 2, -15, 100, 87, 106, 95, 108, 91, 85, 88, 87, 100, 100, 91, 104, 70, 57, 75, 53, 70, 56, 57, 56, 51, 74, kotlin.io.encoding.Base64.padSymbol, 56, 57, 67, 5, -2, -5, -2, -1, 7, -2};
    }

    static {
        A01();
    }

    AdPlacementType(java.lang.String str) {
        this.A00 = str;
    }

    public static com.facebook.ads.internal.protocol.AdPlacementType fromString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(java.util.Locale.US));
        } catch (java.lang.Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.A00;
    }
}
