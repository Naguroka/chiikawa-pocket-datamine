package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzayl implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbv)).longValue();
    android.content.BroadcastReceiver zza;
    final java.lang.ref.WeakReference zzb;
    private final android.content.Context zzd;
    private android.app.Application zze;
    private final android.view.WindowManager zzf;
    private final android.os.PowerManager zzg;
    private final android.app.KeyguardManager zzh;
    private java.lang.ref.WeakReference zzi;
    private com.google.android.gms.internal.ads.zzayx zzj;
    private final com.google.android.gms.ads.internal.util.zzbx zzk = new com.google.android.gms.ads.internal.util.zzbx(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final java.util.HashSet zzn = new java.util.HashSet();
    private final android.util.DisplayMetrics zzo;
    private final android.graphics.Rect zzp;

    public zzayl(android.content.Context context, android.view.View view) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        android.view.WindowManager windowManager = (android.view.WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (android.os.PowerManager) applicationContext.getSystemService("power");
        this.zzh = (android.app.KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) applicationContext;
            this.zze = application;
            this.zzj = new com.google.android.gms.internal.ads.zzayx(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        android.graphics.Rect rect = new android.graphics.Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        java.lang.ref.WeakReference weakReference = this.zzb;
        android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new java.lang.ref.WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int zzh(int i) {
        return (int) (i / this.zzo.density);
    }

    private final void zzi(android.app.Activity activity, int i) {
        android.view.Window window;
        if (this.zzb == null || (window = activity.getWindow()) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.zzb;
        android.view.View viewPeekDecorView = window.peekDecorView();
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzm = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(int i) {
        java.lang.ref.WeakReference weakReference;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        android.view.View view;
        java.util.List listEmptyList;
        boolean z;
        int i2;
        boolean z2;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
            return;
        }
        android.view.View view2 = (android.view.View) weakReference.get();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.graphics.Rect rect3 = new android.graphics.Rect();
        android.graphics.Rect rect4 = new android.graphics.Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeU)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            globalVisibleRect = false;
            localVisibleRect = false;
            view = null;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzby)).booleanValue() || view == null) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            try {
                listEmptyList = new java.util.ArrayList();
                android.view.ViewParent parent = view.getParent();
                while (parent instanceof android.view.View) {
                    android.view.View view3 = (android.view.View) parent;
                    android.graphics.Rect rect5 = new android.graphics.Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        listEmptyList.add(zza(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (java.lang.Exception e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "PositionWatcher.getParentScrollViewRects");
                listEmptyList = java.util.Collections.emptyList();
            }
        }
        java.util.List list = listEmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i3 = this.zzm;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        long jZzx = com.google.android.gms.ads.internal.util.zzs.zzx(view);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzku)).booleanValue()) {
            if (view2 != null) {
                android.os.PowerManager powerManager = this.zzg;
                android.app.KeyguardManager keyguardManager = this.zzh;
                com.google.android.gms.ads.internal.zzv.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzS(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        z = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        z = 0;
                        localVisibleRect = false;
                    } else if (jZzx < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkx)).intValue() || windowVisibility != 0) {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    } else {
                        z = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    }
                }
            }
            z = 0;
        } else {
            if (view2 != null) {
                android.os.PowerManager powerManager2 = this.zzg;
                android.app.KeyguardManager keyguardManager2 = this.zzh;
                com.google.android.gms.ads.internal.zzv.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzS(view, powerManager2, keyguardManager2)) {
                    if (!globalVisibleRect) {
                        z = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        z = 0;
                        localVisibleRect = false;
                    } else if (windowVisibility == 0) {
                        z = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    } else {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    }
                }
            }
            z = 0;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkz)).booleanValue()) {
            android.os.PowerManager powerManager3 = this.zzg;
            android.app.KeyguardManager keyguardManager3 = this.zzh;
            com.google.android.gms.ads.internal.zzv.zzq();
            int i4 = true != com.google.android.gms.ads.internal.util.zzs.zzS(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i5 = true != globalVisibleRect ? 0 : 8;
            int i6 = true != localVisibleRect ? 0 : 16;
            int i7 = windowVisibility == 0 ? 128 : 0;
            int i8 = jZzx >= ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkx)).intValue()) ? 32 : 0;
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, i8 | i7 | i4 | i5 | i6 | z, null);
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (i == i2 && !this.zzk.zzb() && z == this.zzl) {
            return;
        }
        if (z != 0 || this.zzl) {
            z2 = true;
        } else {
            z2 = true;
            if (i == 1) {
                return;
            }
        }
        com.google.android.gms.internal.ads.zzayj zzayjVar = new com.google.android.gms.internal.ads.zzayj(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), this.zzg.isScreenOn(), (view == null || !view.isAttachedToWindow()) ? false : z2, view != null ? view.getWindowVisibility() : 8, zza(this.zzp), zza(rect), zza(rect2), globalVisibleRect, zza(rect3), localVisibleRect, jZzx, zza(rect4), this.zzo.density, z, list);
        java.util.Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzayk) it.next()).zzdn(zzayjVar);
        }
        this.zzl = z;
    }

    private final void zzk() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzayh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    private final void zzl(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new com.google.android.gms.internal.ads.zzayi(this);
            com.google.android.gms.ads.internal.zzv.zzw().zzc(this.zzd, this.zza, intentFilter);
        }
        android.app.Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(android.view.View view) {
        try {
            java.lang.ref.WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (java.lang.Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.zzv.zzw().zzd(this.zzd, this.zza);
            } catch (java.lang.IllegalStateException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed trying to unregister the receiver", e3);
            } catch (java.lang.Exception e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        android.app.Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception e5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zzj(3);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.zzm = -1;
        zzj(3);
        zzk();
        zzm(view);
    }

    final android.graphics.Rect zza(android.graphics.Rect rect) {
        return new android.graphics.Rect(zzh(rect.left), zzh(rect.top), zzh(rect.right), zzh(rect.bottom));
    }

    public final void zzc(com.google.android.gms.internal.ads.zzayk zzaykVar) {
        this.zzn.add(zzaykVar);
        zzj(3);
    }

    final /* synthetic */ void zzd() {
        zzj(3);
    }

    public final void zze(com.google.android.gms.internal.ads.zzayk zzaykVar) {
        this.zzn.remove(zzaykVar);
    }

    public final void zzf() {
        this.zzk.zza(zzc);
    }

    public final void zzg(long j) {
        this.zzk.zza(j);
    }
}
