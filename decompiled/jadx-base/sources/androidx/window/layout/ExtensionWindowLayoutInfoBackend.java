package androidx.window.layout;

/* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "component", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "activityToListeners", "", "Landroid/app/Activity;", "Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "listenerToActivity", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "registerLayoutChangeCallback", "", "activity", "executor", "Ljava/util/concurrent/Executor;", "callback", "unregisterLayoutChangeCallback", "MulticastConsumer", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExtensionWindowLayoutInfoBackend implements androidx.window.layout.WindowBackend {
    private final java.util.Map<android.app.Activity, androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer> activityToListeners;
    private final androidx.window.extensions.layout.WindowLayoutComponent component;
    private final java.util.concurrent.locks.ReentrantLock extensionWindowBackendLock;
    private final java.util.Map<androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo>, android.app.Activity> listenerToActivity;

    public ExtensionWindowLayoutInfoBackend(androidx.window.extensions.layout.WindowLayoutComponent component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new java.util.concurrent.locks.ReentrantLock();
        this.activityToListeners = new java.util.LinkedHashMap();
        this.listenerToActivity = new java.util.LinkedHashMap();
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                unit = null;
            } else {
                multicastConsumer.addListener(callback);
                this.listenerToActivity.put(callback, activity);
                unit = kotlin.Unit.INSTANCE;
            }
            if (unit == null) {
                androidx.window.layout.ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = this;
                androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer multicastConsumer2 = new androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(callback, activity);
                multicastConsumer2.addListener(callback);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            android.app.Activity activity = this.listenerToActivity.get(callback);
            if (activity == null) {
                return;
            }
            androidx.window.layout.ExtensionWindowLayoutInfoBackend.MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.removeListener(callback);
            if (multicastConsumer.isEmpty()) {
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "multicastConsumerLock", "Ljava/util/concurrent/locks/ReentrantLock;", "registeredListeners", "", "Landroidx/core/util/Consumer;", "accept", "", "value", "addListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isEmpty", "", "removeListener", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class MulticastConsumer implements java.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        private final android.app.Activity activity;
        private androidx.window.layout.WindowLayoutInfo lastKnownValue;
        private final java.util.concurrent.locks.ReentrantLock multicastConsumerLock;
        private final java.util.Set<androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo>> registeredListeners;

        public MulticastConsumer(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new java.util.concurrent.locks.ReentrantLock();
            this.registeredListeners = new java.util.LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = androidx.window.layout.ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, value);
                java.util.Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.Consumer) it.next()).accept(this.lastKnownValue);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void addListener(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                androidx.window.layout.WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    listener.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void removeListener(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }
    }
}
