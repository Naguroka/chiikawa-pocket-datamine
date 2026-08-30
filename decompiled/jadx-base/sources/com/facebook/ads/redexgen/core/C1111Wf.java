package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1111Wf implements com.facebook.ads.redexgen.core.InterfaceC1429dr<com.facebook.ads.redexgen.core.C0767It, com.facebook.ads.redexgen.core.C0772Iy> {
    public com.facebook.ads.redexgen.core.C1108Wc A00;

    public C1111Wf(com.facebook.ads.redexgen.core.C1108Wc c1108Wc) {
        this.A00 = c1108Wc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1429dr
    public final void A5y(com.facebook.ads.redexgen.core.Cdo<com.facebook.ads.redexgen.core.C0767It, com.facebook.ads.redexgen.core.C0772Iy> cdo, com.facebook.ads.redexgen.core.InterfaceC1417dd interfaceC1417dd) {
        switch (interfaceC1417dd.A8h(cdo)) {
            case A02:
            case A04:
                this.A00.A02(cdo, interfaceC1417dd);
                break;
        }
    }
}
