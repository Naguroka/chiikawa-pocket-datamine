package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzm implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    rootTelemetryConfiguration = (com.google.android.gms.common.internal.RootTelemetryConfiguration) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    iArrCreateIntArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArrCreateIntArray, i, iArrCreateIntArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration[i];
    }
}
