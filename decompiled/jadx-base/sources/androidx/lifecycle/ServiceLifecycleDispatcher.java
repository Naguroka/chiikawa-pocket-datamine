package androidx.lifecycle;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "handler", "Landroid/os/Handler;", "lastDispatchRunnable", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "onServicePreSuperOnBind", "", "onServicePreSuperOnCreate", "onServicePreSuperOnDestroy", "onServicePreSuperOnStart", "postDispatchRunnable", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ServiceLifecycleDispatcher {
    private final android.os.Handler handler;
    private androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable lastDispatchRunnable;
    private final androidx.lifecycle.LifecycleRegistry registry;

    public ServiceLifecycleDispatcher(androidx.lifecycle.LifecycleOwner provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        this.registry = new androidx.lifecycle.LifecycleRegistry(provider);
        this.handler = new android.os.Handler();
    }

    private final void postDispatchRunnable(androidx.lifecycle.Lifecycle.Event event) {
        androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable dispatchRunnable2 = new androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        android.os.Handler handler = this.handler;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dispatchRunnable2);
        handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        postDispatchRunnable(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.registry;
    }

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "(Landroidx/lifecycle/LifecycleRegistry;Landroidx/lifecycle/Lifecycle$Event;)V", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "wasExecuted", "", "run", "", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DispatchRunnable implements java.lang.Runnable {
        private final androidx.lifecycle.Lifecycle.Event event;
        private final androidx.lifecycle.LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(androidx.lifecycle.LifecycleRegistry registry, androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            this.registry = registry;
            this.event = event;
        }

        public final androidx.lifecycle.Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.handleLifecycleEvent(this.event);
            this.wasExecuted = true;
        }
    }
}
