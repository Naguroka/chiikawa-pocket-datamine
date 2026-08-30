package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzo extends com.google.android.gms.drive.metadata.internal.zzl<com.google.android.gms.drive.DriveId> implements com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<com.google.android.gms.drive.DriveId> {
    public static final com.google.android.gms.drive.metadata.internal.zzg zzjk = new com.google.android.gms.drive.metadata.internal.zzp();

    public zzo(int i) {
        super("parents", java.util.Collections.emptySet(), java.util.Arrays.asList("parentsExtra", "dbInstanceId", "parentsExtraHolder"), com.google.android.gms.common.util.GmsVersion.VERSION_HALLOUMI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.internal.zzl
    /* JADX INFO: renamed from: zzc */
    public final java.util.Collection<com.google.android.gms.drive.DriveId> zzb(android.os.Bundle bundle) {
        java.util.Collection collectionZzb = super.zzb(bundle);
        if (collectionZzb == null) {
            return null;
        }
        return new java.util.HashSet(collectionZzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.zzb
    /* JADX INFO: renamed from: zzd */
    public final java.util.Collection<com.google.android.gms.drive.DriveId> zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        android.os.Bundle metadata = dataHolder.getMetadata();
        java.util.ArrayList parcelableArrayList = metadata.getParcelableArrayList("parentsExtra");
        if (parcelableArrayList == null) {
            if (metadata.getParcelable("parentsExtraHolder") != null) {
                synchronized (dataHolder) {
                    com.google.android.gms.common.data.DataHolder dataHolder2 = (com.google.android.gms.common.data.DataHolder) dataHolder.getMetadata().getParcelable("parentsExtraHolder");
                    if (dataHolder2 != null) {
                        try {
                            int count = dataHolder.getCount();
                            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(count);
                            java.util.HashMap map = new java.util.HashMap(count);
                            for (int i3 = 0; i3 < count; i3++) {
                                int windowIndex = dataHolder.getWindowIndex(i3);
                                com.google.android.gms.drive.metadata.internal.ParentDriveIdSet parentDriveIdSet = new com.google.android.gms.drive.metadata.internal.ParentDriveIdSet();
                                arrayList.add(parentDriveIdSet);
                                map.put(java.lang.Long.valueOf(dataHolder.getLong("sqlId", i3, windowIndex)), parentDriveIdSet);
                            }
                            android.os.Bundle metadata2 = dataHolder2.getMetadata();
                            java.lang.String string = metadata2.getString("childSqlIdColumn");
                            java.lang.String string2 = metadata2.getString("parentSqlIdColumn");
                            java.lang.String string3 = metadata2.getString("parentResIdColumn");
                            int count2 = dataHolder2.getCount();
                            for (int i4 = 0; i4 < count2; i4++) {
                                int windowIndex2 = dataHolder2.getWindowIndex(i4);
                                ((com.google.android.gms.drive.metadata.internal.ParentDriveIdSet) map.get(java.lang.Long.valueOf(dataHolder2.getLong(string, i4, windowIndex2)))).zzjj.add(new com.google.android.gms.drive.metadata.internal.zzq(dataHolder2.getString(string3, i4, windowIndex2), dataHolder2.getLong(string2, i4, windowIndex2), 1));
                            }
                            dataHolder.getMetadata().putParcelableArrayList("parentsExtra", arrayList);
                            dataHolder2.close();
                            dataHolder.getMetadata().remove("parentsExtraHolder");
                        } catch (java.lang.Throwable th) {
                            dataHolder2.close();
                            dataHolder.getMetadata().remove("parentsExtraHolder");
                            throw th;
                        }
                    }
                }
                parcelableArrayList = metadata.getParcelableArrayList("parentsExtra");
            }
            if (parcelableArrayList == null) {
                return null;
            }
        }
        long j = metadata.getLong("dbInstanceId");
        com.google.android.gms.drive.metadata.internal.ParentDriveIdSet parentDriveIdSet2 = (com.google.android.gms.drive.metadata.internal.ParentDriveIdSet) parcelableArrayList.get(i);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.google.android.gms.drive.metadata.internal.zzq zzqVar : parentDriveIdSet2.zzjj) {
            hashSet.add(new com.google.android.gms.drive.DriveId(zzqVar.zzad, zzqVar.zzae, j, zzqVar.zzaf));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(com.google.android.gms.common.data.DataHolder dataHolder) {
        android.os.Bundle metadata = dataHolder.getMetadata();
        if (metadata == null) {
            return;
        }
        synchronized (dataHolder) {
            com.google.android.gms.common.data.DataHolder dataHolder2 = (com.google.android.gms.common.data.DataHolder) metadata.getParcelable("parentsExtraHolder");
            if (dataHolder2 != null) {
                dataHolder2.close();
                metadata.remove("parentsExtraHolder");
            }
        }
    }

    @Override // com.google.android.gms.drive.metadata.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return zzc(dataHolder, i, i2);
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzl, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return zzb(bundle);
    }
}
