package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgww extends com.google.android.gms.internal.ads.zzgwa {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgww.class.getName());
    private static final boolean zzb = com.google.android.gms.internal.ads.zzhao.zzA();
    public static final /* synthetic */ int zzf = 0;
    com.google.android.gms.internal.ads.zzgwx zze;

    private zzgww() {
        throw null;
    }

    /* synthetic */ zzgww(com.google.android.gms.internal.ads.zzgwv zzgwvVar) {
    }

    static int zzA(com.google.android.gms.internal.ads.zzgzc zzgzcVar, com.google.android.gms.internal.ads.zzgzv zzgzvVar) {
        int iZzaM = ((com.google.android.gms.internal.ads.zzgvs) zzgzcVar).zzaM(zzgzvVar);
        return zzD(iZzaM) + iZzaM;
    }

    static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.ads.zzhat.zze(str);
        } catch (com.google.android.gms.internal.ads.zzhas unused) {
            length = str.getBytes(com.google.android.gms.internal.ads.zzgye.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzE(long j) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @java.lang.Deprecated
    static int zzy(int i, com.google.android.gms.internal.ads.zzgzc zzgzcVar, com.google.android.gms.internal.ads.zzgzv zzgzvVar) {
        int iZzD = zzD(i << 3);
        return iZzD + iZzD + ((com.google.android.gms.internal.ads.zzgvs) zzgzcVar).zzaM(zzgzvVar);
    }

    public static int zzz(com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        int iZzaY = zzgzcVar.zzaY();
        return zzD(iZzaY) + iZzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzG(java.lang.String str, com.google.android.gms.internal.ads.zzhas zzhasVar) throws java.io.IOException {
        zza.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzhasVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.ads.zzgye.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzgwt(e);
        }
    }

    public abstract void zzK() throws java.io.IOException;

    public abstract void zzL(byte b) throws java.io.IOException;

    public abstract void zzM(int i, boolean z) throws java.io.IOException;

    public abstract void zzN(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.io.IOException;

    @Override // com.google.android.gms.internal.ads.zzgwa
    public abstract void zza(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws java.io.IOException;

    public abstract void zzi(int i) throws java.io.IOException;

    public abstract void zzj(int i, long j) throws java.io.IOException;

    public abstract void zzk(long j) throws java.io.IOException;

    public abstract void zzl(int i, int i2) throws java.io.IOException;

    public abstract void zzm(int i) throws java.io.IOException;

    abstract void zzn(int i, com.google.android.gms.internal.ads.zzgzc zzgzcVar, com.google.android.gms.internal.ads.zzgzv zzgzvVar) throws java.io.IOException;

    public abstract void zzo(int i, com.google.android.gms.internal.ads.zzgzc zzgzcVar) throws java.io.IOException;

    public abstract void zzp(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.io.IOException;

    public abstract void zzq(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zzs(int i, int i2) throws java.io.IOException;

    public abstract void zzt(int i, int i2) throws java.io.IOException;

    public abstract void zzu(int i) throws java.io.IOException;

    public abstract void zzv(int i, long j) throws java.io.IOException;

    public abstract void zzw(long j) throws java.io.IOException;
}
