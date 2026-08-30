package androidx.privacysandbox.ads.adservices.signals;

/* JADX INFO: compiled from: ProtectedSignalsManagerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0097@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl;", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "protectedSignalsManager", "Landroid/adservices/signals/ProtectedSignalsManager;", "(Landroid/adservices/signals/ProtectedSignalsManager;)V", "convertUpdateRequest", "Landroid/adservices/signals/UpdateSignalsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "updateSignals", "", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext12OptIn
public class ProtectedSignalsManagerImpl extends androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager {
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    public java.lang.Object updateSignals(androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest updateSignalsRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, continuation);
    }

    public ProtectedSignalsManagerImpl(android.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protectedSignalsManager, "protectedSignalsManager");
        this.protectedSignalsManager = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest request) {
        android.adservices.signals.UpdateSignalsRequest updateSignalsRequestBuild = new android.adservices.signals.UpdateSignalsRequest.Builder(request.getUpdateUri()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    static /* synthetic */ java.lang.Object updateSignals$suspendImpl(androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManagerImpl protectedSignalsManagerImpl, androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest updateSignalsRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
