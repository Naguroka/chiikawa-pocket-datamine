package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0766Is implements com.facebook.ads.redexgen.core.SharedViewpointManager {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public com.facebook.ads.redexgen.core.InterfaceC1422dj A00;
    public com.facebook.ads.redexgen.core.C1409dV A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1432dv A03;
    public final com.facebook.ads.redexgen.core.InterfaceC1423dk A04;
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A05;
    public final java.util.LinkedHashMap<java.lang.Integer, java.lang.Runnable> A06 = new java.util.LinkedHashMap<>();
    public final com.facebook.ads.redexgen.core.InterfaceC1422dj A02 = new com.facebook.ads.redexgen.core.JB(this);

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-28};
    }

    static {
        A04();
    }

    public C0766Is(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.InterfaceC1432dv interfaceC1432dv, com.facebook.ads.redexgen.core.InterfaceC1423dk interfaceC1423dk) {
        this.A05 = viewpointQeConfig;
        this.A03 = interfaceC1432dv;
        this.A04 = interfaceC1423dk;
    }

    public static com.facebook.ads.redexgen.core.C0766Is A01() {
        return new com.facebook.ads.redexgen.core.C0766Is(new com.facebook.ads.redexgen.core.ViewpointQeConfig(), new com.facebook.ads.redexgen.core.JS(), null);
    }

    private void A05(com.facebook.ads.redexgen.core.AbstractC1425dm abstractC1425dm, com.facebook.ads.redexgen.core.InterfaceC1428dq interfaceC1428dq, com.facebook.ads.redexgen.core.IA ia) {
        this.A01 = com.facebook.ads.redexgen.core.C1409dV.A00(this.A05, abstractC1425dm, interfaceC1428dq, ia);
        if (0 != 0) {
            this.A01.A01(null);
        }
        this.A01.A02(this.A02);
        java.lang.String[] strArr = A08;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        A08[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C1430dt c1430dt) {
        com.facebook.ads.redexgen.core.C1409dV c1409dV = this.A01;
        if (c1409dV != null && dspViewableNode != null) {
            if (this.A05.A00 && c1430dt != null) {
                c1409dV.A04(dspViewableNode, c1430dt);
            } else {
                c1409dV.A03(dspViewableNode);
            }
        }
    }

    private void A07(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C1430dt c1430dt, com.facebook.ads.redexgen.core.Cdo cdo) {
        com.facebook.ads.redexgen.core.C1409dV c1409dV = this.A01;
        if (c1409dV != null && dspViewableNode != null && cdo != null) {
            if (this.A05.A00 && c1430dt != null) {
                cdo.A00 = dspViewableNode.hashCode() + A02(0, 1, 27) + cdo.A05 + c1430dt;
                c1409dV.A05(dspViewableNode, c1430dt, cdo);
            } else {
                c1409dV.A06(dspViewableNode, cdo);
            }
        }
    }

    public final void A08(android.view.View view) {
        A06(view != null ? com.facebook.ads.redexgen.core.ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(android.view.View view, com.facebook.ads.redexgen.core.Cdo<?, ?> cdo) {
        A07(view != null ? com.facebook.ads.redexgen.core.ViewpointViewNode.A00(view) : null, null, cdo);
    }

    public final void A0A(com.facebook.ads.redexgen.core.AbstractC1425dm abstractC1425dm, android.view.View view) {
        if (abstractC1425dm != null && view != null) {
            A05(abstractC1425dm, new com.facebook.ads.redexgen.core.JD(view, this.A03), new com.facebook.ads.redexgen.core.C04916z(null));
        }
    }
}
