package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0787Jp {
    A03,
    A04;

    public static byte[] A00;
    public static java.lang.String[] A01 = {"muyYqE", "E9PpaFAJE9Hnt4d", "ghgofcX6zvMHlgudfTaqS8Nc5lCgt2E9", "YIYOJOVvACGtG0gL9GV7SlNTtBEERz", "JgOQfSPAOiHiw6Rg9nCac4dnqR1hKwEe", "B0OWkxWZ1EYllgtprLWqObgHiHWKfwuG", "4mHTrr1U8XEd9q", "nBr2KfKPMHO8Xb5ORNsKNBZ88yN02YcX"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[4].charAt(4) != strArr[2].charAt(4)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "ButKfEyieReZO2wb3N14oIodeWUfkj1h";
            strArr2[2] = "KKvBf6HmkOg9UJ27XgqfLe6TaNBCJiNp";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{88, 85, 111, 110, 111, 100};
    }

    static {
        A01();
    }
}
