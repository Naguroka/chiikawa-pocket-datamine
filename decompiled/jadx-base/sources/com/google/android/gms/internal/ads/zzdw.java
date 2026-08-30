package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdw {
    private static com.google.android.gms.internal.ads.zzdw zza;
    private final android.os.Handler zzb = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.CopyOnWriteArrayList zzc = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.Object zzd = new java.lang.Object();
    private int zze = 0;

    private zzdw(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new com.google.android.gms.internal.ads.zzdu(this, null), intentFilter);
    }

    public static synchronized com.google.android.gms.internal.ads.zzdw zzb(android.content.Context context) {
        if (zza == null) {
            zza = new com.google.android.gms.internal.ads.zzdw(context);
        }
        return zza;
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzdw zzdwVar, int i) {
        synchronized (zzdwVar.zzd) {
            if (zzdwVar.zze == i) {
                return;
            }
            zzdwVar.zze = i;
            for (java.lang.ref.WeakReference weakReference : zzdwVar.zzc) {
                com.google.android.gms.internal.ads.zzyl zzylVar = (com.google.android.gms.internal.ads.zzyl) weakReference.get();
                if (zzylVar != null) {
                    zzylVar.zza.zzl(i);
                } else {
                    zzdwVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final com.google.android.gms.internal.ads.zzyl zzylVar) {
        for (java.lang.ref.WeakReference weakReference : this.zzc) {
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new java.lang.ref.WeakReference(zzylVar));
        this.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzds
            @Override // java.lang.Runnable
            public final void run() {
                zzylVar.zza.zzl(this.zza.zza());
            }
        });
    }
}
