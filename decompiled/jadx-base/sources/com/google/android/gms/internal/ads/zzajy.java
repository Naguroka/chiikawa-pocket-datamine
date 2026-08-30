package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajy implements com.google.android.gms.internal.ads.zzakd {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    @Override // com.google.android.gms.internal.ads.zzakd
    public final int zza(com.google.android.gms.internal.ads.zzab zzabVar) {
        java.lang.String str = zzabVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzakd
    public final com.google.android.gms.internal.ads.zzakf zzb(com.google.android.gms.internal.ads.zzab zzabVar) {
        java.lang.String str = zzabVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new com.google.android.gms.internal.ads.zzakv(zzabVar.zzr);
                case "text/vtt":
                    return new com.google.android.gms.internal.ads.zzalw();
                case "application/x-mp4-vtt":
                    return new com.google.android.gms.internal.ads.zzall();
                case "application/x-subrip":
                    return new com.google.android.gms.internal.ads.zzakz();
                case "application/x-quicktime-tx3g":
                    return new com.google.android.gms.internal.ads.zzalk(zzabVar.zzr);
                case "application/pgs":
                    return new com.google.android.gms.internal.ads.zzakt();
                case "application/dvbsubs":
                    return new com.google.android.gms.internal.ads.zzakr(zzabVar.zzr);
                case "application/ttml+xml":
                    return new com.google.android.gms.internal.ads.zzalf();
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final boolean zzc(com.google.android.gms.internal.ads.zzab zzabVar) {
        java.lang.String str = zzabVar.zzo;
        return java.util.Objects.equals(str, androidx.media3.common.MimeTypes.TEXT_SSA) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.TEXT_VTT) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_MP4VTT) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_SUBRIP) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_TX3G) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_PGS) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS) || java.util.Objects.equals(str, androidx.media3.common.MimeTypes.APPLICATION_TTML);
    }
}
