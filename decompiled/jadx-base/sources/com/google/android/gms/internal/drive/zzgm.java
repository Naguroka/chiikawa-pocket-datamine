package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgm> CREATOR = new com.google.android.gms.internal.drive.zzgn();
    private final java.lang.String zzba;
    private final java.lang.String[] zzbb;
    private final com.google.android.gms.drive.DriveId zzbd;
    private final com.google.android.gms.drive.query.internal.FilterHolder zzbe;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzba, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 3, this.zzbb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzbd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzbe, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzgm(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.query.internal.FilterHolder filterHolder) {
        this.zzba = str;
        this.zzbb = strArr;
        this.zzbd = driveId;
        this.zzbe = filterHolder;
    }
}
