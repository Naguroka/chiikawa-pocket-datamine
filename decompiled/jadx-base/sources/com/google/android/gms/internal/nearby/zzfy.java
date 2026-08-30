package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfy extends com.google.android.gms.internal.nearby.zzga {
    zzfy() {
    }

    @Override // com.google.android.gms.internal.nearby.zzga, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzfz createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.internal.nearby.zzga
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.internal.nearby.zzfz createFromParcel(android.os.Parcel parcel) {
        com.google.android.gms.internal.nearby.zzfz zzfzVarCreateFromParcel = super.createFromParcel(parcel);
        if (zzfzVarCreateFromParcel.zzb != null) {
            zzfzVarCreateFromParcel.zza = com.google.android.gms.internal.nearby.zzfz.zzb(zzfzVarCreateFromParcel.zzb);
        }
        return zzfzVarCreateFromParcel;
    }
}
