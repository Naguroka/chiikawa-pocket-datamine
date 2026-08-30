package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzh> CREATOR = new com.google.android.gms.internal.drive.zzi();
    final int status;
    final int zzct;
    final long zzcw;
    final long zzcx;
    final com.google.android.gms.drive.DriveId zzk;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzct);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.status);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzcw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzcx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzh(int i, com.google.android.gms.drive.DriveId driveId, int i2, long j, long j2) {
        this.zzct = i;
        this.zzk = driveId;
        this.status = i2;
        this.zzcw = j;
        this.zzcx = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            com.google.android.gms.internal.drive.zzh zzhVar = (com.google.android.gms.internal.drive.zzh) obj;
            if (this.zzct == zzhVar.zzct && com.google.android.gms.common.internal.Objects.equal(this.zzk, zzhVar.zzk) && this.status == zzhVar.status && this.zzcw == zzhVar.zzcw && this.zzcx == zzhVar.zzcx) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzct), this.zzk, java.lang.Integer.valueOf(this.status), java.lang.Long.valueOf(this.zzcw), java.lang.Long.valueOf(this.zzcx));
    }
}
