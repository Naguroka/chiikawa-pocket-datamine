package com.unity3d.services.core.properties;

/* JADX INFO: compiled from: SessionIdReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/properties/SessionIdReader;", "", "()V", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "getSessionId", "()Ljava/lang/String;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionIdReader {
    public static final com.unity3d.services.core.properties.SessionIdReader INSTANCE = new com.unity3d.services.core.properties.SessionIdReader();
    private static final java.lang.String sessionId;

    private SessionIdReader() {
    }

    static {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        sessionId = string;
    }

    public final java.lang.String getSessionId() {
        return sessionId;
    }
}
