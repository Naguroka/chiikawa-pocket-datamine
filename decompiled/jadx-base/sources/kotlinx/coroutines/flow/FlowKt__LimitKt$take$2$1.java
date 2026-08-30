package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlowKt__LimitKt$take$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1(kotlin.jvm.internal.Ref.IntRef intRef, int i, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.$consumed = intRef;
        this.$count = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) continuation;
            if ((flowKt__LimitKt$take$2$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        }
        java.lang.Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.$consumed.element++;
        if (this.$consumed.element >= this.$count) {
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.$this_unsafeFlow;
            flowKt__LimitKt$take$2$1$emit$1.label = 2;
            if (kotlinx.coroutines.flow.FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(flowCollector, t, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = this.$this_unsafeFlow;
        flowKt__LimitKt$take$2$1$emit$1.label = 1;
        if (flowCollector2.emit(t, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
