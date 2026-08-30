package com.json.mediationsdk.adunit.adapter.utility;

/* JADX INFO: loaded from: classes5.dex */
public class AdInfo {
    private final com.json.mediationsdk.impressionData.ImpressionData mImpressionData;
    private final com.json.wl mLoadArmData;

    public AdInfo() {
        this.mImpressionData = null;
        this.mLoadArmData = null;
    }

    public AdInfo(com.json.mediationsdk.impressionData.ImpressionData impressionData) {
        this.mImpressionData = impressionData;
        this.mLoadArmData = null;
    }

    public AdInfo(com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl wlVar) {
        this.mImpressionData = impressionData;
        this.mLoadArmData = wlVar;
    }

    public java.lang.String getAb() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAb() == null) ? "" : this.mImpressionData.getAb();
    }

    public java.lang.String getAdNetwork() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAdNetwork() == null) ? "" : this.mImpressionData.getAdNetwork();
    }

    public java.lang.String getAdUnit() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAdUnit() == null) ? "" : this.mImpressionData.getAdUnit();
    }

    public java.lang.String getAuctionId() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAuctionId() == null) ? "" : this.mImpressionData.getAuctionId();
    }

    public java.lang.String getCountry() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getCountry() == null) ? "" : this.mImpressionData.getCountry();
    }

    public java.lang.String getEncryptedCPM() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getEncryptedCPM() == null) ? "" : this.mImpressionData.getEncryptedCPM();
    }

    public java.lang.String getInstanceId() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getInstanceId() == null) ? "" : this.mImpressionData.getInstanceId();
    }

    public java.lang.String getInstanceName() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getInstanceName() == null) ? "" : this.mImpressionData.getInstanceName();
    }

    public java.lang.Double getLifetimeRevenue() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getLifetimeRevenue() == null) ? java.lang.Double.valueOf(0.0d) : this.mImpressionData.getLifetimeRevenue();
    }

    public java.lang.String getPrecision() {
        com.json.wl wlVar = this.mLoadArmData;
        if (wlVar != null) {
            return wlVar.c();
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getPrecision() == null) ? "" : this.mImpressionData.getPrecision();
    }

    public java.lang.Double getRevenue() {
        com.json.wl wlVar = this.mLoadArmData;
        if (wlVar != null) {
            return java.lang.Double.valueOf(wlVar.d());
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getRevenue() == null) ? java.lang.Double.valueOf(0.0d) : this.mImpressionData.getRevenue();
    }

    public java.lang.String getSegmentName() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getSegmentName() == null) ? "" : this.mImpressionData.getSegmentName();
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("adUnit", getAdUnit());
            jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, getCountry());
            jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_ABTEST, getAb());
            jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, getSegmentName());
            jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_LIFETIME_REVENUE, getLifetimeRevenue());
            jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, getEncryptedCPM());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        return jSONObject.toString();
    }
}
