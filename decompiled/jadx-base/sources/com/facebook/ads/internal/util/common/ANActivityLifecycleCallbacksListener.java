package com.facebook.ads.internal.util.common;

/* JADX INFO: loaded from: classes4.dex */
public class ANActivityLifecycleCallbacksListener implements android.app.Application.ActivityLifecycleCallbacks {
    public static final int ACTIVITY_CREATED = 1;
    public static final int ACTIVITY_DESTROYED = 6;
    public static final int ACTIVITY_PAUSED = 4;
    public static final int ACTIVITY_RESUMED = 3;
    public static final int ACTIVITY_STARTED = 2;
    public static final int ACTIVITY_STOPPED = 5;
    private static com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener sANActivityLifecycleCallbacksListener;
    private static final java.util.Map<android.app.Activity, java.lang.Integer> sActivityStateMap = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        sActivityStateMap.put(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        sActivityStateMap.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        sActivityStateMap.put(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        sActivityStateMap.put(activity, 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        sActivityStateMap.put(activity, 5);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        sActivityStateMap.put(activity, 6);
    }

    public java.util.Map<android.app.Activity, java.lang.Integer> getActivityStateMap() {
        return sActivityStateMap;
    }

    public static void registerActivityCallbacks(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        synchronized (com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.class) {
            if ((applicationContext instanceof android.app.Application) && sANActivityLifecycleCallbacksListener == null) {
                com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = new com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener();
                sANActivityLifecycleCallbacksListener = aNActivityLifecycleCallbacksListener;
                ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(aNActivityLifecycleCallbacksListener);
            }
        }
    }

    public static synchronized com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener getANActivityLifecycleCallbacksListener() {
        return sANActivityLifecycleCallbacksListener;
    }

    public static void unregisterActivityCallbacks(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        synchronized (com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.class) {
            if (applicationContext instanceof android.app.Application) {
                ((android.app.Application) applicationContext).unregisterActivityLifecycleCallbacks(sANActivityLifecycleCallbacksListener);
                sANActivityLifecycleCallbacksListener = null;
            }
        }
    }
}
