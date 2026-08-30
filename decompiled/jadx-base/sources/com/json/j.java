package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\bR$\u0010\u000e\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR$\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ironsource/j;", "", "Landroid/app/Application;", "application", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "context", "Landroid/app/Activity;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/atomic/AtomicReference;", "isInitialized", "Ljava/lang/ref/WeakReference;", "c", "currentActivity", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.j f2777a = new com.json.j();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> isInitialized = new java.util.concurrent.atomic.AtomicReference<>(java.lang.Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static java.util.concurrent.atomic.AtomicReference<java.lang.ref.WeakReference<android.app.Activity>> currentActivity = new java.util.concurrent.atomic.AtomicReference<>(null);

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"com/ironsource/j$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements android.app.Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.UByte$$ExternalSyntheticBackport0.m(com.json.j.currentActivity, null, new java.lang.ref.WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            com.json.j.currentActivity.set(new java.lang.ref.WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.UByte$$ExternalSyntheticBackport0.m(com.json.j.currentActivity, null, new java.lang.ref.WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    private j() {
    }

    private final void a(android.app.Application application) {
        application.registerActivityLifecycleCallbacks(new com.ironsource.j.a());
    }

    public final void a(android.content.Context context) {
        android.app.Application application;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (kotlin.UByte$$ExternalSyntheticBackport0.m(isInitialized, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE)) {
            if (context instanceof android.app.Activity) {
                android.app.Application application2 = ((android.app.Activity) context).getApplication();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application2, "context.application");
                a(application2);
                currentActivity.set(new java.lang.ref.WeakReference<>(context));
                return;
            }
            if (context instanceof android.app.Service) {
                application = ((android.app.Service) context).getApplication();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "context.application");
            } else if (!(context instanceof android.app.Application)) {
                return;
            } else {
                application = (android.app.Application) context;
            }
            a(application);
        }
    }

    public final android.app.Activity b() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = currentActivity.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
