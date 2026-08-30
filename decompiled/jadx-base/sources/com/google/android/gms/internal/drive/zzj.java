package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzj> CREATOR = new com.google.android.gms.internal.drive.zzk();
    private final com.google.android.gms.drive.events.zze zzbv;
    final int zzda;
    private final com.google.android.gms.drive.events.zzx zzdb;
    private final com.google.android.gms.drive.events.zzt zzdc;
    final com.google.android.gms.drive.DriveId zzk;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzda);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzbv, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzdb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzdc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzj(com.google.android.gms.drive.DriveId driveId, int i, com.google.android.gms.drive.events.zze zzeVar, com.google.android.gms.drive.events.zzx zzxVar, com.google.android.gms.drive.events.zzt zztVar) {
        this.zzk = driveId;
        this.zzda = i;
        this.zzbv = zzeVar;
        this.zzdb = zzxVar;
        this.zzdc = zztVar;
    }

    public zzj(int i, com.google.android.gms.drive.DriveId driveId) {
        this((com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.Preconditions.checkNotNull(driveId), 1, null, null, null);
    }
}
