package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzce {
    private final com.google.android.gms.internal.ads.zzfxn zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private java.nio.ByteBuffer[] zzc = new java.nio.ByteBuffer[0];
    private boolean zzd;

    public zzce(com.google.android.gms.internal.ads.zzfxn zzfxnVar) {
        this.zza = zzfxnVar;
        com.google.android.gms.internal.ads.zzcf zzcfVar = com.google.android.gms.internal.ads.zzcf.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(java.nio.ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= zzi(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    com.google.android.gms.internal.ads.zzch zzchVar = (com.google.android.gms.internal.ads.zzch) this.zzb.get(i);
                    if (!zzchVar.zzh()) {
                        java.nio.ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : com.google.android.gms.internal.ads.zzch.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzchVar.zze(byteBuffer2);
                        this.zzc[i] = zzchVar.zzb();
                        long jRemaining2 = jRemaining - ((long) byteBuffer2.remaining());
                        boolean z2 = true;
                        if (jRemaining2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((com.google.android.gms.internal.ads.zzch) this.zzb.get(i + 1)).zzd();
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzce)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzce zzceVar = (com.google.android.gms.internal.ads.zzce) obj;
        if (this.zza.size() != zzceVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzceVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final com.google.android.gms.internal.ads.zzcf zza(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        if (zzcfVar.equals(com.google.android.gms.internal.ads.zzcf.zza)) {
            throw new com.google.android.gms.internal.ads.zzcg("Unhandled input format:", zzcfVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            com.google.android.gms.internal.ads.zzch zzchVar = (com.google.android.gms.internal.ads.zzch) this.zza.get(i);
            com.google.android.gms.internal.ads.zzcf zzcfVarZza = zzchVar.zza(zzcfVar);
            if (zzchVar.zzg()) {
                com.google.android.gms.internal.ads.zzcw.zzf(!zzcfVarZza.equals(com.google.android.gms.internal.ads.zzcf.zza));
                zzcfVar = zzcfVarZza;
            }
        }
        return zzcfVar;
    }

    public final java.nio.ByteBuffer zzb() {
        if (!zzh()) {
            return com.google.android.gms.internal.ads.zzch.zza;
        }
        java.nio.ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(com.google.android.gms.internal.ads.zzch.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i = 0; i < this.zza.size(); i++) {
            com.google.android.gms.internal.ads.zzch zzchVar = (com.google.android.gms.internal.ads.zzch) this.zza.get(i);
            zzchVar.zzc();
            if (zzchVar.zzg()) {
                this.zzb.add(zzchVar);
            }
        }
        this.zzc = new java.nio.ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((com.google.android.gms.internal.ads.zzch) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((com.google.android.gms.internal.ads.zzch) this.zzb.get(0)).zzd();
    }

    public final void zze(java.nio.ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            com.google.android.gms.internal.ads.zzch zzchVar = (com.google.android.gms.internal.ads.zzch) this.zza.get(i);
            zzchVar.zzc();
            zzchVar.zzf();
        }
        this.zzc = new java.nio.ByteBuffer[0];
        com.google.android.gms.internal.ads.zzcf zzcfVar = com.google.android.gms.internal.ads.zzcf.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        return this.zzd && ((com.google.android.gms.internal.ads.zzch) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
