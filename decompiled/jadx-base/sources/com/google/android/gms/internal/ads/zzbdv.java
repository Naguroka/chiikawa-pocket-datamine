package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzbdv {
    private final java.lang.String zza;
    private final java.lang.Object zzb;
    private final int zzc;

    protected zzbdv(java.lang.String str, java.lang.Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static com.google.android.gms.internal.ads.zzbdv zza(java.lang.String str, double d) {
        return new com.google.android.gms.internal.ads.zzbdv(str, java.lang.Double.valueOf(d), 3);
    }

    public static com.google.android.gms.internal.ads.zzbdv zzb(java.lang.String str, long j) {
        return new com.google.android.gms.internal.ads.zzbdv(str, java.lang.Long.valueOf(j), 2);
    }

    public static com.google.android.gms.internal.ads.zzbdv zzc(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.ads.zzbdv("gad:dynamite_module:experiment_id", "", 4);
    }

    public static com.google.android.gms.internal.ads.zzbdv zzd(java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.ads.zzbdv(str, java.lang.Boolean.valueOf(z), 1);
    }

    public final java.lang.Object zze() {
        com.google.android.gms.internal.ads.zzbfa zzbfaVarZza = com.google.android.gms.internal.ads.zzbfc.zza();
        if (zzbfaVarZza == null) {
            if (com.google.android.gms.internal.ads.zzbfc.zzb() != null) {
                com.google.android.gms.internal.ads.zzbfc.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zzbfaVarZza.zza(this.zza, ((java.lang.Boolean) this.zzb).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? zzbfaVarZza.zzd(this.zza, (java.lang.String) this.zzb) : zzbfaVarZza.zzb(this.zza, ((java.lang.Double) this.zzb).doubleValue());
        }
        return zzbfaVarZza.zzc(this.zza, ((java.lang.Long) this.zzb).longValue());
    }
}
