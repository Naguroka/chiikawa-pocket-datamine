package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    public interface b {
        void a(android.app.Activity activity);
    }

    class a extends com.applovin.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Class f1203a;
        final /* synthetic */ com.applovin.impl.r.b b;
        final /* synthetic */ com.applovin.impl.q c;

        a(java.lang.Class cls, com.applovin.impl.r.b bVar, com.applovin.impl.q qVar) {
            this.f1203a = cls;
            this.b = bVar;
            this.c = qVar;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (this.f1203a.isInstance(activity)) {
                this.b.a(activity);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if (!this.f1203a.isInstance(activity) || activity.isChangingConfigurations()) {
                return;
            }
            this.c.b(this);
        }
    }

    public static android.app.Activity a(android.view.View view) {
        if (view == null) {
            return null;
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public static void a(boolean z, android.app.Activity activity) {
        if (z && com.applovin.impl.z3.b()) {
            android.view.WindowInsetsController insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                insetsController.hide(android.view.WindowInsets.Type.systemBars());
                return;
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(5894);
                return;
            }
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static boolean a(android.app.Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (com.applovin.impl.z3.d() && activity.isDestroyed());
    }

    public static void a(android.content.Context context, java.lang.Class cls) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        if (!(context instanceof android.app.Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void a(android.content.Context context, java.lang.Class cls, com.applovin.impl.q qVar, com.applovin.impl.r.b bVar) {
        qVar.a(new com.applovin.impl.r.a(cls, bVar, qVar));
        a(context, cls);
    }
}
