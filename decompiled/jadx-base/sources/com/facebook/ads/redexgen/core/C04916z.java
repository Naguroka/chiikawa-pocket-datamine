package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04916z implements com.facebook.ads.redexgen.core.IA {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final java.lang.String A0B;
    public long A00;
    public com.facebook.ads.redexgen.core.InterfaceC1424dl A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1423dk A02;
    public final com.facebook.ads.redexgen.core.C1415db A03;
    public final com.facebook.ads.redexgen.core.C1415db A04;
    public final java.util.List<android.graphics.Rect> A05;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C1414da> A06;
    public final boolean A07;
    public final boolean A08;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, 16, 27, 9, 45, 29, 31, 16, kotlin.io.encoding.Base64.padSymbol, 38, okio.Utf8.REPLACEMENT_BYTE, okio.Utf8.REPLACEMENT_BYTE, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, 11, 25, okio.Utf8.REPLACEMENT_BYTE, 8, 29, 2, 31, 25};
    }

    static {
        A03();
        A0B = com.facebook.ads.redexgen.core.C04916z.class.getSimpleName();
    }

    public C04916z(com.facebook.ads.redexgen.core.InterfaceC1423dk interfaceC1423dk) {
        this(interfaceC1423dk, false, false);
    }

    public C04916z(com.facebook.ads.redexgen.core.InterfaceC1423dk interfaceC1423dk, boolean z, boolean z2) {
        this.A06 = new java.util.HashMap();
        this.A04 = new com.facebook.ads.redexgen.core.C1415db();
        this.A03 = new com.facebook.ads.redexgen.core.C1415db();
        this.A05 = new java.util.ArrayList(1);
        this.A02 = interfaceC1423dk;
        this.A08 = z;
        this.A07 = z2;
    }

    public static android.graphics.Rect A00(com.facebook.ads.redexgen.core.C1414da c1414da) {
        if (c1414da == null || c1414da.A02.top == Integer.MIN_VALUE || c1414da.A02.left == Integer.MIN_VALUE || c1414da.A02.right == Integer.MIN_VALUE || c1414da.A02.bottom == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException(A02(0, org.objectweb.asm.Opcodes.D2L, 9));
        }
        return c1414da.A02;
    }

    private com.facebook.ads.redexgen.core.C1414da A01(com.facebook.ads.redexgen.core.Cdo cdo, android.graphics.Rect rect, android.graphics.Rect rect2) {
        com.facebook.ads.redexgen.core.C1414da c1414daA03 = this.A06.get(cdo.A00);
        if (this.A04.A06(cdo)) {
            if (c1414daA03 != null) {
                c1414daA03.A01 = com.facebook.ads.redexgen.core.EnumC1418de.A04;
            } else {
                c1414daA03 = com.facebook.ads.redexgen.core.C1414da.A03(this.A00);
                this.A06.put(cdo.A00, c1414daA03);
            }
        }
        c1414daA03.A02.set(rect2);
        c1414daA03.A03.add(new android.graphics.Rect(rect));
        return c1414daA03;
    }

    private void A04(com.facebook.ads.redexgen.core.C1415db c1415db) {
        for (com.facebook.ads.redexgen.core.Cdo cdo : c1415db.A01()) {
            com.facebook.ads.redexgen.core.C1414da c1414da = this.A06.get(cdo.A00);
            if (c1414da == null) {
                if (0 != 0) {
                    java.lang.String str = A02(150, 36, 26) + cdo.A00;
                    throw new java.lang.NullPointerException(A02(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 10, 36));
                }
            } else {
                c1414da.A01 = com.facebook.ads.redexgen.core.EnumC1418de.A03;
                c1414da.A03.clear();
                cdo.A03(this);
                if (this.A08) {
                    this.A06.remove(c1414da);
                }
            }
        }
    }

    private void A05(com.facebook.ads.redexgen.core.C1415db c1415db) {
        java.util.Iterator it = c1415db.A00().iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.Cdo) it.next()).A03(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.IA
    public final void A3r(com.facebook.ads.redexgen.core.Cdo cdo, android.graphics.Rect rect, android.graphics.Rect rect2) {
        A01(cdo, rect, rect2);
        com.facebook.ads.redexgen.core.Cdo cdo2 = cdo.A02;
        com.facebook.ads.redexgen.core.Cdo parentViewpointData = com.facebook.ads.redexgen.core.Cdo.A08;
        if (cdo2 == parentViewpointData) {
            return;
        }
        boolean zA06 = this.A03.A06(cdo2);
        com.facebook.ads.redexgen.core.C1414da parentViewProperties = this.A06.get(cdo2.A00);
        if (zA06) {
            if (parentViewProperties == null) {
                parentViewProperties = com.facebook.ads.redexgen.core.C1414da.A03(this.A00);
                parentViewProperties.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(cdo2.A00, parentViewProperties);
            } else {
                parentViewProperties.A03.clear();
                if (!this.A07 || cdo2.A04()) {
                    parentViewProperties.A01 = com.facebook.ads.redexgen.core.EnumC1418de.A04;
                }
            }
        }
        parentViewProperties.A03.add(new android.graphics.Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.core.IA
    public final void A4N(long j, java.util.List<android.graphics.Rect> list) {
        this.A00 = j;
        this.A05.clear();
        java.util.Iterator<android.graphics.Rect> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            java.lang.String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (zHasNext) {
                this.A05.add(new android.graphics.Rect(it.next()));
            } else {
                java.util.Iterator it2 = this.A04.A01().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        java.lang.String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((com.facebook.ads.redexgen.core.Cdo) it2.next()).A00);
                    } else {
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((com.facebook.ads.redexgen.core.Cdo) it2.next()).A00);
                    }
                }
                java.util.Collection<com.facebook.ads.redexgen.core.Cdo> collectionA01 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new java.lang.RuntimeException();
                }
                A0A[0] = "Au";
                for (com.facebook.ads.redexgen.core.Cdo viewpointData : collectionA01) {
                    this.A06.remove(viewpointData.A00);
                }
                java.util.Iterator<com.facebook.ads.redexgen.core.C1414da> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    it3.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.IA
    public final void A5v() {
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            new com.facebook.ads.redexgen.core.C1413dZ(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
            throw new java.lang.NullPointerException(A02(org.objectweb.asm.Opcodes.D2L, 7, 55));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417dd
    public final void A7W(com.facebook.ads.redexgen.core.Cdo cdo, android.graphics.Rect rect) {
        rect.setEmpty();
        java.util.Iterator it = this.A06.get(cdo.A00).A03.iterator();
        while (it.hasNext()) {
            rect.union((android.graphics.Rect) it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417dd
    public final com.facebook.ads.redexgen.core.EnumC1418de A8h(com.facebook.ads.redexgen.core.Cdo cdo) {
        return this.A06.get(cdo.A00).A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417dd
    public final void A8j(android.graphics.Rect rect) {
        rect.setEmpty();
        java.util.Iterator<android.graphics.Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417dd
    public final float A8k(com.facebook.ads.redexgen.core.Cdo cdo) {
        com.facebook.ads.redexgen.core.C1414da c1414da = this.A06.get(cdo.A00);
        if (c1414da != null) {
            android.graphics.Rect rectA00 = A00(c1414da);
            int iHeight = rectA00.height() * rectA00.width();
            int totalVisibleArea = 0;
            for (android.graphics.Rect rect : c1414da.A03) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / iHeight;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.core.IA
    public final void AGh(com.facebook.ads.redexgen.core.InterfaceC1424dl interfaceC1424dl) {
        this.A01 = interfaceC1424dl;
    }
}
