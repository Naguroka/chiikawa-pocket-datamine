package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzig extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzig zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.play_billing.zzig zzigVar = new com.google.android.gms.internal.play_billing.zzig();
        zzb = zzigVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzig.class, zzigVar);
    }

    private zzig() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzig zzigVar, java.lang.String str) {
        zzigVar.zzd |= 8;
        zzigVar.zzh = str;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzig zzigVar, java.lang.String str) {
        str.getClass();
        zzigVar.zzd |= 2;
        zzigVar.zzf = str;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzig zzigVar, int i) {
        zzigVar.zzd |= 16;
        zzigVar.zzi = i;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzig zzigVar, com.google.android.gms.internal.play_billing.zzie zzieVar) {
        zzigVar.zzg = zzieVar.zza();
        zzigVar.zzd |= 4;
    }

    static /* synthetic */ void zzE(com.google.android.gms.internal.play_billing.zzig zzigVar, int i) {
        zzigVar.zzd |= 1;
        zzigVar.zze = i;
    }

    public static com.google.android.gms.internal.play_billing.zzic zzc() {
        return (com.google.android.gms.internal.play_billing.zzic) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.play_billing.zzid.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzig();
        }
        com.google.android.gms.internal.play_billing.zzif zzifVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzic(zzifVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
