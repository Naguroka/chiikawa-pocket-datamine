package com.unity3d.ads.core.domain.om;

/* JADX INFO: compiled from: AndroidInitializeOMSDK.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidInitializeOMSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "context", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "omRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidInitializeOMSDK implements com.unity3d.ads.core.domain.om.InitializeOMSDK {
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository omRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeOMSDK.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", i = {0, 0}, l = {27}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.this.invoke(this);
        }
    }

    public AndroidInitializeOMSDK(android.content.Context context, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.OpenMeasurementRepository omRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK androidInitializeOMSDK;
        long j;
        if (continuation instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1(continuation);
        }
        java.lang.Object objActivateOM = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objActivateOM);
            if (this.sessionRepository.isOmEnabled()) {
                long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", null, null, null, null, 30, null);
                com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                android.content.Context context = this.context;
                anonymousClass1.L$0 = this;
                anonymousClass1.J$0 = jM2767markNowz9LOYto;
                anonymousClass1.label = 1;
                objActivateOM = openMeasurementRepository.activateOM(context, anonymousClass1);
                if (objActivateOM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidInitializeOMSDK = this;
                j = jM2767markNowz9LOYto;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = anonymousClass1.J$0;
        androidInitializeOMSDK = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK) anonymousClass1.L$0;
        kotlin.ResultKt.throwOnFailure(objActivateOM);
        com.unity3d.ads.core.data.model.OMResult oMResult = (com.unity3d.ads.core.data.model.OMResult) objActivateOM;
        if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success) {
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidInitializeOMSDK.sendDiagnosticEvent, "om_activate_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j))), null, null, null, 28, null);
        } else if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Failure) {
            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidInitializeOMSDK.sendDiagnosticEvent;
            java.lang.Double dBoxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j)));
            java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            com.unity3d.ads.core.data.model.OMResult.Failure failure = (com.unity3d.ads.core.data.model.OMResult.Failure) oMResult;
            mapCreateMapBuilder.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                mapCreateMapBuilder.put("reason_debug", failure.getReasonDebug());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", dBoxDouble, kotlin.collections.MapsKt.build(mapCreateMapBuilder), null, null, 24, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
