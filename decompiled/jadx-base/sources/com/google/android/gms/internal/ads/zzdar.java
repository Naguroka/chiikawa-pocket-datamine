package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdar implements com.google.android.gms.internal.ads.zzcyq {
    private int zza = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbp)).intValue();
    private int zzb = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmI)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final synchronized void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbq)).booleanValue()) {
            try {
                com.google.android.gms.internal.ads.zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
                this.zza = zzfbrVar.zzc;
                this.zzb = zzfbrVar.zzd;
            } catch (java.lang.NullPointerException unused) {
            }
        }
    }
}
