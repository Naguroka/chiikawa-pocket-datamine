package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzu implements com.google.android.gms.ads.internal.util.client.zze {
    private final java.lang.String zza;

    public zzu() {
        throw null;
    }

    public zzu(java.lang.String str) {
        this.zza = str;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[PHI: r5
  0x00e6: PHI (r5v2 com.google.android.gms.ads.internal.util.client.zzt) = 
  (r5v0 com.google.android.gms.ads.internal.util.client.zzt)
  (r5v1 com.google.android.gms.ads.internal.util.client.zzt)
  (r5v4 com.google.android.gms.ads.internal.util.client.zzt)
 binds: [B:43:0x00e4, B:39:0x00c4, B:23:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str) {
        com.google.android.gms.ads.internal.util.client.zzt zztVar;
        com.google.android.gms.ads.internal.util.client.zzt zztVar2 = com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE;
        try {
            try {
                if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    android.net.TrafficStats.setThreadStatsTag(263);
                }
                com.google.android.gms.ads.internal.util.client.zzo.zze("Pinging URL: " + str);
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URI(str).toURL().openConnection();
                try {
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    java.lang.String str2 = this.zza;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zzc(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zze(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                        if (responseCode == 502) {
                            zztVar = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
                        } else {
                            httpURLConnection.disconnect();
                            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                                android.net.TrafficStats.clearThreadStatsTag();
                            }
                        }
                        return zztVar2;
                    }
                    zztVar = com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
                    zztVar2 = zztVar;
                    httpURLConnection.disconnect();
                    if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                } catch (java.lang.Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    android.net.TrafficStats.clearThreadStatsTag();
                }
                throw th2;
            }
        } catch (java.io.IOException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            zztVar2 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            zztVar2 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        } catch (java.net.URISyntaxException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        }
        return zztVar2;
    }
}
