package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjf extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjf zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.zzfn zze = zzr();
    private java.lang.String zzf = "";
    private boolean zzg;

    static {
        com.google.android.gms.internal.play_billing.zzjf zzjfVar = new com.google.android.gms.internal.play_billing.zzjf();
        zzb = zzjfVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzjf zzjfVar, boolean z) {
        zzjfVar.zzd |= 2;
        zzjfVar.zzg = z;
    }

    public static com.google.android.gms.internal.play_billing.zzjf zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.zzjd.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzjf();
        }
        com.google.android.gms.internal.play_billing.zzje zzjeVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzja(zzjeVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
