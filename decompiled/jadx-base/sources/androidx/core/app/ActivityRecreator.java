package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
final class ActivityRecreator {
    private static final java.lang.String LOG_TAG = "ActivityRecreator";
    protected static final java.lang.Class<?> activityThreadClass;
    private static final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    protected static final java.lang.reflect.Field mainThreadField;
    protected static final java.lang.reflect.Method performStopActivity2ParamsMethod;
    protected static final java.lang.reflect.Method performStopActivity3ParamsMethod;
    protected static final java.lang.reflect.Method requestRelaunchActivityMethod;
    protected static final java.lang.reflect.Field tokenField;

    private ActivityRecreator() {
    }

    static {
        java.lang.Class<?> activityThreadClass2 = getActivityThreadClass();
        activityThreadClass = activityThreadClass2;
        mainThreadField = getMainThreadField();
        tokenField = getTokenField();
        performStopActivity3ParamsMethod = getPerformStopActivity3Params(activityThreadClass2);
        performStopActivity2ParamsMethod = getPerformStopActivity2Params(activityThreadClass2);
        requestRelaunchActivityMethod = getRequestRelaunchActivityMethod(activityThreadClass2);
    }

    static boolean recreate(android.app.Activity activity) {
        java.lang.Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (needsRelaunchCall() && requestRelaunchActivityMethod == null) {
            return false;
        }
        if (performStopActivity2ParamsMethod == null && performStopActivity3ParamsMethod == null) {
            return false;
        }
        try {
            final java.lang.Object obj2 = tokenField.get(activity);
            if (obj2 == null || (obj = mainThreadField.get(activity)) == null) {
                return false;
            }
            final android.app.Application application = activity.getApplication();
            final androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks lifecycleCheckCallbacks = new androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks(activity);
            application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
            mainHandler.post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.1
                @Override // java.lang.Runnable
                public void run() {
                    lifecycleCheckCallbacks.currentlyRecreatingToken = obj2;
                }
            });
            try {
                if (needsRelaunchCall()) {
                    requestRelaunchActivityMethod.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                mainHandler.post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    }
                });
            }
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static final class LifecycleCheckCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        java.lang.Object currentlyRecreatingToken;
        private android.app.Activity mActivity;
        private final int mRecreatingHashCode;
        private boolean mStarted = false;
        private boolean mDestroyed = false;
        private boolean mStopQueued = false;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
        }

        LifecycleCheckCallbacks(android.app.Activity activity) {
            this.mActivity = activity;
            this.mRecreatingHashCode = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            if (this.mActivity == activity) {
                this.mStarted = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            if (!this.mDestroyed || this.mStopQueued || this.mStarted || !androidx.core.app.ActivityRecreator.queueOnStopIfNecessary(this.currentlyRecreatingToken, this.mRecreatingHashCode, activity)) {
                return;
            }
            this.mStopQueued = true;
            this.currentlyRecreatingToken = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if (this.mActivity == activity) {
                this.mActivity = null;
                this.mDestroyed = true;
            }
        }
    }

    protected static boolean queueOnStopIfNecessary(java.lang.Object obj, int i, android.app.Activity activity) {
        try {
            final java.lang.Object obj2 = tokenField.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                final java.lang.Object obj3 = mainThreadField.get(activity);
                mainHandler.postAtFrontOfQueue(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod != null) {
                                androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod.invoke(obj3, obj2, false, "AppCompat recreation");
                            } else {
                                androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod.invoke(obj3, obj2, false);
                            }
                        } catch (java.lang.RuntimeException e) {
                            if (e.getClass() == java.lang.RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                throw e;
                            }
                        } catch (java.lang.Throwable th) {
                            android.util.Log.e(androidx.core.app.ActivityRecreator.LOG_TAG, "Exception while invoking performStopActivity", th);
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (java.lang.Throwable th) {
            android.util.Log.e(LOG_TAG, "Exception while fetching field values", th);
            return false;
        }
    }

    private static java.lang.reflect.Method getPerformStopActivity3Params(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("performStopActivity", android.os.IBinder.class, java.lang.Boolean.TYPE, java.lang.String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method getPerformStopActivity2Params(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("performStopActivity", android.os.IBinder.class, java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean needsRelaunchCall() {
        return android.os.Build.VERSION.SDK_INT == 26 || android.os.Build.VERSION.SDK_INT == 27;
    }

    private static java.lang.reflect.Method getRequestRelaunchActivityMethod(java.lang.Class<?> cls) {
        if (needsRelaunchCall() && cls != null) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", android.os.IBinder.class, java.util.List.class, java.util.List.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, android.content.res.Configuration.class, android.content.res.Configuration.class, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    private static java.lang.reflect.Field getMainThreadField() {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Field getTokenField() {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> getActivityThreadClass() {
        try {
            return java.lang.Class.forName("android.app.ActivityThread");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
