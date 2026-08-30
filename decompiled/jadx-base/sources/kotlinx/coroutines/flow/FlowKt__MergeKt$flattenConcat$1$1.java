package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlowKt__MergeKt$flattenConcat$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MergeKt$flattenConcat$1$1(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.$this_unsafeFlow = flowCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return emit((kotlinx.coroutines.flow.Flow) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1) continuation;
            if ((flowKt__MergeKt$flattenConcat$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__MergeKt$flattenConcat$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
        }
        java.lang.Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.$this_unsafeFlow;
            flowKt__MergeKt$flattenConcat$1$1$emit$1.label = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, flow, flowKt__MergeKt$flattenConcat$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
