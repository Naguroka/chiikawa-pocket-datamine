package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzepa implements com.google.android.gms.internal.ads.zzher {
    public static com.google.android.gms.internal.ads.zzepa zza() {
        return com.google.android.gms.internal.ads.zzeoz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        java.util.List arrayList = new java.util.ArrayList();
        if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlD)).isEmpty()) {
            arrayList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlD)).split(","));
        }
        com.google.android.gms.internal.ads.zzhez.zzb(arrayList);
        return arrayList;
    }
}
