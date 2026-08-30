package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public class ParentDriveIdSet extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.ParentDriveIdSet> CREATOR = new com.google.android.gms.drive.metadata.internal.zzn();
    final java.util.List<com.google.android.gms.drive.metadata.internal.zzq> zzjj;

    ParentDriveIdSet(java.util.List<com.google.android.gms.drive.metadata.internal.zzq> list) {
        this.zzjj = list;
    }

    public ParentDriveIdSet() {
        this(new java.util.ArrayList());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzjj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
