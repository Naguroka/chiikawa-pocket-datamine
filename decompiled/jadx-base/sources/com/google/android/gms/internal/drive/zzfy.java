package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfy> CREATOR = new com.google.android.gms.internal.drive.zzfz();
    final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdn;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfy(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzdn = metadataBundle;
    }

    public final com.google.android.gms.drive.metadata.internal.MetadataBundle zzaw() {
        return this.zzdn;
    }
}
