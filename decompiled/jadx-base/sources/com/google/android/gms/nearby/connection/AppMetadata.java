package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public final class AppMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.AppMetadata> CREATOR = new com.google.android.gms.nearby.connection.zzd();
    private final java.util.List<com.google.android.gms.nearby.connection.AppIdentifier> zza;

    public AppMetadata(java.util.List<com.google.android.gms.nearby.connection.AppIdentifier> list) {
        this.zza = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "Must specify application identifiers");
        com.google.android.gms.common.internal.Preconditions.checkNotZero(list.size(), (java.lang.Object) "Application identifiers cannot be empty");
    }

    public java.util.List<com.google.android.gms.nearby.connection.AppIdentifier> getAppIdentifiers() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getAppIdentifiers(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
