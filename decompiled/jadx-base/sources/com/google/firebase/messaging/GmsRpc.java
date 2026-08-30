package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class GmsRpc {
    static final java.lang.String CMD_RST = "RST";
    static final java.lang.String CMD_RST_FULL = "RST_FULL";
    static final java.lang.String CMD_SYNC = "SYNC";
    static final java.lang.String ERROR_INSTANCE_ID_RESET = "INSTANCE_ID_RESET";
    static final java.lang.String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final java.lang.String ERROR_INTERNAL_SERVER_ERROR_ALT = "InternalServerError";
    static final java.lang.String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final java.lang.String EXTRA_DELETE = "delete";
    private static final java.lang.String EXTRA_ERROR = "error";
    private static final java.lang.String EXTRA_IID_OPERATION = "iid-operation";
    private static final java.lang.String EXTRA_REGISTRATION_ID = "registration_id";
    private static final java.lang.String EXTRA_SCOPE = "scope";
    private static final java.lang.String EXTRA_SENDER = "sender";
    private static final java.lang.String EXTRA_SUBTYPE = "subtype";
    private static final java.lang.String EXTRA_TOPIC = "gcm.topic";
    private static final java.lang.String EXTRA_UNREGISTERED = "unregistered";
    static final java.lang.String FIREBASE_IID_HEARTBEAT_TAG = "fire-iid";
    private static final java.lang.String PARAM_APP_VER_CODE = "app_ver";
    private static final java.lang.String PARAM_APP_VER_NAME = "app_ver_name";
    private static final java.lang.String PARAM_CLIENT_VER = "cliv";
    private static final java.lang.String PARAM_FIREBASE_APP_NAME_HASH = "firebase-app-name-hash";
    private static final java.lang.String PARAM_FIS_AUTH_TOKEN = "Goog-Firebase-Installations-Auth";
    private static final java.lang.String PARAM_GMP_APP_ID = "gmp_app_id";
    private static final java.lang.String PARAM_GMS_VER = "gmsv";
    private static final java.lang.String PARAM_HEARTBEAT_CODE = "Firebase-Client-Log-Type";
    private static final java.lang.String PARAM_INSTANCE_ID = "appid";
    private static final java.lang.String PARAM_OS_VER = "osv";
    private static final java.lang.String PARAM_USER_AGENT = "Firebase-Client";
    private static final java.lang.String SCOPE_ALL = "*";
    static final java.lang.String TAG = "FirebaseMessaging";
    static final java.lang.String TOO_MANY_SUBSCRIBERS = "TOO_MANY_SUBSCRIBERS";
    private static final java.lang.String TOPIC_PREFIX = "/topics/";
    private final com.google.firebase.FirebaseApp app;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> heartbeatInfo;
    private final com.google.firebase.messaging.Metadata metadata;
    private final com.google.android.gms.cloudmessaging.Rpc rpc;
    private final com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> userAgentPublisher;

    GmsRpc(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.messaging.Metadata metadata, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new com.google.android.gms.cloudmessaging.Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    GmsRpc(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.messaging.Metadata metadata, com.google.android.gms.cloudmessaging.Rpc rpc, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = rpc;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    com.google.android.gms.tasks.Task<java.lang.String> getToken() {
        return extractResponseWhenComplete(startRpc(com.google.firebase.messaging.Metadata.getDefaultSenderId(this.app), "*", new android.os.Bundle()));
    }

    com.google.android.gms.tasks.Task<?> deleteToken() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(EXTRA_DELETE, "1");
        return extractResponseWhenComplete(startRpc(com.google.firebase.messaging.Metadata.getDefaultSenderId(this.app), "*", bundle));
    }

    com.google.android.gms.tasks.Task<?> subscribeToTopic(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    com.google.android.gms.tasks.Task<?> unsubscribeFromTopic(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        bundle.putString(EXTRA_DELETE, "1");
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    com.google.android.gms.tasks.Task<java.lang.Void> setRetainProxiedNotifications(boolean z) {
        return this.rpc.setRetainProxiedNotifications(z);
    }

    com.google.android.gms.tasks.Task<com.google.android.gms.cloudmessaging.CloudMessage> getProxyNotificationData() {
        return this.rpc.getProxiedNotificationData();
    }

    private com.google.android.gms.tasks.Task<android.os.Bundle> startRpc(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        try {
            setDefaultAttributesToBundle(str, str2, bundle);
            return this.rpc.send(bundle);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            return com.google.android.gms.tasks.Tasks.forException(e);
        }
    }

    private static java.lang.String base64UrlSafe(byte[] bArr) {
        return android.util.Base64.encodeToString(bArr, 11);
    }

    private java.lang.String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.app.getName().getBytes()));
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private void setDefaultAttributesToBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString(EXTRA_SCOPE, str2);
        bundle.putString(EXTRA_SENDER, str);
        bundle.putString(EXTRA_SUBTYPE, str);
        bundle.putString(PARAM_GMP_APP_ID, this.app.getOptions().getApplicationId());
        bundle.putString(PARAM_GMS_VER, java.lang.Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString(PARAM_APP_VER_CODE, this.metadata.getAppVersionCode());
        bundle.putString(PARAM_APP_VER_NAME, this.metadata.getAppVersionName());
        bundle.putString(PARAM_FIREBASE_APP_NAME_HASH, getHashedFirebaseAppName());
        try {
            java.lang.String token = ((com.google.firebase.installations.InstallationTokenResult) com.google.android.gms.tasks.Tasks.await(this.firebaseInstallations.getToken(false))).getToken();
            if (!android.text.TextUtils.isEmpty(token)) {
                bundle.putString(PARAM_FIS_AUTH_TOKEN, token);
            } else {
                android.util.Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (java.lang.String) com.google.android.gms.tasks.Tasks.await(this.firebaseInstallations.getId()));
        bundle.putString(PARAM_CLIENT_VER, "fcm-24.1.1");
        com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo = this.heartbeatInfo.get();
        com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode(FIREBASE_IID_HEARTBEAT_TAG)) == com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString(PARAM_HEARTBEAT_CODE, java.lang.Integer.toString(heartBeatCode.getCode()));
        bundle.putString(PARAM_USER_AGENT, userAgentPublisher.getUserAgent());
    }

    private java.lang.String handleResponse(android.os.Bundle bundle) throws java.io.IOException {
        if (bundle == null) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        }
        java.lang.String string = bundle.getString(EXTRA_REGISTRATION_ID);
        if (string != null) {
            return string;
        }
        java.lang.String string2 = bundle.getString(EXTRA_UNREGISTERED);
        if (string2 != null) {
            return string2;
        }
        java.lang.String string3 = bundle.getString("error");
        if (CMD_RST.equals(string3)) {
            throw new java.io.IOException(ERROR_INSTANCE_ID_RESET);
        }
        if (string3 != null) {
            throw new java.io.IOException(string3);
        }
        android.util.Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new java.lang.Throwable());
        throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
    }

    private com.google.android.gms.tasks.Task<java.lang.String> extractResponseWhenComplete(com.google.android.gms.tasks.Task<android.os.Bundle> task) {
        return task.continueWith(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.messaging.GmsRpc$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return this.f$0.m878xb80eb67f(task2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$extractResponseWhenComplete$0$com-google-firebase-messaging-GmsRpc, reason: not valid java name */
    /* synthetic */ java.lang.String m878xb80eb67f(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return handleResponse((android.os.Bundle) task.getResult(java.io.IOException.class));
    }

    static boolean isErrorMessageForRetryableError(java.lang.String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || ERROR_INTERNAL_SERVER_ERROR_ALT.equals(str);
    }
}
