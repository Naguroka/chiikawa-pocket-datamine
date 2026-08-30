package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzop {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final com.google.android.gms.internal.ads.zzop zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzop zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzop zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzor zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new com.google.android.gms.internal.ads.zzor(this, null);
        }
        throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
