package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\n\b&\u0018\u00002\u00020\u0001:\u0001\u0005B \u0012\u0006\u00105\u001a\u000201\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020:¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u000f\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0004J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&J\b\u0010(\u001a\u00020\u0006H\u0016J\u000f\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b)\u0010*J\b\u0010+\u001a\u00020\u0006H$J\u0014\u0010\u0005\u001a\u00020\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0011H\u0004J\b\u0010-\u001a\u00020\u0006H\u0016J \u0010.\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u0006H\u0016R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b7\u00108R$\u0010'\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010<R\u0016\u0010?\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R!\u0010C\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010HR$\u0010O\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010R\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010NR$\u0010U\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR$\u0010X\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bW\u0010NR\u001a\u0010]\u001a\u00020Y8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bP\u0010\\R\u0017\u0010a\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b7\u0010_\u001a\u0004\bK\u0010`R\u0019\u0010c\u001a\u0004\u0018\u00010^8\u0006¢\u0006\f\n\u0004\bb\u0010_\u001a\u0004\bZ\u0010`R\u0017\u0010f\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bd\u0010L\u001a\u0004\be\u0010NR\u0017\u0010j\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bd\u0010iR\u0017\u0010n\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bk\u0010mR\u0017\u0010p\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bo\u0010h\u001a\u0004\bg\u0010iR\u0017\u0010u\u001a\u00020q8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\b=\u0010tR\u0017\u0010v\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\be\u0010l\u001a\u0004\br\u0010mR\u0017\u0010\u001c\u001a\u00020w8\u0006¢\u0006\f\n\u0004\bW\u0010x\u001a\u0004\bo\u0010yR\u0014\u0010z\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010mR\u0014\u0010{\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bV\u0010iR\u0016\u0010~\u001a\u0004\u0018\u00010|8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bS\u0010}¨\u0006\u0081\u0001"}, d2 = {"Lcom/ironsource/y;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "Lcom/ironsource/z;", "instanceData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "F", com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "com/ironsource/y$b", "()Lcom/ironsource/y$b;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMessage", "C", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdapterErrorType;", "adapterErrorType", "D", "B", "errorType", "", "duration", "Lcom/ironsource/n1$a;", "performance", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "e", "", "y", "Lcom/ironsource/g0;", "adInstancePresenter", "Ljava/lang/Runnable;", "callback", "status", "Lcom/ironsource/d0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "c", "()V", "z", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "onAdLoadSuccess", com.json.ju.b, com.json.ju.c, com.json.ju.f, "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "f", "()Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/z;", "m", "()Lcom/ironsource/z;", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/c0;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "d", "Lcom/ironsource/d0;", "loadListener", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "g", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "adapter", "Lcom/ironsource/fb;", "Lcom/ironsource/fb;", "loadDuration", "Lcom/ironsource/dr;", "Lcom/ironsource/dr;", "timeoutRunnable", "<set-?>", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Z", "w", "()Z", "isInstanceLoading", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "v", "isInstanceLoaded", "j", "x", "isInstanceOpened", "k", "u", "isInstanceFailed", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "currentAdData", "Lcom/ironsource/j5;", "Lcom/ironsource/j5;", "()Lcom/ironsource/j5;", "auctionResponseItem", com.json.zb.q, "genericNotifications", "o", "t", "isBidder", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Ljava/lang/String;", "()Ljava/lang/String;", "instanceName", "q", "I", "()I", "instanceType", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "instanceSignature", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "sessionDepth", "Lcom/ironsource/f0;", "Lcom/ironsource/f0;", "()Lcom/ironsource/f0;", "instanceLoadTimeoutInSeconds", "currentPlacementName", "Lcom/ironsource/mediationsdk/model/Placement;", "()Lcom/ironsource/mediationsdk/model/Placement;", "currentPlacement", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/z;Lcom/ironsource/c0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class y implements com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t2 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.z instanceData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private java.lang.ref.WeakReference<com.json.c0> listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.d0 loadListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private com.json.fb loadDuration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private com.json.dr timeoutRunnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isInstanceLoading;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isInstanceLoaded;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isInstanceOpened;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isInstanceFailed;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final com.json.mediationsdk.adunit.adapter.utility.AdData currentAdData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final com.json.j5 auctionResponseItem;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final com.json.j5 genericNotifications;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isBidder;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final java.lang.String instanceName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int instanceType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final java.lang.String instanceSignature;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int sessionDepth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final com.json.f0 performance;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ironsource/y$a;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NetworkInitializationListener;", "", "onInitSuccess", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMessage", "onInitFailed", "<init>", "(Lcom/ironsource/y;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    final class a implements com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.y this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.y this$0, int i, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.a(i, str);
        }

        @Override // com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
        public void onInitFailed(final int errorCode, final java.lang.String errorMessage) {
            final com.json.y yVar = com.json.y.this;
            yVar.a(new java.lang.Runnable() { // from class: com.ironsource.y$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.y.a.a(yVar, errorCode, errorMessage);
                }
            });
        }

        @Override // com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
        public void onInitSuccess() {
            final com.json.y yVar = com.json.y.this;
            yVar.a(new java.lang.Runnable() { // from class: com.ironsource.y$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.y.a.a(yVar);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/y$b", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.json.dr {
        b() {
        }

        @Override // com.json.dr
        public void a() {
            long jA = com.json.fb.a(com.json.y.this.loadDuration);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.y.this.a("Load duration = " + jA + ", isBidder = " + com.json.y.this.getIsBidder()));
            com.json.y.this.isInstanceFailed = true;
            com.json.y.this.getAdTools().getEventSender().getLoad().a(jA, 1025, false);
            com.json.y.this.getAdTools().getEventSender().getLoad().a(jA, 1025, "time out", false);
            com.json.y yVar = com.json.y.this;
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            yVar.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public y(com.json.t2 adTools, com.json.z instanceData, com.json.c0 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.adTools = adTools;
        this.instanceData = instanceData;
        this.listener = new java.lang.ref.WeakReference<>(listener);
        this.currentAdData = instanceData.getAdData();
        this.auctionResponseItem = instanceData.n();
        this.genericNotifications = instanceData.getGenericNotifications();
        this.isBidder = instanceData.j().j();
        this.instanceName = instanceData.getInstanceName();
        this.instanceType = instanceData.getInstanceType();
        this.instanceSignature = instanceData.getSignature();
        this.adFormat = instanceData.getAdFormat();
        this.sessionDepth = instanceData.v();
        this.performance = instanceData.getPerformance();
        com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapterA = a(instanceData);
        this.adapter = baseAdAdapterA;
        adTools.getEventSender().a(new com.json.a0(adTools, instanceData, baseAdAdapterA));
        adTools.getEventSender().a(new com.json.r4(instanceData.k()));
    }

    private final void A() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        try {
            F();
            z();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            this.adTools.getEventSender().getTroubleshoot().g(str);
            a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void B() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        this.adTools.getEventSender().getAdInteraction().a(k());
        com.json.c0 c0Var = this.listener.get();
        if (c0Var != null) {
            c0Var.a(this);
        }
    }

    private final void C() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        com.json.d0 d0Var = null;
        ironLog.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        G();
        if (this.isInstanceFailed) {
            c();
            return;
        }
        if (this.isInstanceLoaded) {
            return;
        }
        this.isInstanceLoaded = true;
        long jA = com.json.fb.a(this.loadDuration);
        ironLog.verbose(a("Load duration = " + jA));
        this.adTools.getEventSender().getLoad().a(jA, false);
        a(com.ironsource.n1.a.LoadedSuccessfully);
        com.json.d0 d0Var2 = this.loadListener;
        if (d0Var2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            d0Var = d0Var2;
        }
        d0Var.a(this);
    }

    private final void D() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        if (this.isInstanceOpened) {
            return;
        }
        this.isInstanceOpened = true;
        this.adTools.getEventSender().getAdInteraction().g(k());
        a(com.ironsource.n1.a.ShowedSuccessfully);
        com.json.c0 c0Var = this.listener.get();
        if (c0Var != null) {
            c0Var.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        G();
        if (this.isInstanceFailed) {
            return;
        }
        A();
    }

    private final void F() {
        G();
        com.ironsource.y.b bVarA = a();
        this.timeoutRunnable = bVarA;
        if (bVarA != null) {
            this.adTools.a((com.json.dr) bVarA, java.util.concurrent.TimeUnit.SECONDS.toMillis(n()));
        }
    }

    private final void G() {
        com.json.dr drVar = this.timeoutRunnable;
        if (drVar != null) {
            this.adTools.b(drVar);
            this.timeoutRunnable = null;
        }
    }

    private final com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.json.z instanceData) {
        return this.adTools.a(instanceData);
    }

    private final com.ironsource.y.b a() {
        return new com.ironsource.y.b();
    }

    public static /* synthetic */ java.lang.String a(com.json.y yVar, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return yVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int errorCode, java.lang.String errorMessage) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("error = " + errorCode + ", " + errorMessage));
        G();
        this.isInstanceFailed = true;
        a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, errorCode, errorMessage, com.json.fb.a(this.loadDuration));
        a(new com.json.mediationsdk.logger.IronSourceError(errorCode, errorMessage));
    }

    private final void a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int errorCode, java.lang.String errorMessage) {
        long jA = com.json.fb.a(this.loadDuration);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + errorCode + ", " + errorMessage));
        G();
        c();
        a(adapterErrorType, errorCode, errorMessage, jA);
        this.isInstanceFailed = true;
        a(new com.json.mediationsdk.logger.IronSourceError(errorCode, errorMessage));
    }

    private final void a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType errorType, int errorCode, java.lang.String errorMessage, long duration) {
        if (errorType == com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.adTools.getEventSender().getLoad().a(duration, errorCode);
        } else {
            this.adTools.getEventSender().getLoad().a(duration, errorCode, errorMessage, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.json.mediationsdk.logger.IronSourceError error) {
        a(com.ironsource.n1.a.FailedToLoad);
        com.json.d0 d0Var = this.loadListener;
        if (d0Var == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            d0Var = null;
        }
        d0Var.a(error, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.y this$0, com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.y this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.y this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.y this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D();
    }

    private final int n() {
        java.lang.Integer numF = this.instanceData.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.instanceData.i().getInstanceLoadTimeout() : numF.intValue();
    }

    protected final java.lang.String a(java.lang.String message) {
        return this.adTools.a(message, this.instanceSignature);
    }

    public final void a(com.json.d0 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        this.loadListener = listener;
        this.isInstanceLoading = true;
        try {
            this.adTools.getEventSender().getLoad().a(false);
            this.loadDuration = new com.json.fb();
            F();
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter = this.adapter;
            kotlin.jvm.internal.Intrinsics.checkNotNull(baseAdAdapter);
            com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.instanceData.getAdData(), com.json.environment.ContextProvider.getInstance().getApplicationContext(), new com.ironsource.y.a());
            } else {
                java.lang.String str = "loadAd - network adapter not available " + this.instanceSignature;
                ironLog.error(a(str));
                a(com.json.x1.c(this.instanceData.getAdFormat()), str);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str2));
            this.adTools.getEventSender().getTroubleshoot().g(str2);
            a(com.json.x1.c(this.instanceData.getAdFormat()), str2);
        }
    }

    public abstract void a(com.json.g0 adInstancePresenter);

    protected final void a(com.ironsource.n1.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        this.instanceData.a(performance);
    }

    protected final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.adTools.a(callback);
    }

    public final void a(boolean status) {
        this.adTools.getEventSender().getAdInteraction().a(status);
    }

    public void b() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        G();
        this.adTools.getEventSender().getLoad().a(this.sessionDepth);
    }

    public void c() {
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.ironsource.mediationsdk.IronSource.AD_UNIT getAdFormat() {
        return this.adFormat;
    }

    public com.unity3d.mediation.LevelPlayAdInfo e() {
        java.lang.String strB = this.instanceData.i().getAdProperties().getAdUnitId();
        java.lang.String string = this.instanceData.getAdFormat().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "instanceData.adFormat.toString()");
        return new com.unity3d.mediation.LevelPlayAdInfo(strB, string, this.instanceData.n().a(k()), this.instanceData.n().d(), null, null, 48, null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final com.json.t2 getAdTools() {
        return this.adTools;
    }

    public final com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> g() {
        return this.adapter;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.json.j5 getAuctionResponseItem() {
        return this.auctionResponseItem;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final com.json.mediationsdk.adunit.adapter.utility.AdData getCurrentAdData() {
        return this.currentAdData;
    }

    protected final com.json.mediationsdk.model.Placement j() {
        return this.instanceData.i().getAdProperties().getPlacement();
    }

    protected final java.lang.String k() {
        return this.instanceData.i().l();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final com.json.j5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    protected final com.json.z getInstanceData() {
        return this.instanceData;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final java.lang.String getInstanceName() {
        return this.instanceName;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new java.lang.Runnable() { // from class: com.ironsource.y$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.y.c(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, final int errorCode, final java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new java.lang.Runnable() { // from class: com.ironsource.y$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.y.a(this.f$0, adapterErrorType, errorCode, errorMessage);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        a(new java.lang.Runnable() { // from class: com.ironsource.y$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.y.d(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        a(new java.lang.Runnable() { // from class: com.ironsource.y$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.y.e(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final java.lang.String getInstanceSignature() {
        return this.instanceSignature;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getInstanceType() {
        return this.instanceType;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final com.json.f0 getPerformance() {
        return this.performance;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getSessionDepth() {
        return this.sessionDepth;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsBidder() {
        return this.isBidder;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsInstanceFailed() {
        return this.isInstanceFailed;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsInstanceLoaded() {
        return this.isInstanceLoaded;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsInstanceLoading() {
        return this.isInstanceLoading;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsInstanceOpened() {
        return this.isInstanceOpened;
    }

    public boolean y() {
        return this.isInstanceLoaded;
    }

    protected abstract void z();
}
