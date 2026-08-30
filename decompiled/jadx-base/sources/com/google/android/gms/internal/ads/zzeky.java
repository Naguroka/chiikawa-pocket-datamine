package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeky {
    private final com.google.android.gms.internal.ads.zzeld zza;
    private final java.lang.String zzb;
    private com.google.android.gms.ads.internal.client.zzdy zzc;

    public zzeky(com.google.android.gms.internal.ads.zzeld zzeldVar, java.lang.String str) {
        this.zza = zzeldVar;
        this.zzb = str;
    }

    public final synchronized java.lang.String zza() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzc;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdyVar != null ? zzdyVar.zzg() : null;
    }

    public final synchronized java.lang.String zzb() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzc;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdyVar != null ? zzdyVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        this.zzc = null;
        com.google.android.gms.internal.ads.zzele zzeleVar = new com.google.android.gms.internal.ads.zzele(i);
        com.google.android.gms.internal.ads.zzekx zzekxVar = new com.google.android.gms.internal.ads.zzekx(this);
        this.zza.zzb(zzmVar, this.zzb, zzeleVar, zzekxVar);
    }

    public final synchronized boolean zze() throws android.os.RemoteException {
        return this.zza.zza();
    }
}
