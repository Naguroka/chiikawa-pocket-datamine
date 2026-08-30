package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawk implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {
    private static final android.os.Handler zza = new android.os.Handler(android.os.Looper.getMainLooper());
    private final android.content.Context zzb;
    private android.app.Application zzc;
    private final android.os.PowerManager zzd;
    private final android.app.KeyguardManager zze;
    private android.content.BroadcastReceiver zzf;
    private final com.google.android.gms.internal.ads.zzavw zzg;
    private java.lang.ref.WeakReference zzh;
    private java.lang.ref.WeakReference zzi;
    private com.google.android.gms.internal.ads.zzavs zzj;
    private byte zzk = -1;
    private int zzl = -1;
    private long zzm = -3;

    public zzawk(android.content.Context context, com.google.android.gms.internal.ads.zzavw zzavwVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zzg = zzavwVar;
        this.zzd = (android.os.PowerManager) applicationContext.getSystemService("power");
        this.zze = (android.app.KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) applicationContext;
            this.zzc = application;
            this.zzj = new com.google.android.gms.internal.ads.zzavs(application, this);
        }
        zzd(null);
    }

    private final void zze(android.app.Activity activity, int i) {
        android.view.Window window;
        if (this.zzi == null || (window = activity.getWindow()) == null) {
            return;
        }
        android.view.View viewPeekDecorView = window.peekDecorView();
        android.view.View viewZzb = zzb();
        if (viewZzb == null || viewPeekDecorView == null || viewZzb.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    public final void zzf() {
        android.app.Activity activity;
        if (this.zzi == null) {
            return;
        }
        android.view.View viewZzb = zzb();
        if (viewZzb == null) {
            this.zzm = -3L;
            this.zzk = (byte) -1;
            return;
        }
        int i = 0;
        int i2 = viewZzb.getVisibility() != 0 ? 1 : 0;
        if (!viewZzb.isShown()) {
            i2 |= 2;
        }
        android.os.PowerManager powerManager = this.zzd;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i2 |= 4;
        }
        if (!this.zzg.zza()) {
            android.app.KeyguardManager keyguardManager = this.zze;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i2 |= 8;
            } else {
                int i3 = com.google.android.gms.internal.ads.zzawg.zza;
                android.view.View rootView = viewZzb.getRootView();
                if (rootView == null) {
                    rootView = viewZzb;
                }
                android.content.Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof android.content.ContextWrapper) || i >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                        i++;
                    }
                }
                if (activity != null) {
                    android.view.Window window = activity.getWindow();
                    android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i2 |= 8;
                    }
                } else {
                    i2 |= 8;
                }
            }
        }
        if (!viewZzb.getGlobalVisibleRect(new android.graphics.Rect())) {
            i2 |= 16;
        }
        if (!viewZzb.getLocalVisibleRect(new android.graphics.Rect())) {
            i2 |= 32;
        }
        int windowVisibility = viewZzb.getWindowVisibility();
        int i4 = this.zzl;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        if (windowVisibility != 0) {
            i2 |= 64;
        }
        if (this.zzk != i2) {
            this.zzk = (byte) i2;
            this.zzm = i2 == 0 ? android.os.SystemClock.elapsedRealtime() : (-3) - ((long) i2);
        }
    }

    private final void zzg() {
        zza.post(new com.google.android.gms.internal.ads.zzawi(this));
    }

    private final void zzh(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzh = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzf == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            com.google.android.gms.internal.ads.zzawj zzawjVar = new com.google.android.gms.internal.ads.zzawj(this);
            this.zzf = zzawjVar;
            this.zzb.registerReceiver(zzawjVar, intentFilter);
        }
        android.app.Application application = this.zzc;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private final void zzi(android.view.View view) {
        try {
            java.lang.ref.WeakReference weakReference = this.zzh;
            if (weakReference != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (java.lang.Exception unused2) {
        }
        android.content.BroadcastReceiver broadcastReceiver = this.zzf;
        if (broadcastReceiver != null) {
            try {
                this.zzb.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.Exception unused3) {
            }
            this.zzf = null;
        }
        android.app.Application application = this.zzc;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zze(activity, 0);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zze(activity, 4);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zze(activity, 0);
        zzf();
        zzg();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zze(activity, 0);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zzf();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzf();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.zzl = -1;
        zzh(view);
        zzf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.zzl = -1;
        zzf();
        zzg();
        zzi(view);
    }

    public final long zza() {
        if (this.zzm <= -2 && zzb() == null) {
            this.zzm = -3L;
        }
        return this.zzm;
    }

    final android.view.View zzb() {
        java.lang.ref.WeakReference weakReference = this.zzi;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    final void zzd(android.view.View view) {
        long j;
        android.view.View viewZzb = zzb();
        if (viewZzb != null) {
            viewZzb.removeOnAttachStateChangeListener(this);
            zzi(viewZzb);
        }
        this.zzi = new java.lang.ref.WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                zzh(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.zzm = j;
    }
}
