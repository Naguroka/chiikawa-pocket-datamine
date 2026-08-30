package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzn {
    private java.lang.String zza;
    private java.lang.String zzb;
    private android.bluetooth.BluetoothDevice zzc;
    private byte[] zzd;

    public final com.google.android.gms.nearby.connection.zzn zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzn zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzn zzc(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.zzc = bluetoothDevice;
        this.zzb = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        this.zzd = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        return this;
    }

    public final com.google.android.gms.nearby.connection.zzn zzd(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final com.google.android.gms.nearby.connection.DiscoveredEndpointInfo zze() {
        return new com.google.android.gms.nearby.connection.DiscoveredEndpointInfo(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
