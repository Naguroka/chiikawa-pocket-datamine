package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzaqb implements com.google.android.gms.internal.ads.zzapf {
    protected final com.google.android.gms.internal.ads.zzaqd zza;
    private final com.google.android.gms.internal.ads.zzaqa zzb;

    public zzaqb(com.google.android.gms.internal.ads.zzaqa zzaqaVar) {
        com.google.android.gms.internal.ads.zzaqd zzaqdVar = new com.google.android.gms.internal.ads.zzaqd(4096);
        this.zzb = zzaqaVar;
        this.zza = zzaqdVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:117:0x0230  */
    /* JADX WARN: Code duplicated, block: B:144:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d3  */
    @Override // com.google.android.gms.internal.ads.zzapf
    public com.google.android.gms.internal.ads.zzapi zza(com.google.android.gms.internal.ads.zzapm zzapmVar) throws java.lang.Throwable {
        com.google.android.gms.internal.ads.zzaqk zzaqkVarZza;
        byte[] bArr;
        int iZzb;
        com.google.android.gms.internal.ads.zzaqo zzaqoVar;
        com.google.android.gms.internal.ads.zzapi zzapiVar;
        com.google.android.gms.internal.ads.zzaqo zzaqoVar2;
        int iZzb2;
        java.util.Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZzb;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        while (true) {
            java.util.Collections.emptyList();
            try {
                com.google.android.gms.internal.ads.zzaov zzaovVarZzd = zzapmVar.zzd();
                if (zzaovVarZzd == null) {
                    mapEmptyMap = java.util.Collections.emptyMap();
                } else {
                    java.util.HashMap map = new java.util.HashMap();
                    java.lang.String str = zzaovVarZzd.zzb;
                    if (str != null) {
                        map.put(com.google.common.net.HttpHeaders.IF_NONE_MATCH, str);
                    }
                    long j = zzaovVarZzd.zzd;
                    if (j > 0) {
                        map.put(com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE, com.google.android.gms.internal.ads.zzaqj.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                zzaqkVarZza = this.zzb.zza(zzapmVar, mapEmptyMap);
                try {
                    int iZzb3 = zzaqkVarZza.zzb();
                    java.util.List listZzd = zzaqkVarZza.zzd();
                    if (iZzb3 == 304) {
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        com.google.android.gms.internal.ads.zzaov zzaovVarZzd2 = zzapmVar.zzd();
                        if (zzaovVarZzd2 == null) {
                            return new com.google.android.gms.internal.ads.zzapi(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                        }
                        java.util.TreeSet treeSet = new java.util.TreeSet(java.lang.String.CASE_INSENSITIVE_ORDER);
                        if (!listZzd.isEmpty()) {
                            java.util.Iterator it = listZzd.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((com.google.android.gms.internal.ads.zzape) it.next()).zza());
                            }
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList(listZzd);
                        java.util.List list = zzaovVarZzd2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (com.google.android.gms.internal.ads.zzape zzapeVar : zzaovVarZzd2.zzh) {
                                    if (!treeSet.contains(zzapeVar.zza())) {
                                        arrayList.add(zzapeVar);
                                    }
                                }
                            }
                        } else if (!zzaovVarZzd2.zzg.isEmpty()) {
                            for (java.util.Map.Entry entry : zzaovVarZzd2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new com.google.android.gms.internal.ads.zzape((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
                                }
                            }
                        }
                        return new com.google.android.gms.internal.ads.zzapi(304, zzaovVarZzd2.zza, true, jElapsedRealtime2, (java.util.List) arrayList);
                    }
                    java.io.InputStream inputStreamZzc = zzaqkVarZza.zzc();
                    if (inputStreamZzc != null) {
                        int iZza = zzaqkVarZza.zza();
                        com.google.android.gms.internal.ads.zzaqd zzaqdVar = this.zza;
                        com.google.android.gms.internal.ads.zzaqq zzaqqVar = new com.google.android.gms.internal.ads.zzaqq(zzaqdVar, iZza);
                        try {
                            bArrZzb = zzaqdVar.zzb(1024);
                            while (true) {
                                try {
                                    int i = inputStreamZzc.read(bArrZzb);
                                    if (i == -1) {
                                        break;
                                    }
                                    zzaqqVar.write(bArrZzb, 0, i);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzc.close();
                                    } catch (java.io.IOException unused) {
                                        com.google.android.gms.internal.ads.zzapy.zzd("Error occurred when closing InputStream", new java.lang.Object[0]);
                                    }
                                    zzaqdVar.zza(bArrZzb);
                                    zzaqqVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzaqqVar.toByteArray();
                            try {
                                inputStreamZzc.close();
                            } catch (java.io.IOException unused2) {
                                com.google.android.gms.internal.ads.zzapy.zzd("Error occurred when closing InputStream", new java.lang.Object[0]);
                            }
                            zzaqdVar.zza(bArrZzb);
                            zzaqqVar.close();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            bArrZzb = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    try {
                        long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (com.google.android.gms.internal.ads.zzapy.zzb || jElapsedRealtime3 > androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                            java.lang.Object[] objArr = new java.lang.Object[5];
                            objArr[0] = zzapmVar;
                            objArr[1] = java.lang.Long.valueOf(jElapsedRealtime3);
                            objArr[2] = byteArray != null ? java.lang.Integer.valueOf(byteArray.length) : "null";
                            objArr[3] = java.lang.Integer.valueOf(iZzb3);
                            objArr[4] = java.lang.Integer.valueOf(zzapmVar.zzy().zza());
                            com.google.android.gms.internal.ads.zzapy.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (iZzb3 < 200 || iZzb3 > 299) {
                            throw new java.io.IOException();
                        }
                        return new com.google.android.gms.internal.ads.zzapi(iZzb3, byteArray, false, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                    } catch (java.io.IOException e) {
                        e = e;
                        bArr = byteArray;
                        if (e instanceof java.net.SocketTimeoutException) {
                            zzaqoVar = new com.google.android.gms.internal.ads.zzaqo("socket", new com.google.android.gms.internal.ads.zzapu(), null);
                        } else {
                            if (!(e instanceof java.net.MalformedURLException)) {
                                throw new java.lang.RuntimeException("Bad URL ".concat(java.lang.String.valueOf(zzapmVar.zzk())), e);
                            }
                            if (zzaqkVarZza != null) {
                                throw new com.google.android.gms.internal.ads.zzapj(e);
                            }
                            iZzb = zzaqkVarZza.zzb();
                            com.google.android.gms.internal.ads.zzapy.zzb("Unexpected response code %d for %s", java.lang.Integer.valueOf(iZzb), zzapmVar.zzk());
                            if (bArr != null) {
                                zzapiVar = new com.google.android.gms.internal.ads.zzapi(iZzb, bArr, false, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqkVarZza.zzd());
                                if (iZzb == 401 && iZzb != 403) {
                                    if (iZzb < 400 || iZzb > 499) {
                                        throw new com.google.android.gms.internal.ads.zzapt(zzapiVar);
                                    }
                                    throw new com.google.android.gms.internal.ads.zzaoz(zzapiVar);
                                }
                                zzaqoVar = new com.google.android.gms.internal.ads.zzaqo("auth", new com.google.android.gms.internal.ads.zzaou(zzapiVar), null);
                            } else {
                                zzaqoVar = new com.google.android.gms.internal.ads.zzaqo("network", new com.google.android.gms.internal.ads.zzaph(), null);
                            }
                        }
                        zzaqoVar2 = zzaqoVar;
                        com.google.android.gms.internal.ads.zzapa zzapaVarZzy = zzapmVar.zzy();
                        iZzb2 = zzapmVar.zzb();
                        try {
                            zzapaVarZzy.zzc(zzaqoVar2.zzb);
                            zzapmVar.zzm(java.lang.String.format("%s-retry [timeout=%s]", zzaqoVar2.zza, java.lang.Integer.valueOf(iZzb2)));
                        } catch (com.google.android.gms.internal.ads.zzapv e2) {
                            zzapmVar.zzm(java.lang.String.format("%s-timeout-giveup [timeout=%s]", zzaqoVar2.zza, java.lang.Integer.valueOf(iZzb2)));
                            throw e2;
                        }
                    }
                } catch (java.io.IOException e3) {
                    e = e3;
                    bArr = null;
                    if (e instanceof java.net.SocketTimeoutException) {
                        zzaqoVar = new com.google.android.gms.internal.ads.zzaqo("socket", new com.google.android.gms.internal.ads.zzapu(), null);
                    } else {
                        if (!(e instanceof java.net.MalformedURLException)) {
                            throw new java.lang.RuntimeException("Bad URL ".concat(java.lang.String.valueOf(zzapmVar.zzk())), e);
                        }
                        if (zzaqkVarZza != null) {
                            throw new com.google.android.gms.internal.ads.zzapj(e);
                        }
                        iZzb = zzaqkVarZza.zzb();
                        com.google.android.gms.internal.ads.zzapy.zzb("Unexpected response code %d for %s", java.lang.Integer.valueOf(iZzb), zzapmVar.zzk());
                        if (bArr != null) {
                            zzapiVar = new com.google.android.gms.internal.ads.zzapi(iZzb, bArr, false, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqkVarZza.zzd());
                            if (iZzb == 401) {
                            }
                            zzaqoVar = new com.google.android.gms.internal.ads.zzaqo("auth", new com.google.android.gms.internal.ads.zzaou(zzapiVar), null);
                        } else {
                            zzaqoVar = new com.google.android.gms.internal.ads.zzaqo("network", new com.google.android.gms.internal.ads.zzaph(), null);
                        }
                    }
                    zzaqoVar2 = zzaqoVar;
                    com.google.android.gms.internal.ads.zzapa zzapaVarZzy2 = zzapmVar.zzy();
                    iZzb2 = zzapmVar.zzb();
                    zzapaVarZzy2.zzc(zzaqoVar2.zzb);
                    zzapmVar.zzm(java.lang.String.format("%s-retry [timeout=%s]", zzaqoVar2.zza, java.lang.Integer.valueOf(iZzb2)));
                }
            } catch (java.io.IOException e4) {
                e = e4;
                zzaqkVarZza = null;
            }
            zzapmVar.zzm(java.lang.String.format("%s-retry [timeout=%s]", zzaqoVar2.zza, java.lang.Integer.valueOf(iZzb2)));
        }
    }
}
