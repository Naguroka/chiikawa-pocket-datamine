package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6G {
    public static byte[] A01;
    public android.content.SharedPreferences A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public C6G(com.facebook.ads.redexgen.core.C7j c7j) {
        this.A00 = c7j.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A00(33, 21, 4), c7j), 0);
    }

    public final com.facebook.ads.redexgen.core.C6F A02() {
        android.content.SharedPreferences sharedPreferences = this.A00;
        java.lang.String strA00 = A00(0, 13, 55);
        if (sharedPreferences.contains(strA00)) {
            return new com.facebook.ads.redexgen.core.C6F(this.A00.getString(strA00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), com.facebook.ads.redexgen.core.C6E.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return com.facebook.ads.redexgen.core.C6F.A00();
    }

    public final java.lang.String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(com.facebook.ads.redexgen.core.C6F c6f) {
        android.content.SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(0, 13, 55), c6f.A03());
        editorEdit.putBoolean(A00(54, 15, 96), c6f.A04());
        editorEdit.putLong(A00(26, 7, 65), c6f.A01());
        editorEdit.apply();
    }

    public final void A05(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(13, 13, 78), str);
        editorEdit.apply();
    }
}
