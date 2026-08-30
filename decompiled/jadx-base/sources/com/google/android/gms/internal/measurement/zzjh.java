package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjh implements com.google.android.gms.internal.measurement.zzjd {
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean();
    private java.util.HashMap zzb = null;
    private final java.util.HashMap zzc = new java.util.HashMap(16, 1.0f);
    private final java.util.HashMap zzd = new java.util.HashMap(16, 1.0f);
    private final java.util.HashMap zze = new java.util.HashMap(16, 1.0f);
    private final java.util.HashMap zzf = new java.util.HashMap(16, 1.0f);
    private java.lang.Object zzg = null;
    private boolean zzh = false;
    private final java.lang.String[] zzi = new java.lang.String[0];

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        if (contentResolver == null) {
            throw new java.lang.IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            java.lang.String str3 = null;
            if (this.zzb == null) {
                this.zza.set(false);
                this.zzb = new java.util.HashMap(16, 1.0f);
                this.zzg = new java.lang.Object();
                contentResolver.registerContentObserver(com.google.android.gms.internal.measurement.zzjc.zza, true, new com.google.android.gms.internal.measurement.zzjf(this, null));
            } else if (this.zza.getAndSet(false)) {
                this.zzb.clear();
                this.zzc.clear();
                this.zzd.clear();
                this.zze.clear();
                this.zzf.clear();
                this.zzg = new java.lang.Object();
                this.zzh = false;
            }
            java.lang.Object obj = this.zzg;
            if (this.zzb.containsKey(str)) {
                java.lang.String str4 = (java.lang.String) this.zzb.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            try {
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(com.google.android.gms.internal.measurement.zzjc.zza);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new com.google.android.gms.internal.measurement.zzjg("Unable to acquire ContentProviderClient");
                    }
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(com.google.android.gms.internal.measurement.zzjc.zza, null, null, new java.lang.String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new com.google.android.gms.internal.measurement.zzjg("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } else {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (this) {
                                if (obj == this.zzg) {
                                    this.zzb.put(str, string);
                                }
                            }
                            if (string != null) {
                                return string;
                            }
                            return null;
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
                        throw new com.google.android.gms.internal.measurement.zzjg("ContentProvider query failed", e);
                    }
                } catch (java.lang.Throwable th3) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th3;
                }
            } catch (com.google.android.gms.internal.measurement.zzjg unused) {
                return null;
            }
        }
    }
}
