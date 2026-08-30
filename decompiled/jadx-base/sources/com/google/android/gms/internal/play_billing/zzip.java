package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzip extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzip zzb;
    private int zzd;
    private int zzf;
    private com.google.android.gms.internal.play_billing.zzig zzi;
    private boolean zzj;
    private boolean zzk;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.play_billing.zzfm zzg = zzq();
    private com.google.android.gms.internal.play_billing.zzfn zzh = zzr();

    static {
        com.google.android.gms.internal.play_billing.zzip zzipVar = new com.google.android.gms.internal.play_billing.zzip();
        zzb = zzipVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzip.class, zzipVar);
    }

    private zzip() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.play_billing.zzin.zza, "zzg", com.google.android.gms.internal.play_billing.zzik.zza, "zzh", com.google.android.gms.internal.play_billing.zzjl.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzip();
        }
        com.google.android.gms.internal.play_billing.zzio zzioVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzim(zzioVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
