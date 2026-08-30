package androidx.slidingpanelayout.widget;

/* JADX INFO: compiled from: FoldingFeatureObserver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "windowInfoTracker", "Landroidx/window/layout/WindowInfoTracker;", "executor", "Ljava/util/concurrent/Executor;", "(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V", "job", "Lkotlinx/coroutines/Job;", "onFoldingFeatureChangeListener", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "getFoldingFeature", "Landroidx/window/layout/FoldingFeature;", "windowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "registerLayoutStateChangeCallback", "", "activity", "Landroid/app/Activity;", "setOnFoldingFeatureChangeListener", "unregisterLayoutStateChangeCallback", "OnFoldingFeatureChangeListener", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FoldingFeatureObserver {
    private final java.util.concurrent.Executor executor;
    private kotlinx.coroutines.Job job;
    private androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
    private final androidx.window.layout.WindowInfoTracker windowInfoTracker;

    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "onFoldingFeatureChange", "", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(androidx.window.layout.FoldingFeature foldingFeature);
    }

    public FoldingFeatureObserver(androidx.window.layout.WindowInfoTracker windowInfoTracker, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInfoTracker, "windowInfoTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    public final void setOnFoldingFeatureChangeListener(androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1, reason: invalid class name */
    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ android.app.Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(android.app.Activity activity, kotlin.coroutines.Continuation<? super androidx.slidingpanelayout.widget.FoldingFeatureObserver.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return androidx.slidingpanelayout.widget.FoldingFeatureObserver.this.new AnonymousClass1(this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.slidingpanelayout.widget.FoldingFeatureObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> flowWindowLayoutInfo = androidx.slidingpanelayout.widget.FoldingFeatureObserver.this.windowInfoTracker.windowLayoutInfo(this.$activity);
                final androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver = androidx.slidingpanelayout.widget.FoldingFeatureObserver.this;
                kotlinx.coroutines.flow.Flow flowDistinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<androidx.window.layout.FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Collect.kt */
                    @kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$lambda-1$$inlined$collect$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 6, 0}, xi = 48)
                    public static final class AnonymousClass2 implements kotlinx.coroutines.flow.FlowCollector<androidx.window.layout.WindowLayoutInfo> {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow$inlined;
                        final /* synthetic */ androidx.slidingpanelayout.widget.FoldingFeatureObserver this$0;

                        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object L$0;
                            int label;
                            /* synthetic */ java.lang.Object result;

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver) {
                            this.$this_unsafeFlow$inlined = flowCollector;
                            this.this$0 = foldingFeatureObserver;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public java.lang.Object emit(androidx.window.layout.WindowLayoutInfo windowLayoutInfo, kotlin.coroutines.Continuation continuation) {
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            if (continuation instanceof androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                            }
                            java.lang.Object obj = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = anonymousClass1.label;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                androidx.window.layout.FoldingFeature foldingFeature = this.this$0.getFoldingFeature(windowLayoutInfo);
                                if (foldingFeature != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(foldingFeature, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.window.layout.FoldingFeature> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object objCollect = flowWindowLayoutInfo.collect(new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2(flowCollector, foldingFeatureObserver), continuation);
                        return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
                    }
                });
                final androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver2 = androidx.slidingpanelayout.widget.FoldingFeatureObserver.this;
                this.label = 1;
                if (flowDistinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector<androidx.window.layout.FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public java.lang.Object emit(androidx.window.layout.FoldingFeature foldingFeature, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        kotlin.Unit unit;
                        androidx.window.layout.FoldingFeature foldingFeature2 = foldingFeature;
                        androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = foldingFeatureObserver2.onFoldingFeatureChangeListener;
                        if (onFoldingFeatureChangeListener == null) {
                            unit = null;
                        } else {
                            onFoldingFeatureChangeListener.onFoldingFeatureChange(foldingFeature2);
                            unit = kotlin.Unit.INSTANCE;
                        }
                        return unit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? unit : kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    public final void registerLayoutStateChangeCallback(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlinx.coroutines.Job job = this.job;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.job = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(this.executor)), null, null, new androidx.slidingpanelayout.widget.FoldingFeatureObserver.AnonymousClass1(activity, null), 3, null);
    }

    public final void unregisterLayoutStateChangeCallback() {
        kotlinx.coroutines.Job job = this.job;
        if (job == null) {
            return;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.window.layout.FoldingFeature getFoldingFeature(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        java.lang.Object next;
        java.util.Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((androidx.window.layout.DisplayFeature) next) instanceof androidx.window.layout.FoldingFeature));
        if (next instanceof androidx.window.layout.FoldingFeature) {
            return (androidx.window.layout.FoldingFeature) next;
        }
        return null;
    }
}
