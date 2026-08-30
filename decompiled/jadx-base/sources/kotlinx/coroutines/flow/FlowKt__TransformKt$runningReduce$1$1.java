package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlowKt__TransformKt$runningReduce$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $accumulator;
    final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $operation;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningReduce$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1<T> flowKt__TransformKt$runningReduce$1$1;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        T t2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningReduce$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningReduce$1$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningReduce$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
        }
        java.lang.Object obj = flowKt__TransformKt$runningReduce$1$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef = this.$accumulator;
            if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                flowKt__TransformKt$runningReduce$1$1 = this;
            } else {
                kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function3 = this.$operation;
                T t3 = this.$accumulator.element;
                flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = this;
                flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = objectRef;
                flowKt__TransformKt$runningReduce$1$1$emit$1.label = 1;
                java.lang.Object objInvoke = function3.invoke(t3, t, flowKt__TransformKt$runningReduce$1$1$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowKt__TransformKt$runningReduce$1$1 = this;
                obj = objInvoke;
                objectRef2 = objectRef;
            }
            objectRef.element = t;
            flowCollector = flowKt__TransformKt$runningReduce$1$1.$this_unsafeFlow;
            t2 = flowKt__TransformKt$runningReduce$1$1.$accumulator.element;
            flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
            flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
            flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
            if (flowCollector.emit(t2, flowKt__TransformKt$runningReduce$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i == 1) {
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__TransformKt$runningReduce$1$1$emit$1.L$1;
            flowKt__TransformKt$runningReduce$1$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) flowKt__TransformKt$runningReduce$1$1$emit$1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
        java.lang.Object obj2 = obj;
        objectRef = objectRef2;
        t = (T) obj2;
        objectRef.element = t;
        flowCollector = flowKt__TransformKt$runningReduce$1$1.$this_unsafeFlow;
        t2 = flowKt__TransformKt$runningReduce$1$1.$accumulator.element;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
        if (flowCollector.emit(t2, flowKt__TransformKt$runningReduce$1$1$emit$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
