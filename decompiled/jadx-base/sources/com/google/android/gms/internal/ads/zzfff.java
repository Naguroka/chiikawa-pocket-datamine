package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfff implements com.google.android.gms.internal.ads.zzher {
    public static com.google.android.gms.internal.ads.zzfff zza() {
        return com.google.android.gms.internal.ads.zzffe.zza;
    }

    public static com.google.android.gms.internal.ads.zzgcs zzc() {
        com.google.android.gms.internal.ads.zzgcs zzgcsVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfF)).booleanValue()) {
            zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzc;
        } else {
            zzgcsVar = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfE)).booleanValue() ? com.google.android.gms.internal.ads.zzbzw.zza : com.google.android.gms.internal.ads.zzbzw.zzf;
        }
        com.google.android.gms.internal.ads.zzhez.zzb(zzgcsVar);
        return zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc();
    }
}
