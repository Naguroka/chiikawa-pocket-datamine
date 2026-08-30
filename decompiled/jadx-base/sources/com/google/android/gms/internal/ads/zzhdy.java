package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhdy implements com.google.android.gms.internal.ads.zzaqz {
    private static final com.google.android.gms.internal.ads.zzhej zzg = com.google.android.gms.internal.ads.zzhej.zzb(com.google.android.gms.internal.ads.zzhdy.class);
    protected final java.lang.String zza;
    long zzd;
    com.google.android.gms.internal.ads.zzhed zzf;
    private java.nio.ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    protected zzhdy(java.lang.String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        if (this.zzc) {
            return;
        }
        try {
            com.google.android.gms.internal.ads.zzhej zzhejVar = zzg;
            java.lang.String str = this.zza;
            zzhejVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new java.lang.String("mem mapping "));
            this.zzh = this.zzf.zzd(this.zzd, this.zze);
            this.zzc = true;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(com.google.android.gms.internal.ads.zzhed zzhedVar, java.nio.ByteBuffer byteBuffer, long j, com.google.android.gms.internal.ads.zzaqw zzaqwVar) throws java.io.IOException {
        this.zzd = zzhedVar.zzb();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzhedVar;
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(java.nio.ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        zzc();
        com.google.android.gms.internal.ads.zzhej zzhejVar = zzg;
        java.lang.String str = this.zza;
        zzhejVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new java.lang.String("parsing details of "));
        java.nio.ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}
