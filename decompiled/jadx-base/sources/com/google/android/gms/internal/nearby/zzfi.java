package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfi> CREATOR = new com.google.android.gms.internal.nearby.zzfj();
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private android.bluetooth.BluetoothDevice zzd;
    private byte[] zze;

    private zzfi() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzfi) {
            com.google.android.gms.internal.nearby.zzfi zzfiVar = (com.google.android.gms.internal.nearby.zzfi) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzfiVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzfiVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzfiVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzfiVar.zzd) && java.util.Arrays.equals(this.zze, zzfiVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zze)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final android.bluetooth.BluetoothDevice zzd() {
        return this.zzd;
    }

    public final byte[] zze() {
        return this.zze;
    }

    zzfi(java.lang.String str, java.lang.String str2, java.lang.String str3, android.bluetooth.BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bluetoothDevice;
        this.zze = bArr;
    }
}
