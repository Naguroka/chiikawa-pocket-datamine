package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzazn {
    java.io.ByteArrayOutputStream zza = new java.io.ByteArrayOutputStream(4096);
    android.util.Base64OutputStream zzb = new android.util.Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String string;
        try {
            this.zzb.close();
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (java.io.IOException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
