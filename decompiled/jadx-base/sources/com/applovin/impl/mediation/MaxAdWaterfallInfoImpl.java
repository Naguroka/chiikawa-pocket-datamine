package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdWaterfallInfoImpl implements com.applovin.mediation.MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.fe f1024a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.util.List d;
    private final long e;
    private final java.util.List f;
    private final java.lang.String g;

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public com.applovin.mediation.MaxAd getLoadedAd() {
        return this.f1024a;
    }

    public java.lang.String getMCode() {
        return this.g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public java.lang.String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public java.util.List<com.applovin.mediation.MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public java.util.List<java.lang.String> getPostbackUrls() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public java.lang.String getTestName() {
        return this.c;
    }

    public java.lang.String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.fe feVar, long j, java.util.List<com.applovin.mediation.MaxNetworkResponseInfo> list, java.lang.String str) {
        this(feVar, feVar.V(), feVar.W(), j, list, feVar.U(), str);
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.fe feVar, java.lang.String str, java.lang.String str2, long j, java.util.List<com.applovin.mediation.MaxNetworkResponseInfo> list, java.util.List<java.lang.String> list2, java.lang.String str3) {
        this.f1024a = feVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = j;
        this.f = list2;
        this.g = str3;
    }
}
