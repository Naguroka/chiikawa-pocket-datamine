package com.google.android.gms.ads.identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public static final void zza(java.lang.String str) {
        try {
            try {
                com.google.android.gms.internal.ads_identifier.zzi.zzb(263);
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        android.util.Log.w("HttpUrlPinger", sb.toString());
                    }
                    httpURLConnection.disconnect();
                    com.google.android.gms.internal.ads_identifier.zzi.zza();
                } catch (java.lang.Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.ads_identifier.zzi.zza();
                throw th2;
            }
        } catch (java.io.IOException e) {
            e = e;
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 27 + java.lang.String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            android.util.Log.w("HttpUrlPinger", sb2.toString(), e);
            com.google.android.gms.internal.ads_identifier.zzi.zza();
        } catch (java.lang.IndexOutOfBoundsException e2) {
            java.lang.String message2 = e2.getMessage();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32 + java.lang.String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            android.util.Log.w("HttpUrlPinger", sb3.toString(), e2);
            com.google.android.gms.internal.ads_identifier.zzi.zza();
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            java.lang.String message3 = e.getMessage();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 27 + java.lang.String.valueOf(message3).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message3);
            android.util.Log.w("HttpUrlPinger", sb4.toString(), e);
            com.google.android.gms.internal.ads_identifier.zzi.zza();
        }
    }
}
