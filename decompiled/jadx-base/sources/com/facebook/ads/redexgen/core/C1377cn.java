package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1377cn implements com.facebook.ads.redexgen.core.InterfaceC03280k {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1199Zs A00;
    public final /* synthetic */ java.lang.String A01;
    public final /* synthetic */ org.json.JSONObject A02;

    public C1377cn(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        this.A02 = jSONObject;
        this.A00 = c1199Zs;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final java.lang.String A6r() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final java.util.Collection<java.lang.String> A7B() {
        return com.facebook.ads.redexgen.core.AbstractC03290l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final com.facebook.ads.redexgen.core.EnumC03270j A7c() {
        return com.facebook.ads.redexgen.core.AbstractC03290l.A00(this.A02);
    }
}
