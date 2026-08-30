package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdi extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzdi zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.zzdn zze;
    private com.google.android.gms.internal.play_billing.zzdn zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.play_billing.zzdi zzdiVar = new com.google.android.gms.internal.play_billing.zzdi();
        zzb = zzdiVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzdi.class, zzdiVar);
    }

    private zzdi() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.play_billing.zzdq.zza()});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzdi();
        }
        com.google.android.gms.internal.play_billing.zzdl zzdlVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzdh(zzdlVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
