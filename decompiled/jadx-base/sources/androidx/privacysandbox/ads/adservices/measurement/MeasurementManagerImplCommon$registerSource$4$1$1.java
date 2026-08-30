package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", i = {}, l = {org.objectweb.asm.Opcodes.LXOR}, m = "invokeSuspend", n = {}, s = {})
final class MeasurementManagerImplCommon$registerSource$4$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest $request;
    final /* synthetic */ android.net.Uri $uri;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeasurementManagerImplCommon$registerSource$4$1$1(androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon, android.net.Uri uri, androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = measurementManagerImplCommon;
        this.$uri = uri;
        this.$request = sourceRegistrationRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1(this.this$0, this.$uri, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            android.net.Uri uri = this.$uri;
            androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            this.L$0 = measurementManagerImplCommon;
            this.L$1 = uri;
            this.L$2 = sourceRegistrationRequest;
            this.label = 1;
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1 measurementManagerImplCommon$registerSource$4$1$1 = this;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(measurementManagerImplCommon$registerSource$4$1$1), 1);
            cancellableContinuationImpl.initCancellability();
            measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, sourceRegistrationRequest.getInputEvent(), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(measurementManagerImplCommon$registerSource$4$1$1);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
