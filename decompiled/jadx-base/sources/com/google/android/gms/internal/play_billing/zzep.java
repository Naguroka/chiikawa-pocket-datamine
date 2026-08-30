package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzep extends com.google.android.gms.internal.play_billing.zzdz {
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.logging.Logger zzc = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzep.class.getName());
    private static final boolean zzd = com.google.android.gms.internal.play_billing.zzho.zzx();
    com.google.android.gms.internal.play_billing.zzeq zza;

    private zzep() {
        throw null;
    }

    /* synthetic */ zzep(com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
    }

    static int zzA(com.google.android.gms.internal.play_billing.zzgl zzglVar, com.google.android.gms.internal.play_billing.zzgv zzgvVar) {
        int iZze = ((com.google.android.gms.internal.play_billing.zzds) zzglVar).zze(zzgvVar);
        return zzC(iZze) + iZze;
    }

    public static int zzB(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.play_billing.zzhr.zzc(str);
        } catch (com.google.android.gms.internal.play_billing.zzhq unused) {
            length = str.getBytes(com.google.android.gms.internal.play_billing.zzfo.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzD(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @java.lang.Deprecated
    static int zzy(int i, com.google.android.gms.internal.play_billing.zzgl zzglVar, com.google.android.gms.internal.play_billing.zzgv zzgvVar) {
        int iZzC = zzC(i << 3);
        return iZzC + iZzC + ((com.google.android.gms.internal.play_billing.zzds) zzglVar).zze(zzgvVar);
    }

    public static int zzz(com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        int iZzj = zzglVar.zzj();
        return zzC(iZzj) + iZzj;
    }

    public final void zzE() {
        if (zza() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzF(java.lang.String str, com.google.android.gms.internal.play_billing.zzhq zzhqVar) throws java.io.IOException {
        zzc.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzhqVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.play_billing.zzfo.zza);
        try {
            int length = bytes.length;
            zzv(length);
            zzm(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzen(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws java.io.IOException;

    public abstract void zzd(int i, boolean z) throws java.io.IOException;

    public abstract void zze(int i, com.google.android.gms.internal.play_billing.zzei zzeiVar) throws java.io.IOException;

    public abstract void zzg(int i, int i2) throws java.io.IOException;

    public abstract void zzh(int i) throws java.io.IOException;

    public abstract void zzi(int i, long j) throws java.io.IOException;

    public abstract void zzj(long j) throws java.io.IOException;

    public abstract void zzk(int i, int i2) throws java.io.IOException;

    public abstract void zzl(int i) throws java.io.IOException;

    public abstract void zzm(byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract void zzn(int i, com.google.android.gms.internal.play_billing.zzgl zzglVar, com.google.android.gms.internal.play_billing.zzgv zzgvVar) throws java.io.IOException;

    public abstract void zzp(int i, com.google.android.gms.internal.play_billing.zzgl zzglVar) throws java.io.IOException;

    public abstract void zzq(int i, com.google.android.gms.internal.play_billing.zzei zzeiVar) throws java.io.IOException;

    public abstract void zzr(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzt(int i, int i2) throws java.io.IOException;

    public abstract void zzu(int i, int i2) throws java.io.IOException;

    public abstract void zzv(int i) throws java.io.IOException;

    public abstract void zzw(int i, long j) throws java.io.IOException;

    public abstract void zzx(long j) throws java.io.IOException;
}
