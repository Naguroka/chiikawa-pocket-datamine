package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.games.GameEntity gameEntity = null;
        com.google.android.gms.games.PlayerEntity playerEntity = null;
        java.lang.String strCreateString = null;
        android.net.Uri uri = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.String strCreateString4 = null;
        java.lang.String strCreateString5 = null;
        java.lang.String strCreateString6 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    gameEntity = (com.google.android.gms.games.GameEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (com.google.android.gms.games.PlayerEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.PlayerEntity.CREATOR);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                    break;
                case 6:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(gameEntity, playerEntity, strCreateString, uri, strCreateString2, strCreateString3, strCreateString4, j, j2, f, strCreateString5, z, j3, strCreateString6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.games.snapshot.SnapshotMetadataEntity[i];
    }
}
