package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzij extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzij zzb;

    static {
        com.google.android.gms.internal.play_billing.zzij zzijVar = new com.google.android.gms.internal.play_billing.zzij();
        zzb = zzijVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzij.class, zzijVar);
    }

    private zzij() {
    }

    public static com.google.android.gms.internal.play_billing.zzij zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        com.google.android.gms.internal.play_billing.zzii zziiVar = null;
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzij();
        }
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzih(zziiVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
