package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjv extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjv zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.play_billing.zzjv zzjvVar = new com.google.android.gms.internal.play_billing.zzjv();
        zzb = zzjvVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzjv zzjvVar, boolean z) {
        zzjvVar.zzd |= 8;
        zzjvVar.zzh = z;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzjv zzjvVar, int i) {
        zzjvVar.zzd |= 16;
        zzjvVar.zzi = i;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzjv zzjvVar, long j) {
        zzjvVar.zzd |= 4;
        zzjvVar.zzg = j;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzjv zzjvVar, boolean z) {
        zzjvVar.zzd |= 2;
        zzjvVar.zzf = true;
    }

    public static com.google.android.gms.internal.play_billing.zzjt zzc() {
        return (com.google.android.gms.internal.play_billing.zzjt) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzjv();
        }
        com.google.android.gms.internal.play_billing.zzju zzjuVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzjt(zzjuVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
