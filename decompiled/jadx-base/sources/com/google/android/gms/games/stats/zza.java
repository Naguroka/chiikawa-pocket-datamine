package com.google.android.gms.games.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza implements android.os.Parcelable.Creator {
    static void zza(com.google.android.gms.games.stats.PlayerStatsEntity playerStatsEntity, android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 1, playerStatsEntity.getAverageSessionLength());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, playerStatsEntity.getChurnProbability());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, playerStatsEntity.getDaysSinceLastPlayed());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, playerStatsEntity.getNumberOfPurchases());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, playerStatsEntity.getNumberOfSessions());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, playerStatsEntity.getSessionPercentile());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, playerStatsEntity.getSpendPercentile());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 8, playerStatsEntity.zza(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 9, playerStatsEntity.getSpendProbability());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 10, playerStatsEntity.getHighSpenderProbability());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, playerStatsEntity.getTotalSpendNext28Days());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        android.os.Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 2:
                    f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 3:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    f3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 9:
                    f5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 10:
                    f6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.games.stats.PlayerStatsEntity(f, f2, i, i2, i3, f3, f4, bundleCreateBundle, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.games.stats.PlayerStatsEntity[i];
    }
}
