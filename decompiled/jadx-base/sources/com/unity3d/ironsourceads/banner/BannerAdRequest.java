package com.unity3d.ironsourceads.banner;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001(B3\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\f¨\u0006)"}, d2 = {"Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "", "Landroid/content/Context;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getInstanceId", "()Ljava/lang/String;", "instanceId", "c", "getAdm", "adm", "Lcom/unity3d/ironsourceads/AdSize;", "d", "Lcom/unity3d/ironsourceads/AdSize;", "getSize", "()Lcom/unity3d/ironsourceads/AdSize;", "size", "Landroid/os/Bundle;", "e", "Landroid/os/Bundle;", "getExtraParams", "()Landroid/os/Bundle;", "extraParams", "Lcom/ironsource/up;", "f", "Lcom/ironsource/up;", "getProviderName$mediationsdk_release", "()Lcom/ironsource/up;", "providerName", "g", "getAdId$mediationsdk_release", com.ironsource.sdk.controller.f.b.AD_ID, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ironsourceads/AdSize;Landroid/os/Bundle;)V", "Builder", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.content.Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String instanceId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String adm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.unity3d.ironsourceads.AdSize size;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final android.os.Bundle extraParams;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.up providerName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final java.lang.String adId;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/unity3d/ironsourceads/banner/BannerAdRequest$Builder;", "", "Landroid/os/Bundle;", "extraParams", "withExtraParams", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "build", "Landroid/content/Context;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getInstanceId", "()Ljava/lang/String;", "instanceId", "c", "getAdm", "adm", "Lcom/unity3d/ironsourceads/AdSize;", "d", "Lcom/unity3d/ironsourceads/AdSize;", "getSize", "()Lcom/unity3d/ironsourceads/AdSize;", "size", "e", "Landroid/os/Bundle;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ironsourceads/AdSize;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final android.content.Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.lang.String instanceId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final java.lang.String adm;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final com.unity3d.ironsourceads.AdSize size;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private android.os.Bundle extraParams;

        public Builder(android.content.Context context, java.lang.String instanceId, java.lang.String adm, com.unity3d.ironsourceads.AdSize size) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
            this.context = context;
            this.instanceId = instanceId;
            this.adm = adm;
            this.size = size;
        }

        public final com.unity3d.ironsourceads.banner.BannerAdRequest build() {
            return new com.unity3d.ironsourceads.banner.BannerAdRequest(this.context, this.instanceId, this.adm, this.size, this.extraParams, null);
        }

        public final java.lang.String getAdm() {
            return this.adm;
        }

        public final android.content.Context getContext() {
            return this.context;
        }

        public final java.lang.String getInstanceId() {
            return this.instanceId;
        }

        public final com.unity3d.ironsourceads.AdSize getSize() {
            return this.size;
        }

        public final com.unity3d.ironsourceads.banner.BannerAdRequest.Builder withExtraParams(android.os.Bundle extraParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.extraParams = extraParams;
            return this;
        }
    }

    private BannerAdRequest(android.content.Context context, java.lang.String str, java.lang.String str2, com.unity3d.ironsourceads.AdSize adSize, android.os.Bundle bundle) {
        this.context = context;
        this.instanceId = str;
        this.adm = str2;
        this.size = adSize;
        this.extraParams = bundle;
        this.providerName = new com.json.un(str);
        java.lang.String strB = com.json.xj.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.adId = strB;
    }

    public /* synthetic */ BannerAdRequest(android.content.Context context, java.lang.String str, java.lang.String str2, com.unity3d.ironsourceads.AdSize adSize, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }

    /* JADX INFO: renamed from: getAdId$mediationsdk_release, reason: from getter */
    public final java.lang.String getAdId() {
        return this.adId;
    }

    public final java.lang.String getAdm() {
        return this.adm;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final android.os.Bundle getExtraParams() {
        return this.extraParams;
    }

    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* JADX INFO: renamed from: getProviderName$mediationsdk_release, reason: from getter */
    public final com.json.up getProviderName() {
        return this.providerName;
    }

    public final com.unity3d.ironsourceads.AdSize getSize() {
        return this.size;
    }
}
