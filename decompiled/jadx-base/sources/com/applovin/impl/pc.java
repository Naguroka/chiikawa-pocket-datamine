package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.StringBuilder f1143a = new java.lang.StringBuilder();

    public java.lang.String toString() {
        return this.f1143a.toString();
    }

    public com.applovin.impl.pc a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z = bVar instanceof com.applovin.impl.aq;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", java.lang.Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        java.lang.String dspName = bVar.getDspName();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((com.applovin.impl.aq) bVar).t1());
        }
        return this;
    }

    public com.applovin.impl.pc b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.f0()).a("close_style", bVar.n()).a("close_delay_graphic", java.lang.Long.valueOf(bVar.p()), androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.l1().substring(0, java.lang.Math.min(aVar.l1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", java.lang.Long.valueOf(bVar.m0()), androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS).a("skip_style", bVar.d0()).a("Streaming", java.lang.Boolean.valueOf(bVar.K0())).a("Video Location", bVar.Q()).a("video_button_properties", bVar.k0());
        }
        return this;
    }

    public com.applovin.impl.pc b(java.lang.String str) {
        this.f1143a.append(str);
        return this;
    }

    public com.applovin.impl.pc a(com.applovin.adview.AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", java.lang.Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", com.applovin.impl.zq.a(appLovinAdView.getVisibility()));
    }

    public com.applovin.impl.pc a(android.os.Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (java.lang.String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }

    public com.applovin.impl.pc a() {
        this.f1143a.append("\n========================================");
        return this;
    }

    public com.applovin.impl.pc a(com.applovin.impl.fe feVar) {
        return a(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_NETWORK, feVar.c()).a("Adapter Version", feVar.z()).a("Format", feVar.getFormat().getLabel()).a("Ad Unit ID", feVar.getAdUnitId()).a("Placement", feVar.getPlacement()).a("Network Placement", feVar.T()).a("Serve ID", feVar.R()).a("Creative ID", com.applovin.impl.sdk.utils.StringUtils.isValidString(feVar.getCreativeId()) ? feVar.getCreativeId() : "None").a("Ad Review Creative ID", com.applovin.impl.sdk.utils.StringUtils.isValidString(feVar.getAdReviewCreativeId()) ? feVar.getAdReviewCreativeId() : "None").a("Ad Domain", com.applovin.impl.sdk.utils.StringUtils.isValidString(feVar.v()) ? feVar.v() : "None").a("DSP Name", com.applovin.impl.sdk.utils.StringUtils.isValidString(feVar.getDspName()) ? feVar.getDspName() : "None").a("DSP ID", com.applovin.impl.sdk.utils.StringUtils.isValidString(feVar.getDspId()) ? feVar.getDspId() : "None").a("Server Parameters", feVar.l());
    }

    public com.applovin.impl.pc a(com.applovin.impl.sdk.j jVar) {
        return a("Muted", java.lang.Boolean.valueOf(jVar.f0().isMuted()));
    }

    public com.applovin.impl.pc a(java.lang.String str) {
        this.f1143a.append("\n").append(str);
        return this;
    }

    public com.applovin.impl.pc a(java.lang.String str, java.lang.Object obj) {
        return a(str, obj, "");
    }

    public com.applovin.impl.pc a(java.lang.String str, java.lang.Object obj, java.lang.String str2) {
        this.f1143a.append("\n").append(str).append(": ").append(obj).append(str2);
        return this;
    }
}
