package com.applovin.impl.sdk.ad;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppLovinAdImpl extends com.applovin.impl.sdk.AppLovinAdBase implements com.applovin.sdk.AppLovinAd, com.applovin.impl.i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f1277a;
    private com.applovin.impl.h0 b;
    private boolean c;
    private com.applovin.impl.sdk.ad.c d;

    protected AppLovinAdImpl(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f1277a = new android.os.Bundle();
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((java.lang.Long) this.sdk.a(com.applovin.impl.sj.d1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == com.applovin.sdk.AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(java.lang.Object obj) {
        com.applovin.sdk.AppLovinAd appLovinAdC;
        if ((obj instanceof com.applovin.impl.sdk.ad.c) && (appLovinAdC = ((com.applovin.impl.sdk.ad.c) obj).c()) != null) {
            obj = appLovinAdC;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((com.applovin.impl.sdk.ad.AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public com.applovin.impl.sdk.ad.c getDummyAd() {
        return this.d;
    }

    public android.os.Bundle getMAXAdValues() {
        return this.f1277a;
    }

    public abstract org.json.JSONObject getOriginalFullResponse();

    public java.lang.String getRawFullResponse() {
        java.lang.String string;
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public com.applovin.sdk.AppLovinAdSize getSize() {
        return com.applovin.sdk.AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.i8
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (java.lang.System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public com.applovin.sdk.AppLovinAdType getType() {
        return com.applovin.sdk.AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public java.lang.String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", java.lang.Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.I();
        if (!com.applovin.impl.sdk.n.a()) {
            return false;
        }
        this.sdk.I().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.c;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", java.lang.Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(com.applovin.impl.sdk.ad.c cVar) {
        this.d = cVar;
    }

    @Override // com.applovin.impl.i8
    public void setExpired() {
        this.c = true;
    }

    public void setHasShown(boolean z) {
        try {
            com.applovin.impl.tl tlVar = this.synchronizedAdObject;
            if (tlVar != null) {
                tlVar.a("shown", (java.lang.Object) java.lang.Boolean.valueOf(z));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setMaxAdValue(java.lang.String str, java.lang.Object obj) {
        com.applovin.impl.sdk.utils.BundleUtils.put(str, obj, this.f1277a);
    }

    public java.lang.String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }

    public com.applovin.impl.h0 getAdZone() {
        com.applovin.impl.h0 h0Var = this.b;
        if (h0Var != null) {
            if (h0Var.f() != null && this.b.g() != null) {
                return this.b;
            }
            if (getSize() == null && getType() == null) {
                return this.b;
            }
        }
        com.applovin.impl.h0 h0VarA = com.applovin.impl.h0.a(getSize(), getType(), getStringFromFullResponse(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.b = h0VarA;
        return h0VarA;
    }
}
