package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzglx {
    public static final com.google.android.gms.internal.ads.zzglp zza = new com.google.android.gms.internal.ads.zzglv(null);

    public static com.google.android.gms.internal.ads.zzglu zza(com.google.android.gms.internal.ads.zzgnf zzgnfVar) {
        com.google.android.gms.internal.ads.zzgdz zzgdzVar;
        com.google.android.gms.internal.ads.zzglr zzglrVar = new com.google.android.gms.internal.ads.zzglr();
        zzglrVar.zzb(zzgnfVar.zza());
        java.util.Iterator it = zzgnfVar.zze().iterator();
        while (it.hasNext()) {
            for (com.google.android.gms.internal.ads.zzgnd zzgndVar : (java.util.List) it.next()) {
                int iZzf = zzgndVar.zzf() - 2;
                if (iZzf == 1) {
                    zzgdzVar = com.google.android.gms.internal.ads.zzgdz.zza;
                } else if (iZzf == 2) {
                    zzgdzVar = com.google.android.gms.internal.ads.zzgdz.zzb;
                } else {
                    if (iZzf != 3) {
                        throw new java.lang.IllegalStateException("Unknown key status");
                    }
                    zzgdzVar = com.google.android.gms.internal.ads.zzgdz.zzc;
                }
                int iZza = zzgndVar.zza();
                java.lang.String strZze = zzgndVar.zze();
                if (strZze.startsWith("type.googleapis.com/google.crypto.")) {
                    strZze = strZze.substring(34);
                }
                zzglrVar.zza(zzgdzVar, iZza, strZze, zzgndVar.zzb().name());
            }
        }
        if (zzgnfVar.zzc() != null) {
            zzglrVar.zzc(zzgnfVar.zzc().zza());
        }
        try {
            return zzglrVar.zzd();
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
