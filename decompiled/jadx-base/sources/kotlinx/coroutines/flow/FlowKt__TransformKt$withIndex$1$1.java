package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlowKt__TransformKt$withIndex$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $index;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$withIndex$1$1(kotlinx.coroutines.flow.FlowCollector<? super kotlin.collections.IndexedValue<? extends T>> flowCollector, kotlin.jvm.internal.Ref.IntRef intRef) {
        this.$this_unsafeFlow = flowCollector;
        this.$index = intRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$withIndex$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$withIndex$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
        }
        java.lang.Object obj = flowKt__TransformKt$withIndex$1$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> flowCollector = this.$this_unsafeFlow;
            int i2 = this.$index.element;
            this.$index.element = i2 + 1;
            if (i2 < 0) {
                throw new java.lang.ArithmeticException("Index overflow has happened");
            }
            kotlin.collections.IndexedValue<? extends T> indexedValue = new kotlin.collections.IndexedValue<>(i2, t);
            flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
            if (flowCollector.emit(indexedValue, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutine_suspended) {
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
