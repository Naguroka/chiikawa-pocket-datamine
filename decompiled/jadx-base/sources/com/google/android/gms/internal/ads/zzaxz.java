package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxz extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzaxz zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        com.google.android.gms.internal.ads.zzaxz zzaxzVar = new com.google.android.gms.internal.ads.zzaxz();
        zza = zzaxzVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    public static com.google.android.gms.internal.ads.zzaxx zzd() {
        return (com.google.android.gms.internal.ads.zzaxx) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzaxz zzg() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzaxz zzh(com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzaxz) com.google.android.gms.internal.ads.zzgxr.zzbm(zza, zzgwjVar);
    }

    public static com.google.android.gms.internal.ads.zzaxz zzi(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzaxz) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzaxz zzaxzVar, java.lang.String str) {
        str.getClass();
        zzaxzVar.zzc |= 2;
        zzaxzVar.zze = str;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzaxz zzaxzVar, long j) {
        zzaxzVar.zzc |= 8;
        zzaxzVar.zzg = j;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzaxz zzaxzVar, long j) {
        zzaxzVar.zzc |= 4;
        zzaxzVar.zzf = j;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzaxz zzaxzVar, long j) {
        zzaxzVar.zzc |= 16;
        zzaxzVar.zzh = j;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzaxz zzaxzVar, java.lang.String str) {
        str.getClass();
        zzaxzVar.zzc |= 1;
        zzaxzVar.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzaxz();
        }
        com.google.android.gms.internal.ads.zzaxy zzaxyVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzaxx(zzaxyVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzaxz.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final java.lang.String zzj() {
        return this.zze;
    }

    public final java.lang.String zzk() {
        return this.zzd;
    }
}
