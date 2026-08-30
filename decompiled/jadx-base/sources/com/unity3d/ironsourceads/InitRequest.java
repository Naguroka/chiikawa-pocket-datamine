package com.unity3d.ironsourceads;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ironsourceads/InitRequest;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getAppKey", "()Ljava/lang/String;", "appKey", "", "Lcom/unity3d/ironsourceads/IronSourceAds$AdFormat;", "b", "Ljava/util/List;", "getLegacyAdFormats", "()Ljava/util/List;", "legacyAdFormats", "Lcom/unity3d/ironsourceads/LogLevel;", "c", "Lcom/unity3d/ironsourceads/LogLevel;", "getLogLevel", "()Lcom/unity3d/ironsourceads/LogLevel;", "logLevel", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/unity3d/ironsourceads/LogLevel;)V", "Builder", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class InitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String appKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.List<com.unity3d.ironsourceads.IronSourceAds.AdFormat> legacyAdFormats;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.unity3d.ironsourceads.LogLevel logLevel;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ironsourceads/InitRequest$Builder;", "", "Lcom/unity3d/ironsourceads/LogLevel;", "logLevel", "withLogLevel", "", "Lcom/unity3d/ironsourceads/IronSourceAds$AdFormat;", "legacyAdFormats", "withLegacyAdFormats", "Lcom/unity3d/ironsourceads/InitRequest;", "build", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getAppKey", "()Ljava/lang/String;", "appKey", "b", "Ljava/util/List;", "c", "Lcom/unity3d/ironsourceads/LogLevel;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String appKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> legacyAdFormats;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private com.unity3d.ironsourceads.LogLevel logLevel;

        public Builder(java.lang.String appKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.appKey = appKey;
        }

        public final com.unity3d.ironsourceads.InitRequest build() {
            java.lang.String str = this.appKey;
            java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> listEmptyList = this.legacyAdFormats;
            if (listEmptyList == null) {
                listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            com.unity3d.ironsourceads.LogLevel logLevel = this.logLevel;
            if (logLevel == null) {
                logLevel = com.unity3d.ironsourceads.LogLevel.NONE;
            }
            return new com.unity3d.ironsourceads.InitRequest(str, listEmptyList, logLevel, null);
        }

        public final java.lang.String getAppKey() {
            return this.appKey;
        }

        public final com.unity3d.ironsourceads.InitRequest.Builder withLegacyAdFormats(java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> legacyAdFormats) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.legacyAdFormats = legacyAdFormats;
            return this;
        }

        public final com.unity3d.ironsourceads.InitRequest.Builder withLogLevel(com.unity3d.ironsourceads.LogLevel logLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(java.lang.String str, java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> list, com.unity3d.ironsourceads.LogLevel logLevel) {
        this.appKey = str;
        this.legacyAdFormats = list;
        this.logLevel = logLevel;
    }

    public /* synthetic */ InitRequest(java.lang.String str, java.util.List list, com.unity3d.ironsourceads.LogLevel logLevel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }

    public final java.lang.String getAppKey() {
        return this.appKey;
    }

    public final java.util.List<com.unity3d.ironsourceads.IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.legacyAdFormats;
    }

    public final com.unity3d.ironsourceads.LogLevel getLogLevel() {
        return this.logLevel;
    }
}
