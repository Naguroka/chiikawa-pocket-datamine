package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjm implements com.google.android.gms.internal.measurement.zzjr {
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final java.lang.Runnable zze;
    private final android.database.ContentObserver zzf;
    private volatile java.util.Map zzh;
    private static final java.util.Map zzb = new androidx.collection.ArrayMap();
    public static final java.lang.String[] zza = {com.ironsource.y8.h.W, "value"};
    private final java.lang.Object zzg = new java.lang.Object();
    private final java.util.List zzi = new java.util.ArrayList();

    private zzjm(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(contentResolver);
        com.google.common.base.Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        this.zzf = new com.google.android.gms.internal.measurement.zzjl(this, null);
    }

    public static com.google.android.gms.internal.measurement.zzjm zza(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.Runnable runnable) {
        com.google.android.gms.internal.measurement.zzjm zzjmVar;
        synchronized (com.google.android.gms.internal.measurement.zzjm.class) {
            java.util.Map map = zzb;
            zzjmVar = (com.google.android.gms.internal.measurement.zzjm) map.get(uri);
            if (zzjmVar == null) {
                try {
                    com.google.android.gms.internal.measurement.zzjm zzjmVar2 = new com.google.android.gms.internal.measurement.zzjm(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, zzjmVar2.zzf);
                        map.put(uri, zzjmVar2);
                    } catch (java.lang.SecurityException unused) {
                    }
                    zzjmVar = zzjmVar2;
                } catch (java.lang.SecurityException unused2) {
                }
            }
        }
        return zzjmVar;
    }

    public static /* synthetic */ java.util.Map zzc(com.google.android.gms.internal.measurement.zzjm zzjmVar) {
        java.util.Map mapEmptyMap;
        java.util.Map mapEmptyMap2;
        android.content.ContentResolver contentResolver = zzjmVar.zzc;
        android.net.Uri uri = zzjmVar.zzd;
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return java.util.Collections.emptyMap();
            }
            try {
                android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, zza, null, null, null);
                try {
                    if (cursorQuery == null) {
                        android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        mapEmptyMap = java.util.Collections.emptyMap();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return mapEmptyMap;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        mapEmptyMap2 = java.util.Collections.emptyMap();
                    } else {
                        java.util.Map arrayMap = count <= 256 ? new androidx.collection.ArrayMap(count) : new java.util.HashMap(count, 1.0f);
                        while (cursorQuery.moveToNext()) {
                            arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (cursorQuery.isAfterLast()) {
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return arrayMap;
                        }
                        android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                        mapEmptyMap2 = java.util.Collections.emptyMap();
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapEmptyMap2;
                } catch (java.lang.Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (android.os.RemoteException e) {
                android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                mapEmptyMap = java.util.Collections.emptyMap();
            }
        } catch (java.lang.Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    static synchronized void zze() {
        java.util.Map map = zzb;
        for (com.google.android.gms.internal.measurement.zzjm zzjmVar : map.values()) {
            zzjmVar.zzc.unregisterContentObserver(zzjmVar.zzf);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(java.lang.String str) {
        return (java.lang.String) zzd().get(str);
    }

    public final java.util.Map zzd() {
        java.util.Map mapEmptyMap;
        java.util.Map map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            mapEmptyMap = (java.util.Map) com.google.android.gms.internal.measurement.zzjp.zza(new com.google.android.gms.internal.measurement.zzjq() { // from class: com.google.android.gms.internal.measurement.zzjk
                                @Override // com.google.android.gms.internal.measurement.zzjq
                                public final java.lang.Object zza() {
                                    return com.google.android.gms.internal.measurement.zzjm.zzc(this.zza);
                                }
                            });
                        } catch (java.lang.Throwable th) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException e) {
                        android.util.Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                        mapEmptyMap = java.util.Collections.emptyMap();
                    }
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    this.zzh = mapEmptyMap;
                    map = mapEmptyMap;
                }
            }
        }
        return map != null ? map : java.util.Collections.emptyMap();
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            java.util.Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.measurement.zzjn) it.next()).zza();
            }
        }
    }
}
