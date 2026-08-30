package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class DiscoveredEndpointInfo {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.bluetooth.BluetoothDevice zzc;
    private final byte[] zzd;

    @java.lang.Deprecated
    public DiscoveredEndpointInfo(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = str2.getBytes();
        this.zzc = null;
    }

    /* synthetic */ DiscoveredEndpointInfo(java.lang.String str, java.lang.String str2, android.bluetooth.BluetoothDevice bluetoothDevice, byte[] bArr, com.google.android.gms.nearby.connection.zzm zzmVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bluetoothDevice;
        this.zzd = bArr;
    }

    public byte[] getEndpointInfo() {
        return this.zzd;
    }

    public java.lang.String getEndpointName() {
        return this.zzb;
    }

    public java.lang.String getServiceId() {
        return this.zza;
    }
}
