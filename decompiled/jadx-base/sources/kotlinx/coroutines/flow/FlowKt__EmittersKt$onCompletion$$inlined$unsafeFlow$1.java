package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function3 $action$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_onCompletion$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {115, 122, 129}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        kotlinx.coroutines.flow.ThrowingCollector throwingCollector;
        kotlin.jvm.functions.Function3 function3;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector2;
        java.lang.Object objInvoke;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                kotlinx.coroutines.flow.Flow flow = this.$this_onCompletion$inlined;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = flowCollector;
                anonymousClass1.label = 1;
                if (flow.collect(flowCollector, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                safeCollector = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector, anonymousClass1.getContext());
                kotlin.jvm.functions.Function3 function4 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.$action$inlined;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                kotlin.jvm.internal.InlineMarker.mark(6);
                objInvoke = function4.invoke(safeCollector, null, anonymousClass1);
                kotlin.jvm.internal.InlineMarker.mark(7);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th2) {
                th = th2;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                throwingCollector = new kotlinx.coroutines.flow.ThrowingCollector(th);
                function3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.$action$inlined;
                anonymousClass1.L$0 = th;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(throwingCollector, function3, th, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            }
        }
        if (i != 1) {
            if (i == 2) {
                java.lang.Throwable th3 = (java.lang.Throwable) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th3;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (kotlinx.coroutines.flow.internal.SafeCollector) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                safeCollector2.releaseIntercepted();
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th4) {
                th = th4;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.L$0;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            safeCollector = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector, anonymousClass1.getContext());
            try {
                kotlin.jvm.functions.Function3 function5 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.$action$inlined;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                kotlin.jvm.internal.InlineMarker.mark(6);
                objInvoke = function5.invoke(safeCollector, null, anonymousClass1);
                kotlin.jvm.internal.InlineMarker.mark(7);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th5) {
                th = th5;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            throwingCollector = new kotlinx.coroutines.flow.ThrowingCollector(th);
            function3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.$action$inlined;
            anonymousClass1.L$0 = th;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(throwingCollector, function3, th, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th;
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function3 function3) {
        this.$this_onCompletion$inlined = flow;
        this.$action$inlined = function3;
    }
}
