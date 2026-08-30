package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "()V", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.y8.a.f, "", "context", "Landroid/content/Context;", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleDispatcher {
    public static final androidx.lifecycle.LifecycleDispatcher INSTANCE = new androidx.lifecycle.LifecycleDispatcher();
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);

    private LifecycleDispatcher() {
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (initialized.getAndSet(true)) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.LifecycleDispatcher.DispatcherActivityCallback());
    }

    /* JADX INFO: compiled from: LifecycleDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DispatcherActivityCallback extends androidx.lifecycle.EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.injectIfNeededIn(activity);
        }
    }
}
