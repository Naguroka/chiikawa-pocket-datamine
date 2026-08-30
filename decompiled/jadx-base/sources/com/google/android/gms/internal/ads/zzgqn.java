package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqn extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqn zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgqt zzd;
    private com.google.android.gms.internal.ads.zzgse zze;

    static {
        com.google.android.gms.internal.ads.zzgqn zzgqnVar = new com.google.android.gms.internal.ads.zzgqn();
        zza = zzgqnVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqn.class, zzgqnVar);
    }

    private zzgqn() {
    }

    public static com.google.android.gms.internal.ads.zzgql zza() {
        return (com.google.android.gms.internal.ads.zzgql) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqn zzc(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgqn) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzgqn zzgqnVar, com.google.android.gms.internal.ads.zzgqt zzgqtVar) {
        zzgqtVar.getClass();
        zzgqnVar.zzd = zzgqtVar;
        zzgqnVar.zzc |= 1;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzgqn zzgqnVar, com.google.android.gms.internal.ads.zzgse zzgseVar) {
        zzgseVar.getClass();
        zzgqnVar.zze = zzgseVar;
        zzgqnVar.zzc |= 2;
    }

    public final com.google.android.gms.internal.ads.zzgqt zzd() {
        com.google.android.gms.internal.ads.zzgqt zzgqtVar = this.zzd;
        return zzgqtVar == null ? com.google.android.gms.internal.ads.zzgqt.zzd() : zzgqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgqn();
        }
        com.google.android.gms.internal.ads.zzgqm zzgqmVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgql(zzgqmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqn.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgse zzf() {
        com.google.android.gms.internal.ads.zzgse zzgseVar = this.zze;
        return zzgseVar == null ? com.google.android.gms.internal.ads.zzgse.zzf() : zzgseVar;
    }
}
