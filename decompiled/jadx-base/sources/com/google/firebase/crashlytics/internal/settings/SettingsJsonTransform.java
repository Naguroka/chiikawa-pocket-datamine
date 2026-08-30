package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
interface SettingsJsonTransform {
    com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider, org.json.JSONObject jSONObject) throws org.json.JSONException;
}
