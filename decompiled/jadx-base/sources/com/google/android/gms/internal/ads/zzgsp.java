package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgsp extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgsp zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.zzgwj zzd = com.google.android.gms.internal.ads.zzgwj.zzb;
    private int zze;

    static {
        com.google.android.gms.internal.ads.zzgsp zzgspVar = new com.google.android.gms.internal.ads.zzgsp();
        zza = zzgspVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgsp.class, zzgspVar);
    }

    private zzgsp() {
    }

    public static com.google.android.gms.internal.ads.zzgsn zza() {
        return (com.google.android.gms.internal.ads.zzgsn) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgsn zzb(com.google.android.gms.internal.ads.zzgsp zzgspVar) {
        return (com.google.android.gms.internal.ads.zzgsn) zza.zzba(zzgspVar);
    }

    public static com.google.android.gms.internal.ads.zzgsp zzd() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgsp zzf(byte[] bArr, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgsp) com.google.android.gms.internal.ads.zzgxr.zzbx(zza, bArr, zzgxbVar);
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzgsp zzgspVar, java.lang.String str) {
        str.getClass();
        zzgspVar.zzc = str;
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzgsp zzgspVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzgwjVar.getClass();
        zzgspVar.zzd = zzgwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgsp();
        }
        com.google.android.gms.internal.ads.zzgso zzgsoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsn(zzgsoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgsp.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgtp zzg() {
        com.google.android.gms.internal.ads.zzgtp zzgtpVarZzb = com.google.android.gms.internal.ads.zzgtp.zzb(this.zze);
        return zzgtpVarZzb == null ? com.google.android.gms.internal.ads.zzgtp.UNRECOGNIZED : zzgtpVarZzb;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzh() {
        return this.zzd;
    }

    public final java.lang.String zzi() {
        return this.zzc;
    }
}
