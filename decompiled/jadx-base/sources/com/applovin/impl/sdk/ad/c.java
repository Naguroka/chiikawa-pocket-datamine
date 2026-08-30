package com.applovin.impl.sdk.ad;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.applovin.impl.sdk.ad.AppLovinAdImpl {
    private com.applovin.sdk.AppLovinAd f;
    private final com.applovin.impl.h0 g;

    private com.applovin.sdk.AppLovinAd d() {
        return (com.applovin.sdk.AppLovinAd) this.sdk.h().f(this.g);
    }

    private java.lang.String e() {
        com.applovin.impl.h0 adZone = getAdZone();
        if (adZone == null || adZone.i()) {
            return null;
        }
        return adZone.e();
    }

    public void a(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.f = appLovinAd;
    }

    public com.applovin.sdk.AppLovinAd c() {
        com.applovin.sdk.AppLovinAd appLovinAd = this.f;
        return appLovinAd != null ? appLovinAd : d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.sdk.ad.c.class != obj.getClass()) {
            return false;
        }
        com.applovin.sdk.AppLovinAd appLovinAdC = c();
        return appLovinAdC != null ? appLovinAdC.equals(obj) : super.equals(obj);
    }

    public com.applovin.sdk.AppLovinAd f() {
        return this.f;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public com.applovin.impl.lg getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        com.applovin.sdk.AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof com.applovin.impl.sdk.ad.AppLovinAdImpl) {
            return ((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAdC).getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        com.applovin.sdk.AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof com.applovin.impl.sdk.ad.AppLovinAdImpl) {
            return ((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAdC).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public android.os.Bundle getDirectDownloadParameters() {
        return new android.os.Bundle();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public java.lang.String getDirectDownloadToken() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.lang.String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.lang.String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.util.List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public org.json.JSONObject getOriginalFullResponse() {
        com.applovin.sdk.AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof com.applovin.impl.sdk.ad.AppLovinAdImpl) {
            return ((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAdC).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public com.applovin.sdk.AppLovinAdSize getSize() {
        return getAdZone().f();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public com.applovin.sdk.AppLovinAdType getType() {
        return getAdZone().g();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public java.lang.String getZoneId() {
        if (this.g.i()) {
            return null;
        }
        return this.g.e();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        com.applovin.sdk.AppLovinAd appLovinAdC = c();
        return appLovinAdC != null ? appLovinAdC.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isExpired() {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) c();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isVideoAd() {
        com.applovin.sdk.AppLovinAd appLovinAdC = c();
        return (appLovinAdC instanceof com.applovin.impl.sdk.ad.AppLovinAdImpl) && ((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAdC).isVideoAd();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public java.lang.String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + e() + "'}";
    }

    public c(com.applovin.impl.h0 h0Var, com.applovin.impl.sdk.j jVar) {
        super(new org.json.JSONObject(), new org.json.JSONObject(), jVar);
        this.g = h0Var;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public com.applovin.impl.h0 getAdZone() {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) c();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.g;
    }
}
