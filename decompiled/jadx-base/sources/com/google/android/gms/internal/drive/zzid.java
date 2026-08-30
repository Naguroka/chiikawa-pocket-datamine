package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public class zzid extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties> {
    public static final com.google.android.gms.drive.metadata.internal.zzg zzlc = new com.google.android.gms.internal.drive.zzie();

    public zzid(int i) {
        super("customProperties", java.util.Arrays.asList("hasCustomProperties", "sqlId"), java.util.Arrays.asList("customPropertiesExtra", "customPropertiesExtraHolder"), com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN);
    }

    private static com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties zzf(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        android.os.Bundle metadata = dataHolder.getMetadata();
        android.util.SparseArray sparseParcelableArray = metadata.getSparseParcelableArray("customPropertiesExtra");
        if (sparseParcelableArray == null) {
            if (metadata.getParcelable("customPropertiesExtraHolder") != null) {
                synchronized (dataHolder) {
                    com.google.android.gms.common.data.DataHolder dataHolder2 = (com.google.android.gms.common.data.DataHolder) dataHolder.getMetadata().getParcelable("customPropertiesExtraHolder");
                    if (dataHolder2 != null) {
                        try {
                            android.os.Bundle metadata2 = dataHolder2.getMetadata();
                            java.lang.String string = metadata2.getString("entryIdColumn");
                            java.lang.String string2 = metadata2.getString("keyColumn");
                            java.lang.String string3 = metadata2.getString("visibilityColumn");
                            java.lang.String string4 = metadata2.getString("valueColumn");
                            androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray();
                            for (int i3 = 0; i3 < dataHolder2.getCount(); i3++) {
                                int windowIndex = dataHolder2.getWindowIndex(i3);
                                long j = dataHolder2.getLong(string, i3, windowIndex);
                                java.lang.String string5 = dataHolder2.getString(string2, i3, windowIndex);
                                int integer = dataHolder2.getInteger(string3, i3, windowIndex);
                                com.google.android.gms.drive.metadata.internal.zzc zzcVar = new com.google.android.gms.drive.metadata.internal.zzc(new com.google.android.gms.drive.metadata.CustomPropertyKey(string5, integer), dataHolder2.getString(string4, i3, windowIndex));
                                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzaVar = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza) longSparseArray.get(j);
                                if (zzaVar == null) {
                                    zzaVar = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza();
                                    longSparseArray.put(j, zzaVar);
                                }
                                zzaVar.zza(zzcVar);
                            }
                            android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
                            for (int i4 = 0; i4 < dataHolder.getCount(); i4++) {
                                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzaVar2 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza) longSparseArray.get(dataHolder.getLong("sqlId", i4, dataHolder.getWindowIndex(i4)));
                                if (zzaVar2 != null) {
                                    sparseArray.append(i4, zzaVar2.zzbb());
                                }
                            }
                            dataHolder.getMetadata().putSparseParcelableArray("customPropertiesExtra", sparseArray);
                            dataHolder2.close();
                            dataHolder.getMetadata().remove("customPropertiesExtraHolder");
                        } catch (java.lang.Throwable th) {
                            dataHolder2.close();
                            dataHolder.getMetadata().remove("customPropertiesExtraHolder");
                            throw th;
                        }
                    }
                }
                sparseParcelableArray = metadata.getSparseParcelableArray("customPropertiesExtra");
            }
            if (sparseParcelableArray == null) {
                return com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zzjb;
            }
        }
        return (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) sparseParcelableArray.get(i, com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zzjb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(com.google.android.gms.common.data.DataHolder dataHolder) {
        android.os.Bundle metadata = dataHolder.getMetadata();
        if (metadata == null) {
            return;
        }
        synchronized (dataHolder) {
            com.google.android.gms.common.data.DataHolder dataHolder2 = (com.google.android.gms.common.data.DataHolder) metadata.getParcelable("customPropertiesExtraHolder");
            if (dataHolder2 != null) {
                dataHolder2.close();
                metadata.remove("customPropertiesExtraHolder");
            }
        }
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return zzf(dataHolder, i, i2);
    }
}
