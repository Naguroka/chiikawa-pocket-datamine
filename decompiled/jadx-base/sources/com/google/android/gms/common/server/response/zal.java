package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zal> CREATOR = new com.google.android.gms.common.server.response.zap();
    final int zaa;
    final java.lang.String zab;
    final java.util.ArrayList zac;

    zal(int i, java.lang.String str, java.util.ArrayList arrayList) {
        this.zaa = i;
        this.zab = str;
        this.zac = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zal(java.lang.String str, java.util.Map map) {
        java.util.ArrayList arrayList;
        this.zaa = 1;
        this.zab = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : map.keySet()) {
                arrayList.add(new com.google.android.gms.common.server.response.zam(str2, (com.google.android.gms.common.server.response.FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.zac = arrayList;
    }
}
