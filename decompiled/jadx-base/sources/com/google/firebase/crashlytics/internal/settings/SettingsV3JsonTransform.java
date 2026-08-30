package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
class SettingsV3JsonTransform implements com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform {
    SettingsV3JsonTransform() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider, org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.google.firebase.crashlytics.internal.settings.Settings.SessionData sessionDataBuildSessionDataFrom;
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            sessionDataBuildSessionDataFrom = buildSessionDataFrom(jSONObject.getJSONObject("session"));
        } else {
            sessionDataBuildSessionDataFrom = buildSessionDataFrom(new org.json.JSONObject());
        }
        return new com.google.firebase.crashlytics.internal.settings.Settings(getExpiresAtFrom(currentTimeProvider, iOptInt2, jSONObject), sessionDataBuildSessionDataFrom, buildFeatureFlagDataFrom(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, dOptDouble, dOptDouble2, iOptInt3);
    }

    private static com.google.firebase.crashlytics.internal.settings.Settings.FeatureFlagData buildFeatureFlagDataFrom(org.json.JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.internal.settings.Settings.FeatureFlagData(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static com.google.firebase.crashlytics.internal.settings.Settings.SessionData buildSessionDataFrom(org.json.JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.internal.settings.Settings.SessionData(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long getExpiresAtFrom(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider, long j, org.json.JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }
}
