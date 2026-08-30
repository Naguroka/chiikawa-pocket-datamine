package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FlowKt__LimitKt$dropWhile$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $matched;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$dropWhile$1$1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        this.$matched = booleanRef;
        this.$this_unsafeFlow = flowCollector;
        this.$predicate = function2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            if ((flowKt__LimitKt$dropWhile$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        }
        java.lang.Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            if (this.$matched.element) {
                kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = this.$this_unsafeFlow;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                if (flowCollector2.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.$predicate;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = t;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
            objInvoke = function2.invoke(t, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__LimitKt$dropWhile$1$1 = this;
            if (!((java.lang.Boolean) objInvoke).booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
            flowCollector = flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            if (flowCollector.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                return kotlin.Unit.INSTANCE;
            }
            if (i == 2) {
                t = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                flowKt__LimitKt$dropWhile$1$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
                if (!((java.lang.Boolean) objInvoke).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
                flowCollector = flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                if (flowCollector.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
