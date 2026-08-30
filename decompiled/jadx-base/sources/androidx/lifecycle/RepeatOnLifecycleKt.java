package androidx.lifecycle;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\u000b\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"repeatOnLifecycle", "", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RepeatOnLifecycleKt {
    public static final java.lang.Object repeatOnLifecycle(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(state != androidx.lifecycle.Lifecycle.State.INITIALIZED)) {
            throw new java.lang.IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object objCoroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3(lifecycle, state, function2, null), continuation);
        return objCoroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
        final /* synthetic */ androidx.lifecycle.Lifecycle.State $state;
        final /* synthetic */ androidx.lifecycle.Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3 anonymousClass3 = new androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.IF_ACMPNE}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$coroutineScope;
            final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
            final /* synthetic */ androidx.lifecycle.Lifecycle.State $state;
            final /* synthetic */ androidx.lifecycle.Lifecycle $this_repeatOnLifecycle;
            java.lang.Object L$0;
            java.lang.Object L$1;
            java.lang.Object L$2;
            java.lang.Object L$3;
            java.lang.Object L$4;
            java.lang.Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00be  */
            /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00db  */
            /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
            /* JADX WARN: Type inference failed for: r7v1, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
                kotlin.jvm.internal.Ref.ObjectRef objectRef;
                kotlin.jvm.internal.Ref.ObjectRef objectRef2;
                kotlinx.coroutines.Job job;
                androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver;
                kotlinx.coroutines.Job job2;
                androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver2;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        job2 = (kotlinx.coroutines.Job) objectRef.element;
                        if (job2 != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        lifecycleEventObserver2 = (androidx.lifecycle.LifecycleEventObserver) objectRef2.element;
                        if (lifecycleEventObserver2 != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                        }
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        job = (kotlinx.coroutines.Job) objectRef.element;
                        if (job != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        lifecycleEventObserver = (androidx.lifecycle.LifecycleEventObserver) objectRef2.element;
                        if (lifecycleEventObserver != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                        }
                        throw th;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.$this_repeatOnLifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                    return kotlin.Unit.INSTANCE;
                }
                final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                try {
                    androidx.lifecycle.Lifecycle.State state = this.$state;
                    androidx.lifecycle.Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                    final kotlinx.coroutines.CoroutineScope coroutineScope = this.$$this$coroutineScope;
                    final kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$block;
                    this.L$0 = objectRef3;
                    this.L$1 = objectRef4;
                    this.L$2 = state;
                    this.L$3 = lifecycle;
                    this.L$4 = coroutineScope;
                    this.L$5 = function2;
                    this.label = 1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    final androidx.lifecycle.Lifecycle.Event eventUpTo = androidx.lifecycle.Lifecycle.Event.INSTANCE.upTo(state);
                    final androidx.lifecycle.Lifecycle.Event eventDownFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.downFrom(state);
                    final kotlinx.coroutines.sync.Mutex mutexMutex$default = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
                    objectRef4.element = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
                        /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.Job] */
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                            if (event == eventUpTo) {
                                objectRef3.element = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1(mutexMutex$default, function2, null), 3, null);
                                return;
                            }
                            if (event == eventDownFrom) {
                                kotlinx.coroutines.Job job3 = objectRef3.element;
                                if (job3 != null) {
                                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                }
                                objectRef3.element = null;
                            }
                            if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
                            }
                        }

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {org.objectweb.asm.Opcodes.LOOKUPSWITCH, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                            final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
                            final /* synthetic */ kotlinx.coroutines.sync.Mutex $mutex;
                            java.lang.Object L$0;
                            java.lang.Object L$1;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$mutex = mutex;
                                this.$block = function2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                return new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1(this.$mutex, this.$block, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                return ((androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
                                kotlinx.coroutines.sync.Mutex mutex;
                                kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2;
                                kotlinx.coroutines.sync.Mutex mutex2;
                                java.lang.Throwable th;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                try {
                                    if (i == 0) {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        mutex = this.$mutex;
                                        function2 = this.$block;
                                        this.L$0 = mutex;
                                        this.L$1 = function2;
                                        this.label = 1;
                                        if (mutex.lock(null, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            mutex2 = (kotlinx.coroutines.sync.Mutex) this.L$0;
                                            try {
                                                kotlin.ResultKt.throwOnFailure(obj);
                                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                mutex2.unlock(null);
                                                return kotlin.Unit.INSTANCE;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                mutex2.unlock(null);
                                                throw th;
                                            }
                                        }
                                        function2 = (kotlin.jvm.functions.Function2) this.L$1;
                                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        mutex = mutex3;
                                    }
                                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                    this.L$0 = mutex;
                                    this.L$1 = null;
                                    this.label = 2;
                                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex2 = mutex;
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th3) {
                                    mutex2 = mutex;
                                    th = th3;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                        }
                    };
                    T t = objectRef4.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver((androidx.lifecycle.LifecycleEventObserver) t);
                    java.lang.Object result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    job2 = (kotlinx.coroutines.Job) objectRef.element;
                    if (job2 != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    lifecycleEventObserver2 = (androidx.lifecycle.LifecycleEventObserver) objectRef2.element;
                    if (lifecycleEventObserver2 != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                    }
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    job = (kotlinx.coroutines.Job) objectRef.element;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    lifecycleEventObserver = (androidx.lifecycle.LifecycleEventObserver) objectRef2.element;
                    if (lifecycleEventObserver != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                this.label = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, coroutineScope, this.$block, null), this) == coroutine_suspended) {
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

    public static final java.lang.Object repeatOnLifecycle(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, continuation);
        return objRepeatOnLifecycle == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRepeatOnLifecycle : kotlin.Unit.INSTANCE;
    }
}
