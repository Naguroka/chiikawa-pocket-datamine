package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionDataStoreConfigs.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/SessionDataStoreConfigs;", "", "()V", "PROCESS_NAME", "", "kotlin.jvm.PlatformType", "SESSIONS_CONFIG_NAME", "getSESSIONS_CONFIG_NAME", "()Ljava/lang/String;", "SETTINGS_CONFIG_NAME", "getSETTINGS_CONFIG_NAME", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionDataStoreConfigs {
    public static final com.google.firebase.sessions.SessionDataStoreConfigs INSTANCE = new com.google.firebase.sessions.SessionDataStoreConfigs();
    private static final java.lang.String PROCESS_NAME;
    private static final java.lang.String SESSIONS_CONFIG_NAME;
    private static final java.lang.String SETTINGS_CONFIG_NAME;

    private SessionDataStoreConfigs() {
    }

    static {
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(kotlin.text.StringsKt.encodeToByteArray(com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions()), 10);
        PROCESS_NAME = strEncodeToString;
        SESSIONS_CONFIG_NAME = "firebase_session_" + strEncodeToString + "_data";
        SETTINGS_CONFIG_NAME = "firebase_session_" + strEncodeToString + "_settings";
    }

    public final java.lang.String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    public final java.lang.String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}
