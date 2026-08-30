package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzji extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzji zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private com.google.android.gms.internal.play_billing.zzis zzg;
    private com.google.android.gms.internal.play_billing.zziv zzh;

    static {
        com.google.android.gms.internal.play_billing.zzji zzjiVar = new com.google.android.gms.internal.play_billing.zzji();
        zzb = zzjiVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzji.class, zzjiVar);
    }

    private zzji() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzji zzjiVar, com.google.android.gms.internal.play_billing.zzhx zzhxVar) {
        zzjiVar.zzf = zzhxVar;
        zzjiVar.zze = 2;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzji zzjiVar, com.google.android.gms.internal.play_billing.zzib zzibVar) {
        zzjiVar.zzf = zzibVar;
        zzjiVar.zze = 3;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzji zzjiVar, com.google.android.gms.internal.play_billing.zzij zzijVar) {
        zzijVar.getClass();
        zzjiVar.zzf = zzijVar;
        zzjiVar.zze = 7;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzji zzjiVar, com.google.android.gms.internal.play_billing.zzis zzisVar) {
        zzisVar.getClass();
        zzjiVar.zzg = zzisVar;
        zzjiVar.zzd |= 1;
    }

    static /* synthetic */ void zzE(com.google.android.gms.internal.play_billing.zzji zzjiVar, com.google.android.gms.internal.play_billing.zzjo zzjoVar) {
        zzjoVar.getClass();
        zzjiVar.zzf = zzjoVar;
        zzjiVar.zze = 8;
    }

    static /* synthetic */ void zzF(com.google.android.gms.internal.play_billing.zzji zzjiVar, com.google.android.gms.internal.play_billing.zzjs zzjsVar) {
        zzjiVar.zzf = zzjsVar;
        zzjiVar.zze = 4;
    }

    public static com.google.android.gms.internal.play_billing.zzjg zzc() {
        return (com.google.android.gms.internal.play_billing.zzjg) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.zzhx.class, com.google.android.gms.internal.play_billing.zzib.class, com.google.android.gms.internal.play_billing.zzjs.class, com.google.android.gms.internal.play_billing.zzip.class, "zzh", com.google.android.gms.internal.play_billing.zzij.class, com.google.android.gms.internal.play_billing.zzjo.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzji();
        }
        com.google.android.gms.internal.play_billing.zzjh zzjhVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzjg(zzjhVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
