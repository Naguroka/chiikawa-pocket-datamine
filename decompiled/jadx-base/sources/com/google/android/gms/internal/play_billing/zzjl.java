package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjl extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjl zzb;
    private int zzd;
    private int zzf;
    private com.google.android.gms.internal.play_billing.zzfn zze = com.google.android.gms.internal.play_billing.zzfi.zzr();
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.play_billing.zzjl zzjlVar = new com.google.android.gms.internal.play_billing.zzjl();
        zzb = zzjlVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjl.class, zzjlVar);
    }

    private zzjl() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzjl();
        }
        com.google.android.gms.internal.play_billing.zzjk zzjkVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzjj(zzjkVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
