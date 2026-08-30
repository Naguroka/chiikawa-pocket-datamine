package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzagw implements android.os.Parcelable.Creator {
    zzagw() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.google.android.gms.internal.ads.zzagy.class.getClassLoader());
        return new com.google.android.gms.internal.ads.zzagz(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.ads.zzagz[i];
    }
}
