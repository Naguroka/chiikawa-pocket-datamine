package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidLifecycleDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLifecycleDataSource;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroidx/lifecycle/LifecycleEventObserver;", "()V", "appActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "appIsForeground", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "registerAppLifecycle", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLifecycleDataSource implements com.unity3d.ads.core.data.datasource.LifecycleDataSource, androidx.lifecycle.LifecycleEventObserver {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> appActive = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(true);

    /* JADX INFO: compiled from: AndroidLifecycleDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        registerAppLifecycle();
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidLifecycleDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.this);
            return kotlin.Unit.INSTANCE;
        }
    }

    private final void registerAppLifecycle() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.AnonymousClass1(null), 3, null);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return this.appActive.getValue().booleanValue();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.appActive;
        int i = com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i == 1) {
            zBooleanValue = false;
        } else if (i != 2) {
            zBooleanValue = this.appActive.getValue().booleanValue();
        }
        mutableStateFlow.setValue(java.lang.Boolean.valueOf(zBooleanValue));
    }
}
