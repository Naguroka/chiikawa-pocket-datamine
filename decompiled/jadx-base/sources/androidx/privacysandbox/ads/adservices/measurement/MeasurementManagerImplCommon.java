package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0097@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0097@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0097@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0097@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001cH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001fH\u0097@¢\u0006\u0002\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "mMeasurementManager", "Landroid/adservices/measurement/MeasurementManager;", "(Landroid/adservices/measurement/MeasurementManager;)V", "getMMeasurementManager", "()Landroid/adservices/measurement/MeasurementManager;", "deleteRegistrations", "", "deletionRequest", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMeasurementApiStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSource", "attributionSource", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerTrigger", "trigger", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebSource", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebTrigger", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MeasurementManagerImplCommon extends androidx.privacysandbox.ads.adservices.measurement.MeasurementManager {
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object deleteRegistrations(androidx.privacysandbox.ads.adservices.measurement.DeletionRequest deletionRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object getMeasurementApiStatus(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return getMeasurementApiStatus$suspendImpl(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerSource(android.net.Uri uri, android.view.InputEvent inputEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return registerSource$suspendImpl(this, uri, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.RegisterSourceOptIn
    public java.lang.Object registerSource(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerTrigger(android.net.Uri uri, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return registerTrigger$suspendImpl(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerWebSource(androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public java.lang.Object registerWebTrigger(androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, continuation);
    }

    protected final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4, reason: invalid class name */
    /* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest $request;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest, androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4> continuation) {
            super(2, continuation);
            this.$request = sourceRegistrationRequest;
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4 anonymousClass4 = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4(this.$request, this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            java.util.List<android.net.Uri> registrationUris = this.$request.getRegistrationUris();
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            java.util.Iterator<T> it = registrationUris.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1(measurementManagerImplCommon, (android.net.Uri) it.next(), sourceRegistrationRequest, null), 3, null);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.RegisterSourceOptIn
    static /* synthetic */ java.lang.Object registerSource$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objCoroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon.AnonymousClass4(sourceRegistrationRequest, measurementManagerImplCommon, null), continuation);
        return objCoroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Object deleteRegistrations$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, androidx.privacysandbox.ads.adservices.measurement.DeletionRequest deletionRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Object registerSource$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, android.net.Uri uri, android.view.InputEvent inputEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Object registerTrigger$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, android.net.Uri uri, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Object registerWebSource$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Object registerWebTrigger$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Object getMeasurementApiStatus$suspendImpl(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
