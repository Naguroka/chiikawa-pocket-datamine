package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03872s<E> implements java.lang.Cloneable {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"3rdfmaS4Bvs6KD5DohCaazKJ5nPjrowZ", "nk5cgk6zHA99knZ4VIBWP6swe9j6XVxJ", "SR1GrmmGZb5WiV5DUpa8V4qNmvh", "hXJT0tWkN7S4w3G0a7yWDauM9ZCHUr7o", "HR23fndUBIfy3sX8NPdMDAzNZ7ikzeu", "Yza27yUTeZsQZywWns2Eqk9QSJgdTaNC", "To1PPTsvrqg0vOGGncKBfzj1ovx9xtsA", "AHHllHZ2j6xopeQt7"};
    public static final java.lang.Object A06;
    public int A00;
    public boolean A01;
    public long[] A02;
    public java.lang.Object[] A03;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{107, 55, 43, 42, 48, 99, 14, 34, 51, 106, 4, 8, 25, 31};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final java.lang.String toString() {
        if (A06() <= 0) {
            java.lang.String strA03 = A03(12, 2, 10);
            java.lang.String[] strArr = A05;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[1] = "Skpu9y55M8HCr5nD5qLEIrlUv7DMUr8f";
            strArr2[3] = "83PSjIhGPkyHWD5a17BzKCZMIovhzHLb";
            return strA03;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(A03(10, 2, 64));
            }
            sb.append(A00(i));
            sb.append('=');
            E eA07 = A07(i);
            if (eA07 != this) {
                sb.append(eA07);
            } else {
                sb.append(A03(0, 10, 43));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    static {
        A05();
        A06 = new java.lang.Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C03872s() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C03872s(int i) {
        this.A01 = false;
        if (i == 0) {
            this.A02 = com.facebook.ads.redexgen.core.AbstractC03862r.A02;
            this.A03 = com.facebook.ads.redexgen.core.AbstractC03862r.A03;
        } else {
            int iA00 = com.facebook.ads.redexgen.core.AbstractC03862r.A00(i);
            this.A02 = new long[iA00];
            this.A03 = new java.lang.Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i) {
        if (this.A01) {
            A04();
        }
        return this.A02[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C03872s<E> clone() {
        com.facebook.ads.redexgen.core.C03872s<E> c03872s = null;
        try {
            c03872s = (com.facebook.ads.redexgen.core.C03872s) super.clone();
            c03872s.A02 = (long[]) this.A02.clone();
            c03872s.A03 = (java.lang.Object[]) this.A03.clone();
            return c03872s;
        } catch (java.lang.CloneNotSupportedException unused) {
            return c03872s;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j, E e) {
        int iA03 = com.facebook.ads.redexgen.core.AbstractC03862r.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            java.lang.Object[] objArr = this.A03;
            if (A05[7].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            A05[2] = "jXlMUCcAItIj0GcupoJ3Otj";
            if (objArr[iA03] != A06) {
                return (E) this.A03[iA03];
            }
        }
        return e;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i = this.A00;
        int i2 = 0;
        long[] jArr = this.A02;
        java.lang.Object[] objArr = this.A03;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != A06) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.A01 = false;
        this.A00 = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        int i = this.A00;
        java.lang.String[] strArr = A05;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "ypCZ";
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i = this.A00;
        java.lang.Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i) {
        if (this.A03[i] != A06) {
            this.A03[i] = A06;
            this.A01 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0B(long j, E e) {
        int i;
        int i2;
        int iA03 = com.facebook.ads.redexgen.core.AbstractC03862r.A03(this.A02, this.A00, j);
        if (iA03 >= 0) {
            java.lang.Object[] objArr = this.A03;
            if (A05[4].length() != 11) {
                A05[2] = "zIN2";
                objArr[iA03] = e;
                return;
            }
        } else {
            int iA04 = iA03 ^ (-1);
            int i3 = this.A00;
            if (iA04 < i3 && this.A03[iA04] == A06) {
                this.A02[iA04] = j;
                this.A03[iA04] = e;
                return;
            }
            boolean z = this.A01;
            java.lang.String[] strArr = A05;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[3];
            int iCharAt = str.charAt(17);
            int i4 = str2.charAt(17);
            if (iCharAt != i4) {
                A05[0] = "5FIvphvUgQVU1M732kCMD6tquLVSGC6u";
                if (z) {
                    i = this.A00;
                    i2 = this.A02.length;
                    if (i >= i2) {
                        A04();
                        long[] jArr = this.A02;
                        int i5 = this.A00;
                        iA04 = com.facebook.ads.redexgen.core.AbstractC03862r.A03(jArr, i5, j) ^ (-1);
                    }
                }
            } else {
                A05[2] = "2a9UU1wdCLKEgsYJNRrqpR";
                if (z) {
                    i = this.A00;
                    i2 = this.A02.length;
                    if (i >= i2) {
                        A04();
                        long[] jArr2 = this.A02;
                        int i6 = this.A00;
                        iA04 = com.facebook.ads.redexgen.core.AbstractC03862r.A03(jArr2, i6, j) ^ (-1);
                    }
                }
            }
            int i7 = this.A00;
            if (A05[7].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            A05[7] = "rLvHDd51XfoeTGgnr";
            int i8 = this.A02.length;
            if (i7 >= i8) {
                int i9 = this.A00;
                int i10 = com.facebook.ads.redexgen.core.AbstractC03862r.A00(i9 + 1);
                long[] jArr3 = new long[i10];
                java.lang.Object[] objArr2 = new java.lang.Object[i10];
                long[] jArr4 = this.A02;
                int length = this.A02.length;
                int n = A05[7].length();
                if (n == 17) {
                    A05[2] = "L48OP70swgk";
                    java.lang.System.arraycopy(jArr4, 0, jArr3, 0, length);
                    java.lang.Object[] objArr3 = this.A03;
                    int i11 = this.A03.length;
                    java.lang.System.arraycopy(objArr3, 0, objArr2, 0, i11);
                    this.A02 = jArr3;
                    this.A03 = objArr2;
                }
            }
            int i12 = this.A00;
            if (i12 - iA04 != 0) {
                int i13 = this.A00;
                java.lang.System.arraycopy(this.A02, iA04, this.A02, iA04 + 1, i13 - iA04);
                int i14 = this.A00;
                java.lang.System.arraycopy(this.A03, iA04, this.A03, iA04 + 1, i14 - iA04);
            }
            this.A02[iA04] = j;
            this.A03[iA04] = e;
            int i15 = this.A00;
            this.A00 = i15 + 1;
            return;
        }
        throw new java.lang.RuntimeException();
    }
}
