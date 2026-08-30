package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrw extends com.google.android.gms.internal.ads.zzfsz {
    private int zza;
    private java.lang.String zzb;
    private byte zzc;

    zzfrw() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final com.google.android.gms.internal.ads.zzfsz zza(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final com.google.android.gms.internal.ads.zzfsz zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final com.google.android.gms.internal.ads.zzfta zzc() {
        if (this.zzc == 1) {
            return new com.google.android.gms.internal.ads.zzfry(this.zza, this.zzb, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: statusCode");
    }
}
