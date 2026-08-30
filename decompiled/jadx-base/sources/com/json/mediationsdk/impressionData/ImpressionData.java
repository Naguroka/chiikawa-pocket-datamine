package com.json.mediationsdk.impressionData;

/* JADX INFO: loaded from: classes5.dex */
public class ImpressionData {
    public static final java.lang.String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final java.lang.String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final java.lang.String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final java.lang.String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final java.lang.String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final java.lang.String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final java.lang.String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final java.lang.String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final java.lang.String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final java.lang.String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final java.lang.String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final java.lang.String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final java.lang.String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final java.lang.String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final java.lang.String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final java.lang.String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final java.lang.String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f2979a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private java.lang.String k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.Double n;
    private java.lang.String o;
    private java.lang.Double p;
    private java.lang.String q;
    private java.lang.String r;
    private java.text.DecimalFormat s = new java.text.DecimalFormat("#.#####");

    public ImpressionData(com.json.mediationsdk.impressionData.ImpressionData impressionData) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.f2979a = impressionData.f2979a;
        this.b = impressionData.b;
        this.c = impressionData.c;
        this.d = impressionData.d;
        this.e = impressionData.e;
        this.f = impressionData.f;
        this.g = impressionData.g;
        this.h = impressionData.h;
        this.i = impressionData.i;
        this.j = impressionData.j;
        this.k = impressionData.k;
        this.l = impressionData.l;
        this.m = impressionData.m;
        this.o = impressionData.o;
        this.q = impressionData.q;
        this.p = impressionData.p;
        this.n = impressionData.n;
        this.r = impressionData.r;
    }

    public ImpressionData(org.json.JSONObject jSONObject) {
        java.lang.Double dValueOf = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        if (jSONObject != null) {
            try {
                this.f2979a = jSONObject;
                this.b = jSONObject.optString("auctionId", null);
                this.c = jSONObject.optString("adUnit", null);
                this.d = jSONObject.optString(IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME, null);
                this.e = jSONObject.optString("mediationAdUnitId", null);
                this.f = jSONObject.optString(IMPRESSION_DATA_KEY_AD_FORMAT, null);
                this.g = jSONObject.optString(IMPRESSION_DATA_KEY_COUNTRY, null);
                this.h = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, null);
                this.i = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, null);
                this.j = jSONObject.optString("placement", null);
                this.k = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, null);
                this.l = jSONObject.optString("instanceName", null);
                this.m = jSONObject.optString("instanceId", null);
                this.o = jSONObject.optString("precision", null);
                this.q = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, null);
                this.r = jSONObject.optString(IMPRESSION_DATA_KEY_CREATIVE_ID, null);
                double dOptDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.p = java.lang.Double.isNaN(dOptDouble) ? null : java.lang.Double.valueOf(dOptDouble);
                double dOptDouble2 = jSONObject.optDouble("revenue");
                if (!java.lang.Double.isNaN(dOptDouble2)) {
                    dValueOf = java.lang.Double.valueOf(dOptDouble2);
                }
                this.n = dValueOf;
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public java.lang.String getAb() {
        return this.h;
    }

    public java.lang.String getAdFormat() {
        return this.f;
    }

    public java.lang.String getAdNetwork() {
        return this.k;
    }

    @java.lang.Deprecated
    public java.lang.String getAdUnit() {
        return this.c;
    }

    public org.json.JSONObject getAllData() {
        return this.f2979a;
    }

    public java.lang.String getAuctionId() {
        return this.b;
    }

    public java.lang.String getCountry() {
        return this.g;
    }

    public java.lang.String getCreativeId() {
        return this.r;
    }

    public java.lang.String getEncryptedCPM() {
        return this.q;
    }

    public java.lang.String getInstanceId() {
        return this.m;
    }

    public java.lang.String getInstanceName() {
        return this.l;
    }

    @java.lang.Deprecated
    public java.lang.Double getLifetimeRevenue() {
        return this.p;
    }

    public java.lang.String getMediationAdUnitId() {
        return this.e;
    }

    public java.lang.String getMediationAdUnitName() {
        return this.d;
    }

    public java.lang.String getPlacement() {
        return this.j;
    }

    public java.lang.String getPrecision() {
        return this.o;
    }

    public java.lang.Double getRevenue() {
        return this.n;
    }

    public java.lang.String getSegmentName() {
        return this.i;
    }

    public void replaceMacroForPlacementWithValue(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = this.j;
        if (str3 != null) {
            java.lang.String strReplace = str3.replace(str, str2);
            this.j = strReplace;
            org.json.JSONObject jSONObject = this.f2979a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", strReplace);
                } catch (org.json.JSONException e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("auctionId: '").append(this.b).append("', adUnit: '").append(this.c).append("', mediationAdUnitName: '").append(this.d).append("', mediationAdUnitId: '").append(this.e).append("', adFormat: '").append(this.f).append("', country: '").append(this.g).append("', ab: '").append(this.h).append("', segmentName: '").append(this.i).append("', placement: '").append(this.j).append("', adNetwork: '").append(this.k).append("', instanceName: '").append(this.l).append("', instanceId: '").append(this.m).append("', revenue: ");
        java.lang.Double d = this.n;
        java.lang.StringBuilder sbAppend2 = sbAppend.append(d == null ? null : this.s.format(d)).append(", precision: '").append(this.o).append("', lifetimeRevenue: ");
        java.lang.Double d2 = this.p;
        return sbAppend2.append(d2 != null ? this.s.format(d2) : null).append(", encryptedCPM: '").append(this.q).append("', creativeId: '").append(this.r).append('\'').toString();
    }
}
