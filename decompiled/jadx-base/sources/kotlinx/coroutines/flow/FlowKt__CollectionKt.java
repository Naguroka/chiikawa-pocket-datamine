package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"toCollection", "C", "T", "", "Lkotlinx/coroutines/flow/Flow;", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSet", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collection.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION}, s = {"L$0"})
    static final class AnonymousClass1<T, C extends java.util.Collection<? super T>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt.toCollection(null, null, this);
        }
    }

    public static final <T> java.lang.Object toList(kotlinx.coroutines.flow.Flow<? extends T> flow, java.util.List<T> list, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.toCollection(flow, list, continuation);
    }

    public static /* synthetic */ java.lang.Object toList$default(kotlinx.coroutines.flow.Flow flow, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = new java.util.ArrayList();
        }
        return kotlinx.coroutines.flow.FlowKt.toList(flow, list, continuation);
    }

    public static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.Flow<? extends T> flow, java.util.Set<T> set, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.toCollection(flow, set, continuation);
    }

    public static /* synthetic */ java.lang.Object toSet$default(kotlinx.coroutines.flow.Flow flow, java.util.Set set, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = new java.util.LinkedHashSet();
        }
        return kotlinx.coroutines.flow.FlowKt.toSet(flow, set, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(kotlinx.coroutines.flow.Flow<? extends T> flow, final C c, kotlin.coroutines.Continuation<? super C> continuation) {
        kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Collection collection = (java.util.Collection) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            return collection;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CollectionKt.toCollection.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                c.add(t);
                return kotlin.Unit.INSTANCE;
            }
        };
        anonymousClass1.L$0 = c;
        anonymousClass1.label = 1;
        return flow.collect(flowCollector, anonymousClass1) == coroutine_suspended ? coroutine_suspended : c;
    }
}
