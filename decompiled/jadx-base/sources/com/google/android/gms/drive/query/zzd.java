package com.google.android.gms.drive.query;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements com.google.android.gms.drive.query.internal.zzj<java.lang.String> {
    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzbj() {
        return "ownedByMe()";
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzbk() {
        return "all()";
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzi(java.lang.String str) {
        return java.lang.String.format("fullTextSearch(%s)", str);
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(com.google.android.gms.drive.query.internal.zzx zzxVar, java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzxVar.getTag()).concat("("));
        java.lang.String str = "";
        for (java.lang.String str2 : list) {
            sb.append(str);
            sb.append(str2);
            str = ",";
        }
        return sb.append(")").toString();
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(java.lang.String str) {
        return java.lang.String.format("not(%s)", str);
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(com.google.android.gms.drive.metadata.zzb zzbVar, java.lang.Object obj) {
        return java.lang.String.format("contains(%s,%s)", zzbVar.getName(), obj);
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzc(com.google.android.gms.drive.metadata.MetadataField metadataField, java.lang.Object obj) {
        return java.lang.String.format("has(%s,%s)", metadataField.getName(), obj);
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(com.google.android.gms.drive.query.internal.zzx zzxVar, com.google.android.gms.drive.metadata.MetadataField metadataField, java.lang.Object obj) {
        return java.lang.String.format("cmp(%s,%s,%s)", zzxVar.getTag(), metadataField.getName(), obj);
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zze(com.google.android.gms.drive.metadata.MetadataField metadataField) {
        return java.lang.String.format("fieldOnly(%s)", metadataField.getName());
    }
}
