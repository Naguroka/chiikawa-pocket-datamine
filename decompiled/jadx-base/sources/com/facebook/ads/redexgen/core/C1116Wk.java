package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1116Wk extends com.facebook.ads.redexgen.core.HT {
    public static byte[] A00;
    public static final java.util.regex.Pattern A01;
    public static final java.util.regex.Pattern A02;
    public static final java.util.regex.Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C1116Wk A00(java.io.File file, com.facebook.ads.redexgen.core.HX hx) {
        java.lang.String name = file.getName();
        if (!name.endsWith(A06(1, 7, 72))) {
            file = A05(file, hx);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        java.util.regex.Matcher matcher = A03.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file.length();
        java.lang.String strA0C = hx.A0C(java.lang.Integer.parseInt(matcher.group(1)));
        if (strA0C == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C1116Wk(strA0C, java.lang.Long.parseLong(matcher.group(2)), length, java.lang.Long.parseLong(matcher.group(3)), file);
    }

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{60, 123, 35, 102, 123, 48, 45, 58, 69, 51, 53, 48, 50, 71, 53, 51, 71, 127, 48, 50, 71, 53, 51, 71, 127, 48, 50, 71, 53, 109, 42, 71, 53, 126, 99, 116, okio.Utf8.REPLACEMENT_BYTE, 112, 6, 0, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 88, 28, 114, 0, 75, 86, 65, 10, 99, 21, 97, 89, 22, 20, 97, 19, 21, 97, 89, 22, 20, 97, 19, 21, 97, 89, 22, 20, 97, 19, 75, 14, 97, 19, 88, 69, 82, 25};
    }

    static {
        A07();
        A01 = java.util.regex.Pattern.compile(A06(8, 29, 6), 32);
        A02 = java.util.regex.Pattern.compile(A06(37, 29, 51), 32);
        A03 = java.util.regex.Pattern.compile(A06(66, 30, 32), 32);
    }

    public C1116Wk(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        super(str, j, j2, j3, file);
    }

    public static com.facebook.ads.redexgen.core.C1116Wk A01(java.lang.String str, long j) {
        return new com.facebook.ads.redexgen.core.C1116Wk(str, j, -1L, androidx.media3.common.C.TIME_UNSET, null);
    }

    public static com.facebook.ads.redexgen.core.C1116Wk A02(java.lang.String str, long j) {
        return new com.facebook.ads.redexgen.core.C1116Wk(str, j, -1L, androidx.media3.common.C.TIME_UNSET, null);
    }

    public static com.facebook.ads.redexgen.core.C1116Wk A03(java.lang.String str, long j, long j2) {
        return new com.facebook.ads.redexgen.core.C1116Wk(str, j, j2, androidx.media3.common.C.TIME_UNSET, null);
    }

    public static java.io.File A04(java.io.File file, int i, long j, long j2) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(i);
        java.lang.String strA06 = A06(0, 1, 15);
        return new java.io.File(file, sbAppend.append(strA06).append(j).append(strA06).append(j2).append(A06(1, 7, 72)).toString());
    }

    public static java.io.File A05(java.io.File file, com.facebook.ads.redexgen.core.HX hx) {
        java.lang.String filename;
        java.lang.String name = file.getName();
        java.util.regex.Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            java.lang.String filename2 = matcher.group(1);
            filename = com.facebook.ads.redexgen.core.IK.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        java.io.File parentFile = file.getParentFile();
        int iA08 = hx.A08(filename);
        java.lang.String filename3 = matcher.group(2);
        long j = java.lang.Long.parseLong(filename3);
        java.lang.String filename4 = matcher.group(3);
        java.io.File fileA04 = A04(parentFile, iA08, j, java.lang.Long.parseLong(filename4));
        if (file.renameTo(fileA04)) {
            return fileA04;
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.C1116Wk A08(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A05);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        return new com.facebook.ads.redexgen.core.C1116Wk(this.A04, this.A02, this.A01, jCurrentTimeMillis, A04(this.A03.getParentFile(), i, this.A02, jCurrentTimeMillis));
    }
}
