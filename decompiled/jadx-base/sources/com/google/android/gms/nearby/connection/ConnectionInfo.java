package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionInfo {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final byte[] zzc;
    private final boolean zzd;
    private final boolean zze;
    private final byte[] zzf;

    @java.lang.Deprecated
    public ConnectionInfo(java.lang.String str, java.lang.String str2, boolean z) {
        this(str, str2, str2.getBytes(), z, false, str.getBytes());
    }

    private ConnectionInfo(java.lang.String str, java.lang.String str2, byte[] bArr, boolean z, boolean z2, byte[] bArr2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = z;
        this.zze = z2;
        this.zzf = bArr2;
    }

    public java.lang.String getAuthenticationDigits() {
        int i = 1;
        int i2 = 0;
        for (byte b : this.zzc) {
            i2 = (i2 + (b * i)) % 9973;
            i = (i * 31) % 9973;
        }
        return java.lang.String.format(java.util.Locale.US, "%04d", java.lang.Integer.valueOf(java.lang.Math.abs(i2)));
    }

    @java.lang.Deprecated
    public java.lang.String getAuthenticationToken() {
        return this.zzb;
    }

    public byte[] getEndpointInfo() {
        return this.zzf;
    }

    public java.lang.String getEndpointName() {
        return this.zza;
    }

    public byte[] getRawAuthenticationToken() {
        return this.zzc;
    }

    @java.lang.Deprecated
    public boolean isConnectionVerified() {
        return this.zze;
    }

    public boolean isIncomingConnection() {
        return this.zzd;
    }
}
