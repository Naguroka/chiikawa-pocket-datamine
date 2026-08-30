package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidTriggerInitializationCompletedRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTriggerInitializationCompletedRequest implements com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidTriggerInitializationCompletedRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest", f = "AndroidTriggerInitializationCompletedRequest.kt", i = {0, 0, 1, 1}, l = {32, 34}, m = "invoke", n = {"this", "startTime", "this", "startTime"}, s = {"L$0", "J$0", "L$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidTriggerInitializationCompletedRequest(com.unity3d.ads.core.domain.GetInitializationCompletedRequest getInitializationCompletedRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: Exception -> 0x0113, TRY_LEAVE, TryCatch #5 {Exception -> 0x0113, blocks: (B:36:0x00c5, B:38:0x00cd), top: B:65:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1 anonymousClass1;
        long jM2767markNowz9LOYto;
        char c;
        char c2;
        long j;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2;
        long j2;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest3;
        long j3;
        java.lang.String message;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1(continuation);
        }
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object objInvoke = anonymousClass2.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_completed_started", null, null, null, null, 30, null);
            try {
                com.unity3d.ads.core.domain.GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                anonymousClass2.L$0 = this;
                anonymousClass2.J$0 = jM2767markNowz9LOYto;
                anonymousClass2.label = 1;
                objInvoke = getInitializationCompletedRequest.invoke(anonymousClass2);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidTriggerInitializationCompletedRequest2 = this;
                j2 = jM2767markNowz9LOYto;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke;
                com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = androidTriggerInitializationCompletedRequest2.gatewayClient;
                com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED;
                anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest2;
                anonymousClass2.J$0 = j2;
                anonymousClass2.label = 2;
                androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                j3 = j2;
                c = 1;
                c2 = 2;
                objInvoke = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                j = j3;
                universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objInvoke;
                if (universalResponse.hasError()) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                    java.lang.Double dBoxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j)));
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
                    pairArr[c] = kotlin.TuplesKt.to("reason", "gateway");
                    pairArr[c2] = kotlin.TuplesKt.to("reason_debug", universalResponse.getError().getErrorText());
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_completed_task_failure_time", dBoxDouble, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 24, null);
                }
            } catch (java.lang.Exception e) {
                e = e;
                c = 1;
                c2 = 2;
                j = jM2767markNowz9LOYto;
                androidTriggerInitializationCompletedRequest = this;
            }
        } else {
            if (i == 1) {
                jM2767markNowz9LOYto = anonymousClass2.J$0;
                androidTriggerInitializationCompletedRequest2 = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(objInvoke);
                    j2 = jM2767markNowz9LOYto;
                    try {
                        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke2 = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient2 = androidTriggerInitializationCompletedRequest2.gatewayClient;
                        com.unity3d.ads.core.data.model.OperationType operationType2 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED;
                        anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest2;
                        anonymousClass2.J$0 = j2;
                        anonymousClass2.label = 2;
                        androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                        j3 = j2;
                        c = 1;
                        c2 = 2;
                        try {
                            objInvoke = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, anonymousClass2, 1, null);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                            j = j3;
                            universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objInvoke;
                            if (universalResponse.hasError()) {
                                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                                java.lang.Double dBoxDouble2 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j)));
                                kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                                pairArr2[0] = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
                                pairArr2[c] = kotlin.TuplesKt.to("reason", "gateway");
                                pairArr2[c2] = kotlin.TuplesKt.to("reason_debug", universalResponse.getError().getErrorText());
                                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_initialize_completed_task_failure_time", dBoxDouble2, kotlin.collections.MapsKt.mapOf(pairArr2), null, null, 24, null);
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                            j = j3;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                        j3 = j2;
                        c = 1;
                        c2 = 2;
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    j = jM2767markNowz9LOYto;
                    androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                    c = 1;
                    c2 = 2;
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = anonymousClass2.J$0;
                androidTriggerInitializationCompletedRequest = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(objInvoke);
                    c = 1;
                    c2 = 2;
                    try {
                        universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objInvoke;
                        if (universalResponse.hasError()) {
                            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent3 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                            java.lang.Double dBoxDouble3 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j)));
                            kotlin.Pair[] pairArr3 = new kotlin.Pair[3];
                            pairArr3[0] = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
                            pairArr3[c] = kotlin.TuplesKt.to("reason", "gateway");
                            pairArr3[c2] = kotlin.TuplesKt.to("reason_debug", universalResponse.getError().getErrorText());
                            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_initialize_completed_task_failure_time", dBoxDouble3, kotlin.collections.MapsKt.mapOf(pairArr3), null, null, 24, null);
                        }
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent4 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                        java.lang.Double dBoxDouble4 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j)));
                        kotlin.Pair[] pairArr4 = new kotlin.Pair[3];
                        pairArr4[0] = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
                        pairArr4[c] = kotlin.TuplesKt.to("reason", "uncaught_exception");
                        message = e.getMessage();
                        if (message == null) {
                            message = "unknown";
                        }
                        pairArr4[c2] = kotlin.TuplesKt.to("reason_debug", message);
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, "native_initialize_completed_task_failure_time", dBoxDouble4, kotlin.collections.MapsKt.mapOf(pairArr4), null, null, 24, null);
                    }
                } catch (java.lang.Exception e6) {
                    e = e6;
                    c = 1;
                    c2 = 2;
                }
            }
            c = 1;
            c2 = 2;
            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent5 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
            java.lang.Double dBoxDouble5 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j)));
            kotlin.Pair[] pairArr5 = new kotlin.Pair[3];
            pairArr5[0] = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
            pairArr5[c] = kotlin.TuplesKt.to("reason", "uncaught_exception");
            message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            pairArr5[c2] = kotlin.TuplesKt.to("reason_debug", message);
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent5, "native_initialize_completed_task_failure_time", dBoxDouble5, kotlin.collections.MapsKt.mapOf(pairArr5), null, null, 24, null);
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialize_completed_task_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j))), null, null, null, 28, null);
        return kotlin.Unit.INSTANCE;
    }
}
