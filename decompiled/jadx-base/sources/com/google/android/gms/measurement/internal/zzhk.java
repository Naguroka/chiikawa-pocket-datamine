package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhk extends com.google.android.gms.measurement.internal.zzpg {
    public zzhk(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
    }

    public final void zza(com.google.android.gms.measurement.internal.zzh zzhVar, java.util.Map map, com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhgVar);
        com.google.android.gms.measurement.internal.zzpi zzpiVarZzy = this.zzg.zzy();
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        java.lang.String strZzH = zzhVar.zzH();
        if (android.text.TextUtils.isEmpty(strZzH)) {
            strZzH = zzhVar.zzA();
        }
        android.net.Uri.Builder builderAppendQueryParameter = builder.scheme((java.lang.String) com.google.android.gms.measurement.internal.zzgi.zze.zza(null)).encodedAuthority((java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzf.zza(null)).path("config/app/".concat(java.lang.String.valueOf(strZzH))).appendQueryParameter(com.json.ce.A, "android");
        zzpiVarZzy.zzu.zzf().zzj();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", java.lang.String.valueOf(119002L)).appendQueryParameter("runtime_version", "0");
        java.lang.String string = builder.build().toString();
        try {
            this.zzu.zzaX().zzp(new com.google.android.gms.measurement.internal.zzhi(this, zzhVar.zzC(), new java.net.URI(string).toURL(), null, map, zzhgVar));
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.net.URISyntaxException unused) {
            this.zzu.zzaW().zze().zzc("Failed to parse config URL. Not fetching. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzhVar.zzC()), string);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    public final void zzc(java.lang.String str, com.google.android.gms.measurement.internal.zzph zzphVar, com.google.android.gms.internal.measurement.zzhv zzhvVar, com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        zzg();
        zzav();
        try {
            java.net.URL url = new java.net.URI(zzphVar.zzc()).toURL();
            this.zzg.zzA();
            this.zzu.zzaX().zzp(new com.google.android.gms.measurement.internal.zzhi(this, str, url, zzhvVar.zzcd(), zzphVar.zzd(), zzhgVar));
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.net.URISyntaxException unused) {
            this.zzu.zzaW().zze().zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzphVar.zzc());
        }
    }

    public final boolean zzd() {
        zzav();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.zzu.zzaT().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
