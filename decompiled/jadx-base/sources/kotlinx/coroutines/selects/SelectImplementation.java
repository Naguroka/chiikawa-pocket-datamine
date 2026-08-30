package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001HB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u001a\u0010\u001d\u001a\u00020\u001b2\u0010\u0010\u001e\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0011\u0010\u001f\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0011\u0010$\u001a\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0011\u0010%\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001c\u0010&\u001a\u000e\u0018\u00010\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0013\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\u001c\u0010*\u001a\u00020\u001b2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020\u0014H\u0016J-\u0010.\u001a\u00028\u00002\u0010\u0010/\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u00103\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eJ\u001a\u00107\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J\u0011\u00108\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J3\u0010'\u001a\u00020\u001b*\u0002092\u001c\u0010:\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0;H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010=JE\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0?2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010AJY\u0010'\u001a\u00020\u001b\"\u0004\b\u0001\u0010B\"\u0004\b\u0002\u0010>*\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u0002H>0C2\u0006\u0010D\u001a\u0002HB2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010EJ \u0010F\u001a\u00020\u001b*\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010G\u001a\u00020\u0010H\u0001R \u0010\b\u001a\u0014\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposableHandleOrSegment", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "indexInSegment", "", "internalResult", "isCancelled", "isSelected", "state", "Lkotlinx/atomicfu/AtomicRef;", "checkClauseObject", "", "clauseObject", "cleanup", "selectedClause", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "doSelect", "doSelectSuspend", "findClause", "invoke", "cause", "", "invokeOnCancellation", com.json.y3.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reregisterClause", "selectInRegistrationPhase", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "waitUntilSelected", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SelectImplementation<R> extends kotlinx.coroutines.CancelHandler implements kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstanceInternal<R> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.SelectImplementation.class, java.lang.Object.class, "state");
    private final kotlin.coroutines.CoroutineContext context;
    private java.lang.Object disposableHandleOrSegment;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object state = kotlinx.coroutines.selects.SelectKt.STATE_REG;
    private java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> clauses = new java.util.ArrayList(2);
    private int indexInSegment = -1;
    private java.lang.Object internalResult = kotlinx.coroutines.selects.SelectKt.NO_RESULT;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {431, 434}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doSelectSuspend(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {706}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    static final class C18671 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C18671(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation.C18671> continuation) {
            super(continuation);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void update$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> function1, java.lang.Object obj) {
        java.lang.Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    public java.lang.Object doSelect(kotlin.coroutines.Continuation<? super R> continuation) {
        return doSelect$suspendImpl(this, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(this, selectClause2, function2);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void onTimeout(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.onTimeout(this, j, function1);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.CoroutineContext getContext() {
        return this.context;
    }

    public SelectImplementation(kotlin.coroutines.CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        java.lang.Object obj = state$FU.get(this);
        return obj == kotlinx.coroutines.selects.SelectKt.STATE_REG || (obj instanceof java.util.List);
    }

    private final boolean isSelected() {
        return state$FU.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        return state$FU.get(this) == kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED;
    }

    static /* synthetic */ <R> java.lang.Object doSelect$suspendImpl(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super R> continuation) {
        return selectImplementation.isSelected() ? selectImplementation.complete(continuation) : selectImplementation.doSelectSuspend(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object doSelectSuspend(kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.selects.SelectImplementation selectImplementation;
        if (continuation instanceof kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1(this, continuation);
        }
        java.lang.Object objComplete = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = (kotlinx.coroutines.selects.SelectImplementation) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objComplete);
                selectImplementation = selectImplementation2;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objComplete);
            }
        }
        kotlin.ResultKt.throwOnFailure(objComplete);
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (waitUntilSelected(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        selectImplementation = this;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        objComplete = selectImplementation.complete(anonymousClass1);
        return objComplete == coroutine_suspended ? coroutine_suspended : objComplete;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 selectClause0, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        register$default(this, new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0(), function1, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> selectClause1, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        register$default(this, new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, function2, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, P p, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        register$default(this, new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, function2, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    public static /* synthetic */ void register$default(kotlinx.coroutines.selects.SelectImplementation selectImplementation, kotlinx.coroutines.selects.SelectImplementation.ClauseData clauseData, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.register(clauseData, z);
    }

    public final void register(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData, boolean z) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(state$FU.get(this) != kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED)) {
                throw new java.lang.AssertionError();
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        if (atomicReferenceFieldUpdater.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
            return;
        }
        if (!z) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (clauseData.tryRegisterAsWaiter(this)) {
            if (!z) {
                java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                list.add(clauseData);
            }
            clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
            clauseData.indexInSegment = this.indexInSegment;
            this.disposableHandleOrSegment = null;
            this.indexInSegment = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, clauseData);
    }

    private final void checkClauseObject(java.lang.Object clauseObject) {
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list2 = list;
        boolean z = true;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next()).clauseObject == clauseObject) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            throw new java.lang.IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(java.lang.Object internalResult) {
        this.internalResult = internalResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(java.lang.Object clauseObject) {
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(clauseObject);
        kotlin.jvm.internal.Intrinsics.checkNotNull(clauseDataFindClause);
        clauseDataFindClause.disposableHandleOrSegment = null;
        clauseDataFindClause.indexInSegment = -1;
        register(clauseDataFindClause, true);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(java.lang.Object clauseObject, java.lang.Object result) {
        return trySelectInternal(clauseObject, result) == 0;
    }

    public final kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed(java.lang.Object clauseObject, java.lang.Object result) {
        return kotlinx.coroutines.selects.SelectKt.TrySelectDetailedResult(trySelectInternal(clauseObject, result));
    }

    private final int trySelectInternal(java.lang.Object clauseObject, java.lang.Object internalResult) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.CancellableContinuation)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED) ? true : obj instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
                    return 3;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlinx.coroutines.selects.SelectKt.STATE_REG)) {
                    if (kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, obj, kotlin.collections.CollectionsKt.listOf(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof java.util.List)) {
                        throw new java.lang.IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, obj, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Object>) obj, clauseObject))) {
                        return 1;
                    }
                }
            } else {
                kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(clauseObject);
                if (clauseDataFindClause == null) {
                    continue;
                } else {
                    kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1CreateOnCancellationAction = clauseDataFindClause.createOnCancellationAction(this, internalResult);
                    if (kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, obj, clauseDataFindClause)) {
                        this.internalResult = internalResult;
                        if (kotlinx.coroutines.selects.SelectKt.tryResume((kotlinx.coroutines.CancellableContinuation) obj, function1CreateOnCancellationAction)) {
                            return 0;
                        }
                        this.internalResult = null;
                        return 2;
                    }
                }
            }
        }
    }

    private final kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData findClause(java.lang.Object clauseObject) {
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        java.lang.Object obj = null;
        if (list == null) {
            return null;
        }
        for (java.lang.Object obj2 : list) {
            if (((kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj;
        if (clauseData != null) {
            return clauseData;
        }
        throw new java.lang.IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object complete(kotlin.coroutines.Continuation<? super R> continuation) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isSelected()) {
            throw new java.lang.AssertionError();
        }
        java.lang.Object obj = state$FU.get(this);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj;
        java.lang.Object obj2 = this.internalResult;
        cleanup(clauseData);
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            return clauseData.invokeBlock(clauseData.processResult(obj2), continuation);
        }
        return processResultAndInvokeBlockRecoveringException(clauseData, obj2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData, java.lang.Object obj, kotlin.coroutines.Continuation<? super R> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.selects.SelectImplementation.C18671 c18671;
        if (continuation instanceof kotlinx.coroutines.selects.SelectImplementation.C18671) {
            c18671 = (kotlinx.coroutines.selects.SelectImplementation.C18671) continuation;
            if ((c18671.label & Integer.MIN_VALUE) != 0) {
                c18671.label -= Integer.MIN_VALUE;
            } else {
                c18671 = new kotlinx.coroutines.selects.SelectImplementation.C18671(this, continuation);
            }
        } else {
            c18671 = new kotlinx.coroutines.selects.SelectImplementation.C18671(this, continuation);
        }
        java.lang.Object objInvokeBlock = c18671.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18671.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objInvokeBlock);
                java.lang.Object objProcessResult = clauseData.processResult(obj);
                c18671.label = 1;
                objInvokeBlock = clauseData.invokeBlock(objProcessResult, c18671);
                if (objInvokeBlock == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvokeBlock);
            }
            return objInvokeBlock;
        } catch (java.lang.Throwable th) {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (c18671 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, c18671);
            }
            throw th;
        }
    }

    private final void cleanup(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData selectedClause) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !kotlin.jvm.internal.Intrinsics.areEqual(state$FU.get(this), selectedClause)) {
            throw new java.lang.AssertionError();
        }
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData : list) {
            if (clauseData != selectedClause) {
                clauseData.dispose();
            }
        }
        state$FU.set(this, kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED);
        this.internalResult = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
        this.clauses = null;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable cause) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED) {
                return;
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, obj, kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED));
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next()).dispose();
        }
        this.internalResult = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
        this.clauses = null;
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B¶\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u0014¢\u0006\u0002\u0010\u0015J*\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001a\u001a\u00020\nJ\u001b\u0010\u001b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001J\u0014\u0010 \u001a\u00020!2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\"R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000Rq\u0010\u0010\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010\u0004j\u0004\u0018\u0001`\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "regFunc", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "block", "onCancellationConstructor", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "disposableHandleOrSegment", "indexInSegment", "", "createOnCancellationAction", "dispose", "invokeBlock", "argument", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processResult", "result", "tryRegisterAsWaiter", "", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ClauseData {
        private final java.lang.Object block;
        public final java.lang.Object clauseObject;
        public java.lang.Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onCancellationConstructor;
        private final java.lang.Object param;
        private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> processResFunc;
        private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> regFunc;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(java.lang.Object obj, kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> function3, kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, ? extends java.lang.Object> function4, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>> function5) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function4;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function5;
        }

        public final boolean tryRegisterAsWaiter(kotlinx.coroutines.selects.SelectImplementation<R> select) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                if (!(select.getInRegistrationPhase() || select.isCancelled())) {
                    throw new java.lang.AssertionError();
                }
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                if (!(((kotlinx.coroutines.selects.SelectImplementation) select).internalResult == kotlinx.coroutines.selects.SelectKt.NO_RESULT)) {
                    throw new java.lang.AssertionError();
                }
            }
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return ((kotlinx.coroutines.selects.SelectImplementation) select).internalResult == kotlinx.coroutines.selects.SelectKt.NO_RESULT;
        }

        public final java.lang.Object processResult(java.lang.Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final java.lang.Object invokeBlock(java.lang.Object obj, kotlin.coroutines.Continuation<? super R> continuation) {
            java.lang.Object obj2 = this.block;
            if (this.param == kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((kotlin.jvm.functions.Function1) obj2).invoke(continuation);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((kotlin.jvm.functions.Function2) obj2).invoke(obj, continuation);
        }

        public final void dispose() {
            java.lang.Object obj = this.disposableHandleOrSegment;
            kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation = kotlinx.coroutines.selects.SelectImplementation.this;
            if (obj instanceof kotlinx.coroutines.internal.Segment) {
                ((kotlinx.coroutines.internal.Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            kotlinx.coroutines.DisposableHandle disposableHandle = obj instanceof kotlinx.coroutines.DisposableHandle ? (kotlinx.coroutines.DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> createOnCancellationAction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object internalResult) {
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object waitUntilSelected(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == kotlinx.coroutines.selects.SelectKt.STATE_REG) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj, cancellableContinuationImpl2)) {
                    cancellableContinuationImpl2.invokeOnCancellation(this);
                    break;
                }
            } else if (obj instanceof java.util.List) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj, kotlinx.coroutines.selects.SelectKt.STATE_REG)) {
                    java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                    while (it.hasNext()) {
                        reregisterClause(it.next());
                    }
                }
            } else {
                if (obj instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
                    cancellableContinuationImpl2.resume(kotlin.Unit.INSTANCE, ((kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj).createOnCancellationAction(this, this.internalResult));
                    break;
                }
                throw new java.lang.IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
