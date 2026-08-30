package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzci implements com.google.android.gms.internal.ads.zzch {
    protected com.google.android.gms.internal.ads.zzcf zzb;
    protected com.google.android.gms.internal.ads.zzcf zzc;
    private com.google.android.gms.internal.ads.zzcf zzd;
    private com.google.android.gms.internal.ads.zzcf zze;
    private java.nio.ByteBuffer zzf;
    private java.nio.ByteBuffer zzg;
    private boolean zzh;

    public zzci() {
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = com.google.android.gms.internal.ads.zzcf.zza;
        com.google.android.gms.internal.ads.zzcf zzcfVar = com.google.android.gms.internal.ads.zzcf.zza;
        this.zze = zzcfVar;
        this.zzb = zzcfVar;
        this.zzc = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final com.google.android.gms.internal.ads.zzcf zza(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        this.zzd = zzcfVar;
        this.zze = zzi(zzcfVar);
        return zzg() ? this.zze : com.google.android.gms.internal.ads.zzcf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public java.nio.ByteBuffer zzb() {
        java.nio.ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = com.google.android.gms.internal.ads.zzcf.zza;
        com.google.android.gms.internal.ads.zzcf zzcfVar = com.google.android.gms.internal.ads.zzcf.zza;
        this.zze = zzcfVar;
        this.zzb = zzcfVar;
        this.zzc = zzcfVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public boolean zzg() {
        return this.zze != com.google.android.gms.internal.ads.zzcf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected com.google.android.gms.internal.ads.zzcf zzi(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        throw null;
    }

    protected final java.nio.ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
