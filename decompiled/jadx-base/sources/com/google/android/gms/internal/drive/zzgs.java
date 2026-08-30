package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgs> CREATOR = new com.google.android.gms.internal.drive.zzgt();
    private final int zzda;
    private final com.google.android.gms.drive.events.zzt zzdc;
    private final com.google.android.gms.drive.DriveId zzk;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzda);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzdc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgs(com.google.android.gms.drive.DriveId driveId, int i, com.google.android.gms.drive.events.zzt zztVar) {
        this.zzk = driveId;
        this.zzda = i;
        this.zzdc = zztVar;
    }

    public zzgs(com.google.android.gms.drive.DriveId driveId, int i) {
        this(driveId, i, null);
    }
}
