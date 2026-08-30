package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class ChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.ResourceEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.ChangeEvent> CREATOR = new com.google.android.gms.drive.events.zza();
    private final int zzbu;
    private final com.google.android.gms.drive.DriveId zzk;

    public ChangeEvent(com.google.android.gms.drive.DriveId driveId, int i) {
        this.zzk = driveId;
        this.zzbu = i;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.drive.events.ResourceEvent
    public final com.google.android.gms.drive.DriveId getDriveId() {
        return this.zzk;
    }

    public final boolean hasMetadataChanged() {
        return (this.zzbu & 1) != 0;
    }

    public final boolean hasContentChanged() {
        return (this.zzbu & 2) != 0;
    }

    public final boolean hasBeenDeleted() {
        return (this.zzbu & 4) != 0;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", this.zzk, java.lang.Integer.valueOf(this.zzbu));
    }
}
