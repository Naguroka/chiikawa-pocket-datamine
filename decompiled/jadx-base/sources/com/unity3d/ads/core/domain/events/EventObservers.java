package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: EventObservers.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/events/EventObservers;", "", "operativeEventObserver", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "diagnosticEventObserver", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "transactionEventObserver", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "(Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;)V", "getDiagnosticEventObserver", "()Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "getOperativeEventObserver", "()Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "getTransactionEventObserver", "()Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventObservers {
    private final com.unity3d.ads.core.domain.events.DiagnosticEventObserver diagnosticEventObserver;
    private final com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver;
    private final com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: EventObservers.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", i = {0, 1}, l = {16, 17, 18}, m = "invoke", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.events.EventObservers.this.invoke(this);
        }
    }

    public EventObservers(com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver, com.unity3d.ads.core.domain.events.DiagnosticEventObserver diagnosticEventObserver, com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventObserver, "operativeEventObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventObserver, "diagnosticEventObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final com.unity3d.ads.core.domain.events.OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final com.unity3d.ads.core.domain.events.DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final com.unity3d.ads.core.domain.events.TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.events.EventObservers eventObservers;
        com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver;
        if (continuation instanceof com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver = this.operativeEventObserver;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (operativeEventObserver.invoke(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            eventObservers = this;
        } else {
            if (i == 1) {
                eventObservers = (com.unity3d.ads.core.domain.events.EventObservers) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                eventObservers = (com.unity3d.ads.core.domain.events.EventObservers) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                transactionEventObserver = eventObservers.transactionEventObserver;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (transactionEventObserver.invoke(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.core.domain.events.DiagnosticEventObserver diagnosticEventObserver = eventObservers.diagnosticEventObserver;
        anonymousClass1.L$0 = eventObservers;
        anonymousClass1.label = 2;
        if (diagnosticEventObserver.invoke(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        transactionEventObserver = eventObservers.transactionEventObserver;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (transactionEventObserver.invoke(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
