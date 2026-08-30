package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1024Sv extends com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9O> {
    public static java.lang.String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9S A00;

    public C1024Sv(com.facebook.ads.redexgen.core.C9S c9s) {
        this.A00 = c9s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9O c9o) {
        int iA00 = c9o.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            int currentPositionMS2 = this.A00.A0C.getDuration();
            if (iA00 == currentPositionMS2) {
                int duration = this.A00.A0C.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        com.facebook.ads.redexgen.core.C9S c9s = this.A00;
        if (A01[5].length() == 7) {
            throw new java.lang.RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c9s.A0j(iA00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    public final java.lang.Class<com.facebook.ads.redexgen.core.C9O> A01() {
        return com.facebook.ads.redexgen.core.C9O.class;
    }
}
