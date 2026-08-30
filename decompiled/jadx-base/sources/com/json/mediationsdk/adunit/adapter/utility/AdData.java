package com.json.mediationsdk.adunit.adapter.utility;

/* JADX INFO: loaded from: classes5.dex */
public class AdData {
    private final java.util.Map<java.lang.String, java.lang.Object> mAdUnitData;
    private final java.util.Map<java.lang.String, java.lang.Object> mConfiguration;
    private final java.lang.String mServerData;

    public AdData(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static com.json.mediationsdk.adunit.adapter.utility.AdData createAdDataForNetworkAdapter(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.lang.String str) {
        return createAdDataForNetworkAdapter(jSONObject, ad_unit, str, null);
    }

    public static com.json.mediationsdk.adunit.adapter.utility.AdData createAdDataForNetworkAdapter(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.lang.String str, com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("adUnit", ad_unit);
        if (str != null) {
            map.put("userId", str);
        }
        if (ironSourceBannerLayout != null) {
            map.put("bannerLayout", ironSourceBannerLayout);
        }
        return new com.json.mediationsdk.adunit.adapter.utility.AdData(null, com.json.hk.a(jSONObject), map);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public java.lang.Boolean getBoolean(java.lang.String str) {
        return (java.lang.Boolean) this.mConfiguration.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getConfiguration() {
        return this.mConfiguration;
    }

    public java.lang.Integer getInt(java.lang.String str) {
        return (java.lang.Integer) this.mConfiguration.get(str);
    }

    public java.lang.String getServerData() {
        return this.mServerData;
    }

    public java.lang.String getString(java.lang.String str) {
        return (java.lang.String) this.mConfiguration.get(str);
    }
}
