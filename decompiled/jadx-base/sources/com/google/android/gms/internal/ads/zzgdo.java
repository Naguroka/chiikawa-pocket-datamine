package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgdo {
    private final java.io.InputStream zza;

    private zzgdo(java.io.InputStream inputStream) {
        this.zza = inputStream;
    }

    public static com.google.android.gms.internal.ads.zzgdo zzb(byte[] bArr) {
        return new com.google.android.gms.internal.ads.zzgdo(new java.io.ByteArrayInputStream(bArr));
    }

    public final com.google.android.gms.internal.ads.zzgsx zza() throws java.io.IOException {
        try {
            return com.google.android.gms.internal.ads.zzgsx.zzg(this.zza, com.google.android.gms.internal.ads.zzgxb.zza());
        } finally {
            this.zza.close();
        }
    }
}
