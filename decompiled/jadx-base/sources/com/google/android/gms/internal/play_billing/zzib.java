package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzib extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzib zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.play_billing.zzib zzibVar = new com.google.android.gms.internal.play_billing.zzib();
        zzb = zzibVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzib.class, zzibVar);
    }

    private zzib() {
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzib zzibVar, com.google.android.gms.internal.play_billing.zzil zzilVar) {
        zzibVar.zzh = zzilVar.zza();
        zzibVar.zzd |= 2;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzib zzibVar, com.google.android.gms.internal.play_billing.zziz zzizVar) {
        zzizVar.getClass();
        zzibVar.zzf = zzizVar;
        zzibVar.zze = 2;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzib zzibVar, com.google.android.gms.internal.play_billing.zzjf zzjfVar) {
        zzjfVar.getClass();
        zzibVar.zzf = zzjfVar;
        zzibVar.zze = 4;
    }

    static /* synthetic */ void zzE(com.google.android.gms.internal.play_billing.zzib zzibVar, com.google.android.gms.internal.play_billing.zzjv zzjvVar) {
        zzjvVar.getClass();
        zzibVar.zzf = zzjvVar;
        zzibVar.zze = 3;
    }

    static /* synthetic */ void zzF(com.google.android.gms.internal.play_billing.zzib zzibVar, int i) {
        zzibVar.zzg = i - 1;
        zzibVar.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.zzhz zzc() {
        return (com.google.android.gms.internal.play_billing.zzhz) zzb.zzl();
    }

    public final com.google.android.gms.internal.play_billing.zzjf zzA() {
        return this.zze == 4 ? (com.google.android.gms.internal.play_billing.zzjf) this.zzf : com.google.android.gms.internal.play_billing.zzjf.zzd();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.zzhy.zza, com.google.android.gms.internal.play_billing.zziz.class, com.google.android.gms.internal.play_billing.zzjv.class, com.google.android.gms.internal.play_billing.zzjf.class, "zzh", com.google.android.gms.internal.play_billing.zzik.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzib();
        }
        com.google.android.gms.internal.play_billing.zzia zziaVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzhz(zziaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
