package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzpc> CREATOR = new com.google.android.gms.measurement.internal.zzpd();
    public final java.util.List zza;

    zzpc(java.util.List list) {
        this.zza = list;
    }

    public static com.google.android.gms.measurement.internal.zzpc zza(com.google.android.gms.measurement.internal.zzmf... zzmfVarArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(java.lang.Integer.valueOf(zzmfVarArr[0].zza()));
        return new com.google.android.gms.measurement.internal.zzpc(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
