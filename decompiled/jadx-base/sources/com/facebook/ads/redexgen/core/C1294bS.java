package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1294bS implements com.facebook.ads.redexgen.core.InterfaceC05148d {
    public static byte[] A03;
    public final android.os.Bundle A00;
    public final java.lang.String A01;
    public final java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{83, 94, 94, 93, 78, 84, 73, 65, 93, 88, 82, 88, 69, 78, 69, 84, 66, 69, 78, 92, 94, 85, 84, 78, 90, 84, 72, 67, 78, 78, 77, 94, 72, 82, 94, 84, 79, 72, 85, 88, 12, 1, 1, 2, 17, 3, 7, 22, 11, 10, 17, 15, 27, 10, 7, 11, 0, 13, 11, 17, 5, 11, 23, 32, 37, 48, 37, 59, 52, 54, 43, 39, 33, 55, 55, 45, 42, 35, 59, 43, 52, 48, 45, 43, 42, 55, 59, 39, 43, 49, 42, 48, 54, kotlin.io.encoding.Base64.padSymbol, 59, 47, 33, kotlin.io.encoding.Base64.padSymbol, 54, 51, 38, 51, 45, 34, 32, kotlin.io.encoding.Base64.padSymbol, 49, 55, 33, 33, 59, 60, 53, 45, kotlin.io.encoding.Base64.padSymbol, 34, 38, 59, kotlin.io.encoding.Base64.padSymbol, 60, 33, 45, 57, 55, 43, 7, 2, 23, 2, 28, 19, 17, 12, 0, 6, 16, 16, 10, 13, 4, 28, 12, 19, 23, 10, 12, 13, 16, 28, 16, 23, 2, 23, 6, 28, 8, 6, 26, 94, 89, 95, 82, 76, 73, 82, 89, 72, 94, 89, 82, 89, 84, 93, 72, 82, 70, 72, 84, 84, 83, 85, 88, 74, 66, 67, 78, 70, 83, 78, 72, 73, 88, 84, 66, 85, 81, 78, 68, 66, 88, 76, 66, 94};
    }

    public C1294bS(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A6c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A6q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final com.facebook.ads.redexgen.core.C05107x A78(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.String[] stringArray = this.A00.getStringArray(A00(98, 27, 121));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        java.lang.Integer country = java.lang.Integer.valueOf(this.A00.getInt(A00(125, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new com.facebook.ads.redexgen.core.C05107x(stringArray, numValueOf, country);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A7o() {
        return this.A00.getString(A00(org.objectweb.asm.Opcodes.GETSTATIC, 25, 12));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A8V() {
        java.lang.String string = this.A00.getString(A00(158, 20, 6));
        java.lang.String adTestTypeStr = com.facebook.ads.AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (com.facebook.ads.AdSettings.TestAdType testAdType : com.facebook.ads.AdSettings.TestAdType.values()) {
            java.lang.String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                java.lang.String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final boolean A9Y() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final boolean A9d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.Boolean A9i() {
        java.util.Set<java.lang.String> setKeySet = this.A00.keySet();
        java.lang.String strA00 = A00(27, 13, 10);
        if (setKeySet.contains(strA00)) {
            return java.lang.Boolean.valueOf(this.A00.getBoolean(strA00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final boolean isTestMode(android.content.Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || com.facebook.ads.AdSettings.isTestMode(context);
    }
}
