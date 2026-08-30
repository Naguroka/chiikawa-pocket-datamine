package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzela {
    private final com.google.android.gms.internal.ads.zzdiq zza;
    private final com.google.android.gms.internal.ads.zzekn zzb;
    private final com.google.android.gms.internal.ads.zzcvw zzc;

    public zzela(com.google.android.gms.internal.ads.zzdiq zzdiqVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzdiqVar;
        final com.google.android.gms.internal.ads.zzekn zzeknVar = new com.google.android.gms.internal.ads.zzekn(zzdrwVar);
        this.zzb = zzeknVar;
        final com.google.android.gms.internal.ads.zzbmi zzbmiVarZzg = zzdiqVar.zzg();
        this.zzc = new com.google.android.gms.internal.ads.zzcvw() { // from class: com.google.android.gms.internal.ads.zzekz
            @Override // com.google.android.gms.internal.ads.zzcvw
            public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeknVar.zzdz(zzeVar);
                com.google.android.gms.internal.ads.zzbmi zzbmiVar = zzbmiVarZzg;
                if (zzbmiVar != null) {
                    try {
                        zzbmiVar.zzf(zzeVar);
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbmiVar != null) {
                    try {
                        zzbmiVar.zze(zzeVar.zza);
                    } catch (android.os.RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final com.google.android.gms.internal.ads.zzcvw zza() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzcxh zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzdgl zzc() {
        return new com.google.android.gms.internal.ads.zzdgl(this.zza, this.zzb.zzg());
    }

    public final com.google.android.gms.internal.ads.zzekn zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zzb.zzj(zzblVar);
    }
}
