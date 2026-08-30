package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzu> CREATOR = new com.google.android.gms.internal.drive.zzv();
    private final java.lang.String zzba;
    private final com.google.android.gms.drive.DriveId zzbd;
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdn;
    private final java.lang.Integer zzdo;
    private final int zzj;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzba, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzbd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 6, this.zzdo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzu(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, int i, java.lang.String str, com.google.android.gms.drive.DriveId driveId, java.lang.Integer num) {
        this.zzdn = metadataBundle;
        this.zzj = i;
        this.zzba = str;
        this.zzbd = driveId;
        this.zzdo = num;
    }
}
