package com.unity3d.ads;

/* JADX INFO: loaded from: classes4.dex */
public class UnityAdsBaseOptions {
    private java.lang.String OBJECT_ID = "objectId";
    private org.json.JSONObject _data = new org.json.JSONObject();

    public void set(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            this._data.put(str, str2);
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Failed to set Unity Ads options", e);
        }
    }

    public void setObjectId(java.lang.String str) {
        set(this.OBJECT_ID, str);
    }

    public java.lang.String getObjectId() {
        try {
            return this._data.getString(this.OBJECT_ID);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public org.json.JSONObject getData() {
        return this._data;
    }
}
