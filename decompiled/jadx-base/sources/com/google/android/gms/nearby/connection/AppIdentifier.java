package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public final class AppIdentifier extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.AppIdentifier> CREATOR = new com.google.android.gms.nearby.connection.zzc();
    private final java.lang.String zza;

    public AppIdentifier(java.lang.String str) {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Missing application identifier value");
    }

    public java.lang.String getIdentifier() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getIdentifier(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
