package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziz extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zziz zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.zziz zzizVar = new com.google.android.gms.internal.play_billing.zziz();
        zzb = zzizVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zziz.class, zzizVar);
    }

    private zziz() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zziz zzizVar, int i) {
        zzizVar.zze = i - 1;
        zzizVar.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.zziw zzc() {
        return (com.google.android.gms.internal.play_billing.zziw) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.zzix.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zziz();
        }
        com.google.android.gms.internal.play_billing.zziy zziyVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zziw(zziyVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
