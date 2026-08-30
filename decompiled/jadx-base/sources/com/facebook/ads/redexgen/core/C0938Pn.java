package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0938Pn {
    public final java.lang.String A00;
    public final java.util.ArrayList<java.lang.String> A01;
    public final java.util.ArrayList<java.lang.String> A02;
    public final java.util.ArrayList<java.lang.String> A03;
    public final org.json.JSONObject A04;
    public final boolean A05;

    public C0938Pn(org.json.JSONObject jSONObject, java.lang.String str, java.util.ArrayList<java.lang.String> imageUrls, java.util.ArrayList<java.lang.String> videoUrls, java.util.ArrayList<java.lang.String> fileUrls, boolean z) {
        this.A04 = jSONObject;
        this.A00 = str;
        this.A02 = imageUrls;
        this.A03 = videoUrls;
        this.A01 = fileUrls;
        this.A05 = z;
    }
}
