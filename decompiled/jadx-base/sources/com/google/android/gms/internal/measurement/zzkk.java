package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkk implements com.google.android.gms.internal.measurement.zzjr {
    private static final java.util.Map zza = new androidx.collection.ArrayMap();
    private final android.content.SharedPreferences zzb;
    private final java.lang.Runnable zzc;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private volatile java.util.Map zzf;
    private final java.lang.Object zze = new java.lang.Object();
    private final java.util.List zzg = new java.util.ArrayList();

    private zzkk(android.content.SharedPreferences sharedPreferences, java.lang.Runnable runnable) {
        this.zzb = sharedPreferences;
        this.zzc = runnable;
    }

    static com.google.android.gms.internal.measurement.zzkk zza(android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        final com.google.android.gms.internal.measurement.zzkk zzkkVar;
        android.content.SharedPreferences sharedPreferencesZza;
        if (com.google.android.gms.internal.measurement.zzji.zzc() && !str.startsWith("direct_boot:") && !com.google.android.gms.internal.measurement.zzji.zzb(context)) {
            return null;
        }
        synchronized (com.google.android.gms.internal.measurement.zzkk.class) {
            java.util.Map map = zza;
            zzkkVar = (com.google.android.gms.internal.measurement.zzkk) map.get(str);
            if (zzkkVar == null) {
                android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (com.google.android.gms.internal.measurement.zzji.zzc()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesZza = com.google.android.gms.internal.measurement.zzci.zza(context, str.substring(12), 0, com.google.android.gms.internal.measurement.zzcd.zza);
                    } else {
                        sharedPreferencesZza = com.google.android.gms.internal.measurement.zzci.zza(context, str, 0, com.google.android.gms.internal.measurement.zzcd.zza);
                    }
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    zzkkVar = new com.google.android.gms.internal.measurement.zzkk(sharedPreferencesZza, runnable);
                    android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzkj
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                            com.google.android.gms.internal.measurement.zzkk.zzc(this.zza, sharedPreferences, str2);
                        }
                    };
                    zzkkVar.zzd = onSharedPreferenceChangeListener;
                    zzkkVar.zzb.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, zzkkVar);
                } catch (java.lang.Throwable th) {
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzkkVar;
    }

    public static /* synthetic */ void zzc(com.google.android.gms.internal.measurement.zzkk zzkkVar, android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (zzkkVar.zze) {
            zzkkVar.zzf = null;
            java.lang.Runnable runnable = zzkkVar.zzc;
            com.google.android.gms.internal.measurement.zzki.zzc();
        }
        synchronized (zzkkVar) {
            java.util.Iterator it = zzkkVar.zzg.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.measurement.zzjn) it.next()).zza();
            }
        }
    }

    static synchronized void zzd() {
        java.util.Map map = zza;
        for (com.google.android.gms.internal.measurement.zzkk zzkkVar : map.values()) {
            zzkkVar.zzb.unregisterOnSharedPreferenceChangeListener((android.content.SharedPreferences.OnSharedPreferenceChangeListener) com.google.common.base.Preconditions.checkNotNull(zzkkVar.zzd));
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final java.lang.Object zzb(java.lang.String str) {
        java.util.Map<java.lang.String, ?> map = this.zzf;
        if (map == null) {
            synchronized (this.zze) {
                map = this.zzf;
                if (map == null) {
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        java.util.Map<java.lang.String, ?> all = this.zzb.getAll();
                        this.zzf = all;
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
