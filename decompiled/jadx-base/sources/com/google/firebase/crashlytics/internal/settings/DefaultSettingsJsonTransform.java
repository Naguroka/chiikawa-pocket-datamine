package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
class DefaultSettingsJsonTransform implements com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform {
    DefaultSettingsJsonTransform() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider, org.json.JSONObject jSONObject) {
        return defaultSettings(currentTimeProvider);
    }

    static com.google.firebase.crashlytics.internal.settings.Settings defaultSettings(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider) {
        return new com.google.firebase.crashlytics.internal.settings.Settings(currentTimeProvider.getCurrentTimeMillis() + ((long) com.adjust.sdk.Constants.ONE_HOUR), new com.google.firebase.crashlytics.internal.settings.Settings.SessionData(8, 4), new com.google.firebase.crashlytics.internal.settings.Settings.FeatureFlagData(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }
}
