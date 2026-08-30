package com.google.android.gms.games.achievement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        android.net.Uri uri = null;
        java.lang.String strCreateString4 = null;
        android.net.Uri uri2 = null;
        java.lang.String strCreateString5 = null;
        java.lang.String strCreateString6 = null;
        com.google.android.gms.games.PlayerEntity playerEntity = null;
        java.lang.String strCreateString7 = null;
        java.lang.String strCreateString8 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        float f = -1.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                    break;
                case 6:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    uri2 = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                    break;
                case 8:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 10:
                    strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    playerEntity = (com.google.android.gms.games.PlayerEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.PlayerEntity.CREATOR);
                    break;
                case 12:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    strCreateString7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 15:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 16:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 17:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 18:
                    strCreateString8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.games.achievement.AchievementEntity(strCreateString, i, strCreateString2, strCreateString3, uri, strCreateString4, uri2, strCreateString5, i2, strCreateString6, playerEntity, i3, i4, strCreateString7, j, j2, f, strCreateString8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.games.achievement.AchievementEntity[i];
    }
}
