package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbi implements android.os.Parcelable.Creator {
    static void zza(com.google.android.gms.measurement.internal.zzbh zzbhVar, android.os.Parcel parcel, int i) {
        java.lang.String str = zzbhVar.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, zzbhVar.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, zzbhVar.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, zzbhVar.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        java.lang.String strCreateString = null;
        com.google.android.gms.measurement.internal.zzbf zzbfVar = null;
        java.lang.String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                zzbfVar = (com.google.android.gms.measurement.internal.zzbf) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.measurement.internal.zzbf.CREATOR);
            } else if (fieldId == 4) {
                strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.measurement.internal.zzbh(strCreateString, zzbfVar, strCreateString2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.measurement.internal.zzbh[i];
    }
}
