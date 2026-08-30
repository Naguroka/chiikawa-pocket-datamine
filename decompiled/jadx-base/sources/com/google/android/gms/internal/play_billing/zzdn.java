package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdn extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzdn zzb;
    private int zzd;
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.play_billing.zzdn zzdnVar = new com.google.android.gms.internal.play_billing.zzdn();
        zzb = zzdnVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzdn.class, zzdnVar);
    }

    private zzdn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzdn();
        }
        com.google.android.gms.internal.play_billing.zzdo zzdoVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzdm(zzdoVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
