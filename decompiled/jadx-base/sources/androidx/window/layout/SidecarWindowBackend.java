package androidx.window.layout;

/* JADX INFO: compiled from: SidecarWindowBackend.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0016\u0010\u001b\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "windowExtension", "Landroidx/window/layout/ExtensionInterfaceCompat;", "(Landroidx/window/layout/ExtensionInterfaceCompat;)V", "getWindowExtension", "()Landroidx/window/layout/ExtensionInterfaceCompat;", "setWindowExtension", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "getWindowLayoutChangeCallbacks$annotations", "()V", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "callbackRemovedForActivity", "", "activity", "Landroid/app/Activity;", "isActivityRegistered", "", "registerLayoutChangeCallback", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "unregisterLayoutChangeCallback", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SidecarWindowBackend implements androidx.window.layout.WindowBackend {
    public static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WindowServer";
    private static volatile androidx.window.layout.SidecarWindowBackend globalInstance;
    private androidx.window.layout.ExtensionInterfaceCompat windowExtension;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.SidecarWindowBackend.Companion INSTANCE = new androidx.window.layout.SidecarWindowBackend.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock globalLock = new java.util.concurrent.locks.ReentrantLock();

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    public SidecarWindowBackend(androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 == null) {
            return;
        }
        extensionInterfaceCompat2.setExtensionCallback(new androidx.window.layout.SidecarWindowBackend.ExtensionListenerImpl(this));
    }

    public final androidx.window.layout.ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final void setWindowExtension(androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        androidx.window.layout.WindowLayoutInfo lastInfo;
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            androidx.window.layout.ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList()));
                return;
            }
            boolean zIsActivityRegistered = isActivityRegistered(activity);
            androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!zIsActivityRegistered) {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            } else {
                java.util.Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                do {
                    lastInfo = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.Intrinsics.areEqual(activity, ((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) next).getActivity()));
                androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) next;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    lastInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (lastInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(lastInfo);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final boolean isActivityRegistered(android.app.Activity activity) {
        java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper callbackWrapper : getWindowLayoutChangeCallbacks()) {
                if (callbackWrapper.getCallback() == callback) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                    arrayList.add(callbackWrapper);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                callbackRemovedForActivity(((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next()).getActivity());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void callbackRemovedForActivity(android.app.Activity activity) {
        androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat;
        java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        boolean z = false;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || (extensionInterfaceCompat = this.windowExtension) == null) {
            return;
        }
        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\t"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "(Landroidx/window/layout/SidecarWindowBackend;)V", "onWindowLayoutChanged", "", "activity", "Landroid/app/Activity;", "newLayout", "Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ExtensionListenerImpl implements androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ androidx.window.layout.SidecarWindowBackend this$0;

        public ExtensionListenerImpl(androidx.window.layout.SidecarWindowBackend this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(android.app.Activity activity, androidx.window.layout.WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            for (androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : this.this$0.getWindowLayoutChangeCallbacks()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    windowLayoutChangeCallbackWrapper.accept(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Landroidx/core/util/Consumer;", "lastInfo", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "accept", "", "newLayoutInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WindowLayoutChangeCallbackWrapper {
        private final android.app.Activity activity;
        private final androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback;
        private final java.util.concurrent.Executor executor;
        private androidx.window.layout.WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        public final android.app.Activity getActivity() {
            return this.activity;
        }

        public final androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        public final androidx.window.layout.WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }

        public final void accept(final androidx.window.layout.WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new java.lang.Runnable() { // from class: androidx.window.layout.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m477accept$lambda0(this.f$0, newLayoutInfo);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: accept$lambda-0, reason: not valid java name */
        public static final void m477accept$lambda0(androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper this$0, androidx.window.layout.WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
            this$0.callback.accept(newLayoutInfo);
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "()V", "DEBUG", "", "TAG", "", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "context", "Landroid/content/Context;", "initAndVerifyExtension", "Landroidx/window/layout/ExtensionInterfaceCompat;", "isSidecarVersionSupported", "sidecarVersion", "Landroidx/window/core/Version;", "resetInstance", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.window.layout.SidecarWindowBackend getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (androidx.window.layout.SidecarWindowBackend.globalInstance == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.layout.SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (androidx.window.layout.SidecarWindowBackend.globalInstance == null) {
                        androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompatInitAndVerifyExtension = androidx.window.layout.SidecarWindowBackend.INSTANCE.initAndVerifyExtension(context);
                        androidx.window.layout.SidecarWindowBackend.Companion companion = androidx.window.layout.SidecarWindowBackend.INSTANCE;
                        androidx.window.layout.SidecarWindowBackend.globalInstance = new androidx.window.layout.SidecarWindowBackend(extensionInterfaceCompatInitAndVerifyExtension);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            androidx.window.layout.SidecarWindowBackend sidecarWindowBackend = androidx.window.layout.SidecarWindowBackend.globalInstance;
            kotlin.jvm.internal.Intrinsics.checkNotNull(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final androidx.window.layout.ExtensionInterfaceCompat initAndVerifyExtension(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (!isSidecarVersionSupported(androidx.window.layout.SidecarCompat.INSTANCE.getSidecarVersion())) {
                    return null;
                }
                androidx.window.layout.SidecarCompat sidecarCompat = new androidx.window.layout.SidecarCompat(context);
                if (sidecarCompat.validateExtensionInterface()) {
                    return sidecarCompat;
                }
                return null;
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(androidx.window.core.Version sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(androidx.window.core.Version.INSTANCE.getVERSION_0_1()) >= 0;
        }

        public final void resetInstance() {
            androidx.window.layout.SidecarWindowBackend.globalInstance = null;
        }
    }
}
