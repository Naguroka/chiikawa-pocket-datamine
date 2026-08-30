package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = new com.google.android.gms.common.internal.zzh();
    private final android.os.IBinder zza;

    public BinderWrapper(android.os.IBinder iBinder) {
        this.zza = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zza);
    }
}
