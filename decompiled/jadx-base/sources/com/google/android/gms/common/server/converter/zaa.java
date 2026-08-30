package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.zaa> CREATOR = new com.google.android.gms.common.server.converter.zab();
    final int zaa;
    private final com.google.android.gms.common.server.converter.StringToIntConverter zab;

    zaa(int i, com.google.android.gms.common.server.converter.StringToIntConverter stringToIntConverter) {
        this.zaa = i;
        this.zab = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zab() {
        com.google.android.gms.common.server.converter.StringToIntConverter stringToIntConverter = this.zab;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new java.lang.IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    private zaa(com.google.android.gms.common.server.converter.StringToIntConverter stringToIntConverter) {
        this.zaa = 1;
        this.zab = stringToIntConverter;
    }

    public static com.google.android.gms.common.server.converter.zaa zaa(com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter fieldConverter) {
        if (fieldConverter instanceof com.google.android.gms.common.server.converter.StringToIntConverter) {
            return new com.google.android.gms.common.server.converter.zaa((com.google.android.gms.common.server.converter.StringToIntConverter) fieldConverter);
        }
        throw new java.lang.IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }
}
