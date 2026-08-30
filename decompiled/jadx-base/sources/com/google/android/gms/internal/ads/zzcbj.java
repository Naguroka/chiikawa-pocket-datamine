package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcbj {
    private static final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger(0);

    protected static java.util.concurrent.atomic.AtomicInteger zzD() {
        return zza;
    }

    protected static java.util.concurrent.atomic.AtomicInteger zzE() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract java.lang.Integer zzC();

    public abstract void zzF(android.net.Uri[] uriArr, java.lang.String str);

    public abstract void zzG(android.net.Uri[] uriArr, java.lang.String str, java.nio.ByteBuffer byteBuffer, boolean z);

    public abstract void zzH();

    public abstract void zzI(long j);

    public abstract void zzJ(int i);

    public abstract void zzK(int i);

    public abstract void zzL(com.google.android.gms.internal.ads.zzcbi zzcbiVar);

    public abstract void zzM(int i);

    public abstract void zzN(int i);

    public abstract void zzO(boolean z);

    public abstract void zzP(java.lang.Integer num);

    public abstract void zzQ(boolean z);

    public abstract void zzR(int i);

    public abstract void zzS(android.view.Surface surface, boolean z) throws java.io.IOException;

    public abstract void zzT(float f, boolean z) throws java.io.IOException;

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
