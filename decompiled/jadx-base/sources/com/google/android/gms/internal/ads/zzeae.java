package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeae implements com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcvw {
    private static final java.lang.Object zza = new java.lang.Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final com.google.android.gms.internal.ads.zzeao zzd;

    public zzeae(com.google.android.gms.internal.ads.zzeao zzeaoVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeaoVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int iIntValue;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue() && !this.zzc.zzN()) {
            java.lang.Object obj = zza;
            synchronized (obj) {
                i = zzb;
                iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgc)).intValue();
            }
            if (i < iIntValue) {
                this.zzd.zzd(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzb(true);
    }
}
