package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzatg extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzatg zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzg = "D";

    static {
        com.google.android.gms.internal.ads.zzatg zzatgVar = new com.google.android.gms.internal.ads.zzatg();
        zza = zzatgVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzatg.class, zzatgVar);
    }

    private zzatg() {
    }

    public static com.google.android.gms.internal.ads.zzatf zza() {
        return (com.google.android.gms.internal.ads.zzatf) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzatg zzatgVar, java.lang.String str) {
        zzatgVar.zzc |= 1;
        zzatgVar.zzd = "1.671910402";
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzatg zzatgVar, java.lang.String str) {
        str.getClass();
        zzatgVar.zzc |= 2;
        zzatgVar.zze = str;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzatg zzatgVar, java.lang.String str) {
        str.getClass();
        zzatgVar.zzc |= 8;
        zzatgVar.zzg = str;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 4;
        zzatgVar.zzf = j;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzatg zzatgVar, long j) {
        zzatgVar.zzc |= 16;
        zzatgVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzatg();
        }
        com.google.android.gms.internal.ads.zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzatf(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzatg.class) {
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
