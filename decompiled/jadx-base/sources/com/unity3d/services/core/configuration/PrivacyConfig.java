package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class PrivacyConfig {
    private com.unity3d.services.core.configuration.PrivacyConfigStatus _privacyConfigStatus;
    private boolean _shouldSendNonBehavioral;

    public PrivacyConfig() {
        this(com.unity3d.services.core.configuration.PrivacyConfigStatus.UNKNOWN);
    }

    public PrivacyConfig(org.json.JSONObject jSONObject) {
        parsePrivacyResponse(jSONObject);
    }

    public PrivacyConfig(com.unity3d.services.core.configuration.PrivacyConfigStatus privacyConfigStatus) {
        this._privacyConfigStatus = privacyConfigStatus;
        this._shouldSendNonBehavioral = false;
    }

    public boolean allowedToSendPii() {
        return this._privacyConfigStatus.equals(com.unity3d.services.core.configuration.PrivacyConfigStatus.ALLOWED);
    }

    public boolean shouldSendNonBehavioral() {
        return this._shouldSendNonBehavioral;
    }

    public com.unity3d.services.core.configuration.PrivacyConfigStatus getPrivacyStatus() {
        return this._privacyConfigStatus;
    }

    private void parsePrivacyResponse(org.json.JSONObject jSONObject) {
        this._privacyConfigStatus = jSONObject.optBoolean("pas", false) ? com.unity3d.services.core.configuration.PrivacyConfigStatus.ALLOWED : com.unity3d.services.core.configuration.PrivacyConfigStatus.DENIED;
        this._shouldSendNonBehavioral = jSONObject.optBoolean("snb", false);
    }
}
