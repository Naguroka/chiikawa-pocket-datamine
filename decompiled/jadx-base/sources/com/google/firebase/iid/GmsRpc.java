package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class GmsRpc {
    public static final java.lang.String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final java.lang.String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private final com.google.firebase.FirebaseApp app;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> heartbeatInfo;
    private final com.google.firebase.iid.Metadata metadata;
    private final com.google.android.gms.cloudmessaging.Rpc rpc;
    private final com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> userAgentPublisher;

    GmsRpc(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.Metadata metadata, com.google.android.gms.cloudmessaging.Rpc rpc, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = rpc;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    public GmsRpc(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.Metadata metadata, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new com.google.android.gms.cloudmessaging.Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static java.lang.String base64UrlSafe(byte[] bArr) {
        return android.util.Base64.encodeToString(bArr, 11);
    }

    private com.google.android.gms.tasks.Task<java.lang.String> extractResponseWhenComplete(com.google.android.gms.tasks.Task<android.os.Bundle> task) {
        return task.continueWith(com.google.firebase.iid.FirebaseIidExecutors.directExecutor(), new com.google.android.gms.tasks.Continuation(this) { // from class: com.google.firebase.iid.GmsRpc$$Lambda$0
            private final com.google.firebase.iid.GmsRpc arg$1;

            {
                this.arg$1 = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return this.arg$1.lambda$extractResponseWhenComplete$0$GmsRpc(task2);
            }
        });
    }

    private java.lang.String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.app.getName().getBytes()));
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    static boolean isErrorMessageForRetryableError(java.lang.String str) {
        return ERROR_SERVICE_NOT_AVAILABLE.equals(str) || ERROR_INTERNAL_SERVER_ERROR.equals(str) || "InternalServerError".equals(str);
    }

    private android.os.Bundle setDefaultAttributesToBundle(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(com.google.ads.mediation.pangle.PangleConstants.APP_ID, str);
        bundle.putString("gmp_app_id", this.app.getOptions().getApplicationId());
        bundle.putString("gmsv", java.lang.Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString(com.json.ce.z, java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.metadata.getAppVersionCode());
        bundle.putString("app_ver_name", this.metadata.getAppVersionName());
        bundle.putString("firebase-app-name-hash", getHashedFirebaseAppName());
        try {
            java.lang.String token = ((com.google.firebase.installations.InstallationTokenResult) com.google.android.gms.tasks.Tasks.await(this.firebaseInstallations.getToken(false))).getToken();
            if (android.text.TextUtils.isEmpty(token)) {
                android.util.Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo = this.heartbeatInfo.get();
        com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) != com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", java.lang.Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
        return bundle;
    }

    private com.google.android.gms.tasks.Task<android.os.Bundle> startRpc(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        setDefaultAttributesToBundle(str, str2, str3, bundle);
        return this.rpc.send(bundle);
    }

    public com.google.android.gms.tasks.Task<?> deleteInstanceId(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return extractResponseWhenComplete(startRpc(str, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, bundle));
    }

    public com.google.android.gms.tasks.Task<?> deleteToken(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("delete", "1");
        return extractResponseWhenComplete(startRpc(str, str2, str3, bundle));
    }

    public com.google.android.gms.tasks.Task<java.lang.String> getToken(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return extractResponseWhenComplete(startRpc(str, str2, str3, new android.os.Bundle()));
    }

    final /* synthetic */ java.lang.String lambda$extractResponseWhenComplete$0$GmsRpc(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return handleResponse((android.os.Bundle) task.getResult(java.io.IOException.class));
    }

    public com.google.android.gms.tasks.Task<?> subscribeToTopic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String strValueOf = java.lang.String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new java.lang.String("/topics/"));
        java.lang.String strValueOf2 = java.lang.String.valueOf(str3);
        return extractResponseWhenComplete(startRpc(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new java.lang.String("/topics/"), bundle));
    }

    public com.google.android.gms.tasks.Task<?> unsubscribeFromTopic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String strValueOf = java.lang.String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new java.lang.String("/topics/"));
        bundle.putString("delete", "1");
        java.lang.String strValueOf2 = java.lang.String.valueOf(str3);
        return extractResponseWhenComplete(startRpc(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new java.lang.String("/topics/"), bundle));
    }

    private java.lang.String handleResponse(android.os.Bundle bundle) throws java.io.IOException {
        if (bundle == null) {
            throw new java.io.IOException(ERROR_SERVICE_NOT_AVAILABLE);
        }
        java.lang.String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        java.lang.String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        java.lang.String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new java.io.IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new java.io.IOException(string3);
        }
        java.lang.String strValueOf = java.lang.String.valueOf(bundle);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        android.util.Log.w("FirebaseInstanceId", sb.toString(), new java.lang.Throwable());
        throw new java.io.IOException(ERROR_SERVICE_NOT_AVAILABLE);
    }
}
