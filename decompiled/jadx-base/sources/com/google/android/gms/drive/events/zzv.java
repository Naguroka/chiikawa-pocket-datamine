package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzv> CREATOR = new com.google.android.gms.drive.events.zzw();
    private final java.util.List<com.google.android.gms.internal.drive.zzh> zzcu;

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
        return 7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzcu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzv(java.util.List<com.google.android.gms.internal.drive.zzh> list) {
        this.zzcu = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.Objects.equal(this.zzcu, ((com.google.android.gms.drive.events.zzv) obj).zzcu);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzcu);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("TransferStateEvent[%s]", android.text.TextUtils.join("','", this.zzcu));
    }
}
