package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zze> CREATOR = new com.google.android.gms.drive.events.zzf();
    private final int zzbw;
    private final boolean zzbx;
    private final java.util.List<com.google.android.gms.drive.DriveSpace> zzby;

    zze(int i, boolean z, java.util.List<com.google.android.gms.drive.DriveSpace> list) {
        this.zzbw = i;
        this.zzbx = z;
        this.zzby = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzbw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzbx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, this.zzby, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            com.google.android.gms.drive.events.zze zzeVar = (com.google.android.gms.drive.events.zze) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzby, zzeVar.zzby) && this.zzbw == zzeVar.zzbw && this.zzbx == zzeVar.zzbx) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzby, java.lang.Integer.valueOf(this.zzbw), java.lang.Boolean.valueOf(this.zzbx));
    }
}
