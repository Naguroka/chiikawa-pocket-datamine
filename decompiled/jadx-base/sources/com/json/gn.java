package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u0005\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/ironsource/gn;", "", "", "g", "Lcom/ironsource/yp;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/yp;", "e", "()Lcom/ironsource/yp;", "(Lcom/ironsource/yp;)V", "providersSettingsHolder", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "(Ljava/lang/String;)V", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/ironsource/p8;", "d", "Lcom/ironsource/p8;", "()Lcom/ironsource/p8;", "(Lcom/ironsource/p8;)V", "adFormatConfiguration", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class gn {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final com.json.gn.Companion INSTANCE = new com.json.gn.Companion(null);
    private static volatile com.json.gn f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.yp providersSettingsHolder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean initialized;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private java.lang.String sessionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.p8 adFormatConfiguration;

    /* JADX INFO: renamed from: com.ironsource.gn$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0003\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ironsource/gn$a;", "", "Lcom/ironsource/gn;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lcom/ironsource/b3;", com.json.j5.p, "Lcom/ironsource/gn;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.b3 a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            com.json.gn gnVar = com.json.gn.f;
            com.json.p8 adFormatConfiguration = gnVar != null ? gnVar.getAdFormatConfiguration() : null;
            com.json.gn gnVar2 = com.json.gn.f;
            com.json.yp providersSettingsHolder = gnVar2 != null ? gnVar2.getProvidersSettingsHolder() : null;
            return (adFormatConfiguration == null || providersSettingsHolder == null) ? new com.json.hb() : new com.json.o7(adFormatConfiguration, providersSettingsHolder, adFormat);
        }

        @kotlin.jvm.JvmStatic
        public final com.json.gn a() {
            com.json.gn gnVar = com.json.gn.f;
            if (gnVar == null) {
                synchronized (this) {
                    gnVar = com.json.gn.f;
                    if (gnVar == null) {
                        gnVar = new com.json.gn(null);
                        com.json.gn.Companion companion = com.json.gn.INSTANCE;
                        com.json.gn.f = gnVar;
                    }
                }
            }
            return gnVar;
        }
    }

    private gn() {
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.sessionId = "";
    }

    public /* synthetic */ gn(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.jvm.JvmStatic
    public static final com.json.gn d() {
        return INSTANCE.a();
    }

    public final void a(com.json.p8 p8Var) {
        this.adFormatConfiguration = p8Var;
    }

    public final void a(com.json.yp ypVar) {
        this.providersSettingsHolder = ypVar;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.p8 getAdFormatConfiguration() {
        return this.adFormatConfiguration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.yp getProvidersSettingsHolder() {
        return this.providersSettingsHolder;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void g() {
        this.initialized.set(true);
    }
}
