package com.unity3d.ads.core.domain.om;

/* JADX INFO: compiled from: AndroidOmImpressionOccurred.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmImpressionOccurred;", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "signalLoaded", "", "(Lcom/unity3d/ads/core/data/model/AdObject;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidOmImpressionOccurred implements com.unity3d.ads.core.domain.om.OmImpressionOccurred {
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOmImpressionOccurred.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred", f = "AndroidOmImpressionOccurred.kt", i = {0, 0}, l = {15}, m = "invoke", n = {"this", "adObject"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.this.invoke(null, false, this);
        }
    }

    public AndroidOmImpressionOccurred(com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject adObject, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred androidOmImpressionOccurred;
        if (continuation instanceof com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred.AnonymousClass1(continuation);
        }
        java.lang.Object objImpressionOccurred = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objImpressionOccurred);
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            com.google.protobuf.ByteString opportunityId = adObject.getOpportunityId();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = adObject;
            anonymousClass1.label = 1;
            objImpressionOccurred = openMeasurementRepository.impressionOccurred(opportunityId, z, anonymousClass1);
            if (objImpressionOccurred == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidOmImpressionOccurred = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adObject = (com.unity3d.ads.core.data.model.AdObject) anonymousClass1.L$1;
            androidOmImpressionOccurred = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(objImpressionOccurred);
        }
        com.unity3d.ads.core.data.model.AdObject adObject2 = adObject;
        com.unity3d.ads.core.data.model.OMResult oMResult = (com.unity3d.ads.core.data.model.OMResult) objImpressionOccurred;
        if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success) {
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidOmImpressionOccurred.sendDiagnosticEvent, "om_impression_occurred_success", null, null, null, adObject2, 14, null);
        } else if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Failure) {
            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidOmImpressionOccurred.sendDiagnosticEvent;
            java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            com.unity3d.ads.core.data.model.OMResult.Failure failure = (com.unity3d.ads.core.data.model.OMResult.Failure) oMResult;
            mapCreateMapBuilder.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                mapCreateMapBuilder.put("reason_debug", failure.getReasonDebug());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_impression_occurred_failure", null, kotlin.collections.MapsKt.build(mapCreateMapBuilder), null, adObject2, 10, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
