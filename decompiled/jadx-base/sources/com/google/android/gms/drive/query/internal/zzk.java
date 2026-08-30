package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzk implements com.google.android.gms.drive.query.internal.zzj<java.lang.Boolean> {
    private java.lang.Boolean zzmm = false;

    private zzk() {
    }

    public static boolean zza(com.google.android.gms.drive.query.Filter filter) {
        if (filter == null) {
            return false;
        }
        return ((java.lang.Boolean) filter.zza(new com.google.android.gms.drive.query.internal.zzk())).booleanValue();
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzbj() {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzi(java.lang.String str) {
        if (!str.isEmpty()) {
            this.zzmm = true;
        }
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzbk() {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(com.google.android.gms.drive.query.internal.zzx zzxVar, java.util.List<java.lang.Boolean> list) {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(java.lang.Boolean bool) {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(com.google.android.gms.drive.metadata.zzb zzbVar, java.lang.Object obj) {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzc(com.google.android.gms.drive.metadata.MetadataField metadataField, java.lang.Object obj) {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(com.google.android.gms.drive.query.internal.zzx zzxVar, com.google.android.gms.drive.metadata.MetadataField metadataField, java.lang.Object obj) {
        return this.zzmm;
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zze(com.google.android.gms.drive.metadata.MetadataField metadataField) {
        return this.zzmm;
    }
}
