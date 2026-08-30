package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxMediatedNetworkInfoImpl implements com.applovin.mediation.MaxMediatedNetworkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f1026a;

    public MaxMediatedNetworkInfoImpl(org.json.JSONObject jSONObject) {
        this.f1026a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public java.lang.String getAdapterClassName() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.f1026a, "class", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public java.lang.String getAdapterVersion() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.f1026a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public java.lang.String getName() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.f1026a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public java.lang.String getSdkVersion() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.f1026a, "sdk_version", "");
    }

    public java.lang.String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
