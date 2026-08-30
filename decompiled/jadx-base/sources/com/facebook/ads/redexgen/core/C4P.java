package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4P implements java.lang.Runnable {
    public static java.util.Comparator<com.facebook.ads.redexgen.core.C4O> A04;
    public static byte[] A05;
    public static java.lang.String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final java.lang.ThreadLocal<com.facebook.ads.redexgen.core.C4P> A07;
    public long A00;
    public long A01;
    public java.util.ArrayList<com.facebook.ads.redexgen.core.FL> A02 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.C4O> A03 = new java.util.ArrayList<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, 27, 117, 94, 72, 79, 94, 95, 27, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, 22, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    static {
        A03();
        A07 = new java.lang.ThreadLocal<>();
        A04 = new java.util.Comparator<com.facebook.ads.redexgen.core.C4O>() { // from class: com.facebook.ads.redexgen.X.4N
            public static java.lang.String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(com.facebook.ads.redexgen.core.C4O c4o, com.facebook.ads.redexgen.core.C4O c4o2) {
                if ((c4o.A03 == null) != (c4o2.A03 == null)) {
                    com.facebook.ads.redexgen.core.FL fl = c4o.A03;
                    if (A00[1].length() == 18) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A00;
                    strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
                    strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
                    return fl == null ? 1 : -1;
                }
                if (c4o.A04 != c4o2.A04) {
                    return c4o.A04 ? -1 : 1;
                }
                int i = c4o2.A02 - c4o.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = c4o.A00;
                int deltaViewVelocity = c4o2.A00;
                int i3 = i2 - deltaViewVelocity;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        };
    }

    private com.facebook.ads.redexgen.core.AnonymousClass56 A00(com.facebook.ads.redexgen.core.FL fl, int i, long j) {
        if (A08(fl, i)) {
            return null;
        }
        com.facebook.ads.redexgen.core.C04414w c04414w = fl.A0r;
        try {
            fl.A1K();
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0I = c04414w.A0I(i, false, j);
            if (anonymousClass56A0I != null) {
                if (anonymousClass56A0I.A0Y() && !anonymousClass56A0I.A0Z()) {
                    c04414w.A0T(anonymousClass56A0I.A0H);
                } else {
                    c04414w.A0Z(anonymousClass56A0I, false);
                }
            }
            return anonymousClass56A0I;
        } finally {
            fl.A1m(false);
        }
    }

    private void A02() {
        com.facebook.ads.redexgen.core.C4O c4o;
        int size = this.A02.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.FL fl = this.A02.get(i2);
            int viewCount = fl.getWindowVisibility();
            if (viewCount == 0) {
                fl.A02.A04(fl, false);
                int viewCount2 = fl.A02.A00;
                i += viewCount2;
            }
        }
        this.A03.ensureCapacity(i);
        int j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            com.facebook.ads.redexgen.core.FL fl2 = this.A02.get(i3);
            int viewCount3 = fl2.getWindowVisibility();
            if (viewCount3 == 0) {
                com.facebook.ads.redexgen.core.C1262au c1262au = fl2.A02;
                int viewCount4 = c1262au.A01;
                int i4 = java.lang.Math.abs(viewCount4);
                int viewCount5 = c1262au.A02;
                int i5 = i4 + java.lang.Math.abs(viewCount5);
                for (int i6 = 0; i6 < viewCount * 2; i6 += 2) {
                    int viewCount6 = this.A03.size();
                    if (j >= viewCount6) {
                        c4o = new com.facebook.ads.redexgen.core.C4O();
                        this.A03.add(c4o);
                    } else {
                        c4o = this.A03.get(j);
                    }
                    int totalTaskCount = i6 + 1;
                    int totalTaskIndex = c1262au.A03[totalTaskCount];
                    c4o.A04 = totalTaskIndex <= i5;
                    c4o.A02 = i5;
                    c4o.A00 = totalTaskIndex;
                    c4o.A03 = fl2;
                    int totalTaskCount2 = c1262au.A03[i6];
                    c4o.A01 = totalTaskCount2;
                    j++;
                }
            }
        }
        java.util.Collections.sort(this.A03, A04);
    }

    private void A04(long j) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.C4O c4o = this.A03.get(i);
            if (A06[7].charAt(15) != 'g') {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "gpZ2KV2";
            com.facebook.ads.redexgen.core.C4O c4o2 = c4o;
            if (c4o2.A03 == null) {
                return;
            }
            A06(c4o2, j);
            c4o2.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(com.facebook.ads.redexgen.core.C4O c4o, long j) {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A00 = A00(c4o.A03, c4o.A01, c4o.A04 ? Long.MAX_VALUE : j);
        if (anonymousClass56A00 != null && anonymousClass56A00.A09 != null && anonymousClass56A00.A0Y() && !anonymousClass56A00.A0Z()) {
            com.facebook.ads.redexgen.core.FL fl = anonymousClass56A00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(fl, j);
        }
    }

    private void A07(com.facebook.ads.redexgen.core.FL fl, long j) {
        if (fl == null) {
            return;
        }
        if (fl.A0C && fl.A01.A06() != 0) {
            fl.A1N();
        }
        com.facebook.ads.redexgen.core.C1262au c1262au = fl.A02;
        c1262au.A04(fl, true);
        if (c1262au.A00 != 0) {
            try {
                com.facebook.ads.redexgen.core.AbstractC03852q.A01(A01(0, 18, 83));
                fl.A0s.A05(fl.A04);
                for (int i = 0; i < c1262au.A00 * 2; i += 2) {
                    A00(fl, c1262au.A03[i], j);
                }
                com.facebook.ads.redexgen.core.AbstractC03852q.A00();
            } catch (java.lang.Throwable th) {
                com.facebook.ads.redexgen.core.AbstractC03852q.A00();
                throw th;
            }
        }
    }

    public static boolean A08(com.facebook.ads.redexgen.core.FL fl, int i) {
        int iA06 = fl.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(fl.A01.A0A(i2));
            int childCount = anonymousClass56A0F.A03;
            if (childCount == i && !anonymousClass56A0F.A0Z()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(com.facebook.ads.redexgen.core.FL fl) {
        this.A02.add(fl);
    }

    public final void A0A(com.facebook.ads.redexgen.core.FL fl) {
        this.A02.remove(fl);
    }

    public final void A0B(com.facebook.ads.redexgen.core.FL fl, int i, int i2) {
        if (fl.isAttachedToWindow()) {
            long j = this.A01;
            java.lang.String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j == 0) {
                this.A01 = fl.getNanoTime();
                fl.post(this);
            }
        }
        fl.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.facebook.ads.redexgen.core.AbstractC03852q.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new java.lang.RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                com.facebook.ads.redexgen.core.AbstractC03852q.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                com.facebook.ads.redexgen.core.FL fl = this.A02.get(i);
                if (fl.getWindowVisibility() == 0) {
                    jMax = java.lang.Math.max(fl.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                com.facebook.ads.redexgen.core.AbstractC03852q.A00();
            } else {
                A05(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
                this.A01 = 0L;
                com.facebook.ads.redexgen.core.AbstractC03852q.A00();
            }
        } catch (java.lang.Throwable th) {
            this.A01 = 0L;
            com.facebook.ads.redexgen.core.AbstractC03852q.A00();
            throw th;
        }
    }
}
