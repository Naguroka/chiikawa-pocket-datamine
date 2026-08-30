package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjd extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjd zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.play_billing.zzjd zzjdVar = new com.google.android.gms.internal.play_billing.zzjd();
        zzb = zzjdVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.zzjc.zza, "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzjd();
        }
        com.google.android.gms.internal.play_billing.zzje zzjeVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzjb(zzjeVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
