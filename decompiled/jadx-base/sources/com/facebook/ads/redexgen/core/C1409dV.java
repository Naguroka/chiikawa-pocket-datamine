package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1409dV {
    public static com.facebook.ads.redexgen.core.C1409dV A03 = null;
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A00;
    public final com.facebook.ads.redexgen.core.ViewpointRegistry A01;
    public final com.facebook.ads.redexgen.core.C1419df A02;

    public C1409dV(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.AbstractC1425dm abstractC1425dm, com.facebook.ads.redexgen.core.C1419df c1419df, com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c1419df;
        abstractC1425dm.A02(new com.facebook.ads.redexgen.core.I2(c1419df));
    }

    public static com.facebook.ads.redexgen.core.C1409dV A00(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.AbstractC1425dm abstractC1425dm, com.facebook.ads.redexgen.core.InterfaceC1428dq interfaceC1428dq, com.facebook.ads.redexgen.core.IA ia) {
        com.facebook.ads.redexgen.core.C1409dV localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry = new com.facebook.ads.redexgen.core.ViewpointRegistry(viewpointQeConfig);
        return new com.facebook.ads.redexgen.core.C1409dV(viewpointQeConfig, abstractC1425dm, new com.facebook.ads.redexgen.core.C1419df(viewpointQeConfig, interfaceC1428dq, new com.facebook.ads.redexgen.core.C0784Jm(), ia, viewpointRegistry, new android.os.Handler(android.os.Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(com.facebook.ads.redexgen.core.InterfaceC1424dl interfaceC1424dl) {
        this.A02.A0B(interfaceC1424dl);
    }

    public final void A02(com.facebook.ads.redexgen.core.InterfaceC1422dj interfaceC1422dj) {
        this.A02.A0C(interfaceC1422dj);
    }

    public final void A03(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C1430dt c1430dt) {
        if (this.A00.A00 && c1430dt != null) {
            this.A01.A04(dspViewableNode, c1430dt);
        } else {
            this.A01.A03(dspViewableNode);
        }
    }

    public final void A05(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C1430dt c1430dt, com.facebook.ads.redexgen.core.Cdo cdo) {
        if (this.A00.A00 && c1430dt != null) {
            this.A01.A05(dspViewableNode, c1430dt, cdo);
        } else {
            this.A01.A06(dspViewableNode, cdo);
        }
    }

    public final void A06(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.Cdo cdo) {
        A05(dspViewableNode, null, cdo);
    }
}
