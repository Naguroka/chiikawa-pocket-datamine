package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaqv implements com.google.android.gms.internal.ads.zzaqw {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzaqv.class.getName());
    final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzaqu(this);

    public abstract com.google.android.gms.internal.ads.zzaqz zza(java.lang.String str, byte[] bArr, java.lang.String str2);

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final com.google.android.gms.internal.ads.zzaqz zzb(com.google.android.gms.internal.ads.zzhed zzhedVar, com.google.android.gms.internal.ads.zzara zzaraVar) throws java.io.IOException {
        int iZza;
        long jZzc;
        long jZzb = zzhedVar.zzb();
        ((java.nio.ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            iZza = zzhedVar.zza((java.nio.ByteBuffer) this.zza.get());
            if (iZza == 8) {
                ((java.nio.ByteBuffer) this.zza.get()).rewind();
                long jZze = com.google.android.gms.internal.ads.zzaqy.zze((java.nio.ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    java.util.logging.Logger logger = zzb;
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((java.nio.ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    java.lang.String str = new java.lang.String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ((java.nio.ByteBuffer) this.zza.get()).limit(16);
                        zzhedVar.zza((java.nio.ByteBuffer) this.zza.get());
                        ((java.nio.ByteBuffer) this.zza.get()).position(8);
                        jZzc = com.google.android.gms.internal.ads.zzaqy.zzf((java.nio.ByteBuffer) this.zza.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? zzhedVar.zzc() - zzhedVar.zzb() : jZze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((java.nio.ByteBuffer) this.zza.get()).limit(((java.nio.ByteBuffer) this.zza.get()).limit() + 16);
                        zzhedVar.zza((java.nio.ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int iPosition = ((java.nio.ByteBuffer) this.zza.get()).position() - 16; iPosition < ((java.nio.ByteBuffer) this.zza.get()).position(); iPosition++) {
                            bArr[iPosition - (((java.nio.ByteBuffer) this.zza.get()).position() - 16)] = ((java.nio.ByteBuffer) this.zza.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    com.google.android.gms.internal.ads.zzaqz zzaqzVarZza = zza(str, bArr, zzaraVar instanceof com.google.android.gms.internal.ads.zzaqz ? ((com.google.android.gms.internal.ads.zzaqz) zzaraVar).zza() : "");
                    ((java.nio.ByteBuffer) this.zza.get()).rewind();
                    zzaqzVarZza.zzb(zzhedVar, (java.nio.ByteBuffer) this.zza.get(), j, this);
                    return zzaqzVarZza;
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        } while (iZza >= 0);
        zzhedVar.zze(jZzb);
        throw new java.io.EOFException();
    }
}
