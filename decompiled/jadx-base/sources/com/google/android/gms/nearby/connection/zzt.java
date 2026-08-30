package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.zzt> CREATOR = new com.google.android.gms.nearby.connection.zzu();
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;

    private zzt() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.connection.zzt) {
            com.google.android.gms.nearby.connection.zzt zztVar = (com.google.android.gms.nearby.connection.zzt) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(zztVar.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zztVar.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(zztVar.zzc)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(zztVar.zzd))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zzd));
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        boolean z = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(org.objectweb.asm.Opcodes.I2C);
        sb.append("UwbRangingData{rawDistance=");
        sb.append(i);
        sb.append(", rawAngleOfArrivalAzimuth=");
        sb.append(i2);
        sb.append(", rawAngleOfArrivalPolar=");
        sb.append(i3);
        sb.append(", isValidAngleOfArrivalData=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzt(int i, int i2, int i3, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
    }
}
