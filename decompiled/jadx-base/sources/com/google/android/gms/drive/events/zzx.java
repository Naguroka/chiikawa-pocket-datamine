package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzx> CREATOR = new com.google.android.gms.drive.events.zzy();
    private final java.util.List<com.google.android.gms.drive.DriveSpace> zzby;

    zzx(java.util.List<com.google.android.gms.drive.DriveSpace> list) {
        this.zzby = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzby, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "TransferStateOptions[Spaces=%s]", this.zzby);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.Objects.equal(this.zzby, ((com.google.android.gms.drive.events.zzx) obj).zzby);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzby);
    }
}
