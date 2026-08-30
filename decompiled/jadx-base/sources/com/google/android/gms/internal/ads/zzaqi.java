package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqi implements com.google.android.gms.internal.ads.zzaow {
    private final com.google.android.gms.internal.ads.zzaqh zzc;
    private final java.util.Map zza = new java.util.LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqi(com.google.android.gms.internal.ads.zzaqh zzaqhVar, int i) {
        this.zzc = zzaqhVar;
    }

    static int zze(java.io.InputStream inputStream) throws java.io.IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(java.io.InputStream inputStream) throws java.io.IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    static java.lang.String zzh(com.google.android.gms.internal.ads.zzaqg zzaqgVar) throws java.io.IOException {
        return new java.lang.String(zzm(zzaqgVar, zzf(zzaqgVar)), com.adjust.sdk.Constants.ENCODING);
    }

    static void zzj(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(com.google.android.gms.internal.ads.zzaqg zzaqgVar, long j) throws java.io.IOException {
        long jZza = zzaqgVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new java.io.DataInputStream(zzaqgVar).readFully(bArr);
                return bArr;
            }
        }
        throw new java.io.IOException("streamToBytes length=" + j + ", maxLength=" + jZza);
    }

    private static int zzn(java.io.InputStream inputStream) throws java.io.IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new java.io.EOFException();
    }

    private final void zzo(java.lang.String str, com.google.android.gms.internal.ads.zzaqf zzaqfVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzaqfVar.zza - ((com.google.android.gms.internal.ads.zzaqf) this.zza.get(str)).zza;
        } else {
            this.zzb += zzaqfVar.zza;
        }
        this.zza.put(str, zzaqfVar);
    }

    private final void zzp(java.lang.String str) {
        com.google.android.gms.internal.ads.zzaqf zzaqfVar = (com.google.android.gms.internal.ads.zzaqf) this.zza.remove(str);
        if (zzaqfVar != null) {
            this.zzb -= zzaqfVar.zza;
        }
    }

    private static final java.lang.String zzq(java.lang.String str) {
        int length = str.length() / 2;
        return java.lang.String.valueOf(java.lang.String.valueOf(str.substring(0, length).hashCode())).concat(java.lang.String.valueOf(java.lang.String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized com.google.android.gms.internal.ads.zzaov zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzaqf zzaqfVar = (com.google.android.gms.internal.ads.zzaqf) this.zza.get(str);
        if (zzaqfVar == null) {
            return null;
        }
        java.io.File fileZzg = zzg(str);
        try {
            com.google.android.gms.internal.ads.zzaqg zzaqgVar = new com.google.android.gms.internal.ads.zzaqg(new java.io.BufferedInputStream(new java.io.FileInputStream(fileZzg)), fileZzg.length());
            try {
                com.google.android.gms.internal.ads.zzaqf zzaqfVarZza = com.google.android.gms.internal.ads.zzaqf.zza(zzaqgVar);
                if (!android.text.TextUtils.equals(str, zzaqfVarZza.zzb)) {
                    com.google.android.gms.internal.ads.zzapy.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzaqfVarZza.zzb);
                    zzp(str);
                    zzaqgVar.close();
                    return null;
                }
                byte[] bArrZzm = zzm(zzaqgVar, zzaqgVar.zza());
                com.google.android.gms.internal.ads.zzaov zzaovVar = new com.google.android.gms.internal.ads.zzaov();
                zzaovVar.zza = bArrZzm;
                zzaovVar.zzb = zzaqfVar.zzc;
                zzaovVar.zzc = zzaqfVar.zzd;
                zzaovVar.zzd = zzaqfVar.zze;
                zzaovVar.zze = zzaqfVar.zzf;
                zzaovVar.zzf = zzaqfVar.zzg;
                java.util.List<com.google.android.gms.internal.ads.zzape> list = zzaqfVar.zzh;
                java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
                for (com.google.android.gms.internal.ads.zzape zzapeVar : list) {
                    treeMap.put(zzapeVar.zza(), zzapeVar.zzb());
                }
                zzaovVar.zzg = treeMap;
                zzaovVar.zzh = java.util.Collections.unmodifiableList(zzaqfVar.zzh);
                zzaqgVar.close();
                return zzaovVar;
            } catch (java.lang.Throwable th) {
                zzaqgVar.close();
                throw th;
            }
        } catch (java.io.IOException e) {
            com.google.android.gms.internal.ads.zzapy.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzb() {
        try {
            java.io.File fileZza = this.zzc.zza();
            if (fileZza.exists()) {
                java.io.File[] fileArrListFiles = fileZza.listFiles();
                if (fileArrListFiles != null) {
                    for (java.io.File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            com.google.android.gms.internal.ads.zzaqg zzaqgVar = new com.google.android.gms.internal.ads.zzaqg(new java.io.BufferedInputStream(new java.io.FileInputStream(file)), length);
                            try {
                                com.google.android.gms.internal.ads.zzaqf zzaqfVarZza = com.google.android.gms.internal.ads.zzaqf.zza(zzaqgVar);
                                zzaqfVarZza.zza = length;
                                zzo(zzaqfVarZza.zzb, zzaqfVarZza);
                                zzaqgVar.close();
                            } catch (java.lang.Throwable th) {
                                zzaqgVar.close();
                                throw th;
                            }
                        } catch (java.io.IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileZza.mkdirs()) {
                com.google.android.gms.internal.ads.zzapy.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzc(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzaov zzaovVarZza = zza(str);
        if (zzaovVarZza != null) {
            zzaovVarZza.zzf = 0L;
            zzaovVarZza.zze = 0L;
            zzd(str, zzaovVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzd(java.lang.String str, com.google.android.gms.internal.ads.zzaov zzaovVar) {
        long j = this.zzb;
        int length = zzaovVar.zza.length;
        long j2 = j + ((long) length);
        int i = this.zzd;
        if (j2 <= i || length <= i * 0.9f) {
            java.io.File fileZzg = zzg(str);
            try {
                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(fileZzg));
                com.google.android.gms.internal.ads.zzaqf zzaqfVar = new com.google.android.gms.internal.ads.zzaqf(str, zzaovVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzaqfVar.zzb);
                    java.lang.String str2 = zzaqfVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzaqfVar.zzd);
                    zzk(bufferedOutputStream, zzaqfVar.zze);
                    zzk(bufferedOutputStream, zzaqfVar.zzf);
                    zzk(bufferedOutputStream, zzaqfVar.zzg);
                    java.util.List<com.google.android.gms.internal.ads.zzape> list = zzaqfVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (com.google.android.gms.internal.ads.zzape zzapeVar : list) {
                            zzl(bufferedOutputStream, zzapeVar.zza());
                            zzl(bufferedOutputStream, zzapeVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzaovVar.zza);
                    bufferedOutputStream.close();
                    zzaqfVar.zza = fileZzg.length();
                    zzo(str, zzaqfVar);
                    if (this.zzb >= this.zzd) {
                        if (com.google.android.gms.internal.ads.zzapy.zzb) {
                            com.google.android.gms.internal.ads.zzapy.zzd("Pruning old cache entries.", new java.lang.Object[0]);
                        }
                        long j3 = this.zzb;
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        java.util.Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            com.google.android.gms.internal.ads.zzaqf zzaqfVar2 = (com.google.android.gms.internal.ads.zzaqf) ((java.util.Map.Entry) it.next()).getValue();
                            if (zzg(zzaqfVar2.zzb).delete()) {
                                this.zzb -= zzaqfVar2.zza;
                            } else {
                                java.lang.String str3 = zzaqfVar2.zzb;
                                com.google.android.gms.internal.ads.zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (this.zzb < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (com.google.android.gms.internal.ads.zzapy.zzb) {
                            com.google.android.gms.internal.ads.zzapy.zzd("pruned %d files, %d bytes, %d ms", java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(this.zzb - j3), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (java.io.IOException e) {
                    com.google.android.gms.internal.ads.zzapy.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    com.google.android.gms.internal.ads.zzapy.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                    throw new java.io.IOException();
                }
            } catch (java.io.IOException unused) {
                if (!fileZzg.delete()) {
                    com.google.android.gms.internal.ads.zzapy.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    com.google.android.gms.internal.ads.zzapy.zza("Re-initializing cache after external clearing.", new java.lang.Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final java.io.File zzg(java.lang.String str) {
        return new java.io.File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(java.lang.String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        com.google.android.gms.internal.ads.zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqi(java.io.File file, int i) {
        this.zzc = new com.google.android.gms.internal.ads.zzaqe(this, file);
    }
}
