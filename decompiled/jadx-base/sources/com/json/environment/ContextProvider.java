package com.json.environment;

/* JADX INFO: loaded from: classes5.dex */
public class ContextProvider {
    private static volatile com.json.environment.ContextProvider d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Activity f2620a;
    private android.content.Context b;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.environment.ContextProvider.a> c = new java.util.concurrent.ConcurrentHashMap<>();

    public interface a {
        void onPause(android.app.Activity activity);

        void onResume(android.app.Activity activity);
    }

    private ContextProvider() {
    }

    public static com.json.environment.ContextProvider getInstance() {
        if (d == null) {
            synchronized (com.json.environment.ContextProvider.class) {
                if (d == null) {
                    d = new com.json.environment.ContextProvider();
                }
            }
        }
        return d;
    }

    public android.content.Context getApplicationContext() {
        android.app.Activity activity;
        android.content.Context context = this.b;
        return (context != null || (activity = this.f2620a) == null) ? context : activity.getApplicationContext();
    }

    public android.app.Activity getCurrentActiveActivity() {
        android.app.Activity activity = this.f2620a;
        return activity != null ? activity : com.json.j.f2777a.b();
    }

    public void onPause(android.app.Activity activity) {
        if (activity != null) {
            java.util.Iterator<com.ironsource.environment.ContextProvider.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(android.app.Activity activity) {
        if (activity != null) {
            this.f2620a = activity;
            java.util.Iterator<com.ironsource.environment.ContextProvider.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f2620a);
            }
        }
    }

    public void registerLifeCycleListener(com.ironsource.environment.ContextProvider.a aVar) {
        this.c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(android.app.Activity activity) {
        if (activity != null) {
            this.f2620a = activity;
        }
    }

    public void updateAppContext(android.content.Context context) {
        if (context != null) {
            this.b = context;
        }
    }
}
