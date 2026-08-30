package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class ExperimentObject {
    private static final java.lang.String APPLIED_KEY = "applied";
    private static final java.lang.String VALUE_KEY = "value";
    private final org.json.JSONObject _experimentData;

    public ExperimentObject(org.json.JSONObject jSONObject) {
        this._experimentData = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public java.lang.String getStringValue() {
        return this._experimentData.optString("value");
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean("value");
    }

    public com.unity3d.services.core.configuration.ExperimentAppliedRule getAppliedRule() {
        com.unity3d.services.core.configuration.ExperimentAppliedRule experimentAppliedRule = com.unity3d.services.core.configuration.ExperimentAppliedRule.NEXT;
        java.lang.String strOptString = this._experimentData.optString(APPLIED_KEY);
        if (strOptString.isEmpty()) {
            return experimentAppliedRule;
        }
        try {
            return com.unity3d.services.core.configuration.ExperimentAppliedRule.valueOf(strOptString.toUpperCase());
        } catch (java.lang.IllegalArgumentException unused) {
            com.unity3d.services.core.log.DeviceLog.warning("Invalid rule %s for experiment", strOptString);
            return experimentAppliedRule;
        }
    }
}
