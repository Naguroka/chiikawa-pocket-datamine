package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9F {
    public static int A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"60vC7Tqxq", "iit", "yZ8WhL2SKbyHWFuqrbqyqX6q9YBqbSbq", "zou4kHpYoYqOWULjtQgwmQsgY48o5sQE", "Jj1CAbkpCkmlTw2dBaB6fKsG", "LIdASrcH6z6LtpFKNKqsX", "9qyYxkloNYGFw4rMCbrwSMHZV85hWfZp", "eAI5s54jDPvvLg6GHfi1"};
    public com.facebook.ads.redexgen.core.C9E A00;
    public boolean A01;
    public final java.io.File A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-29, -2, 6, 9, 2, 1, -67, 17, 12, -67, 1, 2, 9, 2, 17, 2, -67, 3, 6, 9, 2, -67, -60, -62, 16, -119, -84, -81, -88, 99, 106, 104, -74, 106, 99, -84, -74, 99, -79, -78, -73, 99, -92, 99, -75, -88, -92, -89, -92, -91, -81, -88, 99, -87, -84, -81, -88, -97, -60, -52, -73, -62, -65, -70, 118, -68, -69, -54, -71, -66, 118, -55, -54, -73, -56, -54, 118, -65, -60, -70, -69, -50, -112, 118, 123, -70, -75, -56, -58, -46, -43, -57, -125, -55, -52, -49, -56, -125, -60, -49, -43, -56, -60, -57, -36, -125, -57, -52, -42, -45, -46, -42, -56, -57};
        java.lang.String[] strArr = A05;
        if (strArr[2].charAt(17) != strArr[6].charAt(17)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A05;
        strArr2[1] = "hp8";
        strArr2[4] = "JPe8szfYYKMd1bH3O09b0bU9";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized int A05() throws java.io.IOException {
        return A00().A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized com.facebook.ads.redexgen.core.AnonymousClass96 A06(int i, byte[] bArr, int i2, int[] iArr, int i3) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C9E c9eA00 = A00();
        int i4 = 1;
        if (i < 0) {
            throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, A01(57, 29, 21), java.lang.Integer.valueOf(i)));
        }
        int i5 = i;
        int i6 = 0;
        long j = -1;
        boolean z = false;
        while (i5 < c9eA00.A00) {
            if ((i5 - i) + i3 >= iArr.length) {
                z = true;
                break;
            }
            long j2 = c9eA00.A03[i5];
            long j3 = (i5 == c9eA00.A00 - i4 ? c9eA00.A01 : c9eA00.A03[i5 + 1]) - j2;
            if (j == -1) {
                j = j2;
            }
            if (((int) j3) + i6 + i2 > bArr.length) {
                z = true;
                break;
            }
            i6 += (int) j3;
            iArr[(i5 - i) + i3] = (int) j3;
            i5++;
            i4 = 1;
        }
        if (i5 <= i) {
            return new com.facebook.ads.redexgen.core.AnonymousClass96(z ? com.facebook.ads.redexgen.core.AnonymousClass95.A04 : com.facebook.ads.redexgen.core.AnonymousClass95.A05, i, i, 0);
        }
        c9eA00.A02.seek(j);
        c9eA00.A02.read(bArr, i2, i6);
        return new com.facebook.ads.redexgen.core.AnonymousClass96(com.facebook.ads.redexgen.core.AnonymousClass95.A03, i, i5, i6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A09(byte[] bArr) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C9E c9eA00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(c9eA00.A00, c9eA00.A01);
        A04(c9eA00.A01, bArr);
        c9eA00.A02.getFD().sync();
        c9eA00.A00++;
        c9eA00.A01 += (long) bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C9F(java.io.File file) throws java.io.IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = com.facebook.ads.redexgen.core.C9E.A03(file);
        } else if (!file.isFile()) {
            throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, A01(25, 32, 2), file.getCanonicalPath()));
        }
    }

    private com.facebook.ads.redexgen.core.C9E A00() throws java.io.IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = com.facebook.ads.redexgen.core.C9E.A04(this.A02);
            }
            return this.A00;
        }
        throw new java.io.IOException(A01(86, 28, 34));
    }

    private void A03(int i, long j) throws java.io.IOException {
        this.A00.A03[i] = j;
        this.A00.A02.seek(com.facebook.ads.redexgen.core.C9E.A02(i));
        this.A00.A02.writeLong(j);
    }

    private void A04(long j, byte[] bArr) throws java.io.IOException {
        this.A00.A02.seek(j);
        this.A00.A02.write(bArr);
    }

    public final synchronized void A07() throws java.io.IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        java.io.RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws java.io.IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, A01(0, 25, 92), this.A02.getCanonicalPath()));
            }
        } else {
            throw new java.io.IOException(A01(86, 28, 34));
        }
    }
}
