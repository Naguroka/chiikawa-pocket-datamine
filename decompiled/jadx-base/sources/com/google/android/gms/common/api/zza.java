package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza implements android.os.Parcelable.Creator {
    private static final com.google.android.gms.common.api.zza zza = new com.google.android.gms.common.api.zza(new com.google.android.gms.common.api.zzb());
    private final android.os.Parcelable.Creator zzb;

    private zza(android.os.Parcelable.Creator creator) {
        this.zzb = creator;
    }

    public static com.google.android.gms.common.api.zza zza() {
        return zza;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return com.google.android.gms.common.api.zzb.zza(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return com.google.android.gms.common.api.ApiMetadata.getEmptyInstance();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.api.ApiMetadata[i];
    }
}
