package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcpy implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzcpy(com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean zzb() {
        boolean z = true;
        if (((com.google.android.gms.internal.ads.zzcvk) this.zza).zza().zza() == null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfz)).booleanValue()) {
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
