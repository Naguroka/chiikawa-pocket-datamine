package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgw> CREATOR = new com.google.android.gms.internal.drive.zzgx();
    private final com.google.android.gms.drive.DriveId zzis;
    private final java.util.List<com.google.android.gms.drive.DriveId> zzit;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzis, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzit, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzgw(com.google.android.gms.drive.DriveId driveId, java.util.List<com.google.android.gms.drive.DriveId> list) {
        this.zzis = driveId;
        this.zzit = list;
    }
}
