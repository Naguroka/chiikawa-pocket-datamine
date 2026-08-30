package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\fj\u0002`\r0\u000bH\u0003J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u0005\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/ironsource/aq;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "", "", "d", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "c", "reason", "Lcom/ironsource/mf;", "Lcom/ironsource/mf;", "eventManager", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "getTimeFunction", "Lcom/ironsource/sf;", "Lcom/ironsource/sf;", "serviceProvider", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lcom/ironsource/mf;Lkotlin/jvm/functions/Function0;Lcom/ironsource/sf;Ljava/util/concurrent/Executor;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mf eventManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Long> getTimeFunction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.sf serviceProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.util.concurrent.Executor executor;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.aq.a f2512a = new com.ironsource.aq.a();

        a() {
            super(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long invoke() {
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u0016¨\u0006\n"}, d2 = {"com/ironsource/aq$b", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "result", "", "onResult", "error", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.aq.this.a(error.getMessage());
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object result) {
            com.json.aq.this.c();
        }
    }

    public aq() {
        this(null, null, null, null, 15, null);
    }

    public aq(com.json.mf eventManager, kotlin.jvm.functions.Function0<java.lang.Long> getTimeFunction, com.json.sf serviceProvider, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        this.eventManager = eventManager;
        this.getTimeFunction = getTimeFunction;
        this.serviceProvider = serviceProvider;
        this.executor = executor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ aq(com.json.mf mfVar, kotlin.jvm.functions.Function0 function0, com.json.sf sfVar, java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            mfVar = com.json.wq.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mfVar, "getInstance()");
        }
        function0 = (i & 2) != 0 ? com.ironsource.aq.a.f2512a : function0;
        sfVar = (i & 4) != 0 ? com.json.im.INSTANCE.d() : sfVar;
        if ((i & 8) != 0) {
            executor = java.util.concurrent.Executors.newSingleThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
        this(mfVar, function0, sfVar, executor);
    }

    private final android.net.Uri a(android.content.Context context) {
        com.json.Cif cifF = this.serviceProvider.f();
        java.lang.String connectionType = com.json.mediationsdk.utils.IronSourceUtils.getConnectionType(context);
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", android.os.Build.VERSION.RELEASE).appendQueryParameter("apiLevel", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter(com.ironsource.y8.i.l, android.os.Build.MODEL).appendQueryParameter("sdkVersion", com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(com.json.ce.K0, cifF.p(context)).appendQueryParameter(com.json.ce.A0, cifF.E(context)).appendQueryParameter("auid", cifF.s(context)).appendQueryParameter("isFirstSession", java.lang.String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(com.json.ce.Y, java.lang.String.valueOf(com.json.h1.a())).appendQueryParameter("origin", "1").appendQueryParameter(com.ironsource.aa.a.d, java.lang.String.valueOf(this.getTimeFunction.invoke().longValue())).appendQueryParameter(com.ironsource.y8.i.x, cifF.b(context)).appendQueryParameter("deviceCarrier", cifF.j(context)).appendQueryParameter(com.ironsource.y8.i.t, connectionType).appendQueryParameter(com.json.u8.b, java.lang.String.valueOf(kotlin.text.StringsKt.equals(connectionType, com.json.u8.b, true))).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    private final android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> a() {
        return new com.ironsource.aq.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.lang.String reason) {
        this.eventManager.a(new com.json.wb(56, new org.json.JSONObject().put("reason", reason)));
    }

    private final java.lang.String b() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMapC = com.json.lk.b().c();
        java.util.List<java.lang.String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.json.mediationsdk.metadata.a.b) : null;
        java.lang.String str = list != null ? (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) list) : null;
        return str == null ? "" : str;
    }

    private final boolean b(android.content.Context context) {
        return com.json.mediationsdk.utils.IronSourceUtils.getFirstSession(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.eventManager.a(new com.json.wb(55, null));
    }

    private final void d() {
        this.eventManager.a(new com.json.wb(54, null));
    }

    public final void c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            android.adservices.measurement.MeasurementManager measurementManagerA = com.json.h1.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.executor, a());
            }
        } catch (java.lang.Exception e) {
            a(e.getMessage());
            com.json.l9.d().a(e);
        }
    }
}
