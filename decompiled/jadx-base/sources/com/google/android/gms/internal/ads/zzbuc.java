package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbuc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbuc> CREATOR = new com.google.android.gms.internal.ads.zzbud();
    public final android.view.View zza;
    public final java.util.Map zzb;

    public zzbuc(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zza = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = (java.util.Map) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.view.View view = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, com.google.android.gms.dynamic.ObjectWrapper.wrap(view).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
