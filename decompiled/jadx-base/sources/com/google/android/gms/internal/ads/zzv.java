package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv {
    private final android.util.SparseBooleanArray zza = new android.util.SparseBooleanArray();
    private boolean zzb;

    public final com.google.android.gms.internal.ads.zzv zza(int i) {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzx zzb() {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzb);
        this.zzb = true;
        return new com.google.android.gms.internal.ads.zzx(this.zza, null);
    }
}
