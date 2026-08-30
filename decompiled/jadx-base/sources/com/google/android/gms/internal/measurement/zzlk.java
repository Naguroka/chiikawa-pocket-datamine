package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzlk extends com.google.android.gms.internal.measurement.zzkv {
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.logging.Logger zzc = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzlk.class.getName());
    private static final boolean zzd = com.google.android.gms.internal.measurement.zzol.zzx();
    com.google.android.gms.internal.measurement.zzll zza;

    private zzlk() {
        throw null;
    }

    /* synthetic */ zzlk(com.google.android.gms.internal.measurement.zzlj zzljVar) {
    }

    public static int zzA(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @java.lang.Deprecated
    static int zzw(int i, com.google.android.gms.internal.measurement.zznh zznhVar, com.google.android.gms.internal.measurement.zzns zznsVar) {
        int iZzz = zzz(i << 3);
        return iZzz + iZzz + ((com.google.android.gms.internal.measurement.zzko) zznhVar).zzca(zznsVar);
    }

    static int zzx(com.google.android.gms.internal.measurement.zznh zznhVar, com.google.android.gms.internal.measurement.zzns zznsVar) {
        int iZzca = ((com.google.android.gms.internal.measurement.zzko) zznhVar).zzca(zznsVar);
        return zzz(iZzca) + iZzca;
    }

    public static int zzy(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.measurement.zzoo.zzc(str);
        } catch (com.google.android.gms.internal.measurement.zzon unused) {
            length = str.getBytes(com.google.android.gms.internal.measurement.zzmk.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzC(java.lang.String str, com.google.android.gms.internal.measurement.zzon zzonVar) throws java.io.IOException {
        zzc.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzonVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.measurement.zzmk.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.measurement.zzli(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws java.io.IOException;

    public abstract void zzd(int i, boolean z) throws java.io.IOException;

    public abstract void zze(int i, com.google.android.gms.internal.measurement.zzld zzldVar) throws java.io.IOException;

    public abstract void zzf(int i, int i2) throws java.io.IOException;

    public abstract void zzg(int i) throws java.io.IOException;

    public abstract void zzh(int i, long j) throws java.io.IOException;

    public abstract void zzi(long j) throws java.io.IOException;

    public abstract void zzj(int i, int i2) throws java.io.IOException;

    public abstract void zzk(int i) throws java.io.IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract void zzm(int i, com.google.android.gms.internal.measurement.zznh zznhVar, com.google.android.gms.internal.measurement.zzns zznsVar) throws java.io.IOException;

    public abstract void zzn(int i, com.google.android.gms.internal.measurement.zznh zznhVar) throws java.io.IOException;

    public abstract void zzo(int i, com.google.android.gms.internal.measurement.zzld zzldVar) throws java.io.IOException;

    public abstract void zzp(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzr(int i, int i2) throws java.io.IOException;

    public abstract void zzs(int i, int i2) throws java.io.IOException;

    public abstract void zzt(int i) throws java.io.IOException;

    public abstract void zzu(int i, long j) throws java.io.IOException;

    public abstract void zzv(long j) throws java.io.IOException;
}
