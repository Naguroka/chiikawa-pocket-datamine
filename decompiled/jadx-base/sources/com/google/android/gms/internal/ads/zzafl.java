package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafl {
    private final java.io.ByteArrayOutputStream zza;
    private final java.io.DataOutputStream zzb;

    public zzafl() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new java.io.DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(com.google.android.gms.internal.ads.zzafk zzafkVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzafkVar.zza);
            java.lang.String str = zzafkVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzafkVar.zzc);
            this.zzb.writeLong(zzafkVar.zzd);
            this.zzb.write(zzafkVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
