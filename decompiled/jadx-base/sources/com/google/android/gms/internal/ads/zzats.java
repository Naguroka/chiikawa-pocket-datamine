package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzats extends com.google.android.gms.internal.ads.zzatq {
    public java.lang.String zza;
    public long zzb;
    public java.lang.String zzc;
    public java.lang.String zzd;
    public java.lang.String zze;

    public zzats() {
        this.zza = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzd = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zze = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
    }

    public zzats(java.lang.String str) {
        java.lang.String str2 = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zza = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzd = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zze = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        java.util.HashMap mapZza = zza(str);
        if (mapZza != null) {
            this.zza = mapZza.get(0) == null ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : (java.lang.String) mapZza.get(0);
            this.zzb = mapZza.get(1) != null ? ((java.lang.Long) mapZza.get(1)).longValue() : -1L;
            this.zzc = mapZza.get(2) == null ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : (java.lang.String) mapZza.get(2);
            this.zzd = mapZza.get(3) == null ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : (java.lang.String) mapZza.get(3);
            this.zze = mapZza.get(4) != null ? (java.lang.String) mapZza.get(4) : str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    protected final java.util.HashMap zzb() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, java.lang.Long.valueOf(this.zzb));
        return map;
    }
}
