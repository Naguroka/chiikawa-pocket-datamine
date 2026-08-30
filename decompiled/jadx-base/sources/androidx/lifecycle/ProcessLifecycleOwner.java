package androidx.lifecycle;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020\u0016H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0002\b%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "()V", "delayedPauseRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "initializationListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "pauseSent", "", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "resumedCounter", "", "startedCounter", "stopSent", "activityPaused", "", "activityPaused$lifecycle_process_release", "activityResumed", "activityResumed$lifecycle_process_release", "activityStarted", "activityStarted$lifecycle_process_release", "activityStopped", "activityStopped$lifecycle_process_release", "attach", "context", "Landroid/content/Context;", "attach$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "Api29Impl", "Companion", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleOwner implements androidx.lifecycle.LifecycleOwner {
    public static final long TIMEOUT_MS = 700;
    private android.os.Handler handler;
    private int resumedCounter;
    private int startedCounter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.lifecycle.ProcessLifecycleOwner.Companion INSTANCE = new androidx.lifecycle.ProcessLifecycleOwner.Companion(null);
    private static final androidx.lifecycle.ProcessLifecycleOwner newInstance = new androidx.lifecycle.ProcessLifecycleOwner();
    private boolean pauseSent = true;
    private boolean stopSent = true;
    private final androidx.lifecycle.LifecycleRegistry registry = new androidx.lifecycle.LifecycleRegistry(this);
    private final java.lang.Runnable delayedPauseRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(this.f$0);
        }
    };
    private final androidx.lifecycle.ReportFragment.ActivityInitializationListener initializationListener = new androidx.lifecycle.ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            this.this$0.activityStarted$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            this.this$0.activityResumed$lifecycle_process_release();
        }
    };

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleOwner get() {
        return INSTANCE.get();
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedPauseRunnable$lambda$0(androidx.lifecycle.ProcessLifecycleOwner this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchPauseIfNeeded$lifecycle_process_release();
        this$0.dispatchStopIfNeeded$lifecycle_process_release();
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "()V", "TIMEOUT_MS", "", "getTIMEOUT_MS$lifecycle_process_release$annotations", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "get", "Landroidx/lifecycle/LifecycleOwner;", com.ironsource.y8.a.f, "", "context", "Landroid/content/Context;", "init$lifecycle_process_release", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.LifecycleOwner get() {
            return androidx.lifecycle.ProcessLifecycleOwner.newInstance;
        }

        @kotlin.jvm.JvmStatic
        public final void init$lifecycle_process_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.lifecycle.ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                android.os.Handler handler = this.handler;
                kotlin.jvm.internal.Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void activityPaused$lifecycle_process_release() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            android.os.Handler handler = this.handler;
            kotlin.jvm.internal.Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    public final void attach$lifecycle_process_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new android.os.Handler();
        this.registry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                final androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = this.this$0;
                androidx.lifecycle.ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new androidx.lifecycle.EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(android.app.Activity activity2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity2, "activity");
                        processLifecycleOwner.activityStarted$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(android.app.Activity activity2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity2, "activity");
                        processLifecycleOwner.activityResumed$lifecycle_process_release();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                if (android.os.Build.VERSION.SDK_INT < 29) {
                    androidx.lifecycle.ReportFragment.INSTANCE.get(activity).setProcessListener(this.this$0.initializationListener);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.activityPaused$lifecycle_process_release();
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.activityStopped$lifecycle_process_release();
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.registry;
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "()V", "registerActivityLifecycleCallbacks", "", "activity", "Landroid/app/Activity;", "callback", "Landroid/app/Application$ActivityLifecycleCallbacks;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api29Impl {
        public static final androidx.lifecycle.ProcessLifecycleOwner.Api29Impl INSTANCE = new androidx.lifecycle.ProcessLifecycleOwner.Api29Impl();

        private Api29Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void registerActivityLifecycleCallbacks(android.app.Activity activity, android.app.Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }
}
