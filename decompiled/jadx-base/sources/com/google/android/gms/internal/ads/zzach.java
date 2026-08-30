package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzach implements com.google.android.gms.internal.ads.zzacs {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final com.google.android.gms.internal.ads.zzacg zzb = new com.google.android.gms.internal.ads.zzacg(new com.google.android.gms.internal.ads.zzacf() { // from class: com.google.android.gms.internal.ads.zzacd
        @Override // com.google.android.gms.internal.ads.zzacf
        public final java.lang.reflect.Constructor zza() {
            if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]))) {
                return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(com.google.android.gms.internal.ads.zzacn.class).getConstructor(java.lang.Integer.TYPE);
            }
            return null;
        }
    });
    private static final com.google.android.gms.internal.ads.zzacg zzc = new com.google.android.gms.internal.ads.zzacg(new com.google.android.gms.internal.ads.zzacf() { // from class: com.google.android.gms.internal.ads.zzace
        @Override // com.google.android.gms.internal.ads.zzacf
        public final java.lang.reflect.Constructor zza() {
            return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(com.google.android.gms.internal.ads.zzacn.class).getConstructor(new java.lang.Class[0]);
        }
    });
    private com.google.android.gms.internal.ads.zzfxn zzd;
    private final com.google.android.gms.internal.ads.zzakd zze = new com.google.android.gms.internal.ads.zzajy();

    /* JADX WARN: Code duplicated, block: B:113:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:141:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzacs
    public final synchronized com.google.android.gms.internal.ads.zzacn[] zza(android.net.Uri uri, java.util.Map map) {
        java.util.ArrayList arrayList;
        int i;
        int i2;
        arrayList = new java.util.ArrayList(21);
        java.util.List list = (java.util.List) map.get("Content-Type");
        java.lang.String str = (list == null || list.isEmpty()) ? null : (java.lang.String) list.get(0);
        if (str != null) {
            switch (com.google.android.gms.internal.ads.zzbb.zze(str)) {
                case "audio/ac3":
                case "audio/eac3":
                case "audio/eac3-joc":
                    i = 0;
                    break;
                case "audio/ac4":
                    i = 1;
                    break;
                case "audio/amr":
                case "audio/3gpp":
                case "audio/amr-wb":
                    i = 3;
                    break;
                case "audio/flac":
                    i = 4;
                    break;
                case "video/x-flv":
                    i = 5;
                    break;
                case "audio/midi":
                    i = 15;
                    break;
                case "video/x-matroska":
                case "audio/x-matroska":
                case "video/webm":
                case "audio/webm":
                case "application/webm":
                    i = 6;
                    break;
                case "audio/mpeg":
                    i = 7;
                    break;
                case "video/mp4":
                case "audio/mp4":
                case "application/mp4":
                    i = 8;
                    break;
                case "audio/ogg":
                    i = 9;
                    break;
                case "video/mp2p":
                    i = 10;
                    break;
                case "video/mp2t":
                    i = 11;
                    break;
                case "audio/wav":
                    i = 12;
                    break;
                case "text/vtt":
                    i = 13;
                    break;
                case "image/jpeg":
                    i = 14;
                    break;
                case "video/x-msvideo":
                    i = 16;
                    break;
                case "image/png":
                    i = 17;
                    break;
                case "image/webp":
                    i = 18;
                    break;
                case "image/bmp":
                    i = 19;
                    break;
                case "image/heif":
                case "image/heic":
                    i = 20;
                    break;
                case "image/avif":
                    i = 21;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            zzb(i, arrayList);
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i2 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i2 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i2 = 1;
        } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            i2 = 2;
        } else if (lastPathSegment.endsWith(".amr")) {
            i2 = 3;
        } else if (lastPathSegment.endsWith(".flac")) {
            i2 = 4;
        } else if (lastPathSegment.endsWith(".flv")) {
            i2 = 5;
        } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            i2 = 15;
        } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            i2 = 6;
        } else if (lastPathSegment.endsWith(".mp3")) {
            i2 = 7;
        } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            i2 = 8;
        } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            i2 = 9;
        } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            i2 = 10;
        } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            i2 = 11;
        } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            i2 = 12;
        } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            i2 = 13;
        } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            i2 = 14;
        } else if (lastPathSegment.endsWith(".avi")) {
            i2 = 16;
        } else if (lastPathSegment.endsWith(".png")) {
            i2 = 17;
        } else if (lastPathSegment.endsWith(".webp")) {
            i2 = 18;
        } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            i2 = 19;
        } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            i2 = 20;
        } else if (lastPathSegment.endsWith(".avif")) {
            i2 = 21;
        } else {
            i2 = -1;
        }
        if (i2 != -1 && i2 != i) {
            zzb(i2, arrayList);
        }
        int[] iArr = zza;
        for (int i3 = 0; i3 < 21; i3++) {
            int i4 = iArr[i3];
            if (i4 != i && i4 != i2) {
                zzb(i4, arrayList);
            }
        }
        return (com.google.android.gms.internal.ads.zzacn[]) arrayList.toArray(new com.google.android.gms.internal.ads.zzacn[arrayList.size()]);
    }

    private final void zzb(int i, java.util.List list) {
        switch (i) {
            case 0:
                list.add(new com.google.android.gms.internal.ads.zzama());
                break;
            case 1:
                list.add(new com.google.android.gms.internal.ads.zzamc());
                break;
            case 2:
                list.add(new com.google.android.gms.internal.ads.zzame(0));
                break;
            case 3:
                list.add(new com.google.android.gms.internal.ads.zzaea(0));
                break;
            case 4:
                com.google.android.gms.internal.ads.zzacn zzacnVarZza = zzb.zza(0);
                if (zzacnVarZza == null) {
                    list.add(new com.google.android.gms.internal.ads.zzaes(0));
                } else {
                    list.add(zzacnVarZza);
                }
                break;
            case 5:
                list.add(new com.google.android.gms.internal.ads.zzaeu());
                break;
            case 6:
                list.add(new com.google.android.gms.internal.ads.zzahm(this.zze, 0));
                break;
            case 7:
                list.add(new com.google.android.gms.internal.ads.zzahs(0));
                break;
            case 8:
                list.add(new com.google.android.gms.internal.ads.zzaiq(this.zze, 0, null, null, com.google.android.gms.internal.ads.zzfxn.zzn(), null));
                list.add(new com.google.android.gms.internal.ads.zzaiv(this.zze, 0));
                break;
            case 9:
                list.add(new com.google.android.gms.internal.ads.zzajl());
                break;
            case 10:
                list.add(new com.google.android.gms.internal.ads.zzanj());
                break;
            case 11:
                if (this.zzd == null) {
                    this.zzd = com.google.android.gms.internal.ads.zzfxn.zzn();
                }
                list.add(new com.google.android.gms.internal.ads.zzant(1, 0, this.zze, new com.google.android.gms.internal.ads.zzef(0L), new com.google.android.gms.internal.ads.zzamg(0, this.zzd), androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                break;
            case 12:
                list.add(new com.google.android.gms.internal.ads.zzaoe());
                break;
            case 14:
                list.add(new com.google.android.gms.internal.ads.zzafa(0));
                break;
            case 15:
                com.google.android.gms.internal.ads.zzacn zzacnVarZza2 = zzc.zza(new java.lang.Object[0]);
                if (zzacnVarZza2 != null) {
                    list.add(zzacnVarZza2);
                }
                break;
            case 16:
                list.add(new com.google.android.gms.internal.ads.zzaef(0, this.zze));
                break;
            case 17:
                list.add(new com.google.android.gms.internal.ads.zzajw());
                break;
            case 18:
                list.add(new com.google.android.gms.internal.ads.zzaoj());
                break;
            case 19:
                list.add(new com.google.android.gms.internal.ads.zzaen());
                break;
            case 20:
                list.add(new com.google.android.gms.internal.ads.zzaez());
                break;
            case 21:
                list.add(new com.google.android.gms.internal.ads.zzaem());
                break;
        }
    }
}
