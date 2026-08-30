package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzim extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.DriveId> {
    public static final com.google.android.gms.internal.drive.zzim zzlj = new com.google.android.gms.internal.drive.zzim();

    private zzim() {
        super("driveId", java.util.Arrays.asList("sqlId", "resourceId", "mimeType"), java.util.Arrays.asList("dbInstanceId"), com.google.android.gms.common.util.GmsVersion.VERSION_HALLOUMI);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final boolean zzb(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        java.util.Iterator<java.lang.String> it = zzaz().iterator();
        while (it.hasNext()) {
            if (!dataHolder.hasColumn(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.getMetadata().getLong("dbInstanceId");
        boolean zEquals = com.google.android.gms.drive.DriveFolder.MIME_TYPE.equals(dataHolder.getString(com.google.android.gms.internal.drive.zzhs.zzki.getName(), i, i2));
        java.lang.String string = dataHolder.getString("resourceId", i, i2);
        return new com.google.android.gms.drive.DriveId("generated-android-null".equals(string) ? null : string, java.lang.Long.valueOf(dataHolder.getLong("sqlId", i, i2)).longValue(), j, zEquals ? 1 : 0);
    }
}
