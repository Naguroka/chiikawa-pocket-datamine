package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzo> CREATOR = new com.google.android.gms.internal.drive.zzp();
    private final com.google.android.gms.drive.Contents zzdf;
    private final int zzdh;
    private final java.lang.Boolean zzdj;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 3, this.zzdj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzdh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzo(com.google.android.gms.drive.Contents contents, java.lang.Boolean bool, int i) {
        this.zzdf = contents;
        this.zzdj = bool;
        this.zzdh = i;
    }

    public zzo(int i, boolean z) {
        this(null, false, i);
    }
}
