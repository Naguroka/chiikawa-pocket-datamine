package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzatc extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzatc zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgwj zzd = com.google.android.gms.internal.ads.zzgwj.zzb;
    private com.google.android.gms.internal.ads.zzgwj zze;
    private com.google.android.gms.internal.ads.zzgwj zzf;
    private com.google.android.gms.internal.ads.zzgwj zzg;

    static {
        com.google.android.gms.internal.ads.zzatc zzatcVar = new com.google.android.gms.internal.ads.zzatc();
        zza = zzatcVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzatc.class, zzatcVar);
    }

    private zzatc() {
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
        this.zze = zzgwjVar;
        this.zzf = zzgwjVar;
        this.zzg = zzgwjVar;
    }

    public static com.google.android.gms.internal.ads.zzatb zza() {
        return (com.google.android.gms.internal.ads.zzatb) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzatc zzc(byte[] bArr, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzatc) com.google.android.gms.internal.ads.zzgxr.zzbx(zza, bArr, zzgxbVar);
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzatc zzatcVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzatcVar.zzc |= 1;
        zzatcVar.zzd = zzgwjVar;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzatc zzatcVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzatcVar.zzc |= 2;
        zzatcVar.zze = zzgwjVar;
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzatc zzatcVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzatcVar.zzc |= 8;
        zzatcVar.zzg = zzgwjVar;
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzatc zzatcVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzatcVar.zzc |= 4;
        zzatcVar.zzf = zzgwjVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzatc();
        }
        com.google.android.gms.internal.ads.zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzatb(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzatc.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzf() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzg() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzh() {
        return this.zzf;
    }
}
