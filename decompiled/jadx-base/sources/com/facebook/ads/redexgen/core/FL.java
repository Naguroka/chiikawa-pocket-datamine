package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FL extends android.view.ViewGroup implements com.facebook.ads.redexgen.core.C3A {
    public static byte[] A18;
    public static java.lang.String[] A19 = {"EVtiEz0XwzmAcv0NfW8PxL5EkbzIoYic", "JvoTrXnfxJUplw5tP56Ros2T7Gsfofpu", "CB3RTx10Tt9OnvYftpvuMygLYd0xmG3f", "iCoGDb0mnoj0sn99iJ8fx9KF0Zt33I3a", "ipdvxhFfLLm3eGkYLsOkZJNxKW1ljoxp", "EVaiAhpvjrLt8PNqQrclR8roKXj174Mb", "AK1oSCSoqExnNm9Bojb7ErrkRophOnjO", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED};
    public static final android.view.animation.Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final java.lang.Class<?>[] A1J;
    public com.facebook.ads.redexgen.core.C1263av A00;
    public com.facebook.ads.redexgen.core.C4C A01;
    public com.facebook.ads.redexgen.core.C1262au A02;
    public com.facebook.ads.redexgen.core.C4P A03;
    public com.facebook.ads.redexgen.core.AbstractC04224c A04;
    public com.facebook.ads.redexgen.core.AbstractC04304k A05;
    public com.facebook.ads.redexgen.core.AbstractC04344o A06;
    public com.facebook.ads.redexgen.core.InterfaceC04424x A07;
    public com.facebook.ads.redexgen.core.AnonymousClass55 A08;
    public com.facebook.ads.redexgen.core.C1249ag A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public android.view.VelocityTracker A0Y;
    public android.widget.EdgeEffect A0Z;
    public android.widget.EdgeEffect A0a;
    public android.widget.EdgeEffect A0b;
    public android.widget.EdgeEffect A0c;
    public com.facebook.ads.redexgen.core.C3B A0d;
    public com.facebook.ads.redexgen.core.InterfaceC04254f A0e;
    public com.facebook.ads.redexgen.core.InterfaceC04284i A0f;
    public com.facebook.ads.redexgen.core.AbstractC04374r A0g;
    public com.facebook.ads.redexgen.core.InterfaceC04384s A0h;
    public com.facebook.ads.redexgen.core.AbstractC04394t A0i;
    public com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState A0j;
    public java.lang.Runnable A0k;
    public java.util.List<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener> A0l;
    public java.util.List<com.facebook.ads.redexgen.core.AbstractC04394t> A0m;
    public boolean A0n;
    public boolean A0o;
    public final android.graphics.Rect A0p;
    public final android.graphics.RectF A0q;
    public final com.facebook.ads.redexgen.core.C04414w A0r;
    public final com.facebook.ads.redexgen.core.AnonymousClass53 A0s;
    public final com.facebook.ads.redexgen.core.C5E A0t;
    public final java.lang.Runnable A0u;
    public final java.util.ArrayList<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView.ItemDecoration> A0v;
    public final java.util.List<com.facebook.ads.redexgen.core.AnonymousClass56> A0w;
    public final int A0x;
    public final int A0y;
    public final android.graphics.Rect A0z;
    public final android.view.accessibility.AccessibilityManager A10;
    public final com.facebook.ads.redexgen.core.C1251aj A11;
    public final com.facebook.ads.redexgen.core.C5D A12;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC04384s> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.FL A0H(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof com.facebook.ads.redexgen.core.FL) {
            return (com.facebook.ads.redexgen.core.FL) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            com.facebook.ads.redexgen.core.FL flA0H = A0H(viewGroup.getChildAt(i));
            if (flA0H != null) {
                return flA0H;
            }
        }
        return null;
    }

    public static java.lang.String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A18, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            A19[1] = "u7dEJjISLATYPJ53p8QeJMuNBCdH6OYt";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 27);
            i4++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0N() {
        this.A0s.A04(4);
        A1J();
        A1K();
        this.A0s.A04 = 1;
        if (this.A0s.A0C) {
            for (int iA05 = this.A01.A05() - 1; iA05 >= 0; iA05--) {
                com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A09(iA05));
                if (!anonymousClass56A0F.A0f()) {
                    long jA0C = A0C(anonymousClass56A0F);
                    com.facebook.ads.redexgen.core.C04294j c04294jA08 = this.A05.A08(this.A0s, anonymousClass56A0F);
                    com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A05 = this.A0t.A05(jA0C);
                    if (anonymousClass56A05 == null || anonymousClass56A05.A0f()) {
                        this.A0t.A0E(anonymousClass56A0F, c04294jA08);
                    } else {
                        boolean zA0H = this.A0t.A0H(anonymousClass56A05);
                        boolean zA0H2 = this.A0t.A0H(anonymousClass56A0F);
                        if (zA0H && anonymousClass56A05 == anonymousClass56A0F) {
                            this.A0t.A0E(anonymousClass56A0F, c04294jA08);
                        } else {
                            com.facebook.ads.redexgen.core.C04294j c04294jA04 = this.A0t.A04(anonymousClass56A05);
                            this.A0t.A0E(anonymousClass56A0F, c04294jA08);
                            com.facebook.ads.redexgen.core.C04294j c04294jA03 = this.A0t.A03(anonymousClass56A0F);
                            if (c04294jA04 == null) {
                                A0m(jA0C, anonymousClass56A0F, anonymousClass56A05);
                            } else {
                                A0t(anonymousClass56A05, anonymousClass56A0F, c04294jA04, c04294jA03, zA0H, zA0H2);
                            }
                        }
                    }
                }
            }
            this.A0t.A0G(this.A12);
        }
        this.A06.A1G(this.A0r);
        this.A0s.A05 = this.A0s.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            this.A0r.A02.clear();
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1v(this.A0s);
        A1L();
        A1n(false);
        this.A0t.A06();
        if (A11(this.A14[0], this.A14[1])) {
            A1b(0, 0);
        }
        A0Q();
        A0S();
    }

    public static void A0W() {
        A18 = new byte[]{82, 68, 46, 68, 122, -115, -119, -101, 68, 108, -109, -112, -120, -119, -106, 68, 86, 94, -80, -13, -15, -2, -2, -1, 4, -80, -14, -11, -80, -10, -1, 5, -2, -12, -80, -14, 5, 4, -80, -7, 4, -80, -7, 3, -80, -2, -11, -13, -11, 3, 3, -15, 2, 9, -80, -10, -1, 2, -80, -73, 0, 10, -73, -8, 3, 9, -4, -8, -5, 16, -73, -8, 11, 11, -8, -6, -1, -4, -5, -73, 11, 6, -73, -8, -73, -23, -4, -6, 16, -6, 3, -4, 9, -19, 0, -4, 14, -47, 97, -86, -76, 97, -81, -80, -75, 97, -94, 97, -91, -86, -77, -90, -92, -75, 97, -92, -87, -86, -83, -91, 97, -80, -89, 97, -95, -17, -16, -11, -95, -25, -16, -10, -17, -27, -81, -95, -59, -22, -27, -95, -30, -17, -6, -95, -50, -16, -11, -22, -16, -17, -58, -9, -26, -17, -11, -12, -95, -24, -26, -11, -95, -12, -20, -22, -15, -15, -26, -27, -64, -98, -110, -45, -42, -45, -30, -26, -41, -28, -84, -66, -78, -11, 1, 0, 6, -9, 10, 6, -52, -99, -111, -35, -46, -22, -32, -26, -27, -85, -82, -109, -24, -26, -36, -31, -38, -109, -41, -40, -39, -44, -24, -33, -25, -109, -23, -44, -33, -24, -40, -78, -48, -37, -37, -44, -45, -113, -31, -44, -36, -34, -27, -44, -77, -44, -29, -48, -46, -41, -44, -45, -59, -40, -44, -26, -113, -26, -40, -29, -41, -113, -48, -113, -27, -40, -44, -26, -113, -26, -41, -40, -46, -41, -113, -40, -30, -113, -35, -34, -29, -113, -43, -37, -48, -42, -42, -44, -45, -113, -48, -30, -113, -29, -36, -33, -113, -45, -44, -29, -48, -46, -41, -44, -45, -99, -69, -39, -26, -26, -25, -20, -104, -37, -39, -28, -28, -104, -20, -32, -31, -21, -104, -27, -35, -20, -32, -25, -36, -104, -31, -26, -104, -39, -104, -21, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -90, -104, -53, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -21, -104, -27, -31, -33, -32, -20, -38, -35, -104, -22, -19, -26, -104, -36, -19, -22, -31, -26, -33, -104, -39, -104, -27, -35, -39, -21, -19, -22, -35, -104, -98, -104, -28, -39, -15, -25, -19, -20, -104, -24, -39, -21, -21, -104, -17, -32, -35, -22, -35, -104, -15, -25, -19, -104, -37, -39, -26, -26, -25, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -36, -39, -20, -39, -90, -104, -71, -26, -15, -104, -27, -35, -20, -32, -25, -36, -104, -37, -39, -28, -28, -104, -20, -32, -39, -20, -104, -27, -31, -33, -32, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -104, -21, -20, -22, -19, -37, -20, -19, -22, -35, -25, -34, -104, -20, -32, -35, -104, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -22, -104, -20, -32, -35, -104, -39, -36, -39, -24, -20, -35, -22, -104, -37, -25, -26, -20, -35, -26, -20, -21, -104, -21, -32, -25, -19, -28, -36, -104, -38, -35, -104, -24, -25, -21, -20, -24, -25, -26, -35, -36, -104, -20, -25, -20, -32, -35, -104, -26, -35, -16, -20, -104, -34, -22, -39, -27, -35, -90, -59, -29, -16, -16, -15, -10, -94, -27, -29, -18, -18, -94, -10, -22, -21, -11, -94, -17, -25, -10, -22, -15, -26, -94, -7, -22, -21, -18, -25, -94, -44, -25, -27, -5, -27, -18, -25, -12, -40, -21, -25, -7, -94, -21, -11, -94, -27, -15, -17, -14, -9, -10, -21, -16, -23, -94, -29, -94, -18, -29, -5, -15, -9, -10, -94, -15, -12, -94, -11, -27, -12, -15, -18, -18, -21, -16, -23, -52, -22, -9, -9, -8, -3, -87, -17, -11, -14, -9, -16, -87, 0, -14, -3, -15, -8, -2, -3, -87, -22, -87, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, -4, -18, -3, -73, -87, -52, -22, -11, -11, -87, -4, -18, -3, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, 0, -14, -3, -15, -87, -22, -87, -9, -8, -9, -74, -9, -2, -11, -11, -87, -22, -5, -16, -2, -10, -18, -9, -3, -73, 106, -120, -107, -107, -106, -101, 71, -102, -118, -103, -106, -109, -109, 71, -101, -106, 71, -105, -106, -102, -112, -101, -112, -106, -107, 71, -120, 71, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -102, -116, -101, 85, 71, 106, -120, -109, -109, 71, -102, -116, -101, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -98, -112, -101, -113, 71, -120, 71, -107, -106, -107, 84, -107, -100, -109, -109, 71, -120, -103, -114, -100, -108, -116, -107, -101, 85, -114, -84, -71, -71, -70, -65, 107, -66, -82, -67, -70, -73, -73, 107, -62, -76, -65, -77, -70, -64, -65, 107, -84, 107, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -66, -80, -65, 121, 107, -114, -84, -73, -73, 107, -66, -80, -65, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -62, -76, -65, -77, 107, -84, 107, -71, -70, -71, 120, -71, -64, -73, -73, 107, -84, -67, -78, -64, -72, -80, -71, -65, 121, -43, -13, 0, 0, 1, 6, -78, 5, -1, 1, 1, 6, -6, -78, 5, -11, 4, 1, -2, -2, -78, 9, -5, 6, -6, 1, 7, 6, -78, -13, -78, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 5, -9, 6, -64, -78, -43, -13, -2, -2, -78, 5, -9, 6, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 9, -5, 6, -6, 
        -78, -13, -78, 0, 1, 0, -65, 0, 7, -2, -2, -78, -13, 4, -7, 7, -1, -9, 0, 6, -64, 96, -117, 60, -118, -117, -112, 60, -113, -127, -112, 104, 125, -107, -117, -111, -112, 98, -114, -117, -106, -127, -118, 60, -123, -118, 60, -120, 125, -107, -117, -111, -112, 60, -117, -114, 60, -113, 127, -114, -117, -120, -120, -94, -49, -49, -52, -49, 125, -51, -49, -52, -64, -62, -48, -48, -58, -53, -60, 125, -48, -64, -49, -52, -55, -55, -104, 125, -51, -52, -58, -53, -47, -62, -49, 125, -58, -53, -63, -62, -43, 125, -61, -52, -49, 125, -58, -63, 125, -111, -90, -66, -76, -70, -71, -110, -90, -77, -90, -84, -86, -73, 101, 119, -104, 73, -118, -115, -118, -103, -99, -114, -101, 73, -118, -99, -99, -118, -116, -111, -114, -115, 100, 73, -100, -108, -110, -103, -103, -110, -105, -112, 73, -107, -118, -94, -104, -98, -99, 110, -113, 64, -116, -127, -103, -113, -107, -108, 64, -115, -127, -114, -127, -121, -123, -110, 64, -127, -108, -108, -127, -125, -120, -123, -124, 91, 64, -109, -117, -119, -112, -112, -119, -114, -121, 64, -116, -127, -103, -113, -107, -108, -98, -64, -67, -80, -70, -77, -69, 110, -59, -74, -73, -70, -77, 110, -69, -81, -62, -79, -74, -73, -68, -75, 110, -79, -74, -81, -68, -75, -77, -78, 110, -60, -73, -77, -59, 110, -74, -67, -70, -78, -77, -64, -63, 110, -59, -73, -62, -74, 110, -62, -74, -77, 110, -68, -77, -59, -67, -68, -77, -63, 124, 110, -94, -74, -77, 110, -66, -64, -77, 123, -70, -81, -57, -67, -61, -62, 110, -73, -68, -76, -67, -64, -69, -81, -62, -73, -67, -68, 110, -76, -67, -64, 110, -62, -74, -77, 110, -79, -74, -81, -68, -75, -77, 110, -74, -67, -70, -78, -77, -64, 110, -84, -80, 122, -96, -49, -58, -58, -93, -56, -48, -69, -58, -61, -66, -69, -50, -65, -113, -109, 93, -116, -85, -119, -98, -74, -84, -78, -79, -103, -99, 103, -105, -88, -71, -69, -80, -88, -77, -112, -75, -67, -88, -77, -80, -85, -88, -69, -84, -96, -92, 110, -95, -79, -64, -67, -70, -70, -108, -89, -91, -69, -91, -82, -89, -76, -104, -85, -89, -71, -90, -71, -73, -51, -73, -64, -71, -58, -86, -67, -71, -53, 116, -72, -61, -71, -57, 116, -62, -61, -56, 116, -57, -55, -60, -60, -61, -58, -56, 116, -57, -73, -58, -61, -64, -64, -67, -62, -69, 116, -56, -61, 116, -75, -62, 116, -75, -74, -57, -61, -64, -55, -56, -71, 116, -60, -61, -57, -67, -56, -67, -61, -62, -126, 116, -87, -57, -71, 116, -57, -73, -58, -61, -64, -64, -88, -61, -92, -61, -57, -67, -56, -67, -61, -62, 116, -67, -62, -57, -56, -71, -75, -72, -88, -69, -71, -49, -71, -62, -69, -56, -84, -65, -69, -51, 118, -66, -73, -55, 118, -60, -59, 118, -94, -73, -49, -59, -53, -54, -93, -73, -60, -73, -67, -69, -56, -102, -67, -75, 102, -86, -81, -84, -84, -85, -72, -85, -76, -70, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, -71, 102, -82, -89, -68, -85, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -87, -82, -89, -76, -83, -85, 102, -113, -118, 116, 102, -102, -82, -81, -71, 102, -77, -81, -83, -82, -70, 102, -82, -89, -74, -74, -85, -76, 102, -86, -69, -85, 102, -70, -75, 102, -81, -76, -87, -75, -76, -71, -81, -71, -70, -85, -76, -70, 102, -121, -86, -89, -74, -70, -85, -72, 102, -69, -74, -86, -89, -70, -85, 102, -85, -68, -85, -76, -70, -71, 102, -75, -72, 102, -81, -84, 102, -70, -82, -85, 102, -110, -89, -65, -75, -69, -70, -109, -89, -76, -89, -83, -85, -72, 102, -78, -89, -65, -71, 102, -75, -69, -70, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -100, -81, -85, -67, 102, -77, -69, -78, -70, -81, -74, -78, -85, 102, -70, -81, -77, -85, -71, 116, 80, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, 102, 119, -128, 126, -95, -103, 74, -114, -109, -112, -112, -113, -100, -113, -104, -98, 74, -128, -109, -113, -95, 114, -103, -106, -114, -113, -100, -99, 74, -110, -117, -96, -113, 74, -98, -110, -113, 74, -99, -117, -105, -113, 74, -99, -98, -117, -116, -106, -113, 74, 115, 110, 88, 74, 125, -98, -117, -116, -106, -113, 74, 115, 110, -99, 74, -109, -104, 74, -93, -103, -97, -100, 74, -117, -114, -117, -102, -98, -113, -100, 74, 119, 127, 125, 126, 74, 108, 111, 74, -97, -104, -109, -101, -97, -113, 74, -117, -104, -114, 74, 125, 114, 121, 127, 118, 110, 74, 120, 121, 126, 74, -115, -110, -117, -104, -111, -113, 88, 52, 74, -128, -109, -113, -95, 114, -103, -106, -114, -113, -100, 74, 91, 100, -102, -83, -87, -69, 100, -111, -109, -109, -107, -93, -93, -103, -110, -103, -100, -103, -92, -87, -44, -39, -30, -43, -45, -28, -39, -33, -34, -112, -35, -27, -29, -28, -112, -46, -43, -112, -47, -46, -29, -33, -36, -27, -28, -43, -98, -112, -30, -43, -45, -43, -39, -26, -43, -44, -86, -14, -16, -1, -44, -1, -16, -8, -38, -15, -15, -2, -16, -1, -2, -51, -52, -95, -58, -57, -54, -62, -76, -57, -61, -43, -97, -46, -46, -65, -63, -58, -61, -62, -78, -51, -75, -57, -52, -62, -51, -43, -78, -79, -122, -85, -84, -81, -89, -103, -84, -88, -70, -121, -88, -73, -92, -90, -85, -88, -89, -119, -75, -78, -80, -102, -84, -79, -89, -78, -70, -102, -103, 114, -112, -97, 110, -109, -108, -105, -113, 111, -99, -116, -94, -108, -103, -110, 122, -99, -113, -112, -99, -72, -73, -110, -73, -67, -82, -69, -84, -82, -71, -67, -99, -72, -66, -84, -79, -114, -65, -82, -73, -67, -16, -30, -15, -48, -32, -17, 
        -20, -23, -23, -26, -21, -28, -47, -20, -14, -32, -27, -48, -23, -20, -19, -91, -90, -73, -99, -33, -34, -31, -99, -34, -17, -28, -14, -22, -30, -21, -15, -99, -32, -20, -21, -16, -15, -34, -21, -15, -99};
    }

    static {
        A0W();
        A1I = new int[]{android.R.attr.nestedScrollingEnabled};
        A1H = new int[]{android.R.attr.clipToPadding};
        A1C = android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20;
        A1B = android.os.Build.VERSION.SDK_INT >= 23;
        A1D = android.os.Build.VERSION.SDK_INT >= 16;
        A1E = android.os.Build.VERSION.SDK_INT >= 21;
        A1F = android.os.Build.VERSION.SDK_INT <= 15;
        A1G = android.os.Build.VERSION.SDK_INT <= 15;
        java.lang.Class<?> cls = java.lang.Integer.TYPE;
        A1J = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        A1A = new android.view.animation.Interpolator() { // from class: com.facebook.ads.redexgen.X.4b
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public FL(android.content.Context context) {
        this(context, null);
    }

    public FL(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FL(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A11 = new com.facebook.ads.redexgen.core.C1251aj(this);
        this.A0r = new com.facebook.ads.redexgen.core.C04414w(this);
        this.A0t = new com.facebook.ads.redexgen.core.C5E();
        this.A0u = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4Z
            public static java.lang.String[] A01 = {"awShR6rB9hHqIMmEUL0mwXA0Gw52kO", "0DSPYtvGuEhIQI6AF9KMD", "9DdmIjaq0QhBq1nPNAcV72ZM8h0mgj2M", "HfTiJ4VVSMi3nAZk7bTv9mblSiAuey3", "debYtkaMAwIZQZjx6lxSS", "4WrPcoFjyZ6X9UuQXP", "Cz1Bv0fV", "irRdqOAQiRC5NgL3TGbl1LssmB7DQYK"};

            @Override // java.lang.Runnable
            public final void run() {
                if (this.A00.A0D) {
                    com.facebook.ads.redexgen.core.FL fl = this.A00;
                    java.lang.String[] strArr = A01;
                    if (strArr[7].length() != strArr[3].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[2] = "whIRPRaeSzbq6WxYyrgvwj4itopbsVJt";
                    if (fl.isLayoutRequested()) {
                        return;
                    }
                    if (!this.A00.A0F) {
                        this.A00.requestLayout();
                    } else if (this.A00.A0I) {
                        this.A00.A0J = true;
                    } else {
                        this.A00.A1I();
                    }
                }
            }
        };
        this.A0p = new android.graphics.Rect();
        this.A0z = new android.graphics.Rect();
        this.A0q = new android.graphics.RectF();
        this.A0v = new java.util.ArrayList<>();
        this.A13 = new java.util.ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new com.facebook.ads.redexgen.core.FT();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new com.facebook.ads.redexgen.core.AnonymousClass55(this);
        this.A02 = A1E ? new com.facebook.ads.redexgen.core.C1262au() : null;
        this.A0s = new com.facebook.ads.redexgen.core.AnonymousClass53();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new com.facebook.ads.redexgen.core.C1254am(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new java.util.ArrayList();
        this.A0k = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4a
            @Override // java.lang.Runnable
            public final void run() {
                if (this.A00.A05 != null) {
                    this.A00.A05.A0J();
                }
                this.A00.A0K = false;
            }
        };
        this.A12 = new com.facebook.ads.redexgen.core.C1257ap(this);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
            this.A0B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = com.facebook.ads.redexgen.core.C3U.A00(viewConfiguration, context);
        this.A0M = com.facebook.ads.redexgen.core.C3U.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0B(this.A0f);
        A0e();
        A0O();
        if (com.facebook.ads.redexgen.core.C3T.A00(this) == 0) {
            com.facebook.ads.redexgen.core.C3T.A09(this, 1);
        }
        this.A10 = (android.view.accessibility.AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 21));
        setAccessibilityDelegateCompat(new com.facebook.ads.redexgen.core.C1249ag(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(android.view.View view) {
        int id = view.getId();
        while (true) {
            boolean zIsFocused = view.isFocused();
            java.lang.String[] strArr = A19;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[6];
            int iCharAt = str.charAt(14);
            int lastKnownId = str2.charAt(14);
            if (iCharAt == lastKnownId) {
                throw new java.lang.RuntimeException();
            }
            A19[1] = "skNAKCm7G9cheB5S1YDp1BKl7DhhyUWu";
            if (!zIsFocused && (view instanceof android.view.ViewGroup) && view.hasFocus()) {
                view = ((android.view.ViewGroup) view).getFocusedChild();
                int id2 = view.getId();
                if (id2 != -1) {
                    id = view.getId();
                }
            } else {
                return id;
            }
        }
    }

    private final long A0C(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return this.A04.A0A() ? anonymousClass56.A0K() : anonymousClass56.A03;
    }

    private android.view.View A0D() {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A1F;
        int i = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int iA03 = this.A0s.A03();
        if (A19[1].charAt(14) != '5') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A19;
        strArr[0] = "7qfeZgEkVtoAThUnrGXSh94SPjREp60d";
        strArr[6] = "LKFRBKGk6g3UCUNb2omEsqPfgI9kqX1N";
        for (int startFocusSearchIndex = i; startFocusSearchIndex < iA03; startFocusSearchIndex++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A1F2 = A1F(startFocusSearchIndex);
            if (anonymousClass56A1F2 == null) {
                break;
            }
            if (anonymousClass56A1F2.A0H.hasFocusable()) {
                return anonymousClass56A1F2.A0H;
            }
        }
        int startFocusSearchIndex2 = java.lang.Math.min(iA03, i);
        for (int limit = startFocusSearchIndex2 - 1; limit >= 0 && (anonymousClass56A1F = A1F(limit)) != null; limit--) {
            if (anonymousClass56A1F.A0H.hasFocusable()) {
                return anonymousClass56A1F.A0H;
            }
        }
        return null;
    }

    private final com.facebook.ads.redexgen.core.AnonymousClass56 A0E(long j) {
        if (this.A04 == null || !this.A04.A0A()) {
            return null;
        }
        int iA06 = this.A01.A06();
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56 = null;
        for (int i = 0; i < iA06; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 holder = A0F(this.A01.A0A(i));
            if (holder != null && !holder.A0a() && holder.A0K() == j) {
                if (this.A01.A0K(holder.A0H)) {
                    anonymousClass56 = holder;
                } else {
                    return holder;
                }
            }
        }
        return anonymousClass56;
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass56 A0F(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A00;
    }

    private final com.facebook.ads.redexgen.core.AnonymousClass56 A0G(android.view.View view) {
        android.view.View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1G(itemView);
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i = this.A0P;
        this.A0P = 0;
        if (i != 0 && A1o()) {
            android.view.accessibility.AccessibilityEvent event = android.view.accessibility.AccessibilityEvent.obtain();
            event.setEventType(2048);
            com.facebook.ads.redexgen.core.AbstractC04073m.A01(event, i);
            sendAccessibilityEventUnchecked(event);
        }
    }

    private void A0L() {
        this.A0s.A04(1);
        A1h(this.A0s);
        this.A0s.A0A = false;
        A1J();
        this.A0t.A06();
        A1K();
        A0P();
        A0U();
        this.A0s.A0E = this.A0s.A0C && this.A0H;
        this.A0H = false;
        this.A0G = false;
        this.A0s.A09 = this.A0s.A0B;
        this.A0s.A03 = this.A04.A0E();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int iA05 = this.A01.A05();
            for (int i = 0; i < iA05; i++) {
                com.facebook.ads.redexgen.core.AnonymousClass56 holder = A0F(this.A01.A09(i));
                if (!holder.A0f() && (!holder.A0Z() || this.A04.A0A())) {
                    com.facebook.ads.redexgen.core.AbstractC04304k abstractC04304k = this.A05;
                    com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53 = this.A0s;
                    int i2 = com.facebook.ads.redexgen.core.AbstractC04304k.A00(holder);
                    this.A0t.A0F(holder, abstractC04304k.A09(anonymousClass53, holder, i2, holder.A0L()));
                    if (this.A0s.A0E && holder.A0d() && !holder.A0a() && !holder.A0f() && !holder.A0Z()) {
                        this.A0t.A08(A0C(holder), holder);
                    }
                }
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1u(this.A0r, this.A0s);
            this.A0s.A0D = z;
            for (int i3 = 0; i3 < this.A01.A05(); i3++) {
                com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A09(i3));
                boolean didStructureChange = anonymousClass56A0F.A0f();
                if (!didStructureChange) {
                    boolean didStructureChange2 = this.A0t.A0I(anonymousClass56A0F);
                    if (!didStructureChange2) {
                        int iA00 = com.facebook.ads.redexgen.core.AbstractC04304k.A00(anonymousClass56A0F);
                        boolean zA0i = anonymousClass56A0F.A0i(8192);
                        if (!zA0i) {
                            iA00 |= 4096;
                        }
                        com.facebook.ads.redexgen.core.C04294j c04294jA09 = this.A05.A09(this.A0s, anonymousClass56A0F, iA00, anonymousClass56A0F.A0L());
                        if (zA0i) {
                            A1i(anonymousClass56A0F, c04294jA09);
                        } else {
                            this.A0t.A0D(anonymousClass56A0F, c04294jA09);
                        }
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1L();
        A1n(false);
        this.A0s.A04 = 2;
    }

    private void A0M() {
        A1J();
        A1K();
        this.A0s.A04(6);
        this.A00.A07();
        this.A0s.A03 = this.A04.A0E();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1u(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        this.A0s.A0C = this.A0s.A0C && this.A05 != null;
        this.A0s.A04 = 4;
        A1L();
        A1n(false);
    }

    private void A0O() {
        this.A01 = new com.facebook.ads.redexgen.core.C4C(new com.facebook.ads.redexgen.core.C1256ao(this));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    private void A0P() {
        boolean animationTypeSupported;
        boolean animationTypeSupported2;
        boolean z;
        java.lang.String[] strArr;
        boolean animationTypeSupported3;
        boolean z2;
        java.lang.String[] strArr2;
        boolean animationTypeSupported4;
        if (this.A0C) {
            this.A00.A09();
            this.A06.A1M(this);
        }
        if (A0z()) {
            this.A00.A08();
        } else {
            this.A00.A07();
        }
        boolean z3 = false;
        boolean z4 = this.A0G || this.A0H;
        com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53 = this.A0s;
        boolean animationTypeSupported5 = this.A0D;
        if (!animationTypeSupported5 || this.A05 == null) {
            animationTypeSupported = false;
            anonymousClass53.A0C = animationTypeSupported;
            com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass54 = this.A0s;
            animationTypeSupported2 = this.A0s.A0C;
            if (animationTypeSupported2 && z4) {
                z = this.A0C;
                strArr = A19;
                if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                    A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                    if (!z) {
                        animationTypeSupported3 = A0z();
                        if (animationTypeSupported3) {
                            z3 = true;
                        }
                    }
                }
            }
            anonymousClass54.A0B = z3;
            if (A19[1].charAt(14) != '5') {
                A19[7] = "L";
                return;
            } else {
                A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                return;
            }
        }
        boolean animationTypeSupported6 = this.A0C;
        if (animationTypeSupported6 || z4) {
            z2 = this.A0C;
            strArr2 = A19;
            if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                java.lang.String[] strArr3 = A19;
                strArr3[4] = "vM5jRQNxomoF5LpbXWYyMOkGK7YRN5II";
                strArr3[5] = "jrspPuxDXaGO5llky5gceAJYKeOu5twS";
                if (z2) {
                    animationTypeSupported4 = this.A04.A0A();
                    if (animationTypeSupported4) {
                        animationTypeSupported = false;
                    }
                    anonymousClass53.A0C = animationTypeSupported;
                    com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass55 = this.A0s;
                    animationTypeSupported2 = this.A0s.A0C;
                    if (animationTypeSupported2) {
                        z = this.A0C;
                        strArr = A19;
                        if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                            A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                            if (!z) {
                                animationTypeSupported3 = A0z();
                                if (animationTypeSupported3) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    anonymousClass55.A0B = z3;
                    if (A19[1].charAt(14) != '5') {
                        A19[7] = "L";
                        return;
                    } else {
                        A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                        return;
                    }
                }
                animationTypeSupported = true;
                anonymousClass53.A0C = animationTypeSupported;
                com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass56 = this.A0s;
                animationTypeSupported2 = this.A0s.A0C;
                if (animationTypeSupported2) {
                    z = this.A0C;
                    strArr = A19;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                        if (!z) {
                            animationTypeSupported3 = A0z();
                            if (animationTypeSupported3) {
                                z3 = true;
                            }
                        }
                    }
                }
                anonymousClass56.A0B = z3;
                if (A19[1].charAt(14) != '5') {
                    A19[7] = "L";
                    return;
                } else {
                    A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                    return;
                }
            }
        } else {
            boolean animationTypeSupported7 = this.A06.A09;
            if (!animationTypeSupported7) {
                animationTypeSupported = false;
                anonymousClass53.A0C = animationTypeSupported;
                com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass57 = this.A0s;
                animationTypeSupported2 = this.A0s.A0C;
                if (animationTypeSupported2) {
                    z = this.A0C;
                    strArr = A19;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                        if (!z) {
                            animationTypeSupported3 = A0z();
                            if (animationTypeSupported3) {
                                z3 = true;
                            }
                        }
                    }
                }
                anonymousClass57.A0B = z3;
                if (A19[1].charAt(14) != '5') {
                    A19[7] = "L";
                    return;
                } else {
                    A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                    return;
                }
            }
            z2 = this.A0C;
            strArr2 = A19;
            if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                java.lang.String[] strArr4 = A19;
                strArr4[4] = "vM5jRQNxomoF5LpbXWYyMOkGK7YRN5II";
                strArr4[5] = "jrspPuxDXaGO5llky5gceAJYKeOu5twS";
                if (z2) {
                    animationTypeSupported4 = this.A04.A0A();
                    if (animationTypeSupported4) {
                        animationTypeSupported = false;
                    }
                    anonymousClass53.A0C = animationTypeSupported;
                    com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass58 = this.A0s;
                    animationTypeSupported2 = this.A0s.A0C;
                    if (animationTypeSupported2) {
                        z = this.A0C;
                        strArr = A19;
                        if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                            A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                            if (!z) {
                                animationTypeSupported3 = A0z();
                                if (animationTypeSupported3) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    anonymousClass58.A0B = z3;
                    if (A19[1].charAt(14) != '5') {
                        A19[7] = "L";
                        return;
                    } else {
                        A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                        return;
                    }
                }
                animationTypeSupported = true;
                anonymousClass53.A0C = animationTypeSupported;
                com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass59 = this.A0s;
                animationTypeSupported2 = this.A0s.A0C;
                if (animationTypeSupported2) {
                    z = this.A0C;
                    strArr = A19;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                        if (!z) {
                            animationTypeSupported3 = A0z();
                            if (animationTypeSupported3) {
                                z3 = true;
                            }
                        }
                    }
                }
                anonymousClass59.A0B = z3;
                if (A19[1].charAt(14) != '5') {
                    A19[7] = "L";
                    return;
                } else {
                    A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                    return;
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    private void A0Q() {
        android.view.View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            if (!isFocused()) {
                android.view.View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0E = null;
            long j = this.A0s.A08;
            java.lang.String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            A19[1] = "kf1DBtA0T6eQEv5OJ0aXYpUf8VxTHKxU";
            if (j != -1 && this.A04.A0A()) {
                anonymousClass56A0E = A0E(this.A0s.A08);
            }
            android.view.View viewA0D = null;
            if (anonymousClass56A0E == null || this.A01.A0K(anonymousClass56A0E.A0H) || !anonymousClass56A0E.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    viewA0D = A0D();
                }
            } else {
                viewA0D = anonymousClass56A0E.A0H;
            }
            if (viewA0D != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = viewA0D.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    viewA0D = viewToFocus;
                }
                viewA0D.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean zIsFinished = false;
        if (this.A0a != null) {
            this.A0a.onRelease();
            zIsFinished = this.A0a.isFinished();
        }
        if (this.A0c != null) {
            this.A0c.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            zIsFinished |= needsInvalidate;
        }
        if (this.A0b != null) {
            this.A0b.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            zIsFinished |= needsInvalidate2;
        }
        android.widget.EdgeEffect edgeEffect = this.A0Z;
        if (A19[1].charAt(14) != '5') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A19;
        strArr[4] = "DUYzAwLS0Yoz3H0mkub2uXfjKU6irrBR";
        strArr[5] = "haWSXRvp1CmnNAQfK1MdvfBgKkr4J9QQ";
        if (edgeEffect != null) {
            this.A0Z.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            zIsFinished |= needsInvalidate3;
        }
        if (zIsFinished) {
            com.facebook.ads.redexgen.core.C3T.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        if (this.A0Y != null) {
            this.A0Y.clear();
        }
        A1X(0);
        A0R();
    }

    private void A0U() {
        int iA0G;
        android.view.View focusedChild = null;
        if (this.A0o && hasFocus()) {
            com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c = this.A04;
            java.lang.String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            A19[7] = "5";
            if (abstractC04224c != null) {
                focusedChild = getFocusedChild();
            }
        }
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0G = focusedChild == null ? null : A0G(focusedChild);
        if (anonymousClass56A0G == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0A() ? anonymousClass56A0G.A0K() : -1L;
        com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53 = this.A0s;
        if (this.A0C) {
            iA0G = -1;
        } else {
            iA0G = anonymousClass56A0G.A0a() ? anonymousClass56A0G.A01 : anonymousClass56A0G.A0G();
        }
        anonymousClass53.A01 = iA0G;
        com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass54 = this.A0s;
        android.view.View child = anonymousClass56A0G.A0H;
        anonymousClass54.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        if (this.A06 != null) {
            this.A06.A0x();
        }
    }

    private final void A0X() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A0A(i));
            if (!anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0M();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c = this.A04;
        java.lang.String strA0I = A0I(1370, 12, 39);
        if (abstractC04224c == null) {
            android.util.Log.e(strA0I, A0I(1123, 36, 14));
            return;
        }
        if (this.A06 == null) {
            android.util.Log.e(strA0I, A0I(1159, 43, 5));
            return;
        }
        this.A0s.A0A = false;
        if (this.A0s.A04 == 1) {
            A0L();
            this.A06.A1O(this);
            A0M();
        } else if (this.A00.A0C() || this.A06.A0h() != getWidth() || this.A06.A0X() != getHeight()) {
            this.A06.A1O(this);
            A0M();
        } else {
            this.A06.A1O(this);
        }
        A0N();
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56 = this.A0w.get(size);
            if (anonymousClass56.A0H.getParent() == this && !anonymousClass56.A0f() && (state = anonymousClass56.A02) != -1) {
                com.facebook.ads.redexgen.core.C3T.A09(anonymousClass56.A0H, state);
                anonymousClass56.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new android.widget.EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new android.widget.EdgeEffect(getContext());
        if (this.A0B) {
            this.A0a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new android.widget.EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        android.widget.EdgeEffect edgeEffect = this.A0b;
        int measuredHeight = getMeasuredHeight();
        if (A19[7].length() != 1) {
            throw new java.lang.RuntimeException();
        }
        A19[1] = "cbkJKTW5fmkF4V5GELAthVoRFDIiLVou";
        edgeEffect.setSize(measuredHeight, getMeasuredWidth());
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new android.widget.EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        android.widget.EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[7].length() != 1) {
            throw new java.lang.RuntimeException();
        }
        A19[7] = "g";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new com.facebook.ads.redexgen.core.C1263av(new com.facebook.ads.redexgen.core.C1255an(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            ((com.facebook.ads.redexgen.core.C04354p) this.A01.A0A(i).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A0A(i));
            if (anonymousClass56A0F != null && !anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0T(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A0A(i));
            if (!anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0R();
            }
        }
    }

    private void A0j(float f, float f2, float f3, float f4) {
        boolean z = false;
        if (f2 < 0.0f) {
            A0b();
            com.facebook.ads.redexgen.core.AnonymousClass43.A00(this.A0a, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
            z = true;
        } else if (f2 > 0.0f) {
            A0c();
            com.facebook.ads.redexgen.core.AnonymousClass43.A00(this.A0b, f2 / getWidth(), f3 / getHeight());
            z = true;
        }
        if (f4 < 0.0f) {
            A0d();
            com.facebook.ads.redexgen.core.AnonymousClass43.A00(this.A0c, (-f4) / getHeight(), f / getWidth());
            z = true;
        } else if (f4 > 0.0f) {
            A0a();
            com.facebook.ads.redexgen.core.AnonymousClass43.A00(this.A0Z, f4 / getHeight(), 1.0f - (f / getWidth()));
            z = true;
        }
        if (!z && f2 == 0.0f) {
            if (A19[7].length() != 1) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A19;
            strArr[0] = "SiLEOgLe53s9c6khchOb02AHEH0FRuha";
            strArr[6] = "5HcivrXWoCNvsp5G28hhclxyRqnGBHgf";
            if (f4 == 0.0f) {
                return;
            }
        }
        com.facebook.ads.redexgen.core.C3T.A07(this);
    }

    private final void A0k(int i) {
        com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o = this.A06;
        if (this.A0i != null) {
            this.A0i.A0L(this, i);
        }
        if (this.A0m != null) {
            for (int size = this.A0m.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i);
                java.lang.String[] strArr = A19;
                java.lang.String str = strArr[3];
                java.lang.String str2 = strArr[2];
                int iCharAt = str.charAt(2);
                int i2 = str2.charAt(2);
                if (iCharAt == i2) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A19;
                strArr2[4] = "wNO3zluUeYau1J5tWYXYTZjLKyZssSra";
                strArr2[5] = "exw9q3ETOdRCiu35xcNaFWLlKD0n1alI";
            }
        }
    }

    private final void A0l(int i, int i2, android.view.animation.Interpolator interpolator) {
        if (this.A06 == null) {
            android.util.Log.e(A0I(1370, 12, 39), A0I(924, 97, 119));
            return;
        }
        if (this.A0I) {
            return;
        }
        if (!this.A06.A20()) {
            i = 0;
        }
        boolean zA21 = this.A06.A21();
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A19[1] = "Tqmtltgb2GXtzJ5pgFbL4REJzj4lGX6R";
        if (!zA21) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            this.A08.A0D(i, i2, interpolator);
        }
    }

    private void A0m(long j, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57) {
        int iA05 = this.A01.A05();
        for (int i = 0; i < iA05; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 other = A0F(this.A01.A09(i));
            if (other != anonymousClass56 && A0C(other) == j) {
                com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c = this.A04;
                java.lang.String[] strArr = A19;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[6];
                int i2 = str.charAt(14);
                int childCount = str2.charAt(14);
                if (i2 == childCount) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A19;
                strArr2[3] = "juwPw4JUkqCkrA4IuHnNpcgybF39inA5";
                strArr2[2] = "0NBeszRVzWCIaFL2RR4GryyHu33afAAx";
                java.lang.String strA0I = A0I(1, 17, 9);
                if (abstractC04224c != null && this.A04.A0A()) {
                    throw new java.lang.IllegalStateException(A0I(1696, 130, 15) + other + strA0I + anonymousClass56 + A1H());
                }
                throw new java.lang.IllegalStateException(A0I(com.google.android.gms.drive.DriveStatusCodes.DRIVE_CONTENTS_TOO_LARGE, 188, 43) + other + strA0I + anonymousClass56 + A1H());
            }
        }
        android.util.Log.e(A0I(1370, 12, 39), A0I(1202, 111, 51) + anonymousClass57 + A0I(18, 41, 117) + anonymousClass56 + A1H());
    }

    private void A0n(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(android.view.View view, android.graphics.Rect rect) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        android.graphics.Rect rect2 = c04354p.A03;
        rect.set((view.getLeft() - rect2.left) - c04354p.leftMargin, (view.getTop() - rect2.top) - c04354p.topMargin, view.getRight() + rect2.right + c04354p.rightMargin, view.getBottom() + rect2.bottom + c04354p.bottomMargin);
    }

    private void A0p(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof com.facebook.ads.redexgen.core.C04354p) {
            if (A19[7].length() != 1) {
                throw new java.lang.RuntimeException();
            }
            A19[1] = "MS6MXnJil8kPq55ThMmX90CfGz9dq6Ir";
            com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) layoutParams;
            if (!c04354p.A01) {
                android.graphics.Rect insets = c04354p.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1a(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c, boolean z, boolean z2) {
        if (this.A04 != null) {
            this.A04.A08(this.A11);
        }
        if (!z || z2) {
            A1N();
        }
        this.A00.A09();
        com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c2 = this.A04;
        this.A04 = abstractC04224c;
        if (abstractC04224c != null) {
            abstractC04224c.A07(this.A11);
        }
        com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o = this.A06;
        com.facebook.ads.redexgen.core.C04414w c04414w = this.A0r;
        com.facebook.ads.redexgen.core.AbstractC04224c oldAdapter = this.A04;
        c04414w.A0U(abstractC04224c2, oldAdapter, z);
        this.A0s.A0D = true;
        A1P();
    }

    private void A0r(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        android.view.View view = anonymousClass56.A0H;
        boolean z = view.getParent() == this;
        this.A0r.A0Y(A1G(view));
        boolean zA0c = anonymousClass56.A0c();
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A19;
        strArr2[3] = "TiCmVlWwgQ6VOJfmkNnlNNx0y9AVJwa2";
        strArr2[2] = "F9jx2AB6s4oeG4sqKvJHQ7CgJaKOJBvs";
        if (zA0c) {
            this.A01.A0H(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A09 != null) {
            com.facebook.ads.redexgen.core.FL fl = anonymousClass56.A09.get();
            while (fl != null) {
                android.view.View item = anonymousClass56.A0H;
                if (fl == item) {
                    return;
                }
                java.lang.Object parent = fl.getParent();
                if (parent instanceof android.view.View) {
                    fl = (android.view.View) parent;
                } else {
                    fl = null;
                }
            }
            anonymousClass56.A09 = null;
        }
    }

    private void A0t(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2, boolean z, boolean z2) {
        anonymousClass56.A0X(false);
        if (z) {
            A0r(anonymousClass56);
        }
        if (anonymousClass56 != anonymousClass57) {
            if (z2) {
                A0r(anonymousClass57);
            }
            anonymousClass56.A06 = anonymousClass57;
            A0r(anonymousClass56);
            this.A0r.A0Y(anonymousClass56);
            anonymousClass57.A0X(false);
            anonymousClass57.A07 = anonymousClass56;
        }
        if (this.A05.A0H(anonymousClass56, anonymousClass57, c04294j, c04294j2)) {
            A1M();
        }
    }

    private void A0x(int[] iArr) {
        int iA05 = this.A01.A05();
        if (iA05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Integer.MAX_VALUE;
        int minPositionPreLayout = Integer.MIN_VALUE;
        for (int i = 0; i < iA05; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A09(i));
            if (!anonymousClass56A0F.A0f()) {
                int count = anonymousClass56A0F.A0I();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int iA05 = this.A01.A05();
        for (int i = 0; i < iA05; i++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A09(i));
            if (anonymousClass56A0F != null && !anonymousClass56A0F.A0f()) {
                boolean zA0d = anonymousClass56A0F.A0d();
                int i2 = A19[7].length();
                if (i2 != 1) {
                    throw new java.lang.RuntimeException();
                }
                A19[1] = "5mbkKWt0hxhFdp5kkkYwhOUPEf80vh4b";
                if (zA0d) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A22();
    }

    private boolean A11(int i, int i2) {
        A0x(this.A14);
        return (this.A14[0] == i && this.A14[1] == i2) ? false : true;
    }

    private final boolean A12(int i, int i2) {
        if (this.A06 == null) {
            android.util.Log.e(A0I(1370, 12, 39), A0I(651, 89, 110));
            return false;
        }
        if (this.A0I) {
            return false;
        }
        boolean zA20 = this.A06.A20();
        boolean canScroll = this.A06.A21();
        if (!zA20 || java.lang.Math.abs(i) < this.A0y) {
            i = 0;
        }
        if (!canScroll || java.lang.Math.abs(i2) < this.A0y) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A19;
        strArr2[3] = "ReiKJWWZUipUJIZKdTnth4O85KfdJzFe";
        strArr2[2] = "VE75UicjWgpvWTg6gZrF4R3BQlGAuEv7";
        boolean canScrollHorizontal = dispatchNestedPreFling(f, i2);
        if (!canScrollHorizontal) {
            boolean canScrollVertical = zA20 || canScroll;
            dispatchNestedFling(i, i2, canScrollVertical);
            if (this.A0g != null) {
                boolean canScrollHorizontal2 = this.A0g.A0B(i, i2);
                if (canScrollHorizontal2) {
                    return true;
                }
            }
            if (canScrollVertical) {
                int i3 = 0;
                if (zA20) {
                    i3 = 0 | 1;
                }
                if (canScroll) {
                    i3 |= 2;
                }
                A1s(i3, 1);
                int nestedScrollAxis = -this.A0x;
                int iMax = java.lang.Math.max(nestedScrollAxis, java.lang.Math.min(i, this.A0x));
                int nestedScrollAxis2 = -this.A0x;
                this.A08.A09(iMax, java.lang.Math.max(nestedScrollAxis2, java.lang.Math.min(i2, this.A0x)));
                return true;
            }
        }
        return false;
    }

    private final boolean A13(int consumedX, int consumedY, android.view.MotionEvent motionEvent) {
        int i = 0;
        int i2 = 0;
        int iA1d = 0;
        int iA1e = 0;
        A1I();
        if (this.A04 != null) {
            A1J();
            A1K();
            com.facebook.ads.redexgen.core.AbstractC03852q.A01(A0I(1361, 9, 51));
            A1h(this.A0s);
            if (consumedX != 0) {
                iA1d = this.A06.A1d(consumedX, this.A0r, this.A0s);
                i = consumedX - iA1d;
            }
            if (consumedY != 0) {
                iA1e = this.A06.A1e(consumedY, this.A0r, this.A0s);
                i2 = consumedY - iA1e;
            }
            com.facebook.ads.redexgen.core.AbstractC03852q.A00();
            A1O();
            A1L();
            A1n(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1t(iA1d, iA1e, i, i2, this.A17, 0)) {
            this.A0S -= this.A17[0];
            this.A0T -= this.A17[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.A17[0], this.A17[1]);
            }
            int[] iArr = this.A15;
            iArr[0] = iArr[0] + this.A17[0];
            int[] iArr2 = this.A15;
            iArr2[1] = iArr2[1] + this.A17[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !com.facebook.ads.redexgen.core.AnonymousClass39.A00(motionEvent, 8194)) {
                A0j(motionEvent.getX(), i, motionEvent.getY(), i2);
            }
            A1Z(consumedX, consumedY);
        }
        if (iA1d != 0 || iA1e != 0) {
            A1b(iA1d, iA1e);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (iA1d == 0 && iA1e == 0) ? false : true;
    }

    private boolean A14(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (0 != 0) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int action2 = this.A13.size();
            if (0 < action2) {
                this.A13.get(0);
                throw new java.lang.NullPointerException(A0I(1973, 21, 46));
            }
            return false;
        }
        return false;
    }

    private boolean A15(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int action2 = this.A13.size();
        if (0 < action2) {
            this.A13.get(0);
            throw new java.lang.NullPointerException(A0I(1973, 21, 46));
        }
        return false;
    }

    private boolean A16(android.view.View view, android.view.View view2, int i) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i == 2 || i == 1) {
            boolean z = this.A06.A0a() == 1;
            boolean rtl = i == 2;
            if (rtl ^ z) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i == 2) {
                return A17(view, view2, 130);
            }
            java.lang.String[] strArr = A19;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[6];
            int iCharAt = str.charAt(14);
            int absHorizontal2 = str2.charAt(14);
            if (iCharAt == absHorizontal2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[3] = "Ohwc1756uTT166t9FAn6vugoi7AJfc0c";
            strArr2[2] = "5J1fVRqaKzeN2XjLKxMOi2uJr88KN7aK";
            return A17(view, view2, 33);
        }
        return A17(view, view2, i);
    }

    private boolean A17(android.view.View view, android.view.View view2, int i) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case 66:
                return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case 130:
                if (this.A0p.top >= this.A0z.top) {
                    android.graphics.Rect rect = this.A0p;
                    java.lang.String[] strArr = A19;
                    if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A19;
                    strArr2[0] = "mOrDrwN7qo6GKKMJ6G3US4mLdoh2ETut";
                    strArr2[6] = "IWP4ZqDDS1db9pl2oaFrT53kmkniKDfl";
                    if (rect.bottom > this.A0z.top) {
                        return false;
                    }
                }
                return this.A0p.bottom < this.A0z.bottom;
            default:
                throw new java.lang.IllegalArgumentException(A0I(1844, 37, 85) + i + A1H());
        }
    }

    private final boolean A18(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (A1q()) {
            int iA00 = 0;
            if (accessibilityEvent != null) {
                iA00 = com.facebook.ads.redexgen.core.AbstractC04073m.A00(accessibilityEvent);
            }
            if (iA00 == 0) {
                iA00 = 0;
            }
            int type = this.A0P;
            this.A0P = type | iA00;
            return true;
        }
        return false;
    }

    public final int A1B(android.view.View view) {
        com.facebook.ads.redexgen.core.AnonymousClass56 holder = A0F(view);
        if (holder != null) {
            return holder.A0I();
        }
        return -1;
    }

    public final int A1C(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0i(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED) || !anonymousClass56.A0Y()) {
            return -1;
        }
        return this.A00.A05(anonymousClass56.A03);
    }

    public final android.graphics.Rect A1D(android.view.View view) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        if (!c04354p.A01) {
            return c04354p.A03;
        }
        if (this.A0s.A07()) {
            boolean zA01 = c04354p.A01();
            if (A19[7].length() != 1) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A19;
            strArr[0] = "RfoZAoElzPqJKaUzlOfJ9JNtEQb3r4Q3";
            strArr[6] = "IQCpaJiMXE8HuUJ13qJ8cPkLmMUIWIfQ";
            if (zA01 || c04354p.A03()) {
                return c04354p.A03;
            }
        }
        android.graphics.Rect rect = c04354p.A03;
        rect.set(0, 0, 0, 0);
        if (0 < this.A0v.size()) {
            this.A0p.set(0, 0, 0, 0);
            this.A0v.get(0);
            throw new java.lang.NullPointerException(A0I(1881, 14, 112));
        }
        c04354p.A01 = false;
        return rect;
    }

    public final android.view.View A1E(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            boolean z = parent instanceof android.view.View;
            if (A19[7].length() == 1) {
                java.lang.String[] strArr = A19;
                strArr[3] = "J9ctOc3byknHaiu8XEstSyzOEyaFCb7S";
                strArr[2] = "QOdc34hkOqsfpHVshThNFi46vThKtwkT";
                if (!z) {
                    break;
                }
                view = parent;
                parent = view.getParent();
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass56 A1F(int i) {
        if (this.A0C) {
            return null;
        }
        int iA06 = this.A01.A06();
        com.facebook.ads.redexgen.core.AnonymousClass56 hidden = null;
        for (int i2 = 0; i2 < iA06; i2++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(this.A01.A0A(i2));
            if (anonymousClass56A0F != null && !anonymousClass56A0F.A0a()) {
                int childCount = A1C(anonymousClass56A0F);
                if (childCount != i) {
                    continue;
                } else if (this.A01.A0K(anonymousClass56A0F.A0H)) {
                    hidden = anonymousClass56A0F;
                } else {
                    return anonymousClass56A0F;
                }
            }
        }
        return hidden;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass56 A1G(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new java.lang.IllegalArgumentException(A0I(1826, 5, 41) + view + A0I(98, 26, 38) + this);
    }

    public final java.lang.String A1H() {
        return A0I(0, 1, 23) + super.toString() + A0I(org.objectweb.asm.Opcodes.RET, 10, 87) + this.A04 + A0I(189, 9, 86) + this.A06 + A0I(org.objectweb.asm.Opcodes.PUTSTATIC, 10, 119) + getContext();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    public final void A1I() {
        boolean z = this.A0D;
        java.lang.String strA0I = A0I(1313, 17, 63);
        if (!z || this.A0C) {
            com.facebook.ads.redexgen.core.AbstractC03852q.A01(strA0I);
            A0Y();
            com.facebook.ads.redexgen.core.AbstractC03852q.A00();
            return;
        }
        if (!this.A00.A0B()) {
            return;
        }
        com.facebook.ads.redexgen.core.C1263av c1263av = this.A00;
        java.lang.String[] strArr = A19;
        if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
            A19[1] = "cmOs2ngvAj3urs5G14jP2yS9Pox4PNUI";
            if (c1263av.A0D(4) && !this.A00.A0D(11)) {
                com.facebook.ads.redexgen.core.AbstractC03852q.A01(A0I(1341, 20, 44));
                A1J();
                A1K();
                this.A00.A08();
                if (!this.A0J) {
                    boolean zA0y = A0y();
                    java.lang.String[] strArr2 = A19;
                    if (strArr2[3].charAt(2) != strArr2[2].charAt(2)) {
                        A19[7] = androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY;
                        if (zA0y) {
                            A0Y();
                        } else {
                            this.A00.A06();
                        }
                    } else if (zA0y) {
                        A0Y();
                    } else {
                        this.A00.A06();
                    }
                }
                A1n(true);
                if (A19[7].length() == 1) {
                    java.lang.String[] strArr3 = A19;
                    strArr3[3] = "rQ0jmwctWvIOIioOAlLcoJlzUDkcSysz";
                    strArr3[2] = "N5NmD2ge71vhim7LrdB83J9iYpsRCLkc";
                    A1L();
                    com.facebook.ads.redexgen.core.AbstractC03852q.A00();
                    return;
                }
            } else {
                if (this.A00.A0B()) {
                    com.facebook.ads.redexgen.core.AbstractC03852q.A01(strA0I);
                    A0Y();
                    com.facebook.ads.redexgen.core.AbstractC03852q.A00();
                    return;
                }
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public final void A1J() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1K() {
        this.A0U++;
    }

    public final void A1L() {
        A1m(true);
    }

    public final void A1M() {
        if (!this.A0K && this.A0F) {
            com.facebook.ads.redexgen.core.C3T.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1N() {
        if (this.A05 != null) {
            this.A05.A0I();
        }
        if (this.A06 != null) {
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
        }
        this.A0r.A0P();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    public final void A1O() {
        int iA05 = this.A01.A05();
        for (int left = 0; left < iA05; left++) {
            android.view.View view = this.A01.A09(left);
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A1G = A1G(view);
            if (anonymousClass56A1G != null && anonymousClass56A1G.A07 != null) {
                android.view.View shadowingView = anonymousClass56A1G.A07.A0H;
                int left2 = view.getLeft();
                int top = view.getTop();
                int count = shadowingView.getLeft();
                if (left2 == count) {
                    int count2 = shadowingView.getTop();
                    if (top != count2) {
                        int i = shadowingView.getWidth();
                        int count3 = shadowingView.getHeight();
                        shadowingView.layout(left2, top, i + left2, count3 + top);
                    }
                } else {
                    int i2 = shadowingView.getWidth();
                    int count4 = shadowingView.getHeight();
                    shadowingView.layout(left2, top, i2 + left2, count4 + top);
                }
            }
        }
    }

    public final void A1P() {
        this.A0C = true;
        A0h();
    }

    public final void A1Q() {
        if (this.A0m != null) {
            this.A0m.clear();
        }
    }

    public final void A1R() {
        setScrollState(0);
        A0V();
    }

    public final void A1S(int i) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A1p(i);
        awakenScrollBars();
    }

    public final void A1T(int i) {
        int iA05 = this.A01.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            this.A01.A09(i2).offsetLeftAndRight(i);
        }
    }

    public final void A1U(int i) {
        int iA05 = this.A01.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            this.A01.A09(i2).offsetTopAndBottom(i);
        }
    }

    public final void A1V(int i) {
        if (this.A0I) {
            return;
        }
        A1R();
        if (this.A06 == null) {
            android.util.Log.e(A0I(1370, 12, 39), A0I(740, 94, 12));
        } else {
            this.A06.A1p(i);
            awakenScrollBars();
        }
    }

    public final void A1W(int i) {
        if (this.A0I) {
            return;
        }
        if (this.A06 == null) {
            android.util.Log.e(A0I(1370, 12, 39), A0I(924, 97, 119));
        } else {
            this.A06.A1x(this, this.A0s, i);
        }
    }

    public final void A1X(int i) {
        getScrollingChildHelper().A03(i);
    }

    public final void A1Y(int i, int i2) {
        if (i < 0) {
            A0b();
            this.A0a.onAbsorb(-i);
        } else if (i > 0) {
            A0c();
            this.A0b.onAbsorb(i);
        }
        if (i2 < 0) {
            A0d();
            this.A0c.onAbsorb(-i2);
        } else if (i2 > 0) {
            A0a();
            java.lang.String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[0] = "Kq4j6FG7zvFvwW4vRC6zLjapwuK9WjkP";
            strArr2[6] = "2Xczf707pBdLKDJ5NVr429bRaPx31sq0";
            this.A0Z.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            com.facebook.ads.redexgen.core.C3T.A07(this);
        }
    }

    public final void A1Z(int i, int i2) {
        boolean zIsFinished = false;
        if (this.A0a != null) {
            boolean needsInvalidate = this.A0a.isFinished();
            if (!needsInvalidate && i > 0) {
                this.A0a.onRelease();
                zIsFinished = this.A0a.isFinished();
            }
        }
        if (this.A0b != null) {
            boolean needsInvalidate2 = this.A0b.isFinished();
            if (!needsInvalidate2 && i < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                zIsFinished |= needsInvalidate3;
            }
        }
        android.widget.EdgeEffect edgeEffect = this.A0c;
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A19;
        strArr2[0] = "hv7OcE78gRUWXZIBx5R2VkE7fvviVqXd";
        strArr2[6] = "NFDR0brV2INlGIZxgJE16fqqg8Mw1YR1";
        if (edgeEffect != null) {
            boolean needsInvalidate4 = this.A0c.isFinished();
            if (!needsInvalidate4 && i2 > 0) {
                this.A0c.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                zIsFinished |= needsInvalidate5;
            }
        }
        if (this.A0Z != null) {
            boolean needsInvalidate6 = this.A0Z.isFinished();
            if (!needsInvalidate6 && i2 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                zIsFinished |= needsInvalidate7;
            }
        }
        if (zIsFinished) {
            com.facebook.ads.redexgen.core.C3T.A07(this);
        }
    }

    public final void A1a(int i, int i2) {
        int iA00 = com.facebook.ads.redexgen.core.AbstractC04344o.A00(i, getPaddingLeft() + getPaddingRight(), com.facebook.ads.redexgen.core.C3T.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i3 = paddingTop + width;
        int width2 = com.facebook.ads.redexgen.core.C3T.A02(this);
        setMeasuredDimension(iA00, com.facebook.ads.redexgen.core.AbstractC04344o.A00(i2, i3, width2));
    }

    public final void A1b(int i, int i2) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        if (this.A0i != null) {
            this.A0i.A0M(this, i, i2);
        }
        if (this.A0m != null) {
            for (int scrollY2 = this.A0m.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i, i2);
            }
        }
        this.A0N--;
    }

    public final void A1c(int i, int i2) {
        A0l(i, i2, null);
    }

    public final void A1d(android.view.View view) {
        int cnt;
        A0F(view);
        com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c = this.A04;
        if (this.A0l != null && (cnt = this.A0l.size() - 1) >= 0) {
            this.A0l.get(cnt);
            throw new java.lang.NullPointerException(A0I(1895, 27, 67));
        }
    }

    public final void A1e(android.view.View view) {
        A0F(view);
        com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c = this.A04;
        if (this.A0l != null) {
            java.util.List<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
            java.lang.String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[4] = "Ju6zs0r9efzkyV7LXILEyjCEKckziCxk";
            strArr2[5] = "xtNh9wS4idAx9IKZVnTROlGUKiewUtpM";
            int size = list.size() - 1;
            if (size >= 0) {
                this.A0l.get(size);
                throw new java.lang.NullPointerException(A0I(1922, 29, 40));
            }
        }
    }

    public final void A1f(com.facebook.ads.redexgen.core.AbstractC04394t abstractC04394t) {
        if (this.A0m == null) {
            this.A0m = new java.util.ArrayList();
        }
        this.A0m.add(abstractC04394t);
    }

    public final void A1g(com.facebook.ads.redexgen.core.AbstractC04394t abstractC04394t) {
        if (this.A0m != null) {
            java.util.List<com.facebook.ads.redexgen.core.AbstractC04394t> list = this.A0m;
            if (A19[7].length() != 1) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A19;
            strArr[3] = "sOoQs3X4dS853ZpkNjZwaQi0LuRyF7Hc";
            strArr[2] = "YQ1nAsE5QOTVY911s6plJSU2g6bxQXkh";
            list.remove(abstractC04394t);
        }
    }

    public final void A1h(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (getScrollState() == 2) {
            android.widget.OverScroller overScroller = this.A08.A01;
            anonymousClass53.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            anonymousClass53.A07 = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            anonymousClass53.A06 = 0;
            anonymousClass53.A07 = 0;
        }
    }

    public final void A1i(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j) {
        anonymousClass56.A0U(0, 8192);
        if (this.A0s.A0E) {
            boolean zA0d = anonymousClass56.A0d();
            if (A19[1].charAt(14) != '5') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A19;
            strArr[0] = "SaiGfOi3tH24E262D5BQaQwya8XqTMou";
            strArr[6] = "ZNTGZnAbt95d53NkHsORUVfXJkKP7CFB";
            if (zA0d && !anonymousClass56.A0a() && !anonymousClass56.A0f()) {
                this.A0t.A08(A0C(anonymousClass56), anonymousClass56);
            }
        }
        this.A0t.A0F(anonymousClass56, c04294j);
    }

    public final void A1j(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2) {
        anonymousClass56.A0X(false);
        if (this.A05.A0E(anonymousClass56, c04294j, c04294j2)) {
            A1M();
        }
    }

    public final void A1k(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2) {
        A0r(anonymousClass56);
        anonymousClass56.A0X(false);
        if (this.A05.A0F(anonymousClass56, c04294j, c04294j2)) {
            A1M();
        }
    }

    public final void A1l(java.lang.String str) {
        if (A1q()) {
            if (str == null) {
                throw new java.lang.IllegalStateException(A0I(574, 77, 103) + A1H());
            }
            throw new java.lang.IllegalStateException(str);
        }
        if (this.A0N > 0) {
            android.util.Log.w(A0I(1370, 12, 39), A0I(294, 280, 93), new java.lang.IllegalStateException(A0I(0, 0, 122) + A1H()));
        }
    }

    public final void A1m(boolean z) {
        this.A0U--;
        if (this.A0U < 1) {
            java.lang.String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[4] = "VgsuIcXtp0FweJIL4JjeIuHXK9vcALAx";
            strArr2[5] = "AVlqmC2HCSNpSWUvoITeU6SwKS4OLgxH";
            this.A0U = 0;
            if (z) {
                A0K();
                A0Z();
            }
        }
    }

    public final void A1n(boolean z) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z && this.A0J) {
                boolean z2 = this.A0I;
                if (A19[1].charAt(14) != '5') {
                    throw new java.lang.RuntimeException();
                }
                A19[7] = "k";
                if (!z2 && this.A06 != null && this.A04 != null) {
                    A0Y();
                }
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1o() {
        return this.A10 != null && this.A10.isEnabled();
    }

    public final boolean A1p() {
        if (this.A0D) {
            boolean z = this.A0C;
            java.lang.String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            A19[7] = "K";
            if (!z && !this.A00.A0B()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1q() {
        return this.A0U > 0;
    }

    public final boolean A1r(int i) {
        return getScrollingChildHelper().A09(i);
    }

    public final boolean A1s(int i, int i2) {
        return getScrollingChildHelper().A0B(i, i2);
    }

    public final boolean A1t(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A0D(i, i2, i3, i4, iArr, i5);
    }

    public final boolean A1u(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().A0F(i, i2, iArr, iArr2, i3);
    }

    public final boolean A1v(android.view.View view) {
        A1J();
        boolean zA0L = this.A01.A0L(view);
        if (zA0L) {
            com.facebook.ads.redexgen.core.AnonymousClass56 viewHolder = A0F(view);
            this.A0r.A0Y(viewHolder);
            this.A0r.A0X(viewHolder);
        }
        boolean removed = !zA0L;
        A1n(removed);
        return zA0L;
    }

    public final boolean A1w(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return this.A05 == null || this.A05.A0M(anonymousClass56, anonymousClass56.A0L());
    }

    public final boolean A1x(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i) {
        if (A1q()) {
            anonymousClass56.A02 = i;
            this.A0w.add(anonymousClass56);
            return false;
        }
        com.facebook.ads.redexgen.core.C3T.A09(anonymousClass56.A0H, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList<android.view.View> views, int i, int i2) {
        if (this.A06 == null || !this.A06.A1c(this, views, i, i2)) {
            super.addFocusables(views, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof com.facebook.ads.redexgen.core.C04354p) && this.A06.A1Y((com.facebook.ads.redexgen.core.C04354p) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1f(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1g(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1h(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (this.A06 == null || !this.A06.A21()) {
            return 0;
        }
        com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o = this.A06;
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A19;
        strArr2[3] = "OwG4fgggKq7icgaaysnCa6zBD064f6Q4";
        strArr2[2] = "UojYTgk0EBa2sJrZvEgoz68xRxvrHNBO";
        return abstractC04344o.A1i(this.A0s);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        if (this.A06 != null && this.A06.A21()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (this.A06 != null && this.A06.A21()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A08(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A07(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A0C(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0199 A[DONT_INVERT, PHI: r5
  0x0199: PHI (r5v4 'padding' int) = (r5v3 'padding' int), (r5v3 'padding' int), (r5v7 'padding' int) binds: [B:49:0x00e1, B:53:0x0108, B:74:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        java.util.ArrayList<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView.ItemDecoration> arrayList;
        int iCharAt;
        int count;
        int count2;
        super.draw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
            java.lang.String[] strArr = A19;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[5];
            int i2 = str.charAt(24);
            int count3 = str2.charAt(24);
            if (i2 != count3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[4] = "gQsc8vIJl1UGYmi9aNFbwaJOKb8pUSAm";
            strArr2[5] = "oC19iGbHbrFzAvfkH6l2iab1KXGTXLUm";
        }
        int padding = 0;
        if (this.A0a != null && !this.A0a.isFinished()) {
            int restore = canvas.save();
            int paddingBottom = this.A0B ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            int count4 = getHeight();
            canvas.translate((-count4) + paddingBottom, 0.0f);
            padding = (this.A0a == null || !this.A0a.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(restore);
        }
        if (this.A0c != null && !this.A0c.isFinished()) {
            int restore2 = canvas.save();
            if (this.A0B) {
                int count5 = getPaddingLeft();
                float f = count5;
                int count6 = getPaddingTop();
                canvas.translate(f, count6);
            }
            int count7 = (this.A0c == null || !this.A0c.draw(canvas)) ? 0 : 1;
            padding |= count7;
            canvas.restoreToCount(restore2);
        }
        if (this.A0b != null && !this.A0b.isFinished()) {
            int iSave = canvas.save();
            int restore3 = getWidth();
            int paddingTop = this.A0B ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            int count8 = -paddingTop;
            float f2 = count8;
            int count9 = -restore3;
            canvas.translate(f2, count9);
            int count10 = (this.A0b == null || !this.A0b.draw(canvas)) ? 0 : 1;
            padding |= count10;
            canvas.restoreToCount(iSave);
        }
        if (this.A0Z == null) {
            if (padding == 0) {
                arrayList = this.A0v;
                java.lang.String[] strArr3 = A19;
                java.lang.String str3 = strArr3[3];
                java.lang.String str4 = strArr3[2];
                iCharAt = str3.charAt(2);
                count = str4.charAt(2);
                if (iCharAt != count) {
                    A19[7] = "H";
                    count2 = arrayList.size();
                    if (count2 > 0) {
                        padding = 1;
                    }
                }
            }
            if (padding != 0) {
                com.facebook.ads.redexgen.core.C3T.A07(this);
                return;
            }
            return;
        }
        android.widget.EdgeEffect edgeEffect = this.A0Z;
        java.lang.String[] strArr4 = A19;
        java.lang.String str5 = strArr4[3];
        java.lang.String str6 = strArr4[2];
        int iCharAt2 = str5.charAt(2);
        int count11 = str6.charAt(2);
        if (iCharAt2 == count11) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr5 = A19;
        strArr5[3] = "pc4oxgQcBgvDQxlVEd8f0MQKJjQuaCtL";
        strArr5[2] = "7OrxE1K6SAZd49hN5xk5t3PbvmNxieuR";
        if (!edgeEffect.isFinished()) {
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A0B) {
                int count12 = getWidth();
                int i3 = -count12;
                if (A19[1].charAt(14) == '5') {
                    java.lang.String[] strArr6 = A19;
                    strArr6[3] = "kFmiqaRapActNLLOarRDIccZMtzlwzdY";
                    strArr6[2] = "xQ3lH2Su3SoDIim9C11VlEm3b0Af7gFe";
                    int count13 = getPaddingRight();
                    float f3 = i3 + count13;
                    int count14 = getHeight();
                    int i4 = -count14;
                    int count15 = getPaddingBottom();
                    canvas.translate(f3, i4 + count15);
                }
            } else {
                int count16 = getWidth();
                float f4 = -count16;
                int count17 = getHeight();
                canvas.translate(f4, -count17);
            }
            padding |= (this.A0Z == null || !this.A0Z.draw(canvas)) ? 0 : 1;
            java.lang.String[] strArr7 = A19;
            java.lang.String str7 = strArr7[4];
            java.lang.String str8 = strArr7[5];
            int iCharAt3 = str7.charAt(24);
            int count18 = str8.charAt(24);
            if (iCharAt3 == count18) {
                A19[1] = "WzyBKHPzEJ8PH456mJZxotJJ1epXOuMr";
                canvas.restoreToCount(iSave2);
                if (padding == 0 && this.A05 != null) {
                    arrayList = this.A0v;
                    java.lang.String[] strArr8 = A19;
                    java.lang.String str9 = strArr8[3];
                    java.lang.String str10 = strArr8[2];
                    iCharAt = str9.charAt(2);
                    count = str10.charAt(2);
                    if (iCharAt != count) {
                        A19[7] = "H";
                        count2 = arrayList.size();
                        if (count2 > 0 && this.A05.A0L()) {
                            padding = 1;
                        }
                    }
                }
                if (padding != 0) {
                    com.facebook.ads.redexgen.core.C3T.A07(this);
                    return;
                }
                return;
            }
        } else {
            if (padding == 0) {
                arrayList = this.A0v;
                java.lang.String[] strArr9 = A19;
                java.lang.String str11 = strArr9[3];
                java.lang.String str12 = strArr9[2];
                iCharAt = str11.charAt(2);
                count = str12.charAt(2);
                if (iCharAt != count) {
                    A19[7] = "H";
                    count2 = arrayList.size();
                    if (count2 > 0) {
                        padding = 1;
                    }
                }
            }
            if (padding != 0) {
                com.facebook.ads.redexgen.core.C3T.A07(this);
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x0179 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
    
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016c, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
    
        A0p(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0172, code lost:
    
        return r11;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.View focusSearch(android.view.View view, int i) {
        boolean z;
        android.view.FocusFinder focusFinder;
        java.lang.String[] strArr;
        android.view.View viewFindNextFocus;
        int i2;
        boolean canRunFocusFailure;
        boolean z2;
        int i3;
        int absDir;
        android.view.View found;
        java.lang.String[] strArr2;
        android.view.View result = this.A06.A0u(view, i);
        if (result != null) {
            return result;
        }
        if (this.A04 == null) {
            z = false;
            focusFinder = android.view.FocusFinder.getInstance();
            strArr = A19;
            if (strArr[3].charAt(2) != strArr[2].charAt(2)) {
                java.lang.String[] strArr3 = A19;
                strArr3[4] = "RuMODLf1O689wAEyDjhhFz87KamG9C6R";
                strArr3[5] = "NJcDSTcxKXwBscDw0ZmIhZRbKBELDC3R";
                if (z) {
                    if (i != 2) {
                    }
                    i2 = 0;
                    if (this.A06.A21()) {
                        if (i == 2) {
                            absDir = 130;
                        } else {
                            absDir = 33;
                        }
                        found = focusFinder.findNextFocus(this, view, absDir);
                        strArr2 = A19;
                        if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                            java.lang.String[] strArr4 = A19;
                            strArr4[0] = "PHUXCSvj0qVt4bMkXhuKdS2TL18qx3jZ";
                            strArr4[6] = "9Uo8CmEd6ZAjo9pPUWDw01n4G5SCE1PJ";
                            if (found == null) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            if (A1F) {
                                i = absDir;
                            }
                        }
                    }
                    if (i2 == 0) {
                        if (this.A06.A0a() == 1) {
                            canRunFocusFailure = true;
                        } else {
                            canRunFocusFailure = false;
                        }
                        if (i == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 ^ canRunFocusFailure) {
                            i3 = 66;
                        } else {
                            i3 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i3) != null) {
                        }
                        i2 = absDir;
                        if (A1F) {
                            i = i3;
                        }
                    }
                    if (i2 != 0) {
                        A1I();
                        if (A1E(view) == null) {
                            return null;
                        }
                        A1J();
                        this.A06.A1n(view, i, this.A0r, this.A0s);
                        A1n(false);
                    }
                    viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
                }
                if (viewFindNextFocus == null) {
                }
                if (A16(view, viewFindNextFocus, i)) {
                    return viewFindNextFocus;
                }
                return super.focusSearch(view, i);
            }
            A19[1] = "TOkwf99EPChAbg5nwJdJAGpyiA4dz5qy";
            if (z) {
                if (i != 2) {
                }
                i2 = 0;
                if (this.A06.A21()) {
                    if (i == 2) {
                        absDir = 130;
                    } else {
                        absDir = 33;
                    }
                    found = focusFinder.findNextFocus(this, view, absDir);
                    strArr2 = A19;
                    if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                        java.lang.String[] strArr5 = A19;
                        strArr5[0] = "PHUXCSvj0qVt4bMkXhuKdS2TL18qx3jZ";
                        strArr5[6] = "9Uo8CmEd6ZAjo9pPUWDw01n4G5SCE1PJ";
                        if (found == null) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (A1F) {
                            i = absDir;
                        }
                    }
                }
                if (i2 == 0) {
                    if (this.A06.A0a() == 1) {
                        canRunFocusFailure = true;
                    } else {
                        canRunFocusFailure = false;
                    }
                    if (i == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 ^ canRunFocusFailure) {
                        i3 = 66;
                    } else {
                        i3 = 17;
                    }
                    if (focusFinder.findNextFocus(this, view, i3) != null) {
                    }
                    i2 = absDir;
                    if (A1F) {
                        i = i3;
                    }
                }
                if (i2 != 0) {
                    A1I();
                    if (A1E(view) == null) {
                        return null;
                    }
                    A1J();
                    this.A06.A1n(view, i, this.A0r, this.A0s);
                    A1n(false);
                }
                viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            }
            if (viewFindNextFocus == null) {
            }
            if (A16(view, viewFindNextFocus, i)) {
                return viewFindNextFocus;
            }
            return super.focusSearch(view, i);
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null) {
                A1I();
                if (A1E(view) == null) {
                    return null;
                }
                A1J();
                if (A19[7].length() != 1) {
                    throw new java.lang.RuntimeException();
                }
                A19[7] = "d";
                viewFindNextFocus = this.A06.A1n(view, i, this.A0r, this.A0s);
                A1n(false);
            }
            if (viewFindNextFocus == null) {
            }
            if (A16(view, viewFindNextFocus, i)) {
                return viewFindNextFocus;
            }
            return super.focusSearch(view, i);
        }
        com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o = this.A06;
        java.lang.String[] strArr6 = A19;
        if (strArr6[3].charAt(2) != strArr6[2].charAt(2)) {
            java.lang.String[] strArr7 = A19;
            strArr7[0] = "jbJdWpntL3gTwTsx2QIOzgiReX5J9WML";
            strArr7[6] = "diVWiQ0BX7qzSdfLGBdmhe3ED96vfvir";
            if (abstractC04344o == null || A1q() || this.A0I) {
                z = false;
            } else {
                z = true;
            }
            focusFinder = android.view.FocusFinder.getInstance();
            strArr = A19;
            if (strArr[3].charAt(2) != strArr[2].charAt(2)) {
                java.lang.String[] strArr8 = A19;
                strArr8[4] = "RuMODLf1O689wAEyDjhhFz87KamG9C6R";
                strArr8[5] = "NJcDSTcxKXwBscDw0ZmIhZRbKBELDC3R";
                if (z) {
                    if (i != 2 || i == 1) {
                        i2 = 0;
                        if (this.A06.A21()) {
                            if (i == 2) {
                                absDir = 130;
                            } else {
                                absDir = 33;
                            }
                            found = focusFinder.findNextFocus(this, view, absDir);
                            strArr2 = A19;
                            if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                                java.lang.String[] strArr9 = A19;
                                strArr9[0] = "PHUXCSvj0qVt4bMkXhuKdS2TL18qx3jZ";
                                strArr9[6] = "9Uo8CmEd6ZAjo9pPUWDw01n4G5SCE1PJ";
                                if (found == null) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                if (A1F) {
                                    i = absDir;
                                }
                            }
                        }
                        if (i2 == 0 && this.A06.A20()) {
                            if (this.A06.A0a() == 1) {
                                canRunFocusFailure = true;
                            } else {
                                canRunFocusFailure = false;
                            }
                            if (i == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2 ^ canRunFocusFailure) {
                                i3 = 66;
                            } else {
                                i3 = 17;
                            }
                            int absDir2 = focusFinder.findNextFocus(this, view, i3) != null ? 0 : 1;
                            i2 = absDir2;
                            if (A1F) {
                                i = i3;
                            }
                        }
                        if (i2 != 0) {
                            A1I();
                            if (A1E(view) == null) {
                                return null;
                            }
                            A1J();
                            this.A06.A1n(view, i, this.A0r, this.A0s);
                            A1n(false);
                        }
                        viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
                    }
                }
                if (viewFindNextFocus == null && !viewFindNextFocus.hasFocusable()) {
                    android.view.View focusedChild = getFocusedChild();
                    java.lang.String[] strArr10 = A19;
                    if (strArr10[3].charAt(2) != strArr10[2].charAt(2)) {
                        A19[1] = "b9MIeYXaHVfTdq5nKFyUZKSBlIH2M87t";
                    }
                } else {
                    if (A16(view, viewFindNextFocus, i)) {
                        return viewFindNextFocus;
                    }
                    return super.focusSearch(view, i);
                }
            } else {
                A19[1] = "TOkwf99EPChAbg5nwJdJAGpyiA4dz5qy";
                if (z) {
                    if (i != 2) {
                    }
                    i2 = 0;
                    if (this.A06.A21()) {
                        if (i == 2) {
                            absDir = 130;
                        } else {
                            absDir = 33;
                        }
                        found = focusFinder.findNextFocus(this, view, absDir);
                        strArr2 = A19;
                        if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                            java.lang.String[] strArr11 = A19;
                            strArr11[0] = "PHUXCSvj0qVt4bMkXhuKdS2TL18qx3jZ";
                            strArr11[6] = "9Uo8CmEd6ZAjo9pPUWDw01n4G5SCE1PJ";
                            if (found == null) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            if (A1F) {
                                i = absDir;
                            }
                        }
                    }
                    if (i2 == 0) {
                        if (this.A06.A0a() == 1) {
                            canRunFocusFailure = true;
                        } else {
                            canRunFocusFailure = false;
                        }
                        if (i == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 ^ canRunFocusFailure) {
                            i3 = 66;
                        } else {
                            i3 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i3) != null) {
                        }
                        i2 = absDir2;
                        if (A1F) {
                            i = i3;
                        }
                    }
                    if (i2 != 0) {
                        A1I();
                        if (A1E(view) == null) {
                            return null;
                        }
                        A1J();
                        this.A06.A1n(view, i, this.A0r, this.A0s);
                        A1n(false);
                    }
                    viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
                }
                if (viewFindNextFocus == null) {
                }
                if (A16(view, viewFindNextFocus, i)) {
                    return viewFindNextFocus;
                }
                return super.focusSearch(view, i);
            }
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z) {
                A1I();
                if (A1E(view) == null) {
                    return null;
                }
                A1J();
                if (A19[7].length() != 1) {
                    throw new java.lang.RuntimeException();
                }
                A19[7] = "d";
                viewFindNextFocus = this.A06.A1n(view, i, this.A0r, this.A0s);
                A1n(false);
            }
            if (viewFindNextFocus == null) {
            }
            if (A16(view, viewFindNextFocus, i)) {
                return viewFindNextFocus;
            }
            return super.focusSearch(view, i);
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.A06 != null) {
            return this.A06.A1o();
        }
        throw new java.lang.IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        if (this.A06 != null) {
            return this.A06.A0v(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.A06 != null) {
            return this.A06.A0w(layoutParams);
        }
        throw new java.lang.IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    public com.facebook.ads.redexgen.core.AbstractC04224c getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A06 != null) {
            return this.A06.A0V();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (0 == 0) {
            return super.getChildDrawingOrder(i, i2);
        }
        throw new java.lang.NullPointerException(A0I(1951, 22, 16));
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public com.facebook.ads.redexgen.core.C1249ag getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public com.facebook.ads.redexgen.core.AbstractC04304k getItemAnimator() {
        return this.A05;
    }

    public com.facebook.ads.redexgen.core.AbstractC04344o getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return java.lang.System.nanoTime();
        }
        return 0L;
    }

    public com.facebook.ads.redexgen.core.AbstractC04374r getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public com.facebook.ads.redexgen.core.C4v getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private com.facebook.ads.redexgen.core.C3B getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new com.facebook.ads.redexgen.core.C3B(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z = true;
        this.A0F = true;
        if (!this.A0D || isLayoutRequested()) {
            z = false;
        }
        this.A0D = z;
        if (this.A06 != null) {
            this.A06.A1N(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = com.facebook.ads.redexgen.core.C4P.A07.get();
            com.facebook.ads.redexgen.core.C4P c4p = this.A03;
            java.lang.String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[4] = "C0ehsoOGkHH4Yo5xO6QtGogVKP7uVX9B";
            strArr2[5] = "76wleFUxgdDs3CwSlu7sJ9vYK22l9wck";
            if (c4p == null) {
                this.A03 = new com.facebook.ads.redexgen.core.C4P();
                android.view.Display displayA04 = com.facebook.ads.redexgen.core.C3T.A04(this);
                float f = 60.0f;
                if (!isInEditMode() && displayA04 != null) {
                    float refreshRate = displayA04.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.A03.A00 = (long) (1.0E9f / f);
                com.facebook.ads.redexgen.core.C4P.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A05 != null) {
            this.A05.A0I();
        }
        A1R();
        this.A0F = false;
        if (this.A06 != null) {
            this.A06.A1Q(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && this.A03 != null) {
            this.A03.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float vScroll;
        float axisValue;
        if (this.A06 == null || this.A0I) {
            return false;
        }
        int action = motionEvent.getAction();
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A19;
        strArr2[4] = "SqJdYhJCWRyNUdRTYMkhoX0xKlvJTIzq";
        strArr2[5] = "dLZEV46oohOd8c5dsstKZ2mmKWuZBEje";
        if (action == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A21()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.A06.A20()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.A06.A21()) {
                    vScroll = -axisValue;
                    axisValue = 0.0f;
                } else if (this.A06.A20()) {
                    vScroll = 0.0f;
                } else {
                    vScroll = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                axisValue = 0.0f;
            }
            if (vScroll != 0.0f || axisValue != 0.0f) {
                float hScroll = this.A0L;
                A13((int) (hScroll * axisValue), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        }
        if (this.A06 == null) {
            return false;
        }
        boolean zA20 = this.A06.A20();
        boolean startScroll = this.A06.A21();
        if (this.A0Y == null) {
            this.A0Y = android.view.VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                boolean canScrollHorizontally = this.A0n;
                if (canScrollHorizontally) {
                    this.A0n = false;
                }
                this.A0V = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.A0S = x;
                this.A0Q = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.A0T = y;
                this.A0R = y;
                if (this.A0W == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    java.lang.String[] strArr = A19;
                    if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                        java.lang.String[] strArr2 = A19;
                        strArr2[4] = "M5UY6PcxpnTLVPVued5fx0ZBKGPv0DD6";
                        strArr2[5] = "epX9q1DqtqLsT3WNVlKQ1OkRKfkr8qoW";
                        setScrollState(1);
                    } else {
                        java.lang.String[] strArr3 = A19;
                        strArr3[3] = "mz0Spg27ESm6n2CBfiNuhIq158jNl3XC";
                        strArr3[2] = "LXDJrUlN0pxLgDChp5qc6Quk8NcN491z";
                        setScrollState(1);
                    }
                }
                int[] iArr = this.A15;
                this.A15[1] = 0;
                iArr[0] = 0;
                int i = 0;
                if (zA20) {
                    i = 0 | 1;
                }
                if (startScroll) {
                    i |= 2;
                }
                A1s(i, 0);
                break;
            case 1:
                this.A0Y.clear();
                A1X(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                if (iFindPointerIndex >= 0) {
                    int index = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.A0W != 1) {
                        int i2 = index - this.A0Q;
                        int dy = y2 - this.A0R;
                        int dx = 0;
                        if (zA20) {
                            int x2 = java.lang.Math.abs(i2);
                            int actionIndex2 = this.A0X;
                            if (A19[1].charAt(14) != '5') {
                                throw new java.lang.RuntimeException();
                            }
                            A19[1] = "KTspDQ6S4I31ss5nDId9o94814z1kYXz";
                            if (x2 > actionIndex2) {
                                this.A0S = index;
                                dx = 1;
                            }
                        }
                        if (startScroll && java.lang.Math.abs(dy) > this.A0X) {
                            this.A0T = y2;
                            dx = 1;
                        }
                        if (dx != 0) {
                            setScrollState(1);
                        }
                    }
                } else {
                    android.util.Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                    return false;
                }
                break;
            case 3:
                A0J();
                break;
            case 5:
                this.A0V = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.A0S = x3;
                this.A0Q = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.A0T = y3;
                this.A0R = y3;
                break;
            case 6:
                A0n(motionEvent);
                break;
        }
        return this.A0W == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.facebook.ads.redexgen.core.AbstractC03852q.A01(A0I(1330, 11, 34));
        A0Y();
        com.facebook.ads.redexgen.core.AbstractC03852q.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A06 == null) {
            A1a(i, i2);
            return;
        }
        boolean z = this.A06.A06;
        java.lang.String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A19;
        strArr2[3] = "7ZSgCyrANqbSR0bOMUGXtewOYYl5EtQ7";
        strArr2[2] = "EtNqJr4QhL0ASxhb1XseUjRgOzTVtavV";
        int heightMode = 0;
        if (z) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int widthMode = android.view.View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && widthMode == 1073741824) {
                heightMode = 1;
            }
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            if (heightMode != 0 || this.A04 == null) {
                return;
            }
            int widthMode2 = this.A0s.A04;
            if (widthMode2 == 1) {
                A0L();
            }
            this.A06.A11(i, i2);
            this.A0s.A0A = true;
            A0M();
            this.A06.A12(i, i2);
            if (this.A06.A1z()) {
                com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o = this.A06;
                int widthMode3 = getMeasuredWidth();
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(widthMode3, 1073741824);
                int widthMode4 = getMeasuredHeight();
                abstractC04344o.A11(iMakeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(widthMode4, 1073741824));
                this.A0s.A0A = true;
                A0M();
                if (A19[1].charAt(14) != '5') {
                    this.A06.A12(i, i2);
                    return;
                }
                java.lang.String[] strArr3 = A19;
                strArr3[3] = "2scJF4Z4oabFWuCQusikCL010xDMrwfy";
                strArr3[2] = "adt4S0RTiAMMvoy66yYvZbK2iUPJlD04";
                this.A06.A12(i, i2);
                return;
            }
            return;
        }
        if (this.A0E) {
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            return;
        }
        if (this.A0A) {
            A1J();
            A1K();
            A0P();
            A1L();
            if (this.A0s.A0B) {
                this.A0s.A09 = true;
            } else {
                this.A00.A07();
                this.A0s.A09 = false;
            }
            this.A0A = false;
            A1n(false);
        } else if (this.A0s.A0B) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.A04 != null) {
            this.A0s.A03 = this.A04.A0E();
        } else {
            this.A0s.A03 = 0;
        }
        A1J();
        this.A06.A1J(this.A0r, this.A0s, i, i2);
        A1n(false);
        this.A0s.A09 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        if (A1q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.facebook.ads.internal.util.parcelable.WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        android.os.Parcelable state = ((com.facebook.ads.internal.util.parcelable.WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.A0j = (com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState) state;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1s(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState recyclerView$SavedState = new com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState(super.onSaveInstanceState());
        com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState state2 = this.A0j;
            recyclerView$SavedState.A03(state2);
        } else if (this.A06 != null) {
            recyclerView$SavedState.A00 = this.A06.A1l();
        } else {
            recyclerView$SavedState.A00 = null;
        }
        return new com.facebook.ads.internal.util.parcelable.WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.A0I || this.A0n) {
            return false;
        }
        if (A14(motionEvent)) {
            A0J();
            return true;
        }
        if (this.A06 == null) {
            return false;
        }
        boolean zA20 = this.A06.A20();
        boolean eventAddedToVelocityTracker = this.A06.A21();
        if (this.A0Y == null) {
            this.A0Y = android.view.VelocityTracker.obtain();
        }
        boolean canScrollVertically = false;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.A15;
            this.A15[1] = 0;
            iArr[0] = 0;
        }
        float f3 = this.A15[0];
        if (A19[1].charAt(14) == '5') {
            java.lang.String[] strArr = A19;
            strArr[4] = "SmtdwAgCAQ3d1YsOl1YESVhzKEqu7eKK";
            strArr[5] = "J6uBjvS6jISF4fo0G11W738KKcsSrsAN";
            motionEventObtain.offsetLocation(f3, this.A15[1]);
            switch (actionMasked) {
                case 0:
                    this.A0V = motionEvent.getPointerId(0);
                    int dy = (int) (motionEvent.getX() + 0.5f);
                    this.A0S = dy;
                    this.A0Q = dy;
                    int dx = (int) (motionEvent.getY() + 0.5f);
                    this.A0T = dx;
                    this.A0R = dx;
                    int nestedScrollAxis = 0;
                    if (zA20) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (eventAddedToVelocityTracker) {
                        nestedScrollAxis |= 2;
                    }
                    A1s(nestedScrollAxis, 0);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 1:
                    this.A0Y.addMovement(motionEventObtain);
                    canScrollVertically = true;
                    this.A0Y.computeCurrentVelocity(1000, this.A0x);
                    if (zA20) {
                        f = -this.A0Y.getXVelocity(this.A0V);
                    } else {
                        f = 0.0f;
                    }
                    if (eventAddedToVelocityTracker) {
                        f2 = -this.A0Y.getYVelocity(this.A0V);
                    } else {
                        f2 = 0.0f;
                    }
                    if (A19[1].charAt(14) == '5') {
                        java.lang.String[] strArr2 = A19;
                        strArr2[0] = "jpSzY3cN6Yd9mC426DHJqMOwyRQLyhoD";
                        strArr2[6] = "NqO1hqm0aSOLr2VmuYam7NnyHk2GnoAg";
                        if ((f == 0.0f && f2 == 0.0f) || !A12((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        A0T();
                        if (!canScrollVertically) {
                            this.A0Y.addMovement(motionEventObtain);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    break;
                case 2:
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                    if (iFindPointerIndex < 0) {
                        android.util.Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                        return false;
                    }
                    int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int actionIndex2 = this.A0S - x;
                    int dy2 = this.A0T - y;
                    if (A1u(actionIndex2, dy2, this.A16, this.A17, 0)) {
                        actionIndex2 -= this.A16[0];
                        dy2 -= this.A16[1];
                        motionEventObtain.offsetLocation(this.A17[0], this.A17[1]);
                        int[] iArr2 = this.A15;
                        iArr2[0] = iArr2[0] + this.A17[0];
                        int[] iArr3 = this.A15;
                        iArr3[1] = iArr3[1] + this.A17[1];
                    }
                    if (this.A0W != 1) {
                        boolean z = false;
                        if (zA20 && java.lang.Math.abs(actionIndex2) > this.A0X) {
                            if (actionIndex2 > 0) {
                                actionIndex2 -= this.A0X;
                            } else {
                                actionIndex2 += this.A0X;
                            }
                            z = true;
                        }
                        if (eventAddedToVelocityTracker && java.lang.Math.abs(dy2) > this.A0X) {
                            if (dy2 > 0) {
                                dy2 -= this.A0X;
                            } else {
                                dy2 += this.A0X;
                            }
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    if (this.A0W == 1) {
                        this.A0S = x - this.A17[0];
                        this.A0T = y - this.A17[1];
                        if (A13(zA20 ? actionIndex2 : 0, eventAddedToVelocityTracker ? dy2 : 0, motionEventObtain)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (this.A03 != null && (actionIndex2 != 0 || dy2 != 0)) {
                            this.A03.A0B(this, actionIndex2, dy2);
                        }
                    }
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 3:
                    A0J();
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 4:
                default:
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 5:
                    this.A0V = motionEvent.getPointerId(actionIndex);
                    int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0S = x2;
                    this.A0Q = x2;
                    int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0T = y2;
                    this.A0R = y2;
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 6:
                    A0n(motionEvent);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View view, boolean z) {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = A0F(view);
        if (anonymousClass56A0F != null) {
            if (anonymousClass56A0F.A0c()) {
                anonymousClass56A0F.A0P();
            } else if (!anonymousClass56A0F.A0f()) {
                throw new java.lang.IllegalArgumentException(A0I(219, 75, 84) + anonymousClass56A0F + A1H());
            }
        }
        view.clearAnimation();
        A1e(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.A06.A1b(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        return this.A06.A1Z(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC04384s> arrayList = this.A13;
            int i2 = A19[7].length();
            if (i2 != 1) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A19;
            strArr[3] = "ALuvCB3Uxfwb6USvRsTQeejOaKQGJDVI";
            strArr[2] = "eH5kVfmfggziqkhtmDEzLdVkGL1u4682";
            arrayList.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0) {
            boolean z = this.A0I;
            java.lang.String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[0] = "DQNG7v2eQntUoXmxdvl3JfddX2pbwEnJ";
            strArr2[6] = "9dlsUD8r2K7vneFeWRut3F36hDYz7ROo";
            if (!z) {
                super.requestLayout();
                return;
            }
        }
        this.A0J = true;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        if (this.A06 == null) {
            android.util.Log.e(A0I(1370, 12, 39), A0I(834, 90, 48));
            return;
        }
        if (this.A0I) {
            return;
        }
        boolean zA20 = this.A06.A20();
        boolean zA21 = this.A06.A21();
        if (zA20 || zA21) {
            java.lang.String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            A19[1] = "hukuWuX8c8ikYD5Zh6axQSjgAUqwSCKd";
            if (!zA20) {
                i = 0;
            }
            A13(i, zA21 ? i2 : 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        android.util.Log.w(A0I(1370, 12, 39), A0I(1382, 93, 57));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(com.facebook.ads.redexgen.core.C1249ag c1249ag) {
        this.A09 = c1249ag;
        com.facebook.ads.redexgen.core.C3T.A0B(this, this.A09);
    }

    public void setAdapter(com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c) {
        setLayoutFrozen(false);
        A0q(abstractC04224c, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(com.facebook.ads.redexgen.core.InterfaceC04254f interfaceC04254f) {
        if (interfaceC04254f == null) {
            return;
        }
        this.A0e = interfaceC04254f;
        setChildrenDrawingOrderEnabled(0 != 0);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0B) {
            A0f();
        }
        this.A0B = z;
        super.setClipToPadding(z);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(com.facebook.ads.redexgen.core.AbstractC04304k abstractC04304k) {
        if (this.A05 != null) {
            this.A05.A0I();
            this.A05.A0B(null);
        }
        this.A05 = abstractC04304k;
        if (this.A05 != null) {
            this.A05.A0B(this.A0f);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.A0r.A0Q(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0I) {
            A1l(A0I(1021, 42, 1));
            if (!z) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = android.os.SystemClock.uptimeMillis();
            onTouchEvent(android.view.MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            java.lang.String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A19;
            strArr2[0] = "JdEcOawzhGoMi7SJTaKu9jXFd9l8G1Qn";
            strArr2[6] = "ngxMbpV1qHapbkXJW6JrwI2187obRSoG";
            this.A0I = true;
            this.A0n = true;
            A1R();
        }
    }

    public void setLayoutManager(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        if (abstractC04344o == this.A06) {
            return;
        }
        A1R();
        if (this.A06 != null) {
            if (this.A05 != null) {
                this.A05.A0I();
            }
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1Q(this, this.A0r);
            }
            this.A06.A1P(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = abstractC04344o;
        if (abstractC04344o != null) {
            if (abstractC04344o.A03 == null) {
                this.A06.A1P(this);
                if (this.A0F) {
                    this.A06.A1N(this);
                }
            } else {
                throw new java.lang.IllegalArgumentException(A0I(1109, 14, 42) + abstractC04344o + A0I(59, 39, 124) + abstractC04344o.A03.A1H());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A04(z);
    }

    public void setOnFlingListener(com.facebook.ads.redexgen.core.AbstractC04374r abstractC04374r) {
        this.A0g = abstractC04374r;
    }

    @java.lang.Deprecated
    public void setOnScrollListener(com.facebook.ads.redexgen.core.AbstractC04394t abstractC04394t) {
        this.A0i = abstractC04394t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(com.facebook.ads.redexgen.core.C4v c4v) {
        this.A0r.A0V(c4v);
    }

    public void setRecyclerListener(com.facebook.ads.redexgen.core.InterfaceC04424x interfaceC04424x) {
        this.A07 = interfaceC04424x;
    }

    public void setScrollState(int i) {
        if (i == this.A0W) {
            return;
        }
        this.A0W = i;
        if (i != 2) {
            A0V();
        }
        A0k(i);
    }

    public void setScrollingTouchSlop(int i) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                android.util.Log.w(A0I(1370, 12, 39), A0I(1994, 47, 98) + i + A0I(org.objectweb.asm.Opcodes.IFNULL, 21, 88));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(com.facebook.ads.redexgen.core.AnonymousClass54 anonymousClass54) {
        this.A0r.A0W(anonymousClass54);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0A(i);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.core.C3A
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
