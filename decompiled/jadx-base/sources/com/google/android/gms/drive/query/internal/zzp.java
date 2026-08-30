package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzp<T> extends com.google.android.gms.drive.query.internal.zza {
    public static final com.google.android.gms.drive.query.internal.zzq CREATOR = new com.google.android.gms.drive.query.internal.zzq();
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.zzb<T> zzmn;

    zzp(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzma = metadataBundle;
        this.zzmn = (com.google.android.gms.drive.metadata.zzb) com.google.android.gms.drive.query.internal.zzi.zza(metadataBundle);
    }

    public zzp(com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<T> searchableCollectionMetadataField, T t) {
        this(com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(searchableCollectionMetadataField, java.util.Collections.singleton(t)));
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> zzjVar) {
        com.google.android.gms.drive.metadata.zzb<T> zzbVar = this.zzmn;
        return zzjVar.zza(zzbVar, ((java.util.Collection) this.zzma.zza(zzbVar)).iterator().next());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzma, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
