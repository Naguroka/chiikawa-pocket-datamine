package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvents.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "()V", "SESSION_EVENT_ENCODER", "Lcom/google/firebase/encoders/DataEncoder;", "getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/encoders/DataEncoder;", "buildSession", "Lcom/google/firebase/sessions/SessionEvent;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "subscribers", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "firebaseInstallationId", "", "firebaseAuthenticationToken", "getApplicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "toDataCollectionState", "Lcom/google/firebase/sessions/DataCollectionState;", "subscriber", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionEvents {
    public static final com.google.firebase.sessions.SessionEvents INSTANCE = new com.google.firebase.sessions.SessionEvents();
    private static final com.google.firebase.encoders.DataEncoder SESSION_EVENT_ENCODER;

    private SessionEvents() {
    }

    public final com.google.firebase.encoders.DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }

    static {
        com.google.firebase.encoders.DataEncoder dataEncoderBuild = new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.firebase.sessions.AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataEncoderBuild, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = dataEncoderBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.google.firebase.sessions.SessionEvent buildSession$default(com.google.firebase.sessions.SessionEvents sessionEvents, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.sessions.SessionDetails sessionDetails, com.google.firebase.sessions.settings.SessionsSettings sessionsSettings, java.util.Map map, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2);
    }

    public final com.google.firebase.sessions.SessionEvent buildSession(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.sessions.SessionDetails sessionDetails, com.google.firebase.sessions.settings.SessionsSettings sessionsSettings, java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber> subscribers, java.lang.String firebaseInstallationId, java.lang.String firebaseAuthenticationToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new com.google.firebase.sessions.SessionEvent(com.google.firebase.sessions.EventType.SESSION_START, new com.google.firebase.sessions.SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new com.google.firebase.sessions.DataCollectionStatus(toDataCollectionState(subscribers.get(com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState(subscribers.get(com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), firebaseInstallationId, firebaseAuthenticationToken), getApplicationInfo(firebaseApp));
    }

    public final com.google.firebase.sessions.ApplicationInfo getApplicationInfo(com.google.firebase.FirebaseApp firebaseApp) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String strValueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        android.content.Context applicationContext = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        java.lang.String packageName = applicationContext.getPackageName();
        android.content.pm.PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            strValueOf = java.lang.String.valueOf(packageInfo.getLongVersionCode());
        } else {
            strValueOf = java.lang.String.valueOf(packageInfo.versionCode);
        }
        java.lang.String str = strValueOf;
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationId, "firebaseApp.options.applicationId");
        java.lang.String MODEL = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        com.google.firebase.sessions.LogEnvironment logEnvironment = com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        java.lang.String str2 = packageInfo.versionName;
        java.lang.String str3 = str2 == null ? str : str2;
        java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        com.google.firebase.sessions.ProcessDetailsProvider processDetailsProvider = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE;
        android.content.Context applicationContext2 = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "firebaseApp.applicationContext");
        com.google.firebase.sessions.ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
        com.google.firebase.sessions.ProcessDetailsProvider processDetailsProvider2 = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE;
        android.content.Context applicationContext3 = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "firebaseApp.applicationContext");
        return new com.google.firebase.sessions.ApplicationInfo(applicationId, MODEL, com.google.firebase.sessions.BuildConfig.VERSION_NAME, RELEASE, logEnvironment, new com.google.firebase.sessions.AndroidApplicationInfo(packageName, str3, str, MANUFACTURER, currentProcessDetails, processDetailsProvider2.getAppProcessDetails(applicationContext3)));
    }

    private final com.google.firebase.sessions.DataCollectionState toDataCollectionState(com.google.firebase.sessions.api.SessionSubscriber subscriber) {
        if (subscriber == null) {
            return com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (subscriber.isDataCollectionEnabled()) {
            return com.google.firebase.sessions.DataCollectionState.COLLECTION_ENABLED;
        }
        return com.google.firebase.sessions.DataCollectionState.COLLECTION_DISABLED;
    }
}
