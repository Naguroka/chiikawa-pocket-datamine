package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzi {
    private java.lang.String zza;
    private java.lang.String zzb;
    private byte[] zzc;
    private boolean zzd;
    private boolean zze;
    private byte[] zzf;

    public final com.google.android.gms.nearby.connection.zzi zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.connection.zzi zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzi zzc(byte[] bArr) {
        this.zzc = bArr;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzi zzd(boolean z) {
        this.zzd = z;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzi zze(byte[] bArr) {
        this.zzf = bArr;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.nearby.connection.zzi zzf(boolean z) {
        this.zze = z;
        return this;
    }

    public final com.google.android.gms.nearby.connection.ConnectionInfo zzg() {
        return new com.google.android.gms.nearby.connection.ConnectionInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
