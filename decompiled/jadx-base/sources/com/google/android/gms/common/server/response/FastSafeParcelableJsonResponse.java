package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class FastSafeParcelableJsonResponse extends com.google.android.gms.common.server.response.FastJsonResponse implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse = (com.google.android.gms.common.server.response.FastJsonResponse) obj;
        for (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (isFieldSet(field)) {
                if (!fastJsonResponse.isFieldSet(field) || !com.google.android.gms.common.internal.Objects.equal(getFieldValue(field), fastJsonResponse.getFieldValue(field))) {
                    return false;
                }
            } else if (fastJsonResponse.isFieldSet(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getValueObject(java.lang.String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (isFieldSet(field)) {
                iHashCode = (iHashCode * 31) + com.google.android.gms.common.internal.Preconditions.checkNotNull(getFieldValue(field)).hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(java.lang.String str) {
        return false;
    }

    public byte[] toByteArray() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
