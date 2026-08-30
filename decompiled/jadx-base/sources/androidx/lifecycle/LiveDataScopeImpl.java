package androidx.lifecycle;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0097@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@¢\u0006\u0002\u0010\u0018R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", "T", "Landroidx/lifecycle/LiveDataScope;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/CoroutineLiveData;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "latestValue", "getLatestValue", "()Ljava/lang/Object;", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LiveDataScopeImpl<T> implements androidx.lifecycle.LiveDataScope<T> {
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private androidx.lifecycle.CoroutineLiveData<T> target;

    public LiveDataScopeImpl(androidx.lifecycle.CoroutineLiveData<T> target, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate());
    }

    public final androidx.lifecycle.CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(androidx.lifecycle.CoroutineLiveData<T> coroutineLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/DisposableHandle;", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class C03092 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle>, java.lang.Object> {
        final /* synthetic */ androidx.lifecycle.LiveData<T> $source;
        int label;
        final /* synthetic */ androidx.lifecycle.LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03092(androidx.lifecycle.LiveDataScopeImpl<T> liveDataScopeImpl, androidx.lifecycle.LiveData<T> liveData, kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveDataScopeImpl.C03092> continuation) {
            super(2, continuation);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.lifecycle.LiveDataScopeImpl.C03092(this.this$0, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle> continuation) {
            return ((androidx.lifecycle.LiveDataScopeImpl.C03092) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.this$0.getTarget$lifecycle_livedata_release().emitSource$lifecycle_livedata_release(this.$source, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // androidx.lifecycle.LiveDataScope
    public java.lang.Object emitSource(androidx.lifecycle.LiveData<T> liveData, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.coroutineContext, new androidx.lifecycle.LiveDataScopeImpl.C03092(this, liveData, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ androidx.lifecycle.LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.lifecycle.LiveDataScopeImpl<T> liveDataScopeImpl, T t, kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveDataScopeImpl.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = liveDataScopeImpl;
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.lifecycle.LiveDataScopeImpl.AnonymousClass2(this.this$0, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.lifecycle.LiveDataScopeImpl.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.getTarget$lifecycle_livedata_release().clearSource$lifecycle_livedata_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.LiveDataScope
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.coroutineContext, new androidx.lifecycle.LiveDataScopeImpl.AnonymousClass2(this, t, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }
}
