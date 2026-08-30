package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziv extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zziv zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        com.google.android.gms.internal.play_billing.zziv zzivVar = new com.google.android.gms.internal.play_billing.zziv();
        zzb = zzivVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zziv.class, zzivVar);
    }

    private zziv() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zziv();
        }
        com.google.android.gms.internal.play_billing.zziu zziuVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzit(zziuVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
