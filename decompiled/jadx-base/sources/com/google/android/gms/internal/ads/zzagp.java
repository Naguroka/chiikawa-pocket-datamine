package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzagp implements android.os.Parcelable.Creator {
    zzagp() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        string.getClass();
        java.lang.String string2 = parcel.readString();
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        return new com.google.android.gms.internal.ads.zzagq(string, string2, com.google.android.gms.internal.ads.zzfxn.zzm(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.ads.zzagq[i];
    }
}
