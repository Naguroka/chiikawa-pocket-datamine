package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzis extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzis zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        com.google.android.gms.internal.play_billing.zzis zzisVar = new com.google.android.gms.internal.play_billing.zzis();
        zzb = zzisVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzis.class, zzisVar);
    }

    private zzis() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzis zzisVar, int i) {
        zzisVar.zzd |= 128;
        zzisVar.zzl = i;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzis zzisVar, int i) {
        zzisVar.zzd |= 256;
        zzisVar.zzm = i;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzis zzisVar, int i) {
        zzisVar.zzd |= 8;
        zzisVar.zzh = i;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzis zzisVar, long j) {
        zzisVar.zzd |= 16;
        zzisVar.zzi = j;
    }

    static /* synthetic */ void zzE(com.google.android.gms.internal.play_billing.zzis zzisVar, long j) {
        zzisVar.zzd |= 32;
        zzisVar.zzj = j;
    }

    static /* synthetic */ void zzF(com.google.android.gms.internal.play_billing.zzis zzisVar, long j) {
        zzisVar.zzd |= 512;
        zzisVar.zzn = 772604006L;
    }

    static /* synthetic */ void zzG(com.google.android.gms.internal.play_billing.zzis zzisVar, java.lang.String str) {
        str.getClass();
        zzisVar.zzd |= 4;
        zzisVar.zzg = str;
    }

    static /* synthetic */ void zzH(com.google.android.gms.internal.play_billing.zzis zzisVar, boolean z) {
        zzisVar.zzd |= 64;
        zzisVar.zzk = z;
    }

    static /* synthetic */ void zzI(com.google.android.gms.internal.play_billing.zzis zzisVar, java.lang.String str) {
        str.getClass();
        zzisVar.zzd |= 1;
        zzisVar.zze = str;
    }

    static /* synthetic */ void zzJ(com.google.android.gms.internal.play_billing.zzis zzisVar, java.lang.String str) {
        zzisVar.zzd |= 2;
        zzisVar.zzf = str;
    }

    public static com.google.android.gms.internal.play_billing.zziq zzc() {
        return (com.google.android.gms.internal.play_billing.zziq) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new java.lang.Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzis();
        }
        com.google.android.gms.internal.play_billing.zzir zzirVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zziq(zzirVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
