package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgxb {
    static final com.google.android.gms.internal.ads.zzgxb zza = new com.google.android.gms.internal.ads.zzgxb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile com.google.android.gms.internal.ads.zzgxb zzd;
    private final java.util.Map zze;

    zzgxb() {
        this.zze = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.ads.zzgxb zza() {
        int i = com.google.android.gms.internal.ads.zzgzm.zza;
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgxb zzb() {
        com.google.android.gms.internal.ads.zzgxb zzgxbVar = zzd;
        if (zzgxbVar != null) {
            return zzgxbVar;
        }
        synchronized (com.google.android.gms.internal.ads.zzgxb.class) {
            com.google.android.gms.internal.ads.zzgxb zzgxbVar2 = zzd;
            if (zzgxbVar2 != null) {
                return zzgxbVar2;
            }
            int i = com.google.android.gms.internal.ads.zzgzm.zza;
            com.google.android.gms.internal.ads.zzgxb zzgxbVarZzb = com.google.android.gms.internal.ads.zzgxj.zzb(com.google.android.gms.internal.ads.zzgxb.class);
            zzd = zzgxbVarZzb;
            return zzgxbVarZzb;
        }
    }

    public final com.google.android.gms.internal.ads.zzgxp zzc(com.google.android.gms.internal.ads.zzgzc zzgzcVar, int i) {
        return (com.google.android.gms.internal.ads.zzgxp) this.zze.get(new com.google.android.gms.internal.ads.zzgxa(zzgzcVar, i));
    }

    zzgxb(boolean z) {
        this.zze = java.util.Collections.emptyMap();
    }
}
