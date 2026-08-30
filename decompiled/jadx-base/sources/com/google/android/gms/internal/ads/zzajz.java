package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajz {
    public static void zza(com.google.android.gms.internal.ads.zzaka zzakaVar, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        for (int i = 0; i < zzakaVar.zza(); i++) {
            long jZzb = zzakaVar.zzb(i);
            java.util.List listZzc = zzakaVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzakaVar.zza() - 1) {
                    throw new java.lang.IllegalStateException();
                }
                long jZzb2 = zzakaVar.zzb(i + 1) - zzakaVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
