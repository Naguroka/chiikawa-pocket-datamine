package androidx.privacysandbox.ads.adservices.appsetid;

/* JADX INFO: compiled from: AppSetIdManagerImplCommon.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "mAppSetIdManager", "Landroid/adservices/appsetid/AppSetIdManager;", "(Landroid/adservices/appsetid/AppSetIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", com.json.hs.n, "Landroid/adservices/appsetid/AppSetId;", "getAppSetId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AppSetIdManagerImplCommon extends androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager {
    private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppSetIdManagerImplCommon.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", i = {}, l = {38}, m = "getAppSetId$suspendImpl", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.getAppSetId$suspendImpl(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.this, this);
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
    public java.lang.Object getAppSetId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> continuation) {
        return getAppSetId$suspendImpl(this, continuation);
    }

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
        this.mAppSetIdManager = mAppSetIdManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    static /* synthetic */ java.lang.Object getAppSetId$suspendImpl(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon appSetIdManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> continuation) {
        androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.AnonymousClass1 anonymousClass1;
        if (continuation instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.AnonymousClass1) {
            anonymousClass1 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = appSetIdManagerImplCommon.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = appSetIdManagerImplCommon.new AnonymousClass1(continuation);
        }
        java.lang.Object appSetIdAsyncInternal = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(appSetIdAsyncInternal);
            anonymousClass1.L$0 = appSetIdManagerImplCommon;
            anonymousClass1.label = 1;
            appSetIdAsyncInternal = appSetIdManagerImplCommon.getAppSetIdAsyncInternal(anonymousClass1);
            if (appSetIdAsyncInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSetIdManagerImplCommon = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(appSetIdAsyncInternal);
        }
        return appSetIdManagerImplCommon.convertResponse((android.adservices.appsetid.AppSetId) appSetIdAsyncInternal);
    }

    private final androidx.privacysandbox.ads.adservices.appsetid.AppSetId convertResponse(android.adservices.appsetid.AppSetId response) {
        if (response.getScope() == 1) {
            java.lang.String id = response.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "response.id");
            return new androidx.privacysandbox.ads.adservices.appsetid.AppSetId(id, 1);
        }
        java.lang.String id2 = response.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "response.id");
        return new androidx.privacysandbox.ads.adservices.appsetid.AppSetId(id2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getAppSetIdAsyncInternal(kotlin.coroutines.Continuation<? super android.adservices.appsetid.AppSetId> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mAppSetIdManager.getAppSetId(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
