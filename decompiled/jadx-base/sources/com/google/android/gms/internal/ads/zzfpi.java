package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfpi {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfpi(com.google.android.gms.internal.ads.zzfpk zzfpkVar, byte[] bArr, com.google.android.gms.internal.ads.zzfpj zzfpjVar) {
        this.zza = zzfpkVar;
        this.zzb = bArr;
    }

    public final com.google.android.gms.internal.ads.zzfpi zza(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfpi zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zza;
            if (zzfpkVar.zzb) {
                zzfpkVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
