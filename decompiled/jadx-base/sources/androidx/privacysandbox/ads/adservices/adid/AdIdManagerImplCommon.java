package androidx.privacysandbox.ads.adservices.adid;

/* JADX INFO: compiled from: AdIdManagerImplCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0083@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "mAdIdManager", "Landroid/adservices/adid/AdIdManager;", "(Landroid/adservices/adid/AdIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", com.json.hs.n, "Landroid/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AdIdManagerImplCommon extends androidx.privacysandbox.ads.adservices.adid.AdIdManager {
    private final android.adservices.adid.AdIdManager mAdIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1, reason: invalid class name */
    /* JADX INFO: compiled from: AdIdManagerImplCommon.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", i = {}, l = {40}, m = "getAdId$suspendImpl", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.getAdId$suspendImpl(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.this, this);
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    public java.lang.Object getAdId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> continuation) {
        return getAdId$suspendImpl(this, continuation);
    }

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    static /* synthetic */ java.lang.Object getAdId$suspendImpl(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon adIdManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> continuation) {
        androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.AnonymousClass1 anonymousClass1;
        if (continuation instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.AnonymousClass1) {
            anonymousClass1 = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = adIdManagerImplCommon.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = adIdManagerImplCommon.new AnonymousClass1(continuation);
        }
        java.lang.Object adIdAsyncInternal = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(adIdAsyncInternal);
            anonymousClass1.L$0 = adIdManagerImplCommon;
            anonymousClass1.label = 1;
            adIdAsyncInternal = adIdManagerImplCommon.getAdIdAsyncInternal(anonymousClass1);
            if (adIdAsyncInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adIdManagerImplCommon = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(adIdAsyncInternal);
        }
        return adIdManagerImplCommon.convertResponse((android.adservices.adid.AdId) adIdAsyncInternal);
    }

    private final androidx.privacysandbox.ads.adservices.adid.AdId convertResponse(android.adservices.adid.AdId response) {
        java.lang.String adId = response.getAdId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
        return new androidx.privacysandbox.ads.adservices.adid.AdId(adId, response.isLimitAdTrackingEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getAdIdAsyncInternal(kotlin.coroutines.Continuation<? super android.adservices.adid.AdId> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mAdIdManager.getAdId(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
