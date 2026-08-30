package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppLovinAdBase implements com.applovin.impl.kg, com.applovin.impl.sdk.array.ArrayDirectDownloadAd {
    protected final org.json.JSONObject adObject;
    private final long createdAtMillis;
    protected final org.json.JSONObject fullResponse;
    protected final com.applovin.impl.sdk.j sdk;
    protected final com.applovin.impl.tl synchronizedAdObject;
    protected final com.applovin.impl.tl synchronizedFullResponse;
    protected final java.lang.Object adObjectLock = new java.lang.Object();
    protected final java.lang.Object fullResponseLock = new java.lang.Object();

    protected AppLovinAdBase(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            throw new java.lang.IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new java.lang.IllegalArgumentException("No response specified");
        }
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        this.sdk = jVar;
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.i6)).booleanValue()) {
            this.synchronizedAdObject = new com.applovin.impl.tl(jSONObject);
            this.synchronizedFullResponse = new com.applovin.impl.tl(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = java.lang.System.currentTimeMillis();
    }

    protected boolean containsKeyForAdObject(java.lang.String str) {
        boolean zHas;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str);
        }
        synchronized (this.adObjectLock) {
            zHas = this.adObject.has(str);
        }
        return zHas;
    }

    public java.lang.String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.kg
    public abstract /* synthetic */ com.applovin.impl.lg getAdEventTracker();

    public abstract long getAdIdNumber();

    protected boolean getBooleanFromAdObject(java.lang.String str, java.lang.Boolean bool) {
        boolean zBooleanValue;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            zBooleanValue = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return zBooleanValue;
    }

    protected boolean getBooleanFromFullResponse(java.lang.String str, boolean z) {
        boolean zBooleanValue;
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.a(str, java.lang.Boolean.valueOf(z)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            zBooleanValue = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.fullResponse, str, java.lang.Boolean.valueOf(z)).booleanValue();
        }
        return zBooleanValue;
    }

    public java.lang.String getClCode() {
        java.lang.String stringFromAdObject = getStringFromAdObject("clcode", "");
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    protected int getColorFromAdObject(java.lang.String str, int i) {
        java.lang.String stringFromAdObject = getStringFromAdObject(str, null);
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject) ? android.graphics.Color.parseColor(stringFromAdObject) : i;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public java.lang.String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public java.lang.String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    protected float getFloatFromAdObject(java.lang.String str, float f) {
        float f2;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, f);
        }
        synchronized (this.adObjectLock) {
            f2 = com.applovin.impl.sdk.utils.JsonUtils.getFloat(this.adObject, str, f);
        }
        return f2;
    }

    protected int getIntFromAdObject(java.lang.String str, int i) {
        int i2;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, i);
        }
        synchronized (this.adObjectLock) {
            i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(this.adObject, str, i);
        }
        return i2;
    }

    protected java.util.List<java.lang.Integer> getIntegerListFromAdObject(java.lang.String str, java.util.List<java.lang.Integer> list) {
        java.util.List<java.lang.Integer> integerList;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, (java.util.List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = com.applovin.impl.sdk.utils.JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    protected org.json.JSONArray getJsonArrayFromAdObject(java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    protected org.json.JSONObject getJsonObjectFromAdObject(java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromAdObject(java.lang.String str, long j) {
        long j2;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, j);
        }
        synchronized (this.adObjectLock) {
            j2 = com.applovin.impl.sdk.utils.JsonUtils.getLong(this.adObject, str, j);
        }
        return j2;
    }

    protected long getLongFromFullResponse(java.lang.String str, long j) {
        long j2;
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.a(str, j);
        }
        synchronized (this.fullResponseLock) {
            j2 = com.applovin.impl.sdk.utils.JsonUtils.getLong(this.fullResponse, str, j);
        }
        return j2;
    }

    @Override // com.applovin.impl.kg
    public abstract /* synthetic */ java.lang.String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.kg
    public abstract /* synthetic */ java.lang.String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.kg
    public abstract /* synthetic */ java.util.List getOpenMeasurementVerificationScriptResources();

    public com.applovin.impl.sdk.j getSdk() {
        return this.sdk;
    }

    protected java.lang.String getStringFromAdObject(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    protected java.lang.String getStringFromFullResponse(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    protected java.util.List<java.lang.String> getStringListFromAdObject(java.lang.String str, java.util.List<java.lang.String> list) {
        java.util.List<java.lang.String> stringList;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = com.applovin.impl.sdk.utils.JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.kg
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
