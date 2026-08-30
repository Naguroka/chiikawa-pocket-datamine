package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zza extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.nearby.messages.BleSignal {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zza> CREATOR = new com.google.android.gms.nearby.messages.internal.zzb();
    final int zza;
    final int zzb;
    final int zzc;

    zza(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.BleSignal)) {
            return false;
        }
        com.google.android.gms.nearby.messages.BleSignal bleSignal = (com.google.android.gms.nearby.messages.BleSignal) obj;
        return this.zzb == bleSignal.getRssi() && this.zzc == bleSignal.getTxPower();
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    public final int getRssi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    public final int getTxPower() {
        return this.zzc;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
        sb.append("BleSignal{rssi=");
        sb.append(i);
        sb.append(", txPower=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
