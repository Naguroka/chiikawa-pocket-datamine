package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bH\u0007J\r\u0010\u001c\u001a\u00020\tH\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "fallbackOnBackPressed", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "backInvokedCallbackRegistered", "", "enabledChangedCallback", "Lkotlin/Function0;", "", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackPressedCallbacks", "Lkotlin/collections/ArrayDeque;", "Landroidx/activity/OnBackPressedCallback;", "addCallback", "onBackPressedCallback", "owner", "Landroidx/lifecycle/LifecycleOwner;", "addCancellableCallback", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "hasEnabledCallbacks", "onBackPressed", "setOnBackInvokedDispatcher", "invoker", "updateBackInvokedCallbackState", "updateBackInvokedCallbackState$activity_release", "Api33Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private kotlin.jvm.functions.Function0<kotlin.Unit> enabledChangedCallback;
    private final java.lang.Runnable fallbackOnBackPressed;
    private android.window.OnBackInvokedDispatcher invokedDispatcher;
    private android.window.OnBackInvokedCallback onBackInvokedCallback;
    private final kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> onBackPressedCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OnBackPressedDispatcher(java.lang.Runnable runnable) {
        this.fallbackOnBackPressed = runnable;
        this.onBackPressedCallbacks = new kotlin.collections.ArrayDeque<>();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.enabledChangedCallback = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.activity.OnBackPressedDispatcher.this.updateBackInvokedCallbackState$activity_release();
                }
            };
            this.onBackInvokedCallback = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE.createOnBackInvokedCallback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.activity.OnBackPressedDispatcher.this.onBackPressed();
                }
            });
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(java.lang.Runnable runnable, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }

    public final void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState$activity_release();
    }

    public final void updateBackInvokedCallbackState$activity_release() {
        boolean zHasEnabledCallbacks = hasEnabledCallbacks();
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        android.window.OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (zHasEnabledCallbacks && !this.backInvokedCallbackRegistered) {
            androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (zHasEnabledCallbacks || !this.backInvokedCallbackRegistered) {
                return;
            }
            androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    public final void addCallback(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final androidx.activity.Cancellable addCancellableCallback$activity_release(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        androidx.activity.OnBackPressedDispatcher.OnBackPressedCancellable onBackPressedCancellable = new androidx.activity.OnBackPressedDispatcher.OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
        return onBackPressedCancellable;
    }

    public final void addCallback(androidx.lifecycle.LifecycleOwner owner, androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
    }

    public final boolean hasEnabledCallbacks() {
        kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
        if ((arrayDeque instanceof java.util.Collection) && arrayDeque.isEmpty()) {
            return false;
        }
        java.util.Iterator<androidx.activity.OnBackPressedCallback> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (it.next().getIsEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final void onBackPressed() {
        androidx.activity.OnBackPressedCallback onBackPressedCallbackPrevious;
        kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
        java.util.ListIterator<androidx.activity.OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            }
            onBackPressedCallbackPrevious = listIterator.previous();
        } while (!onBackPressedCallbackPrevious.getIsEnabled());
        androidx.activity.OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        java.lang.Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "cancel", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher, androidx.activity.OnBackPressedCallback onBackPressedCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            this.onBackPressedCallback.removeCancellable(this);
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
                this.this$0.updateBackInvokedCallbackState$activity_release();
            }
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "currentCancellable", "cancel", "", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {
        private androidx.activity.Cancellable currentCancellable;
        private final androidx.lifecycle.Lifecycle lifecycle;
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.Lifecycle lifecycle, androidx.activity.OnBackPressedCallback onBackPressedCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
                androidx.activity.Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            androidx.activity.Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "()V", "createOnBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackInvoked", "Lkotlin/Function0;", "", "registerOnBackInvokedCallback", "dispatcher", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "callback", "unregisterOnBackInvokedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static final androidx.activity.OnBackPressedDispatcher.Api33Impl INSTANCE = new androidx.activity.OnBackPressedDispatcher.Api33Impl();

        private Api33Impl() {
        }

        public final void registerOnBackInvokedCallback(java.lang.Object dispatcher, int priority, java.lang.Object callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            ((android.window.OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (android.window.OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(java.lang.Object dispatcher, java.lang.Object callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            ((android.window.OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(kotlin.jvm.functions.Function0 onBackInvoked) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final android.window.OnBackInvokedCallback createOnBackInvokedCallback(final kotlin.jvm.functions.Function0<kotlin.Unit> onBackInvoked) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new android.window.OnBackInvokedCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    androidx.activity.OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(onBackInvoked);
                }
            };
        }
    }
}
