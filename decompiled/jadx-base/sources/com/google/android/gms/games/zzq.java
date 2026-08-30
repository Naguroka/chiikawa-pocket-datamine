package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzq implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.games.PlayerEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.games.PlayerEntity createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        android.net.Uri uri = null;
        android.net.Uri uri2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.String strCreateString4 = null;
        java.lang.String strCreateString5 = null;
        com.google.android.gms.games.internal.player.MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        com.google.android.gms.games.PlayerLevelInfo playerLevelInfo = null;
        java.lang.String strCreateString6 = null;
        java.lang.String strCreateString7 = null;
        android.net.Uri uri3 = null;
        java.lang.String strCreateString8 = null;
        android.net.Uri uri4 = null;
        java.lang.String strCreateString9 = null;
        com.google.android.gms.games.zzt zztVar = null;
        com.google.android.gms.games.zza zzaVar = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        long j3 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 29) {
                j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 33) {
                zztVar = (com.google.android.gms.games.zzt) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.zzt.CREATOR);
            } else if (fieldId == 35) {
                zzaVar = (com.google.android.gms.games.zza) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.zza.CREATOR);
            } else if (fieldId != 36) {
                switch (fieldId) {
                    case 1:
                        strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    case 2:
                        strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    case 3:
                        uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                        break;
                    case 4:
                        uri2 = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                        break;
                    case 5:
                        j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                        break;
                    case 6:
                        i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 7:
                        j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                        break;
                    case 8:
                        strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    case 9:
                        strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    default:
                        switch (fieldId) {
                            case 14:
                                strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                                break;
                            case 15:
                                mostRecentGameInfoEntity = (com.google.android.gms.games.internal.player.MostRecentGameInfoEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.CREATOR);
                                break;
                            case 16:
                                playerLevelInfo = (com.google.android.gms.games.PlayerLevelInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.games.PlayerLevelInfo.CREATOR);
                                break;
                            default:
                                switch (fieldId) {
                                    case 18:
                                        z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                                        break;
                                    case 19:
                                        z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                                        break;
                                    case 20:
                                        strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                                        break;
                                    case 21:
                                        strCreateString7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                                        break;
                                    case 22:
                                        uri3 = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                                        break;
                                    case 23:
                                        strCreateString8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                                        break;
                                    case 24:
                                        uri4 = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                                        break;
                                    case 25:
                                        strCreateString9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                                        break;
                                    default:
                                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.games.PlayerEntity(strCreateString, strCreateString2, uri, uri2, j, i, j2, strCreateString3, strCreateString4, strCreateString5, mostRecentGameInfoEntity, playerLevelInfo, z, z2, strCreateString6, strCreateString7, uri3, strCreateString8, uri4, strCreateString9, j3, zztVar, zzaVar, z3);
    }
}
