package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1427dp<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final java.lang.String A04;
    public final java.lang.String A05;
    public java.util.List<com.facebook.ads.redexgen.core.InterfaceC1429dr<ModelType, StateType>> A01 = null;
    public com.facebook.ads.redexgen.core.Cdo A00 = com.facebook.ads.redexgen.core.Cdo.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1427dp(ModelType model, StateType state, java.lang.String str) {
        this.A02 = model;
        this.A03 = state;
        this.A05 = str;
        this.A04 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final com.facebook.ads.redexgen.core.C1427dp<ModelType, StateType> A05(com.facebook.ads.redexgen.core.InterfaceC1429dr<ModelType, StateType> interfaceC1429dr) {
        if (this.A01 == null) {
            this.A01 = new java.util.ArrayList();
        }
        this.A01.add(interfaceC1429dr);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final com.facebook.ads.redexgen.core.Cdo<ModelType, StateType> A06() {
        return new com.facebook.ads.redexgen.core.Cdo<>(this);
    }
}
