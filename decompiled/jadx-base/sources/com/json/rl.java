package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u001a\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007J\u001e\u0010\u0006\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\b\b\u0002\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0006\u001a\u00020\u0014J\u000e\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015J'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001bJ\u000e\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0018J\u001e\u0010\u0006\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0002J\u001e\u0010\u0006\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0004J(\u0010\u0006\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002J \u0010\u0006\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+¨\u0006/"}, d2 = {"Lcom/ironsource/rl;", "", "", "responseOrigin", "", "delayTimeAfterInitProcessInMS", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Runnable;", "runnable", "", "d", "b", "c", "delay", "callback", "e", "Lcom/ironsource/dr;", "safeRunnable", "Lkotlin/Function0;", "action", "Landroid/os/Handler;", "Landroid/content/Context;", "context", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormats", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "([Lcom/unity3d/mediation/LevelPlay$AdFormat;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "networkAdapter", "providerName", "", "duration", "Lcom/ironsource/hs$a;", "Lcom/ironsource/ir;", "error", com.json.op.d, "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "errorMessage", "adUnitId", "Lcom/ironsource/si;", "Lcom/ironsource/si;", "thread", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.si thread = new com.json.si(null, 1, null);

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/rl$a", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f3246a;

        a(java.lang.Runnable runnable) {
            this.f3246a = runnable;
        }

        @Override // com.json.dr
        public void a() {
            this.f3246a.run();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/rl$b", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f3247a;

        b(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.f3247a = function0;
        }

        @Override // com.json.dr
        public void a() {
            this.f3247a.invoke();
        }
    }

    private final java.lang.String a(java.lang.String responseOrigin, long delayTimeAfterInitProcessInMS) {
        return "responseOrigin=" + responseOrigin + ";delayTimeAfterInitProcess=" + delayTimeAfterInitProcessInMS;
    }

    public static /* synthetic */ void a(com.json.rl rlVar, com.json.dr drVar, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        rlVar.a(drVar, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.rl this$0, java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.thread.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.rl this$0, java.lang.Runnable runnable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    public static /* synthetic */ void a(com.json.rl rlVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        rlVar.a(runnable, j);
    }

    public static /* synthetic */ void a(com.json.rl rlVar, kotlin.jvm.functions.Function0 function0, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        rlVar.a((kotlin.jvm.functions.Function0<kotlin.Unit>) function0, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final com.json.rl this$0, final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: com.ironsource.rl$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                com.json.rl.a(this.f$0, runnable, j);
            }
        });
    }

    public final android.os.Handler a() {
        return this.thread.getHandler();
    }

    public final com.ironsource.mediationsdk.IronSource.AD_UNIT a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final void a(long duration, com.ironsource.hs.a responseOrigin, long delayTimeAfterInitProcessInMS) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put("duration", duration);
        java.lang.String strA = responseOrigin.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strA, "responseOrigin.value");
        jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a(strA, delayTimeAfterInitProcessInMS));
        com.json.rt.a(com.json.mediationsdk.utils.IronSourceConstants.SDK_INIT_SUCCESS, jSONObject);
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.json.mediationsdk.integration.IntegrationHelper.validateIntegration(context.getApplicationContext());
    }

    public final void a(com.json.dr safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (java.lang.Object) null);
    }

    public final void a(com.json.dr safeRunnable, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable, delay);
    }

    public final void a(com.json.ir error, long duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, error.c());
        jSONObject.put("reason", error.d());
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put("duration", duration);
        com.json.rt.a(com.json.mediationsdk.utils.IronSourceConstants.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.thread.a(callback);
    }

    public final void a(java.lang.Runnable runnable, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.rl.a(runnable), delay);
    }

    public final void a(java.lang.String adUnitId, int errorCode, java.lang.String errorMessage) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, errorCode);
        jSONObject.putOpt("reason", errorMessage);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        com.json.rt.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, int errorCode, java.lang.String errorMessage) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, errorCode);
        jSONObject.putOpt("reason", errorMessage);
        jSONObject.put("placement", placementName);
        jSONObject.put(com.json.bl.EVENTS_LEVEL_PLAY_AD_FORMAT_NAME, adFormat.getValue());
        jSONObject.put("adf", com.json.rt.b(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        com.json.rt.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        a((com.json.dr) new com.ironsource.rl.b(action), delay);
    }

    public final boolean a(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter, com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat, java.lang.String providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        return com.json.rt.a(networkAdapter, adFormat, providerName);
    }

    public final com.ironsource.mediationsdk.IronSource.AD_UNIT[] a(com.unity3d.mediation.LevelPlay.AdFormat... adFormats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) arrayList.toArray(new com.ironsource.mediationsdk.IronSource.AD_UNIT[0]);
    }

    public final void b(com.json.dr safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable);
    }

    public final void b(final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new java.lang.Runnable() { // from class: com.ironsource.rl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.rl.a(this.f$0, runnable);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    public final void b(java.lang.String adUnitId, int errorCode, java.lang.String errorMessage) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, errorCode);
        jSONObject.putOpt("reason", errorMessage);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        com.json.rt.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void c(final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new java.lang.Runnable() { // from class: com.ironsource.rl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.rl.b(this.f$0, runnable);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    public final void d(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.thread.b(runnable);
    }

    public final void e(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }
}
