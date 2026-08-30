package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqc implements android.os.Parcelable.Creator {
    static void zza(com.google.android.gms.measurement.internal.zzqb zzqbVar, android.os.Parcel parcel, int i) {
        int i2 = zzqbVar.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, zzqbVar.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, zzqbVar.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 4, zzqbVar.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, zzqbVar.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, zzqbVar.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 8, zzqbVar.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.Long longObject = null;
        java.lang.Float floatObject = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.Double doubleObject = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                    longObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(parcel, header);
                    break;
                case 5:
                    floatObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 6:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    doubleObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.measurement.internal.zzqb(i, strCreateString, j, longObject, floatObject, strCreateString2, strCreateString3, doubleObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.measurement.internal.zzqb[i];
    }
}
