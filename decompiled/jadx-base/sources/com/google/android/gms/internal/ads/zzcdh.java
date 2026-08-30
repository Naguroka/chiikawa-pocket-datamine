package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcdh extends com.google.android.gms.internal.ads.zzcde {
    public static final /* synthetic */ int zzd = 0;
    private static final java.util.Set zze = java.util.Collections.synchronizedSet(new java.util.HashSet());
    private static final java.text.DecimalFormat zzf = new java.text.DecimalFormat("#,###");
    private java.io.File zzg;
    private boolean zzh;

    public zzcdh(com.google.android.gms.internal.ads.zzcbs zzcbsVar) {
        super(zzcbsVar);
        java.io.File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context.getCacheDir() returned null");
            return;
        }
        java.io.File file = new java.io.File(com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzfpu.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create preload cache directory at ".concat(java.lang.String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not set cache file permissions at ".concat(java.lang.String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final java.io.File zza(java.io.File file) {
        return new java.io.File(com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzfpu.zza(), this.zzg, java.lang.String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x035e A[Catch: RuntimeException -> 0x03ab, IOException -> 0x03ad, TryCatch #5 {IOException -> 0x03ad, blocks: (B:96:0x02a2, B:130:0x0354, B:132:0x035e, B:133:0x0381, B:135:0x038c, B:138:0x0397), top: B:185:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x038c A[Catch: RuntimeException -> 0x03ab, IOException -> 0x03ad, TRY_LEAVE, TryCatch #5 {IOException -> 0x03ad, blocks: (B:96:0x02a2, B:130:0x0354, B:132:0x035e, B:133:0x0381, B:135:0x038c, B:138:0x0397), top: B:185:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:167:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:171:0x0410  */
    /* JADX WARN: Code duplicated, block: B:183:0x0394 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[LOOP:3: B:84:0x0259->B:222:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0177 A[Catch: RuntimeException -> 0x03bf, IOException | RuntimeException -> 0x03c1, TryCatch #16 {IOException | RuntimeException -> 0x03c1, blocks: (B:51:0x010f, B:53:0x0123, B:69:0x0171, B:71:0x0177, B:73:0x0198, B:75:0x01b1, B:77:0x01eb), top: B:203:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0198 A[Catch: RuntimeException -> 0x03bf, IOException | RuntimeException -> 0x03c1, TryCatch #16 {IOException | RuntimeException -> 0x03c1, blocks: (B:51:0x010f, B:53:0x0123, B:69:0x0171, B:71:0x0177, B:73:0x0198, B:75:0x01b1, B:77:0x01eb), top: B:203:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1 A[Catch: RuntimeException -> 0x03bf, IOException | RuntimeException -> 0x03c1, TryCatch #16 {IOException | RuntimeException -> 0x03c1, blocks: (B:51:0x010f, B:53:0x0123, B:69:0x0171, B:71:0x0177, B:73:0x0198, B:75:0x01b1, B:77:0x01eb), top: B:203:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01eb A[Catch: RuntimeException -> 0x03bf, IOException | RuntimeException -> 0x03c1, TRY_LEAVE, TryCatch #16 {IOException | RuntimeException -> 0x03c1, blocks: (B:51:0x010f, B:53:0x0123, B:69:0x0171, B:71:0x0177, B:73:0x0198, B:75:0x01b1, B:77:0x01eb), top: B:203:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0252  */
    /* JADX WARN: Code duplicated, block: B:88:0x0270 A[Catch: IOException | RuntimeException -> 0x030e, IOException -> 0x0310, TryCatch #22 {IOException | RuntimeException -> 0x030e, blocks: (B:83:0x0256, B:84:0x0259, B:86:0x025f, B:88:0x0270, B:90:0x0276, B:92:0x027c), top: B:192:0x0256 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0276 A[Catch: IOException | RuntimeException -> 0x030e, IOException -> 0x0310, TryCatch #22 {IOException | RuntimeException -> 0x030e, blocks: (B:83:0x0256, B:84:0x0259, B:86:0x025f, B:88:0x0270, B:90:0x0276, B:92:0x027c), top: B:192:0x0256 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x027c A[Catch: IOException | RuntimeException -> 0x030e, IOException -> 0x0310, TRY_LEAVE, TryCatch #22 {IOException | RuntimeException -> 0x030e, blocks: (B:83:0x0256, B:84:0x0259, B:86:0x025f, B:88:0x0270, B:90:0x0276, B:92:0x027c), top: B:192:0x0256 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x035e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x03dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x03f4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0177, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01b1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01eb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(final java.lang.String str) {
        int i;
        java.lang.String str2;
        java.lang.String str3;
        int contentLength;
        java.lang.String str4;
        int iIntValue;
        java.nio.channels.ReadableByteChannel readableByteChannelNewChannel;
        java.io.FileOutputStream fileOutputStream;
        java.lang.String str5;
        java.nio.channels.FileChannel channel;
        java.nio.ByteBuffer byteBufferAllocate;
        com.google.android.gms.common.util.Clock clockZzC;
        long jCurrentTimeMillis;
        com.google.android.gms.ads.internal.util.zzbx zzbxVar;
        long jLongValue;
        int i2;
        int i3;
        java.lang.String str6;
        java.nio.ByteBuffer byteBuffer;
        java.lang.String str7;
        boolean zDelete;
        java.io.FileOutputStream fileOutputStream2 = null;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            java.io.File file = this.zzg;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (java.io.File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i <= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzq)).intValue()) {
                java.io.File file3 = new java.io.File(com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzfpu.zza(), this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
                java.io.File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length = (int) file3.length();
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Stream cache hit at ".concat(java.lang.String.valueOf(str)));
                    zzh(str, file3.getAbsolutePath(), length);
                    return true;
                }
                java.lang.String strValueOf = java.lang.String.valueOf(this.zzg.getAbsolutePath());
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                java.util.Set set = zze;
                java.lang.String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    if (set.contains(strConcat)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache already in progress at " + str);
                        zzg(str, file3.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    java.lang.String str8 = "error";
                    try {
                        java.net.HttpURLConnection httpURLConnectionZzn = com.google.android.gms.internal.ads.zzfqr.zza().zzn(new com.google.android.gms.internal.ads.zzfqq() { // from class: com.google.android.gms.internal.ads.zzcdg
                            @Override // com.google.android.gms.internal.ads.zzfqq
                            public final java.net.URLConnection zza() throws java.io.IOException {
                                int i4 = com.google.android.gms.internal.ads.zzcdh.zzd;
                                com.google.android.gms.ads.internal.zzv.zzx();
                                int iIntValue2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzM)).intValue();
                                java.net.URL url = new java.net.URL(str);
                                int i5 = 0;
                                while (true) {
                                    i5++;
                                    if (i5 > 20) {
                                        throw new java.io.IOException("Too many redirects (20)");
                                    }
                                    java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
                                    uRLConnectionOpenConnection.setConnectTimeout(iIntValue2);
                                    uRLConnectionOpenConnection.setReadTimeout(iIntValue2);
                                    if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
                                        throw new java.io.IOException("Invalid protocol.");
                                    }
                                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
                                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                    zzlVar.zzc(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode = httpURLConnection.getResponseCode();
                                    zzlVar.zze(httpURLConnection, responseCode);
                                    if (responseCode / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                                    if (headerField == null) {
                                        throw new java.io.IOException("Missing Location header in redirect");
                                    }
                                    java.net.URL url2 = new java.net.URL(url, headerField);
                                    java.lang.String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new java.io.IOException("Protocol is null");
                                    }
                                    if (!protocol.equals(androidx.webkit.ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                                        throw new java.io.IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    com.google.android.gms.ads.internal.util.client.zzo.zze("Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if (httpURLConnectionZzn instanceof java.net.HttpURLConnection) {
                            java.net.HttpURLConnection httpURLConnection = httpURLConnectionZzn;
                            int responseCode = httpURLConnectionZzn.getResponseCode();
                            if (responseCode < 400) {
                                contentLength = httpURLConnectionZzn.getContentLength();
                                if (contentLength < 0) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache aborted, missing content-length header at " + str);
                                    zzg(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                str4 = zzf.format(contentLength);
                                iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzr)).intValue();
                                if (contentLength > iIntValue) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Content length " + str4 + " exceeds limit at " + str);
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append("File too big for full file cache. Size: ");
                                    sb.append(str4);
                                    zzg(str, file3.getAbsolutePath(), "sizeExceeded", sb.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Caching " + str4 + " bytes from " + str);
                                readableByteChannelNewChannel = java.nio.channels.Channels.newChannel(httpURLConnectionZzn.getInputStream());
                                fileOutputStream = new java.io.FileOutputStream(file3);
                                try {
                                    channel = fileOutputStream.getChannel();
                                    byteBufferAllocate = java.nio.ByteBuffer.allocate(1048576);
                                    clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
                                    jCurrentTimeMillis = clockZzC.currentTimeMillis();
                                    zzbxVar = new com.google.android.gms.ads.internal.util.zzbx(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzL)).longValue());
                                    com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zzK;
                                    com.google.android.gms.internal.ads.zzbcj zzbcjVarZzc = com.google.android.gms.ads.internal.client.zzbe.zzc();
                                    jLongValue = ((java.lang.Long) zzbcjVarZzc.zza(zzbccVar)).longValue();
                                    i2 = 0;
                                    while (true) {
                                        i3 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i3 < 0) {
                                            i2 += i3;
                                            try {
                                                try {
                                                    if (i2 <= iIntValue) {
                                                        java.lang.String str9 = "File too big for full file cache. Size: " + java.lang.Integer.toString(i2);
                                                        throw new java.io.IOException("stream cache file size limit exceeded");
                                                    }
                                                    try {
                                                        byteBufferAllocate.flip();
                                                        while (channel.write(byteBufferAllocate) > 0) {
                                                        }
                                                        byteBufferAllocate.clear();
                                                        if (clockZzC.currentTimeMillis() - jCurrentTimeMillis <= 1000 * jLongValue) {
                                                            java.lang.String str10 = "Timeout exceeded. Limit: " + java.lang.Long.toString(jLongValue) + " sec";
                                                            throw new java.io.IOException("stream cache time limit exceeded");
                                                        }
                                                        byteBuffer = byteBufferAllocate;
                                                        if (!this.zzh) {
                                                            throw new java.io.IOException("abort requested");
                                                        }
                                                        if (zzbxVar.zzb()) {
                                                            str5 = str8;
                                                            try {
                                                                str6 = strConcat;
                                                                fileOutputStream = fileOutputStream;
                                                                try {
                                                                    try {
                                                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzccy(this, str, file3.getAbsolutePath(), i2, contentLength, false));
                                                                    } catch (java.io.IOException e) {
                                                                        e = e;
                                                                        str2 = str6;
                                                                        str8 = str5;
                                                                        fileOutputStream2 = fileOutputStream;
                                                                        str3 = 0;
                                                                        if (e instanceof java.lang.RuntimeException) {
                                                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                                                        }
                                                                        fileOutputStream2.close();
                                                                        if (this.zzh) {
                                                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                                        } else {
                                                                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                        }
                                                                        if (file3.exists()) {
                                                                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                                                        }
                                                                        zzg(str, file3.getAbsolutePath(), str8, str3);
                                                                        zze.remove(str2);
                                                                        return false;
                                                                    }
                                                                } catch (java.lang.RuntimeException e2) {
                                                                    e = e2;
                                                                    str2 = str6;
                                                                    str8 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str3 = 0;
                                                                    if (e instanceof java.lang.RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.zzh) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                                    } else {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                    }
                                                                    if (file3.exists()) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                                                    }
                                                                    zzg(str, file3.getAbsolutePath(), str8, str3);
                                                                    zze.remove(str2);
                                                                    return false;
                                                                }
                                                            } catch (java.io.IOException e3) {
                                                                e = e3;
                                                                str2 = strConcat;
                                                                str8 = str5;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = 0;
                                                                if (e instanceof java.lang.RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.zzh) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                zzg(str, file3.getAbsolutePath(), str8, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            } catch (java.lang.RuntimeException e4) {
                                                                e = e4;
                                                                str2 = strConcat;
                                                                str8 = str5;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = 0;
                                                                if (e instanceof java.lang.RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.zzh) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                zzg(str, file3.getAbsolutePath(), str8, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            }
                                                        } else {
                                                            fileOutputStream = fileOutputStream;
                                                            str6 = strConcat;
                                                            str5 = str8;
                                                        }
                                                        byteBufferAllocate = byteBuffer;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        str8 = str5;
                                                        zzbxVar = zzbxVar;
                                                        strConcat = str6;
                                                        channel = channel;
                                                        fileOutputStream = fileOutputStream;
                                                        iIntValue = iIntValue;
                                                        contentLength = contentLength;
                                                    } catch (java.io.IOException | java.lang.RuntimeException e5) {
                                                        e = e5;
                                                        str5 = str8;
                                                    }
                                                    str2 = strConcat;
                                                } catch (java.io.IOException | java.lang.RuntimeException e6) {
                                                    e = e6;
                                                    str2 = str6;
                                                }
                                            } catch (java.io.IOException | java.lang.RuntimeException e7) {
                                                e = e7;
                                                str3 = zzbcjVarZzc;
                                                str2 = str6;
                                                fileOutputStream2 = fileOutputStream;
                                            }
                                        } else {
                                            fileOutputStream = fileOutputStream;
                                            str6 = strConcat;
                                            str5 = str8;
                                            fileOutputStream.close();
                                            if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zze("Preloaded " + zzf.format(i2) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileZza.isFile()) {
                                                fileZza.setLastModified(java.lang.System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileZza.createNewFile();
                                                } catch (java.io.IOException unused) {
                                                }
                                            }
                                            zzh(str, file3.getAbsolutePath(), i2);
                                            str2 = str6;
                                            try {
                                                zze.remove(str2);
                                                return true;
                                            } catch (java.io.IOException e8) {
                                                e = e8;
                                            } catch (java.lang.RuntimeException e9) {
                                                e = e9;
                                            }
                                        }
                                        str8 = str5;
                                        fileOutputStream2 = fileOutputStream;
                                        str3 = 0;
                                    }
                                } catch (java.io.IOException | java.lang.RuntimeException e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStream;
                                    str2 = strConcat;
                                    str5 = str8;
                                }
                            } else {
                                str8 = "badUrl";
                                try {
                                    java.lang.String str11 = "HTTP request failed. Code: " + java.lang.Integer.toString(responseCode);
                                    try {
                                        throw new java.io.IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (java.io.IOException | java.lang.RuntimeException e11) {
                                        e = e11;
                                        str7 = str11;
                                        str2 = strConcat;
                                        str3 = str7;
                                        if (e instanceof java.lang.RuntimeException) {
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                        }
                                        fileOutputStream2.close();
                                        if (this.zzh) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                        } else {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                        }
                                        if (file3.exists()) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                        }
                                        zzg(str, file3.getAbsolutePath(), str8, str3);
                                        zze.remove(str2);
                                        return false;
                                    }
                                } catch (java.io.IOException | java.lang.RuntimeException e12) {
                                    e = e12;
                                    str7 = null;
                                }
                            }
                        } else {
                            contentLength = httpURLConnectionZzn.getContentLength();
                            if (contentLength < 0) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache aborted, missing content-length header at " + str);
                                zzg(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(strConcat);
                                return false;
                            }
                            str4 = zzf.format(contentLength);
                            iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzr)).intValue();
                            if (contentLength > iIntValue) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Content length " + str4 + " exceeds limit at " + str);
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append("File too big for full file cache. Size: ");
                                sb2.append(str4);
                                zzg(str, file3.getAbsolutePath(), "sizeExceeded", sb2.toString());
                                set.remove(strConcat);
                                return false;
                            }
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Caching " + str4 + " bytes from " + str);
                            readableByteChannelNewChannel = java.nio.channels.Channels.newChannel(httpURLConnectionZzn.getInputStream());
                            fileOutputStream = new java.io.FileOutputStream(file3);
                            channel = fileOutputStream.getChannel();
                            byteBufferAllocate = java.nio.ByteBuffer.allocate(1048576);
                            clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
                            jCurrentTimeMillis = clockZzC.currentTimeMillis();
                            zzbxVar = new com.google.android.gms.ads.internal.util.zzbx(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzL)).longValue());
                            com.google.android.gms.internal.ads.zzbcc zzbccVar2 = com.google.android.gms.internal.ads.zzbcl.zzK;
                            com.google.android.gms.internal.ads.zzbcj zzbcjVarZzc2 = com.google.android.gms.ads.internal.client.zzbe.zzc();
                            jLongValue = ((java.lang.Long) zzbcjVarZzc2.zza(zzbccVar2)).longValue();
                            i2 = 0;
                            while (true) {
                                i3 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                if (i3 < 0) {
                                    fileOutputStream = fileOutputStream;
                                    str6 = strConcat;
                                    str5 = str8;
                                    fileOutputStream.close();
                                    if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
                                        com.google.android.gms.ads.internal.util.client.zzo.zze("Preloaded " + zzf.format(i2) + " bytes from " + str);
                                    }
                                    file3.setReadable(true, false);
                                    if (fileZza.isFile()) {
                                        fileZza.setLastModified(java.lang.System.currentTimeMillis());
                                    } else {
                                        fileZza.createNewFile();
                                    }
                                    zzh(str, file3.getAbsolutePath(), i2);
                                    str2 = str6;
                                    zze.remove(str2);
                                    return true;
                                }
                                i2 += i3;
                                if (i2 <= iIntValue) {
                                    java.lang.String str12 = "File too big for full file cache. Size: " + java.lang.Integer.toString(i2);
                                    throw new java.io.IOException("stream cache file size limit exceeded");
                                }
                                byteBufferAllocate.flip();
                                while (channel.write(byteBufferAllocate) > 0) {
                                }
                                byteBufferAllocate.clear();
                                if (clockZzC.currentTimeMillis() - jCurrentTimeMillis <= 1000 * jLongValue) {
                                    java.lang.String str13 = "Timeout exceeded. Limit: " + java.lang.Long.toString(jLongValue) + " sec";
                                    throw new java.io.IOException("stream cache time limit exceeded");
                                }
                                byteBuffer = byteBufferAllocate;
                                if (!this.zzh) {
                                    throw new java.io.IOException("abort requested");
                                }
                                if (zzbxVar.zzb()) {
                                    str5 = str8;
                                    str6 = strConcat;
                                    fileOutputStream = fileOutputStream;
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzccy(this, str, file3.getAbsolutePath(), i2, contentLength, false));
                                } else {
                                    fileOutputStream = fileOutputStream;
                                    str6 = strConcat;
                                    str5 = str8;
                                }
                                byteBufferAllocate = byteBuffer;
                                readableByteChannelNewChannel = readableByteChannelNewChannel;
                                str8 = str5;
                                zzbxVar = zzbxVar;
                                strConcat = str6;
                                channel = channel;
                                fileOutputStream = fileOutputStream;
                                iIntValue = iIntValue;
                                contentLength = contentLength;
                                str2 = strConcat;
                                str8 = str5;
                                fileOutputStream2 = fileOutputStream;
                                str3 = 0;
                            }
                        }
                    } catch (java.io.IOException | java.lang.RuntimeException e13) {
                        e = e13;
                        str2 = strConcat;
                        str8 = "error";
                        str3 = 0;
                        fileOutputStream2 = null;
                    }
                    if (e instanceof java.lang.RuntimeException) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (java.io.IOException | java.lang.NullPointerException unused2) {
                    }
                    if (this.zzh) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                    }
                    if (file3.exists() && !file3.delete()) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                    }
                    zzg(str, file3.getAbsolutePath(), str8, str3);
                    zze.remove(str2);
                    return false;
                }
            }
            java.io.File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            long j = Long.MAX_VALUE;
            java.io.File file5 = null;
            for (java.io.File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j) {
                        file5 = file6;
                        j = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                java.io.File fileZza2 = zza(file5);
                if (fileZza2.isFile()) {
                    zDelete &= fileZza2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
    }
}
