package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasx extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzasx zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        com.google.android.gms.internal.ads.zzasx zzasxVar = new com.google.android.gms.internal.ads.zzasx();
        zza = zzasxVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzasx.class, zzasxVar);
    }

    private zzasx() {
    }

    public static com.google.android.gms.internal.ads.zzasw zza() {
        return (com.google.android.gms.internal.ads.zzasw) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 32;
        zzasxVar.zzi = j;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 4;
        zzasxVar.zzf = j;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 1;
        zzasxVar.zzd = j;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 8;
        zzasxVar.zzg = j;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 16;
        zzasxVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzasx();
        }
        com.google.android.gms.internal.ads.zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzasw(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzasx.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }
}
