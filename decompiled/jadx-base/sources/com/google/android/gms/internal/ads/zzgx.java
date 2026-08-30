package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgx implements com.google.android.gms.internal.ads.zzfy {
    private final com.google.android.gms.internal.ads.zzfy zza;
    private long zzb;
    private android.net.Uri zzc = android.net.Uri.EMPTY;
    private java.util.Map zzd = java.util.Collections.emptyMap();

    public zzgx(com.google.android.gms.internal.ads.zzfy zzfyVar) {
        this.zza = zzfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int iZza = this.zza.zza(bArr, i, i2);
        if (iZza != -1) {
            this.zzb += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws java.io.IOException {
        this.zzc = zzgdVar.zza;
        this.zzd = java.util.Collections.emptyMap();
        try {
            long jZzb = this.zza.zzb(zzgdVar);
            if (zzc() != null) {
            }
            return jZzb;
        } finally {
            android.net.Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.zzc = uriZzc;
            }
            this.zzd = zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws java.io.IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final java.util.Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final android.net.Uri zzh() {
        return this.zzc;
    }

    public final java.util.Map zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zza.zzf(zzgyVar);
    }
}
