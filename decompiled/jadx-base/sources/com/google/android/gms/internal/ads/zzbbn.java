package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbp zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbbn(com.google.android.gms.internal.ads.zzbbp zzbbpVar, byte[] bArr, com.google.android.gms.internal.ads.zzbbo zzbboVar) {
        this.zza = zzbbpVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            com.google.android.gms.internal.ads.zzbbp zzbbpVar = this.zza;
            if (zzbbpVar.zzb) {
                zzbbpVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Clearcut log failed", e);
        }
    }

    public final com.google.android.gms.internal.ads.zzbbn zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbbm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
