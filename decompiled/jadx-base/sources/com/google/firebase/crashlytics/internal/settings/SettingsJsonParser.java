package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
public class SettingsJsonParser {
    private final com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider;

    SettingsJsonParser(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider) {
        this.currentTimeProvider = currentTimeProvider;
    }

    public com.google.firebase.crashlytics.internal.settings.Settings parseSettingsJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return getJsonTransformForVersion(jSONObject.getInt("settings_version")).buildFromJson(this.currentTimeProvider, jSONObject);
    }

    private static com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform getJsonTransformForVersion(int i) {
        if (i == 3) {
            return new com.google.firebase.crashlytics.internal.settings.SettingsV3JsonTransform();
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().e("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform();
    }
}
