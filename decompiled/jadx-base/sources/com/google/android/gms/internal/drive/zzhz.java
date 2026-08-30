package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhz extends com.google.android.gms.drive.metadata.internal.zzl<com.google.android.gms.drive.DriveSpace> {
    public zzhz(int i) {
        super("spaces", java.util.Arrays.asList("inDriveSpace", "isAppData", "inGooglePhotosSpace"), java.util.Collections.emptySet(), com.google.android.gms.common.util.GmsVersion.VERSION_ORLA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.zzb
    /* JADX INFO: renamed from: zzd */
    public final java.util.Collection<com.google.android.gms.drive.DriveSpace> zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (dataHolder.getBoolean("inDriveSpace", i, i2)) {
            arrayList.add(com.google.android.gms.drive.DriveSpace.zzah);
        }
        if (dataHolder.getBoolean("isAppData", i, i2)) {
            arrayList.add(com.google.android.gms.drive.DriveSpace.zzai);
        }
        if (dataHolder.getBoolean("inGooglePhotosSpace", i, i2)) {
            arrayList.add(com.google.android.gms.drive.DriveSpace.zzaj);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.drive.metadata.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return zzc(dataHolder, i, i2);
    }
}
