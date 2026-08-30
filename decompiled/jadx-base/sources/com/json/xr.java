package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u0005\u001a\u00020\u0017J\u0006\u0010\u000e\u001a\u00020\u0004R\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\r\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0017\u0010(\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\b\u0010'¨\u0006+"}, d2 = {"Lcom/ironsource/xr;", "", "Ljava/lang/Runnable;", "runnable", "", "c", "", "delay", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "callback", "d", "Lcom/ironsource/dr;", "safeRunnable", "b", "e", "", com.ironsource.y8.h.W, "value", "elapsedTime", "Lcom/ironsource/hs$a;", "responseOrigin", "Landroid/content/Context;", "context", "", "appKey", "Lcom/ironsource/hs;", "Lcom/ironsource/a4;", "reporterSettings", "Lcom/ironsource/vr;", "initStatus", "Lcom/ironsource/vj;", "Lcom/ironsource/vj;", "()Lcom/ironsource/vj;", "globalDataWriter", "Lcom/ironsource/si;", "Lcom/ironsource/si;", "thread", "Lcom/ironsource/if;", "Lcom/ironsource/if;", "()Lcom/ironsource/if;", "deviceInfoService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.vj globalDataWriter = new com.json.vj();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.si thread = new com.json.si(com.json.environment.thread.IronSourceThreadManager.INSTANCE.getInitHandler());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.Cif deviceInfoService = com.json.im.INSTANCE.d().f();

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/xr$a", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f3563a;

        a(java.lang.Runnable runnable) {
            this.f3563a = runnable;
        }

        @Override // com.json.dr
        public void a() {
            this.f3563a.run();
        }
    }

    public static /* synthetic */ void a(com.json.xr xrVar, com.json.dr drVar, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        xrVar.a(drVar, j);
    }

    public static /* synthetic */ void a(com.json.xr xrVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        xrVar.a(runnable, j);
    }

    public final com.json.hs a(android.content.Context context, java.lang.String appKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.json.mediationsdk.p.m().a(context, appKey);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.Cif getDeviceInfoService() {
        return this.deviceInfoService;
    }

    public final java.lang.String a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String strB = com.json.mediationsdk.p.m().b(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    public final void a(long elapsedTime, com.ironsource.hs.a responseOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.json.mediationsdk.p.m().a(elapsedTime, responseOrigin);
    }

    public final void a(com.json.a4 reporterSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        com.json.l9.d().a(reporterSettings.b(), reporterSettings.getCom.ironsource.c4.c java.lang.String(), reporterSettings.getCom.ironsource.c4.d java.lang.String(), reporterSettings.getIsANRIncluded(), com.json.mediationsdk.utils.IronSourceUtils.getSessionId(), reporterSettings.getDefaultAnrTimeout(), reporterSettings.getIsIgnoreDebugger());
    }

    public final void a(com.json.dr safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (java.lang.Object) null);
    }

    public final void a(com.json.dr safeRunnable, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable, delay);
    }

    public final void a(com.json.vr initStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        com.json.wr.f3542a.a(initStatus);
    }

    public final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.thread.a(callback);
    }

    public final void a(java.lang.Runnable runnable, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, delay);
    }

    public final void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (android.text.TextUtils.isEmpty(value)) {
            return;
        }
        com.json.zd.a().a(key, value);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.vj getGlobalDataWriter() {
        return this.globalDataWriter;
    }

    public final java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String strK = this.deviceInfoService.K(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strK, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strK;
    }

    public final void b(com.json.dr safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable);
    }

    public final void b(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.json.environment.thread.IronSourceThreadManager.postMediationBackgroundTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void c(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.thread.b(runnable);
    }

    public final boolean c() {
        return com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse();
    }

    public final boolean c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.json.mediationsdk.utils.IronSourceUtils.isNetworkConnected(context);
    }

    public final void d() {
        com.json.mediationsdk.p.m().U();
    }

    public final void d(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final void e() {
        com.json.wq.i().a(new com.json.wb(140, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final void e(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new com.ironsource.xr.a(callback), 0L, 2, null);
    }
}
