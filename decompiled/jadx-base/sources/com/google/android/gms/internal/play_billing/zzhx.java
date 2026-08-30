package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhx extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzhx zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;
    private com.google.android.gms.internal.play_billing.zzig zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.play_billing.zzhx zzhxVar = new com.google.android.gms.internal.play_billing.zzhx();
        zzb = zzhxVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static com.google.android.gms.internal.play_billing.zzhx zzA(byte[] bArr, com.google.android.gms.internal.play_billing.zzeu zzeuVar) throws com.google.android.gms.internal.play_billing.zzfq {
        return (com.google.android.gms.internal.play_billing.zzhx) com.google.android.gms.internal.play_billing.zzfi.zzp(zzb, bArr, zzeuVar);
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzhx zzhxVar, com.google.android.gms.internal.play_billing.zzil zzilVar) {
        zzhxVar.zzi = zzilVar.zza();
        zzhxVar.zzd |= 4;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzhx zzhxVar, com.google.android.gms.internal.play_billing.zzig zzigVar) {
        zzigVar.getClass();
        zzhxVar.zzh = zzigVar;
        zzhxVar.zzd |= 2;
    }

    static /* synthetic */ void zzE(com.google.android.gms.internal.play_billing.zzhx zzhxVar, com.google.android.gms.internal.play_billing.zziz zzizVar) {
        zzizVar.getClass();
        zzhxVar.zzf = zzizVar;
        zzhxVar.zze = 4;
    }

    static /* synthetic */ void zzF(com.google.android.gms.internal.play_billing.zzhx zzhxVar, com.google.android.gms.internal.play_billing.zzjf zzjfVar) {
        zzjfVar.getClass();
        zzhxVar.zzf = zzjfVar;
        zzhxVar.zze = 7;
    }

    static /* synthetic */ void zzG(com.google.android.gms.internal.play_billing.zzhx zzhxVar, com.google.android.gms.internal.play_billing.zzjv zzjvVar) {
        zzjvVar.getClass();
        zzhxVar.zzf = zzjvVar;
        zzhxVar.zze = 6;
    }

    static /* synthetic */ void zzH(com.google.android.gms.internal.play_billing.zzhx zzhxVar, int i) {
        zzhxVar.zzg = i - 1;
        zzhxVar.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.zzhv zzc() {
        return (com.google.android.gms.internal.play_billing.zzhv) zzb.zzl();
    }

    public final com.google.android.gms.internal.play_billing.zzjf zzB() {
        return this.zze == 7 ? (com.google.android.gms.internal.play_billing.zzjf) this.zzf : com.google.android.gms.internal.play_billing.zzjf.zzd();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.zzhy.zza, "zzh", com.google.android.gms.internal.play_billing.zziz.class, "zzi", com.google.android.gms.internal.play_billing.zzik.zza, com.google.android.gms.internal.play_billing.zzjv.class, com.google.android.gms.internal.play_billing.zzjf.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzhx();
        }
        com.google.android.gms.internal.play_billing.zzhw zzhwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzhv(zzhwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
