package androidx.window.layout;

/* JADX INFO: compiled from: SidecarCompat.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0007\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020 H\u0017R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "componentCallbackMap", "", "Landroid/app/Activity;", "Landroid/content/ComponentCallbacks;", "extensionCallback", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "windowListenerRegisteredContexts", "Landroid/os/IBinder;", "getWindowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "onWindowLayoutChangeListenerAdded", "", "onWindowLayoutChangeListenerRemoved", "register", "windowToken", "registerConfigurationChangeListener", "setExtensionCallback", "unregisterComponentCallback", "validateExtensionInterface", "", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SidecarCompat implements androidx.window.layout.ExtensionInterfaceCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.SidecarCompat.Companion INSTANCE = new androidx.window.layout.SidecarCompat.Companion(null);
    private static final java.lang.String TAG = "SidecarCompat";
    private final java.util.Map<android.app.Activity, android.content.ComponentCallbacks> componentCallbackMap;
    private androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final androidx.window.sidecar.SidecarInterface sidecar;
    private final androidx.window.layout.SidecarAdapter sidecarAdapter;
    private final java.util.Map<android.os.IBinder, android.app.Activity> windowListenerRegisteredContexts;

    public SidecarCompat(androidx.window.sidecar.SidecarInterface sidecarInterface, androidx.window.layout.SidecarAdapter sidecarAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new java.util.LinkedHashMap();
        this.componentCallbackMap = new java.util.LinkedHashMap();
    }

    public final androidx.window.sidecar.SidecarInterface getSidecar() {
        return this.sidecar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(android.content.Context context) {
        this(INSTANCE.getSidecarCompat$window_release(context), new androidx.window.layout.SidecarAdapter(null, 1, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.extensionCallback = new androidx.window.layout.SidecarCompat.DistinctElementCallback(extensionCallback);
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback(this.sidecarAdapter, new androidx.window.layout.SidecarCompat.TranslatingCallback(this)));
    }

    public final androidx.window.layout.WindowLayoutInfo getWindowLayoutInfo(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList());
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.sidecar;
        androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        androidx.window.layout.SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
        androidx.window.sidecar.SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new androidx.window.sidecar.SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new androidx.window.layout.SidecarCompat.FirstAttachAdapter(this, activity));
        }
    }

    public final void register(android.os.IBinder windowToken, android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    private final void registerConfigurationChangeListener(final android.app.Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            android.content.ComponentCallbacks componentCallbacks = new android.content.ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(android.content.res.Configuration newConfig) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                    androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    android.app.Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, this.this$0.getWindowLayoutInfo(activity2));
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        boolean z = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (!z || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    private final void unregisterComponentCallback(android.app.Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public boolean validateExtensionInterface() {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        java.lang.Class<?> cls4;
        try {
            androidx.window.sidecar.SidecarInterface sidecarInterface = this.sidecar;
            java.lang.Class<?> returnType = null;
            java.lang.reflect.Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", androidx.window.sidecar.SidecarInterface.SidecarCallback.class);
            java.lang.Class<?> returnType2 = method == null ? null : method.getReturnType();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType2, java.lang.Void.TYPE)) {
                throw new java.lang.NoSuchMethodException(kotlin.jvm.internal.Intrinsics.stringPlus("Illegal return type for 'setSidecarCallback': ", returnType2));
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface3 = this.sidecar;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface4 = this.sidecar;
            java.lang.reflect.Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", android.os.IBinder.class);
            java.lang.Class<?> returnType3 = method2 == null ? null : method2.getReturnType();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType3, androidx.window.sidecar.SidecarWindowLayoutInfo.class)) {
                throw new java.lang.NoSuchMethodException(kotlin.jvm.internal.Intrinsics.stringPlus("Illegal return type for 'getWindowLayoutInfo': ", returnType3));
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface5 = this.sidecar;
            java.lang.reflect.Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", android.os.IBinder.class);
            java.lang.Class<?> returnType4 = method3 == null ? null : method3.getReturnType();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType4, java.lang.Void.TYPE)) {
                throw new java.lang.NoSuchMethodException(kotlin.jvm.internal.Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType4));
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface6 = this.sidecar;
            java.lang.reflect.Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", android.os.IBinder.class);
            if (method4 != null) {
                returnType = method4.getReturnType();
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType, java.lang.Void.TYPE)) {
                throw new java.lang.NoSuchMethodException(kotlin.jvm.internal.Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType));
            }
            androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (java.lang.NoSuchFieldError unused) {
                androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, 3);
                java.lang.Object objInvoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", new java.lang.Class[0]).invoke(sidecarDeviceState, new java.lang.Object[0]);
                if (objInvoke == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((java.lang.Integer) objInvoke).intValue() != 3) {
                    throw new java.lang.Exception("Invalid device posture getter/setter");
                }
            }
            androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = new androidx.window.sidecar.SidecarDisplayFeature();
            android.graphics.Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new androidx.window.sidecar.SidecarWindowLayoutInfo();
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (java.lang.NoSuchFieldError unused2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(sidecarDisplayFeature);
                androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                java.lang.Object objInvoke2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new java.lang.Class[0]).invoke(sidecarWindowLayoutInfo, new java.lang.Object[0]);
                if (objInvoke2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(arrayList, (java.util.List) objInvoke2)) {
                    throw new java.lang.Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (java.lang.Throwable unused3) {
            return false;
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "sidecarCompat", "Landroidx/window/layout/SidecarCompat;", "activity", "Landroid/app/Activity;", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class FirstAttachAdapter implements android.view.View.OnAttachStateChangeListener {
        private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
        private final androidx.window.layout.SidecarCompat sidecarCompat;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        }

        public FirstAttachAdapter(androidx.window.layout.SidecarCompat sidecarCompat, android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            android.app.Activity activity = this.activityWeakReference.get();
            android.os.IBinder activityWindowToken$window_release = androidx.window.layout.SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¨\u0006\f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "(Landroidx/window/layout/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
        final /* synthetic */ androidx.window.layout.SidecarCompat this$0;

        public TranslatingCallback(androidx.window.layout.SidecarCompat this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState newDeviceState) {
            androidx.window.sidecar.SidecarInterface sidecar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            java.util.Collection<android.app.Activity> collectionValues = this.this$0.windowListenerRegisteredContexts.values();
            androidx.window.layout.SidecarCompat sidecarCompat = this.this$0;
            for (android.app.Activity activity : collectionValues) {
                android.os.IBinder activityWindowToken$window_release = androidx.window.layout.SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
                androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    windowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(android.os.IBinder windowToken, androidx.window.sidecar.SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            android.app.Activity activity = (android.app.Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity != null) {
                androidx.window.layout.SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
                androidx.window.sidecar.SidecarInterface sidecar = this.this$0.getSidecar();
                androidx.window.sidecar.SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
                if (deviceState == null) {
                    deviceState = new androidx.window.sidecar.SidecarDeviceState();
                }
                androidx.window.layout.WindowLayoutInfo windowLayoutInfoTranslate = sidecarAdapter.translate(newLayout, deviceState);
                androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                if (extensionCallbackInterface == null) {
                    return;
                }
                extensionCallbackInterface.onWindowLayoutChanged(activity, windowLayoutInfoTranslate);
                return;
            }
            android.util.Log.w(androidx.window.layout.SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "callbackInterface", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "activityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "Landroid/app/Activity;", "Landroidx/window/layout/WindowLayoutInfo;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "onWindowLayoutChanged", "", "activity", "newLayout", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctElementCallback implements androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final java.util.WeakHashMap<android.app.Activity, androidx.window.layout.WindowLayoutInfo> activityWindowLayoutInfo;
        private final androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final java.util.concurrent.locks.ReentrantLock lock;

        public DistinctElementCallback(androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new java.util.concurrent.locks.ReentrantLock();
            this.activityWindowLayoutInfo = new java.util.WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(android.app.Activity activity, androidx.window.layout.WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "callbackInterface", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "lastDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mActivityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "Landroid/os/IBinder;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "onDeviceStateChanged", "", "newDeviceState", "onWindowLayoutChanged", "token", "newLayout", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctSidecarElementCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
        private final androidx.window.sidecar.SidecarInterface.SidecarCallback callbackInterface;
        private androidx.window.sidecar.SidecarDeviceState lastDeviceState;
        private final java.util.concurrent.locks.ReentrantLock lock;
        private final java.util.WeakHashMap<android.os.IBinder, androidx.window.sidecar.SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        private final androidx.window.layout.SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(androidx.window.layout.SidecarAdapter sidecarAdapter, androidx.window.sidecar.SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new java.util.concurrent.locks.ReentrantLock();
            this.mActivityWindowLayoutInfo = new java.util.WeakHashMap<>();
        }

        public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(android.os.IBinder token, androidx.window.sidecar.SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", "context", "Landroid/content/Context;", "getSidecarCompat$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.window.core.Version getSidecarVersion() {
            try {
                java.lang.String apiVersion = androidx.window.sidecar.SidecarProvider.getApiVersion();
                if (android.text.TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return androidx.window.core.Version.INSTANCE.parse(apiVersion);
            } catch (java.lang.NoClassDefFoundError unused) {
                return null;
            } catch (java.lang.UnsupportedOperationException unused2) {
                return null;
            }
        }

        public final androidx.window.sidecar.SidecarInterface getSidecarCompat$window_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return androidx.window.sidecar.SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final android.os.IBinder getActivityWindowToken$window_release(android.app.Activity activity) {
            android.view.Window window;
            android.view.WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }
    }
}
