package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03370u {
    public static com.facebook.ads.redexgen.core.InterfaceC03320p A00;

    public final com.facebook.ads.redexgen.core.InterfaceC03320p A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.internal.protocol.AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (com.facebook.ads.redexgen.core.C03360t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new com.facebook.ads.redexgen.core.GL();
            case 2:
                if (com.facebook.ads.redexgen.core.C0762Im.A1H(c1199Zs)) {
                    return new com.facebook.ads.redexgen.core.GK();
                }
                return new com.facebook.ads.redexgen.core.GL();
            case 3:
                return new com.facebook.ads.redexgen.core.C1363cZ();
            case 4:
                return new com.facebook.ads.redexgen.core.C1358cU(c1199Zs);
            case 5:
                return new com.facebook.ads.redexgen.core.GJ(c1199Zs);
            case 6:
                return new com.facebook.ads.redexgen.core.C0692Fq();
            default:
                return null;
        }
    }
}
