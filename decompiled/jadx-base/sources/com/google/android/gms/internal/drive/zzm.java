package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzm> CREATOR = new com.google.android.gms.internal.drive.zzn();
    private final java.lang.String zzan;
    private final boolean zzao;
    private final boolean zzat;
    private final com.google.android.gms.drive.DriveId zzdd;
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzde;
    private final com.google.android.gms.drive.Contents zzdf;
    private final int zzdg;
    private final int zzdh;
    private final boolean zzdi;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzde, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzdf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzao);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzan, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzdg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzdh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzdi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzat);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzm(com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, com.google.android.gms.drive.Contents contents, boolean z, java.lang.String str, int i, int i2, boolean z2, boolean z3) {
        this.zzdd = driveId;
        this.zzde = metadataBundle;
        this.zzdf = contents;
        this.zzao = z;
        this.zzan = str;
        this.zzdg = i;
        this.zzdh = i2;
        this.zzdi = z2;
        this.zzat = z3;
    }

    public zzm(com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, int i, boolean z, com.google.android.gms.drive.zzn zznVar) {
        this(driveId, metadataBundle, null, zznVar.zzm(), zznVar.zzl(), zznVar.zzn(), i, z, zznVar.zzp());
    }
}
