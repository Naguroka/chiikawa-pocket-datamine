package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zam> CREATOR = new com.google.android.gms.common.server.response.zak();
    final int zaa;
    final java.lang.String zab;
    final com.google.android.gms.common.server.response.FastJsonResponse.Field zac;

    zam(int i, java.lang.String str, com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        this.zaa = i;
        this.zab = str;
        this.zac = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zam(java.lang.String str, com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        this.zaa = 1;
        this.zab = str;
        this.zac = field;
    }
}
