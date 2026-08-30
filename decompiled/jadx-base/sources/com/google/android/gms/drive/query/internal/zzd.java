package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzd> CREATOR = new com.google.android.gms.drive.query.internal.zze();
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.MetadataField<?> zzmb;

    zzd(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzma = metadataBundle;
        this.zzmb = com.google.android.gms.drive.query.internal.zzi.zza(metadataBundle);
    }

    public zzd(com.google.android.gms.drive.metadata.SearchableMetadataField<?> searchableMetadataField) {
        this(com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(searchableMetadataField, null));
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <T> T zza(com.google.android.gms.drive.query.internal.zzj<T> zzjVar) {
        return zzjVar.zze(this.zzmb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzma, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
