package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzf {
    private int zza;
    private int zzb;

    public final com.google.android.gms.nearby.connection.zzf zza(int i) {
        this.zza = i;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzf zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzg zzc() {
        return new com.google.android.gms.nearby.connection.zzg(this.zza, this.zzb, null);
    }
}
