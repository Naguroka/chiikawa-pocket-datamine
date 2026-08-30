package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjo extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjo zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.zzig zze;
    private long zzf;

    static {
        com.google.android.gms.internal.play_billing.zzjo zzjoVar = new com.google.android.gms.internal.play_billing.zzjo();
        zzb = zzjoVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjo.class, zzjoVar);
    }

    private zzjo() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzjo zzjoVar, com.google.android.gms.internal.play_billing.zzig zzigVar) {
        zzigVar.getClass();
        zzjoVar.zze = zzigVar;
        zzjoVar.zzd |= 1;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzjo zzjoVar, long j) {
        zzjoVar.zzd |= 2;
        zzjoVar.zzf = j;
    }

    public static com.google.android.gms.internal.play_billing.zzjm zzc() {
        return (com.google.android.gms.internal.play_billing.zzjm) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzjo();
        }
        com.google.android.gms.internal.play_billing.zzjn zzjnVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzjm(zzjnVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
