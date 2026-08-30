package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
class DefaultSettingsSpiCall implements com.google.firebase.crashlytics.internal.settings.SettingsSpiCall {
    static final java.lang.String ACCEPT_JSON_VALUE = "application/json";
    static final java.lang.String ANDROID_CLIENT_TYPE = "android";
    static final java.lang.String BUILD_VERSION_PARAM = "build_version";
    static final java.lang.String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    static final java.lang.String DISPLAY_VERSION_PARAM = "display_version";
    static final java.lang.String HEADER_ACCEPT = "Accept";
    static final java.lang.String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    static final java.lang.String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    static final java.lang.String HEADER_DEVICE_MODEL = "X-CRASHLYTICS-DEVICE-MODEL";
    static final java.lang.String HEADER_GOOGLE_APP_ID = "X-CRASHLYTICS-GOOGLE-APP-ID";
    static final java.lang.String HEADER_INSTALLATION_ID = "X-CRASHLYTICS-INSTALLATION-ID";
    static final java.lang.String HEADER_OS_BUILD_VERSION = "X-CRASHLYTICS-OS-BUILD-VERSION";
    static final java.lang.String HEADER_OS_DISPLAY_VERSION = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    static final java.lang.String HEADER_USER_AGENT = "User-Agent";
    static final java.lang.String INSTANCE_PARAM = "instance";
    static final java.lang.String SOURCE_PARAM = "source";
    private final com.google.firebase.crashlytics.internal.Logger logger;
    private final com.google.firebase.crashlytics.internal.network.HttpRequestFactory requestFactory;
    private final java.lang.String url;

    boolean requestWasSuccessful(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public DefaultSettingsSpiCall(java.lang.String str, com.google.firebase.crashlytics.internal.network.HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, com.google.firebase.crashlytics.internal.Logger.getLogger());
    }

    DefaultSettingsSpiCall(java.lang.String str, com.google.firebase.crashlytics.internal.network.HttpRequestFactory httpRequestFactory, com.google.firebase.crashlytics.internal.Logger logger) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("url must not be null.");
        }
        this.logger = logger;
        this.requestFactory = httpRequestFactory;
        this.url = str;
    }

    protected com.google.firebase.crashlytics.internal.network.HttpGetRequest createHttpGetRequest(java.util.Map<java.lang.String, java.lang.String> map) {
        return this.requestFactory.buildHttpGetRequest(this.url, map).header("User-Agent", CRASHLYTICS_USER_AGENT + com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public org.json.JSONObject invoke(com.google.firebase.crashlytics.internal.settings.SettingsRequest settingsRequest, boolean z) {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBlockingThread();
        if (!z) {
            throw new java.lang.RuntimeException("An invalid data collection token was used.");
        }
        try {
            java.util.Map<java.lang.String, java.lang.String> queryParamsFor = getQueryParamsFor(settingsRequest);
            com.google.firebase.crashlytics.internal.network.HttpGetRequest httpGetRequestApplyHeadersTo = applyHeadersTo(createHttpGetRequest(queryParamsFor), settingsRequest);
            this.logger.d("Requesting settings from " + this.url);
            this.logger.v("Settings query params were: " + queryParamsFor);
            return handleResponse(httpGetRequestApplyHeadersTo.execute());
        } catch (java.io.IOException e) {
            this.logger.e("Settings request failed.", e);
            return null;
        }
    }

    org.json.JSONObject handleResponse(com.google.firebase.crashlytics.internal.network.HttpResponse httpResponse) {
        int iCode = httpResponse.code();
        this.logger.v("Settings response code was: " + iCode);
        if (requestWasSuccessful(iCode)) {
            return getJsonObjectFrom(httpResponse.body());
        }
        this.logger.e("Settings request failed; (status: " + iCode + ") from " + this.url);
        return null;
    }

    private org.json.JSONObject getJsonObjectFrom(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e) {
            this.logger.w("Failed to parse settings JSON from " + this.url, e);
            this.logger.w("Settings response " + str);
            return null;
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> getQueryParamsFor(com.google.firebase.crashlytics.internal.settings.SettingsRequest settingsRequest) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(BUILD_VERSION_PARAM, settingsRequest.buildVersion);
        map.put(DISPLAY_VERSION_PARAM, settingsRequest.displayVersion);
        map.put("source", java.lang.Integer.toString(settingsRequest.source));
        java.lang.String str = settingsRequest.instanceId;
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    private com.google.firebase.crashlytics.internal.network.HttpGetRequest applyHeadersTo(com.google.firebase.crashlytics.internal.network.HttpGetRequest httpGetRequest, com.google.firebase.crashlytics.internal.settings.SettingsRequest settingsRequest) {
        applyNonNullHeader(httpGetRequest, HEADER_GOOGLE_APP_ID, settingsRequest.googleAppId);
        applyNonNullHeader(httpGetRequest, HEADER_CLIENT_TYPE, "android");
        applyNonNullHeader(httpGetRequest, HEADER_CLIENT_VERSION, com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion());
        applyNonNullHeader(httpGetRequest, "Accept", "application/json");
        applyNonNullHeader(httpGetRequest, HEADER_DEVICE_MODEL, settingsRequest.deviceModel);
        applyNonNullHeader(httpGetRequest, HEADER_OS_BUILD_VERSION, settingsRequest.osBuildVersion);
        applyNonNullHeader(httpGetRequest, HEADER_OS_DISPLAY_VERSION, settingsRequest.osDisplayVersion);
        applyNonNullHeader(httpGetRequest, HEADER_INSTALLATION_ID, settingsRequest.installIdProvider.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    private void applyNonNullHeader(com.google.firebase.crashlytics.internal.network.HttpGetRequest httpGetRequest, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }
}
