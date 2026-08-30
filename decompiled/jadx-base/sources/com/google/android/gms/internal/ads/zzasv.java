package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasv extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzasv zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        com.google.android.gms.internal.ads.zzasv zzasvVar = new com.google.android.gms.internal.ads.zzasv();
        zza = zzasvVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzasv.class, zzasvVar);
    }

    private zzasv() {
    }

    public static com.google.android.gms.internal.ads.zzasu zza() {
        return (com.google.android.gms.internal.ads.zzasu) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzasv zzasvVar) {
        zzasvVar.zzc &= -9;
        zzasvVar.zzg = -1L;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 8;
        zzasvVar.zzg = j;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 32;
        zzasvVar.zzi = j;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 4096;
        zzasvVar.zzp = j;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 512;
        zzasvVar.zzm = j;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 2048;
        zzasvVar.zzo = j;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 4;
        zzasvVar.zzf = j;
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 16;
        zzasvVar.zzh = j;
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 128;
        zzasvVar.zzk = j;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 131072;
        zzasvVar.zzy = j;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 1;
        zzasvVar.zzd = j;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 262144;
        zzasvVar.zzz = j;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 2;
        zzasvVar.zze = j;
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 256;
        zzasvVar.zzl = j;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 32768;
        zzasvVar.zzw = j;
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 65536;
        zzasvVar.zzx = j;
    }

    static /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 8192;
        zzasvVar.zzu = j;
    }

    static /* synthetic */ void zzu(com.google.android.gms.internal.ads.zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 16384;
        zzasvVar.zzv = j;
    }

    static /* synthetic */ void zzv(com.google.android.gms.internal.ads.zzasv zzasvVar, int i) {
        zzasvVar.zzn = i - 1;
        zzasvVar.zzc |= 1024;
    }

    static /* synthetic */ void zzw(com.google.android.gms.internal.ads.zzasv zzasvVar, int i) {
        zzasvVar.zzj = i - 1;
        zzasvVar.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.android.gms.internal.ads.zzgxx zzgxxVar = com.google.android.gms.internal.ads.zzate.zza;
            return zzbQ(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgxxVar, "zzk", "zzl", "zzm", "zzn", zzgxxVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzasv();
        }
        com.google.android.gms.internal.ads.zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzasu(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzasv.class) {
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
