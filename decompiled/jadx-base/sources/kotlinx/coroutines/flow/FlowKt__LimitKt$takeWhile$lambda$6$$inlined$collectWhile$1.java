package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2 $predicate$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {org.objectweb.asm.Opcodes.D2I, org.objectweb.asm.Opcodes.D2L}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
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
            return kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(kotlin.jvm.functions.Function2 function2, kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.$predicate$inlined = function2;
        this.$this_unsafeFlow$inlined = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1 anonymousClass1;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.AnonymousClass1(continuation);
        }
        java.lang.Object obj3 = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                java.lang.Object obj4 = anonymousClass1.L$1;
                kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj3);
                obj2 = obj4;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                obj = obj3;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj3);
            }
            if (z) {
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
        }
        kotlin.ResultKt.throwOnFailure(obj3);
        kotlin.jvm.functions.Function2 function2 = this.$predicate$inlined;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = t;
        anonymousClass1.label = 1;
        kotlin.jvm.internal.InlineMarker.mark(6);
        java.lang.Object objInvoke = function2.invoke(t, anonymousClass1);
        kotlin.jvm.internal.InlineMarker.mark(7);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objInvoke;
        obj2 = t;
        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = this;
        if (((java.lang.Boolean) obj).booleanValue()) {
            kotlinx.coroutines.flow.FlowCollector flowCollector = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.$this_unsafeFlow$inlined;
            anonymousClass1.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            z = false;
        }
        if (z) {
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
    }
}
