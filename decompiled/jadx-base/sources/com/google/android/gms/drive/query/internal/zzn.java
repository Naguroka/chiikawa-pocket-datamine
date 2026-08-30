package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzn<T> extends com.google.android.gms.drive.query.internal.zza {
    public static final com.google.android.gms.drive.query.internal.zzo CREATOR = new com.google.android.gms.drive.query.internal.zzo();
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.MetadataField<T> zzmb;

    zzn(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzma = metadataBundle;
        this.zzmb = (com.google.android.gms.drive.metadata.MetadataField<T>) com.google.android.gms.drive.query.internal.zzi.zza(metadataBundle);
    }

    public zzn(com.google.android.gms.drive.metadata.SearchableMetadataField<T> searchableMetadataField, T t) {
        this(com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(searchableMetadataField, t));
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> zzjVar) {
        com.google.android.gms.drive.metadata.MetadataField<T> metadataField = this.zzmb;
        return zzjVar.zzc(metadataField, this.zzma.zza(metadataField));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzma, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
