package com.unity3d.services;

/* JADX INFO: compiled from: SDKErrorHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sdkMetricsSender", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)V", com.ironsource.y8.h.W, "Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "getKey", "()Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getShortenedStackTrace", "", "e", "", "maxLines", "", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "retrieveCoroutineName", "sendDiagnostic", "name", "reason", "scopeName", "stackTrace", "sendMetric", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SDKErrorHandler implements kotlinx.coroutines.CoroutineExceptionHandler {
    public static final java.lang.String UNITY_PACKAGE = "com.unity3d";
    public static final java.lang.String UNKNOWN_FILE = "unknown";
    private final com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;
    private final kotlinx.coroutines.CoroutineExceptionHandler.Companion key;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender sdkMetricsSender;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public SDKErrorHandler(kotlinx.coroutines.CoroutineDispatcher ioDispatcher, com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.services.core.request.metrics.SDKMetricsSender sdkMetricsSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(ioDispatcher), new kotlinx.coroutines.CoroutineName("SDKErrorHandler"));
        this.key = kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public kotlinx.coroutines.CoroutineExceptionHandler.Companion getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.String strRetrieveCoroutineName = retrieveCoroutineName(context);
        if (exception instanceof java.lang.NullPointerException) {
            str = "native_exception_npe";
        } else if (exception instanceof java.lang.OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (exception instanceof java.lang.IllegalStateException) {
            str = "native_exception_ise";
        } else if (exception instanceof java.lang.SecurityException) {
            str = "native_exception_se";
        } else {
            str = exception instanceof java.lang.RuntimeException ? "native_exception_re" : "native_exception";
        }
        java.lang.String str2 = str;
        boolean zInvoke = this.alternativeFlowReader.invoke();
        java.lang.String strRetrieveUnityCrashValue = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        com.unity3d.services.core.log.DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str2, strRetrieveUnityCrashValue, strRetrieveCoroutineName, getShortenedStackTrace(exception, 15));
        } else {
            sendMetric(new com.unity3d.services.core.request.metrics.Metric(str2, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1, reason: invalid class name */
    /* JADX INFO: compiled from: SDKErrorHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $name;
        final /* synthetic */ java.lang.String $reason;
        final /* synthetic */ java.lang.String $scopeName;
        final /* synthetic */ java.lang.String $stackTrace;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super com.unity3d.services.SDKErrorHandler.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.SDKErrorHandler.this.new AnonymousClass1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.SDKErrorHandler.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.services.SDKErrorHandler.this.sendDiagnosticEvent, this.$name, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", this.$reason), kotlin.TuplesKt.to("reason_debug", this.$stackTrace), kotlin.TuplesKt.to("coroutine_name", this.$scopeName)), null, null, 26, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    private final void sendDiagnostic(java.lang.String name, java.lang.String reason, java.lang.String scopeName, java.lang.String stackTrace) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.services.SDKErrorHandler.AnonymousClass1(name, reason, stackTrace, scopeName, null), 3, null);
    }

    private final void sendMetric(com.unity3d.services.core.request.metrics.Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    private final java.lang.String retrieveCoroutineName(kotlin.coroutines.CoroutineContext context) {
        java.lang.String name;
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) context.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        return (coroutineName == null || (name = coroutineName.getName()) == null) ? "unknown" : name;
    }

    private final java.lang.String getShortenedStackTrace(java.lang.Throwable e, int maxLines) {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            e.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.lang.String string = stringWriter.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "writer.toString()");
            return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.take(kotlin.text.StringsKt.lineSequence(kotlin.text.StringsKt.trim((java.lang.CharSequence) string).toString()), maxLines), "\n", null, null, 0, null, null, 62, null);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }
}
