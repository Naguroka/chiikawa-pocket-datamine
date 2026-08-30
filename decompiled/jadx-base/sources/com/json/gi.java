package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J'\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0005\u001a\u00020\u0007HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0005\u0010\u001aR\"\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d\"\u0004\b\u0005\u0010\u001eR$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b\b\u0010!R$\u0010$\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b#\u0010\u0013\"\u0004\b\u0005\u0010!¨\u0006'"}, d2 = {"Lcom/ironsource/gi;", "", "T", "Lcom/ironsource/hm;", "mapper", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/hm;)Ljava/lang/Object;", "", "b", "appKey", "userId", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/s0;", "c", "Lcom/ironsource/s0;", "e", "()Lcom/ironsource/s0;", "(Lcom/ironsource/s0;)V", "applicationConfig", "Z", "()Z", "(Z)V", "adapterDebug", "g", "(Ljava/lang/String;)V", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "f", "pluginType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String appKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private com.json.s0 applicationConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean adapterDebug;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private java.lang.String sessionId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private java.lang.String pluginType;

    public gi(java.lang.String appKey, java.lang.String userId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        this.appKey = appKey;
        this.userId = userId;
    }

    public static /* synthetic */ com.json.gi a(com.json.gi giVar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = giVar.appKey;
        }
        if ((i & 2) != 0) {
            str2 = giVar.userId;
        }
        return giVar.a(str, str2);
    }

    public final com.json.gi a(java.lang.String appKey, java.lang.String userId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        return new com.json.gi(appKey, userId);
    }

    public final <T> T a(com.json.hm<com.json.gi, T> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getAppKey() {
        return this.appKey;
    }

    public final void a(com.json.s0 s0Var) {
        this.applicationConfig = s0Var;
    }

    public final void a(java.lang.String str) {
        this.pluginType = str;
    }

    public final void a(boolean z) {
        this.adapterDebug = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final void b(java.lang.String str) {
        this.sessionId = str;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAdapterDebug() {
        return this.adapterDebug;
    }

    public final java.lang.String d() {
        return this.appKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.s0 getApplicationConfig() {
        return this.applicationConfig;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.gi)) {
            return false;
        }
        com.json.gi giVar = (com.json.gi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appKey, giVar.appKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.userId, giVar.userId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final java.lang.String getPluginType() {
        return this.pluginType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String h() {
        return this.userId;
    }

    public int hashCode() {
        return (this.appKey.hashCode() * 31) + this.userId.hashCode();
    }

    public java.lang.String toString() {
        return "InitConfig(appKey=" + this.appKey + ", userId=" + this.userId + ')';
    }
}
