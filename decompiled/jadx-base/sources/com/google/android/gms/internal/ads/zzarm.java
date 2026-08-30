package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzarm extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzarm zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private java.lang.String zzd = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzk = "";
    private java.lang.String zzm = "";
    private java.lang.String zzn = "";
    private com.google.android.gms.internal.ads.zzgyd zzo = zzbK();

    static {
        com.google.android.gms.internal.ads.zzarm zzarmVar = new com.google.android.gms.internal.ads.zzarm();
        zza = zzarmVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzarm.class, zzarmVar);
    }

    private zzarm() {
    }

    public static com.google.android.gms.internal.ads.zzari zza() {
        return (com.google.android.gms.internal.ads.zzari) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzarm zzarmVar, java.lang.String str) {
        str.getClass();
        zzarmVar.zzc |= 1;
        zzarmVar.zzd = str;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzarm zzarmVar, java.lang.String str) {
        zzarmVar.zzc |= 16;
        zzarmVar.zzh = str;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzarm zzarmVar, java.lang.String str) {
        zzarmVar.zzc |= 1024;
        zzarmVar.zzn = str;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzarm zzarmVar, java.lang.String str) {
        str.getClass();
        zzarmVar.zzc |= 8;
        zzarmVar.zzg = str;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzarm zzarmVar, long j) {
        zzarmVar.zzc |= 2;
        zzarmVar.zze = j;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzarm zzarmVar, java.lang.String str) {
        str.getClass();
        zzarmVar.zzc |= 4;
        zzarmVar.zzf = str;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzarm zzarmVar, int i) {
        zzarmVar.zzp = i - 1;
        zzarmVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", com.google.android.gms.internal.ads.zzark.class, "zzp", com.google.android.gms.internal.ads.zzarl.zza});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzarm();
        }
        com.google.android.gms.internal.ads.zzarn zzarnVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzari(zzarnVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzarm.class) {
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
