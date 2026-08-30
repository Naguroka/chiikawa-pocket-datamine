package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.zzv> CREATOR = new com.google.android.gms.nearby.connection.zzw();
    private byte[] zza;
    private int zzb;
    private int zzc;

    private zzv() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.connection.zzv) {
            com.google.android.gms.nearby.connection.zzv zzvVar = (com.google.android.gms.nearby.connection.zzv) obj;
            if (java.util.Arrays.equals(this.zza, zzvVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzvVar.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(zzvVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zza)), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        java.lang.String string = java.util.Arrays.toString(this.zza);
        int i = this.zzb;
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 71);
        sb.append("UwbSenderInfo{address=");
        sb.append(string);
        sb.append(", channel=");
        sb.append(i);
        sb.append(", preambleIndex=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzv(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
    }
}
