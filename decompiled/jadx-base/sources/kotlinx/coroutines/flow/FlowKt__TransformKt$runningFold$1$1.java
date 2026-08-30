package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlowKt__TransformKt$runningFold$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $operation;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1(kotlin.jvm.internal.Ref.ObjectRef<R> objectRef, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningFold$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningFold$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$runningFold$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        }
        java.lang.Object obj = flowKt__TransformKt$runningFold$1$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.$accumulator;
            kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.$operation;
            T t2 = objectRef2.element;
            flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = this;
            flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = objectRef2;
            flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
            java.lang.Object objInvoke = function3.invoke((R) t2, t, flowKt__TransformKt$runningFold$1$1$emit$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__TransformKt$runningFold$1$1 = this;
            obj = (T) objInvoke;
            objectRef = objectRef2;
        } else {
            if (i == 1) {
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                flowKt__TransformKt$runningFold$1$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        objectRef.element = (T) obj;
        kotlinx.coroutines.flow.FlowCollector<R> flowCollector = flowKt__TransformKt$runningFold$1$1.$this_unsafeFlow;
        T t3 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
        if (flowCollector.emit((R) t3, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
