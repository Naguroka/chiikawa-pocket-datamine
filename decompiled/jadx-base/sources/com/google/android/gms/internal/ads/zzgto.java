package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgto extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgto zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.ads.zzgsp zze;

    static {
        com.google.android.gms.internal.ads.zzgto zzgtoVar = new com.google.android.gms.internal.ads.zzgto();
        zza = zzgtoVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgto.class, zzgtoVar);
    }

    private zzgto() {
    }

    public static com.google.android.gms.internal.ads.zzgtm zzb() {
        return (com.google.android.gms.internal.ads.zzgtm) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgto zzd() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgto zzf(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgto) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzgto zzgtoVar, com.google.android.gms.internal.ads.zzgsp zzgspVar) {
        zzgspVar.getClass();
        zzgtoVar.zze = zzgspVar;
        zzgtoVar.zzc |= 1;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzgto zzgtoVar, java.lang.String str) {
        str.getClass();
        zzgtoVar.zzd = str;
    }

    public final com.google.android.gms.internal.ads.zzgsp zza() {
        com.google.android.gms.internal.ads.zzgsp zzgspVar = this.zze;
        return zzgspVar == null ? com.google.android.gms.internal.ads.zzgsp.zzd() : zzgspVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgto();
        }
        com.google.android.gms.internal.ads.zzgtn zzgtnVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgtm(zzgtnVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgto.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final java.lang.String zzg() {
        return this.zzd;
    }
}
