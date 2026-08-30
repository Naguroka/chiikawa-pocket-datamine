package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z7 implements com.facebook.ads.redexgen.core.A5, com.facebook.ads.redexgen.core.InterfaceC0641De, com.facebook.ads.redexgen.core.InterfaceC0576Ao, com.facebook.ads.redexgen.core.Ii, com.facebook.ads.redexgen.core.F9, com.facebook.ads.redexgen.core.InterfaceC0718Gt {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"JhZxgqSPqJZtY", "FLENzqLihQAA2w3tgpVm0", "7ZBv6Xf8m8TMmXRPS", "I4crTxI1giVI7xqmGDODF89LWdqI", "ohE9u8k0zNF07TfyNCZmbDm4sMg961ad", "nKZNDf3J9No1PG0TylmkWCGmRp7BU7FY", "TNTBuTAPIFUG7kmeXsoB", "NmWqFCZR2g5OT4VxewX508"};
    public com.facebook.ads.redexgen.core.AA A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0733Hi A03;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.AR> A04 = new java.util.concurrent.CopyOnWriteArraySet<>();
    public final com.facebook.ads.redexgen.core.AO A02 = new com.facebook.ads.redexgen.core.AO();
    public final com.facebook.ads.redexgen.core.AL A01 = new com.facebook.ads.redexgen.core.AL();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final com.facebook.ads.redexgen.core.AQ A04(int i, com.facebook.ads.redexgen.core.Et et) {
        long jA00;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A00);
        long jA5p = this.A03.A5p();
        com.facebook.ads.redexgen.core.AM amA73 = this.A00.A73();
        if (i != this.A00.A74()) {
            jA00 = (i >= amA73.A01() || (et != null && et.A01())) ? 0L : amA73.A0B(i, this.A01).A00();
        } else if (et == null || !et.A01()) {
            jA00 = this.A00.A6w();
        } else {
            jA00 = (this.A00.A6y() == et.A00 && this.A00.A6z() == et.A01) ? this.A00.A71() : 0L;
        }
        return new com.facebook.ads.redexgen.core.AQ(jA5p, amA73, i, et, jA00, this.A00.A71(), this.A00.A6a() - this.A00.A6w());
    }

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-56, -57, -102, -50, -67, -62, -56, -84, -66, -52, -52, -62, -56, -57, -94, -67, -106, -107, 104, -100, -117, -112, -106, 124, -107, -117, -116, -103, -103, -100, -107, -105, -106, 108, -115, -117, -105, -116, -115, -102, 108, -111, -101, -119, -118, -108, -115, -116, -90, -91, 123, -100, -102, -90, -101, -100, -87, 124, -91, -104, -103, -93, -100, -101, -105, -106, 108, -115, -117, -105, -116, -115, -102, 113, -106, -111, -100, -111, -119, -108, -111, -94, -115, -116, -91, -92, 122, -101, -103, -91, -102, -101, -88, 127, -92, -90, -85, -86, 124, -91, -88, -93, -105, -86, 121, -98, -105, -92, -99, -101, -102, -117, -118, 96, -117, -109, -118, -113, -112, -114, -127, 125, -119, 98, -117, -114, -119, 125, -112, 95, -124, 125, -118, -125, -127, -128, -66, -67, -109, -63, -66, -65, -65, -76, -77, -91, -72, -77, -76, -66, -107, -63, -80, -68, -76, -62, -111, -112, 110, -111, -125, -122, 103, -108, -108, -111, -108, -101, -102, 120, -101, -115, -112, -107, -102, -109, 111, -108, -115, -102, -109, -111, -112, -95, -96, 127, -105, -106, -101, -109, -126, -105, -92, -101, -95, -106, 117, -92, -105, -109, -90, -105, -106, -115, -116, 107, -125, -126, -121, 127, 110, -125, -112, -121, -115, -126, 112, -125, -118, -125, 127, -111, -125, -126, -60, -61, -94, -70, -55, -74, -71, -74, -55, -74, -77, -78, -108, -80, -91, -67, -90, -91, -89, -81, -108, -91, -74, -91, -79, -87, -72, -87, -74, -73, -121, -84, -91, -78, -85, -87, -88, -70, -71, -101, -73, -84, -60, -80, -67, -112, -67, -67, -70, -67, -56, -57, -87, -59, -70, -46, -66, -53, -84, -51, -70, -51, -66, -100, -63, -70, -57, -64, -66, -67, -41, -42, -72, -41, -37, -47, -36, -47, -41, -42, -84, -47, -37, -53, -41, -42, -36, -47, -42, -35, -47, -36, -31, -34, -35, -63, -44, -48, -45, -40, -35, -42, -62, -29, -48, -31, -29, -44, -45, -52, -53, -81, -62, -53, -63, -62, -49, -62, -63, -93, -58, -49, -48, -47, -93, -49, -66, -54, -62, -69, -70, -97, -79, -79, -73, -100, -66, -69, -81, -79, -65, -65, -79, -80, -55, -56, -83, -65, -65, -59, -83, -50, -69, -52, -50, -65, -66, -62, -63, -89, -68, -64, -72, -65, -68, -63, -72, -106, -69, -76, -63, -70, -72, -73, -110, -111, 119, -107, -124, -122, -114, -106, 102, -117, -124, -111, -118, -120, -121, -114, -115, 117, -120, -125, -124, -114, 114, -120, -103, -124, 98, -121, -128, -115, -122, -124, -125};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABJ(int i, long j, long j2) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(16, 15, 37));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0718Gt
    public final void ABM(int i, long j, long j2) {
        A01();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static {
        A07();
    }

    public Z7(com.facebook.ads.redexgen.core.AA aa, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        this.A00 = aa;
        this.A03 = (com.facebook.ads.redexgen.core.InterfaceC0733Hi) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0733Hi);
    }

    private com.facebook.ads.redexgen.core.AQ A00() {
        return A05(this.A02.A03());
    }

    private com.facebook.ads.redexgen.core.AQ A01() {
        return A05(this.A02.A04());
    }

    private com.facebook.ads.redexgen.core.AQ A02() {
        return A05(this.A02.A05());
    }

    private com.facebook.ads.redexgen.core.AQ A03() {
        return A05(this.A02.A06());
    }

    private com.facebook.ads.redexgen.core.AQ A05(com.facebook.ads.redexgen.core.AP ap) {
        if (ap == null) {
            int iA74 = ((com.facebook.ads.redexgen.core.AA) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A00)).A74();
            return A04(iA74, this.A02.A07(iA74));
        }
        return A04(ap.A00, ap.A01);
    }

    public final void A08() {
        if (!this.A02.A0F()) {
            A02();
            this.A02.A09();
            java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new java.lang.NullPointerException(A06(368, 13, 88));
            }
        }
    }

    public final void A09() {
        java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.analytics.AnalyticsCollector.WindowAndMediaPeriodId> activeMediaPeriods = new java.util.ArrayList<>(this.A02.A05);
        java.util.Iterator<com.facebook.ads.internal.exoplayer2.thirdparty.analytics.AnalyticsCollector.WindowAndMediaPeriodId> it = activeMediaPeriods.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.AP ap = (com.facebook.ads.redexgen.core.AP) it.next();
            ACi(ap.A00, ap.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABE(java.lang.String str, long j, long j2) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(64, 20, 38));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABF(com.facebook.ads.redexgen.core.BH bh) {
        A00();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(31, 17, 38));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABG(com.facebook.ads.redexgen.core.BH bh) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(48, 16, 53));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABH(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(84, 27, 52));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0576Ao
    public final void ABI(int i) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(0, 16, 87));
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ABn(int i, com.facebook.ads.redexgen.core.Et et, com.facebook.ads.redexgen.core.F8 f8) {
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(111, 25, 26));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ABo(int i, long j) {
        A00();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(136, 20, 77));
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ACP(int i, com.facebook.ads.redexgen.core.Et et, com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A06[3].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            A06[0] = "2uRrQtj8OVF6XfLs";
            if (!zHasNext) {
                return;
            } else {
                it.next();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ACR(int i, com.facebook.ads.redexgen.core.Et et, com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ACU(int i, com.facebook.ads.redexgen.core.Et et, com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8, java.io.IOException iOException, boolean z) {
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(156, 11, 32));
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ACW(int i, com.facebook.ads.redexgen.core.Et et, com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void ACY(boolean z) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(org.objectweb.asm.Opcodes.GOTO, 16, 42));
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ACh(int i, com.facebook.ads.redexgen.core.Et et) {
        this.A02.A0B(i, et);
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(org.objectweb.asm.Opcodes.INVOKESPECIAL, 20, 48));
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ACi(int i, com.facebook.ads.redexgen.core.Et et) {
        this.A02.A0C(i, et);
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(com.ironsource.g3.c.b.d, 21, 28));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0641De
    public final void ACl(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(224, 10, 83));
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void AD4(com.facebook.ads.redexgen.core.A2 a2) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(234, 27, 66));
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void AD6(com.facebook.ads.redexgen.core.C05449h c05449h) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(261, 13, 73));
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void AD8(boolean z, int i) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(274, 20, 87));
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void ADA(int i) {
        this.A02.A0A(i);
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(294, 23, 102));
        }
    }

    @Override // com.facebook.ads.redexgen.core.F9
    public final void ADI(int i, com.facebook.ads.redexgen.core.Et et) {
        this.A02.A0D(i, et);
        A04(i, et);
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_EASING, 16, 109));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADM(android.view.Surface surface) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(333, 20, 91));
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void ADX() {
        if (this.A02.A0F()) {
            this.A02.A08();
            if (A06[3].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A06;
            strArr[5] = "UDZDYjXxjNHYq9JD6S2eSatmZcvsscy1";
            strArr[4] = "qhkLJVHcnNHUeJmYZMCLkSzlztH9ZvMr";
            A02();
            java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new java.lang.NullPointerException(A06(353, 15, 74));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void ADm(com.facebook.ads.redexgen.core.AM am, java.lang.Object obj, int i) {
        this.A02.A0E(am);
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(381, 17, 81));
        }
    }

    @Override // com.facebook.ads.redexgen.core.A5
    public final void ADp(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.C0711Gm c0711Gm) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        boolean zHasNext = it.hasNext();
        java.lang.String[] strArr = A06;
        if (strArr[7].length() == strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[5] = "qLIqUi61sNDZYWoF8geBhsMEHylVdISs";
        strArr2[4] = "9HduxlPi9N40LYnK0KSe4bGhPs2KM8kN";
        if (zHasNext) {
            it.next();
            throw new java.lang.NullPointerException(A06(398, 15, 33));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADx(java.lang.String str, long j, long j2) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(64, 20, 38));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADy(com.facebook.ads.redexgen.core.BH bh) {
        A00();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(31, 17, 38));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void ADz(com.facebook.ads.redexgen.core.BH bh) {
        A02();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A06(48, 16, 53));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void AE3(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        boolean zHasNext = it.hasNext();
        if (A06[0].length() == 27) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[7] = "p7wHWjPhsPNxUw5g8aIZ5g";
        strArr[6] = "BH3xE3sWNlCwun7pc0Kn";
        if (zHasNext) {
            it.next();
            throw new java.lang.NullPointerException(A06(84, 27, 52));
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ii
    public final void AE8(int i, int i2, int i3, float f) {
        A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.AR> it = this.A04.iterator();
        boolean zHasNext = it.hasNext();
        java.lang.String[] strArr = A06;
        if (strArr[5].charAt(9) != strArr[4].charAt(9)) {
            throw new java.lang.RuntimeException();
        }
        A06[2] = "jBVMu8t1YfgjmQVV4";
        if (zHasNext) {
            it.next();
            throw new java.lang.NullPointerException(A06(com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_INFO_CODE, 18, 29));
        }
    }
}
