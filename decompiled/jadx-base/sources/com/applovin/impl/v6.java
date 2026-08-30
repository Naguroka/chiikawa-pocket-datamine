package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1421a;
    private final java.lang.Object b;
    private java.lang.String c;
    private java.lang.String d;

    public v6(java.lang.Object obj, long j) {
        this.b = obj;
        this.f1421a = j;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.d = "AppLovin";
        } else if (obj instanceof com.applovin.impl.fe) {
            com.applovin.impl.fe feVar = (com.applovin.impl.fe) obj;
            this.c = feVar.getFormat().getLabel();
            this.d = feVar.getNetworkName();
        }
    }

    public java.lang.String c() {
        java.lang.String str = this.c;
        return str != null ? str : "Unknown";
    }

    public java.lang.String d() {
        java.lang.String str = this.d;
        return str != null ? str : "Unknown";
    }

    public java.lang.Object a() {
        return this.b;
    }

    public long b() {
        return this.f1421a;
    }
}
