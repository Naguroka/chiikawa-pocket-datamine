package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        this.$predicate = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1<T> flowKt__LimitKt$collectWhile$collector$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            if ((flowKt__LimitKt$collectWhile$collector$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        }
        java.lang.Object objInvoke = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.$predicate;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
            objInvoke = function2.invoke(t, flowKt__LimitKt$collectWhile$collector$1$emit$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__LimitKt$collectWhile$collector$1 = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$collectWhile$collector$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
            kotlin.ResultKt.throwOnFailure(objInvoke);
        }
        if (!((java.lang.Boolean) objInvoke).booleanValue()) {
            throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
        }
        return kotlin.Unit.INSTANCE;
    }

    public java.lang.Object emit$$forInline(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(4);
        new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        kotlin.jvm.internal.InlineMarker.mark(5);
        if (!((java.lang.Boolean) this.$predicate.invoke(t, continuation)).booleanValue()) {
            throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
        }
        return kotlin.Unit.INSTANCE;
    }
}
