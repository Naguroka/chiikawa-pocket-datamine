package androidx.lifecycle;

/* JADX INFO: compiled from: ReportFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "()V", "processListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "dispatch", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "dispatchCreate", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dispatchResume", "dispatchStart", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", com.ironsource.y8.h.t0, com.ironsource.y8.h.u0, "onStart", "onStop", "setProcessListener", "ActivityInitializationListener", "Companion", "LifecycleCallbacks", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ReportFragment extends android.app.Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.lifecycle.ReportFragment.Companion INSTANCE = new androidx.lifecycle.ReportFragment.Companion(null);
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener processListener;

    /* JADX INFO: compiled from: ReportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "onCreate", "", com.ironsource.y8.h.u0, "onStart", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final androidx.lifecycle.ReportFragment get(android.app.Activity activity) {
        return INSTANCE.get(activity);
    }

    @kotlin.jvm.JvmStatic
    public static final void injectIfNeededIn(android.app.Activity activity) {
        INSTANCE.injectIfNeededIn(activity);
    }

    private final void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener listener) {
        if (listener != null) {
            listener.onCreate();
        }
    }

    private final void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener listener) {
        if (listener != null) {
            listener.onStart();
        }
    }

    private final void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener listener) {
        if (listener != null) {
            listener.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dispatchCreate(this.processListener);
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        dispatchStart(this.processListener);
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        dispatchResume(this.processListener);
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispatch(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        this.processListener = null;
    }

    private final void dispatch(androidx.lifecycle.Lifecycle.Event event) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            androidx.lifecycle.ReportFragment.Companion companion = INSTANCE;
            android.app.Activity activity = getActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
            companion.dispatch$lifecycle_runtime_release(activity, event);
        }
    }

    public final void setProcessListener(androidx.lifecycle.ReportFragment.ActivityInitializationListener processListener) {
        this.processListener = processListener;
    }

    /* JADX INFO: compiled from: ReportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityPostCreated", "savedInstanceState", "onActivityPostResumed", "onActivityPostStarted", "onActivityPreDestroyed", "onActivityPrePaused", "onActivityPreStopped", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion INSTANCE = new androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion(null);

        @kotlin.jvm.JvmStatic
        public static final void registerIn(android.app.Activity activity) {
            INSTANCE.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, androidx.lifecycle.Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, androidx.lifecycle.Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        }

        /* JADX INFO: compiled from: ReportFragment.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", "()V", "registerIn", "", "activity", "Landroid/app/Activity;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final void registerIn(android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.ReportFragment.LifecycleCallbacks());
            }
        }
    }

    /* JADX INFO: compiled from: ReportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", "()V", "REPORT_FRAGMENT_TAG", "", "reportFragment", "Landroidx/lifecycle/ReportFragment;", "Landroid/app/Activity;", "get$annotations", "(Landroid/app/Activity;)V", "get", "(Landroid/app/Activity;)Landroidx/lifecycle/ReportFragment;", "dispatch", "", "activity", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "dispatch$lifecycle_runtime_release", "injectIfNeededIn", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void get$annotations(android.app.Activity activity) {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void injectIfNeededIn(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.lifecycle.ReportFragment.LifecycleCallbacks.INSTANCE.registerIn(activity);
            }
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(androidx.lifecycle.ReportFragment.REPORT_FRAGMENT_TAG) == null) {
                fragmentManager.beginTransaction().add(new androidx.lifecycle.ReportFragment(), androidx.lifecycle.ReportFragment.REPORT_FRAGMENT_TAG).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final void dispatch$lifecycle_runtime_release(android.app.Activity activity, androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof androidx.lifecycle.LifecycleRegistryOwner) {
                ((androidx.lifecycle.LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
            } else if (activity instanceof androidx.lifecycle.LifecycleOwner) {
                androidx.lifecycle.Lifecycle lifecycle = ((androidx.lifecycle.LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof androidx.lifecycle.LifecycleRegistry) {
                    ((androidx.lifecycle.LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        public final androidx.lifecycle.ReportFragment get(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
            android.app.Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(androidx.lifecycle.ReportFragment.REPORT_FRAGMENT_TAG);
            kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (androidx.lifecycle.ReportFragment) fragmentFindFragmentByTag;
        }
    }
}
