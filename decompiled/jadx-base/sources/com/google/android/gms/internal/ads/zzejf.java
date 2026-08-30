package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejf {
    private final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.ads.zzdpm zzb;

    public zzejf(com.google.android.gms.internal.ads.zzdpm zzdpmVar) {
        this.zzb = zzdpmVar;
    }

    @javax.annotation.CheckForNull
    public final com.google.android.gms.internal.ads.zzbrd zza(java.lang.String str) {
        if (this.zza.containsKey(str)) {
            return (com.google.android.gms.internal.ads.zzbrd) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(java.lang.String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }
}
