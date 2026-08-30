package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzff {
    private static volatile com.google.android.gms.internal.measurement.zzff zzc;
    protected final com.google.android.gms.common.util.Clock zza;
    protected final java.util.concurrent.ExecutorService zzb;
    private final java.lang.String zzd;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zze;
    private final java.util.List zzf;
    private int zzg;
    private boolean zzh;
    private final java.lang.String zzi;
    private volatile com.google.android.gms.internal.measurement.zzcv zzj;

    protected zzff(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        if (str == null || !zzX(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = com.google.android.gms.common.util.DefaultClock.getInstance();
        com.google.android.gms.internal.measurement.zzcq.zza();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.measurement.zzeg(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new com.google.android.gms.measurement.api.AppMeasurementSdk(this);
        this.zzf = new java.util.ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzmg.zzc(context, "google_app_id", com.google.android.gms.measurement.internal.zzig.zza(context)) != null && !zzT()) {
                this.zzi = null;
                this.zzh = true;
                android.util.Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (java.lang.IllegalStateException unused) {
        }
        if (zzX(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    android.util.Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                android.util.Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        zzW(new com.google.android.gms.internal.measurement.zzdu(this, str2, str3, context, bundle));
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        if (application == null) {
            android.util.Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new com.google.android.gms.internal.measurement.zzfe(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(java.lang.Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            android.util.Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzB(5, "Error with data collection. Data lost.", exc, null, null);
        }
        android.util.Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    private final void zzV(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, java.lang.Long l) {
        zzW(new com.google.android.gms.internal.measurement.zzet(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(com.google.android.gms.internal.measurement.zzeu zzeuVar) {
        this.zzb.execute(zzeuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzX(java.lang.String str, java.lang.String str2) {
        return (str2 == null || str == null || zzT()) ? false : true;
    }

    public static com.google.android.gms.internal.measurement.zzff zzg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (com.google.android.gms.internal.measurement.zzff.class) {
                if (zzc == null) {
                    zzc = new com.google.android.gms.internal.measurement.zzff(context, str, str2, str3, bundle);
                }
            }
        }
        return zzc;
    }

    public final void zzA(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        zzV(str, str2, bundle, true, false, java.lang.Long.valueOf(j));
    }

    public final void zzB(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        zzW(new com.google.android.gms.internal.measurement.zzeh(this, false, 5, str, obj, null, null));
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkcVar);
        java.util.List list = this.zzf;
        synchronized (list) {
            for (int i = 0; i < list.size(); i++) {
                if (zzkcVar.equals(((android.util.Pair) list.get(i)).first)) {
                    android.util.Log.w(this.zzd, "OnEventListener already registered.");
                    return;
                }
            }
            com.google.android.gms.internal.measurement.zzew zzewVar = new com.google.android.gms.internal.measurement.zzew(zzkcVar);
            list.add(new android.util.Pair(zzkcVar, zzewVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzewVar);
                    return;
                } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                    android.util.Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzW(new com.google.android.gms.internal.measurement.zzer(this, zzewVar));
        }
    }

    public final void zzD() {
        zzW(new com.google.android.gms.internal.measurement.zzdt(this));
    }

    public final void zzE(java.lang.Runnable runnable) {
        zzW(new com.google.android.gms.internal.measurement.zzdz(this, runnable));
    }

    public final void zzF(android.os.Bundle bundle) {
        zzW(new com.google.android.gms.internal.measurement.zzdm(this, bundle));
    }

    public final void zzG(android.os.Bundle bundle) {
        zzW(new com.google.android.gms.internal.measurement.zzds(this, bundle));
    }

    public final void zzH(com.google.android.gms.internal.measurement.zzdj zzdjVar, java.lang.String str, java.lang.String str2) {
        zzW(new com.google.android.gms.internal.measurement.zzdq(this, zzdjVar, str, str2));
    }

    public final void zzI(boolean z) {
        zzW(new com.google.android.gms.internal.measurement.zzen(this, z));
    }

    public final void zzJ(android.os.Bundle bundle) {
        zzW(new com.google.android.gms.internal.measurement.zzeo(this, bundle));
    }

    public final void zzK(com.google.android.gms.measurement.internal.zzkb zzkbVar) {
        com.google.android.gms.internal.measurement.zzev zzevVar = new com.google.android.gms.internal.measurement.zzev(zzkbVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzevVar);
                return;
            } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                android.util.Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzW(new com.google.android.gms.internal.measurement.zzep(this, zzevVar));
    }

    public final void zzL(java.lang.Boolean bool) {
        zzW(new com.google.android.gms.internal.measurement.zzdr(this, bool));
    }

    public final void zzM(long j) {
        zzW(new com.google.android.gms.internal.measurement.zzdv(this, j));
    }

    public final void zzN(android.content.Intent intent) {
        zzW(new com.google.android.gms.internal.measurement.zzeq(this, intent));
    }

    public final void zzO(java.lang.String str) {
        zzW(new com.google.android.gms.internal.measurement.zzdp(this, str));
    }

    public final void zzP(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        zzW(new com.google.android.gms.internal.measurement.zzdl(this, str, str2, obj, z));
    }

    public final void zzQ(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        android.util.Pair pair;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkcVar);
        java.util.List list = this.zzf;
        synchronized (list) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzkcVar.equals(((android.util.Pair) list.get(i)).first)) {
                        pair = (android.util.Pair) list.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                android.util.Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            com.google.android.gms.internal.measurement.zzew zzewVar = (com.google.android.gms.internal.measurement.zzew) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzewVar);
                    return;
                } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                    android.util.Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzW(new com.google.android.gms.internal.measurement.zzes(this, zzewVar));
        }
    }

    protected final boolean zzT() {
        try {
            java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzej(this, str, zzcsVar));
        java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.measurement.zzcs.zzf(zzcsVar.zzb(10000L), java.lang.Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzec(this, zzcsVar));
        java.lang.Long lZzc = zzcsVar.zzc(500L);
        if (lZzc != null) {
            return lZzc.longValue();
        }
        long jNextLong = new java.util.Random(java.lang.System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return jNextLong + ((long) i);
    }

    public final android.os.Bundle zzc(android.os.Bundle bundle, boolean z) {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzei(this, bundle, zzcsVar));
        if (z) {
            return zzcsVar.zzb(5000L);
        }
        return null;
    }

    public final com.google.android.gms.measurement.api.AppMeasurementSdk zzd() {
        return this.zze;
    }

    protected final com.google.android.gms.internal.measurement.zzcv zzf(android.content.Context context, boolean z) {
        try {
            return com.google.android.gms.internal.measurement.zzcu.asInterface(com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            zzU(e, true, false);
            return null;
        }
    }

    public final java.lang.Long zzh() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzel(this, zzcsVar));
        return zzcsVar.zzc(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final java.lang.Object zzi(int i) {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzem(this, zzcsVar, i));
        return com.google.android.gms.internal.measurement.zzcs.zzf(zzcsVar.zzb(androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS), java.lang.Object.class);
    }

    public final java.lang.String zzk() {
        return this.zzi;
    }

    public final java.lang.String zzl() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzek(this, zzcsVar));
        return zzcsVar.zzd(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final java.lang.String zzm() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzeb(this, zzcsVar));
        return zzcsVar.zzd(50L);
    }

    public final java.lang.String zzn() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzee(this, zzcsVar));
        return zzcsVar.zzd(500L);
    }

    public final java.lang.String zzo() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzed(this, zzcsVar));
        return zzcsVar.zzd(500L);
    }

    public final java.lang.String zzp() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzea(this, zzcsVar));
        return zzcsVar.zzd(500L);
    }

    public final java.util.List zzq(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzdo(this, str, str2, zzcsVar));
        java.util.List list = (java.util.List) com.google.android.gms.internal.measurement.zzcs.zzf(zzcsVar.zzb(5000L), java.util.List.class);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public final java.util.Map zzr(java.lang.String str, java.lang.String str2, boolean z) {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        zzW(new com.google.android.gms.internal.measurement.zzef(this, str, str2, z, zzcsVar));
        android.os.Bundle bundleZzb = zzcsVar.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap map = new java.util.HashMap(bundleZzb.size());
        for (java.lang.String str3 : bundleZzb.keySet()) {
            java.lang.Object obj = bundleZzb.get(str3);
            if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzv(java.lang.String str) {
        zzW(new com.google.android.gms.internal.measurement.zzdw(this, str));
    }

    public final void zzw(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzW(new com.google.android.gms.internal.measurement.zzdn(this, str, str2, bundle));
    }

    public final void zzx(java.lang.String str) {
        zzW(new com.google.android.gms.internal.measurement.zzdx(this, str));
    }

    public final void zzy(java.lang.String str, android.os.Bundle bundle) {
        zzV(null, str, bundle, false, true, null);
    }

    public final void zzz(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzV(str, str2, bundle, true, true, null);
    }
}
