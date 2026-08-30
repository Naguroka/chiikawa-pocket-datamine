package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasb extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzasb zzb;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        com.google.android.gms.internal.ads.zzasb zzasbVar = new com.google.android.gms.internal.ads.zzasb();
        zzb = zzasbVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    public static com.google.android.gms.internal.ads.zzasb zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzasb();
        }
        com.google.android.gms.internal.ads.zzasa zzasaVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzarz(zzasaVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzc;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzasb.class) {
                zzgxmVar = zzc;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zzb);
                    zzc = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }
}
