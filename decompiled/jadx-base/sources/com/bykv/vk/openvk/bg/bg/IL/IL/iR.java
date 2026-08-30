package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
class iR extends com.bykv.vk.openvk.bg.bg.IL.IL.bg {
    private final com.bykv.vk.openvk.bg.bg.IL.IL.eqN Lq;
    private final java.net.Socket Ta;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.IL vb;
    private volatile boolean xxp;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX yDt;

    public interface bX {
        void IL(com.bykv.vk.openvk.bg.bg.IL.IL.iR iRVar);

        void bg(com.bykv.vk.openvk.bg.bg.IL.IL.iR iRVar);
    }

    iR(com.bykv.vk.openvk.bg.bg.IL.IL.iR.bg bgVar) {
        super(bgVar.bg, bgVar.IL);
        this.xxp = true;
        this.Ta = bgVar.bX;
        this.yDt = bgVar.eqN;
        this.Lq = com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX();
    }

    private com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL Kg() {
        try {
            this.WR = com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg(this.Ta.getInputStream());
            java.io.OutputStream outputStream = this.Ta.getOutputStream();
            com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg bgVar = this.WR.bX.bg == 1 ? com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg : com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL;
            if (bgVar == null) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.bg = bgVar;
            this.iR = this.WR.bX.IL;
            this.Kg = this.WR.bX.bX;
            this.eo = new com.bykv.vk.openvk.bg.bg.IL.IL.PX(this.WR.bX.iR);
            this.ldr = this.WR.IL;
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.WR.toString());
            }
            return new com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL(outputStream, this.WR.bX.eqN);
        } catch (com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN e) {
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(this.Ta);
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e));
            }
            if (this.bg != null) {
                java.lang.Boolean.valueOf(iR());
            }
            java.lang.String str = this.iR;
            return null;
        } catch (java.io.IOException e2) {
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(this.Ta);
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e2));
            }
            if (this.bg != null) {
                java.lang.Boolean.valueOf(iR());
            }
            java.lang.String str2 = this.iR;
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg;
        com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL ilKg = Kg();
        if (ilKg == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX bXVar = this.yDt;
        if (bXVar != null) {
            bXVar.bg(this);
        }
        this.bg.bg(this.Kg);
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.Kg != 0 && ((bgVarBg = this.IL.bg(this.Kg, this.WR.bX.bg)) == null || this.bg.bX(this.Kg).length() < bgVarBg.bX)) {
            this.Lq.bg(iR(), this.Kg);
        }
        try {
            bg(ilKg);
        } catch (com.bykv.vk.openvk.bg.bg.IL.IL.bX.bg e) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e));
            }
        } catch (java.lang.Throwable th) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(th));
            }
        }
        this.bg.IL(this.Kg);
        this.Lq.bg(iR(), null);
        bg();
        com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(this.Ta);
        com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX bXVar2 = this.yDt;
        if (bXVar2 != null) {
            bXVar2.IL(this);
        }
    }

    private boolean bg(com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il) throws java.lang.Throwable {
        while (this.eo.bg()) {
            zx();
            com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVarIL = this.eo.IL();
            try {
                bg(il, bgVarIL);
                return true;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg e) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e));
                }
                this.xxp = false;
                java.lang.Boolean.valueOf(iR());
                java.lang.String str = this.iR;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL e2) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e2));
                }
                return false;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX unused) {
                bgVarIL.bg();
                java.lang.Boolean.valueOf(iR());
                java.lang.String str2 = this.iR;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.bX.eqN e3) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e3));
                }
                return true;
            } catch (java.io.IOException e4) {
                if (e4 instanceof java.net.SocketTimeoutException) {
                    bgVarIL.IL();
                }
                if (IL()) {
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        if ("Canceled".equalsIgnoreCase(e4.getMessage())) {
                            android.util.Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                        } else {
                            android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e4));
                        }
                    }
                } else {
                    java.lang.Boolean.valueOf(iR());
                    java.lang.String str3 = this.iR;
                }
            } catch (java.lang.Exception e5) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_ProxyTask", android.util.Log.getStackTraceString(e5));
                }
            }
        }
        return false;
    }

    private void bg(com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il, com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar) throws java.lang.Throwable {
        if ("HEAD".equalsIgnoreCase(this.WR.bg.bg)) {
            IL(il, bgVar);
        } else {
            bX(il, bgVar);
        }
    }

    private void IL(com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il, com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar) throws java.io.IOException, com.bykv.vk.openvk.bg.bg.IL.IL.bX.eqN {
        byte[] bArrBg = bg(this.IL.bg(this.Kg, this.WR.bX.bg), il, bgVar);
        if (bArrBg == null) {
            return;
        }
        il.bg(bArrBg, 0, bArrBg.length);
    }

    private void bX(com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il, com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar) throws java.lang.Throwable {
        if (this.xxp) {
            java.io.File fileBX = this.bg.bX(this.Kg);
            long length = fileBX.length();
            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg = this.IL.bg(this.Kg, this.WR.bX.bg);
            int iIL = il.IL();
            if (length > il.IL()) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + (length - ((long) iIL)));
                }
                bg(bgVarBg, fileBX, il, bgVar);
                return;
            }
        } else {
            il.IL();
        }
        eqN(il, bgVar);
    }

    private byte[] bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar, com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il, com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar2) throws java.io.IOException {
        if (bgVar != null) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVar, il.IL()).getBytes(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg);
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVarBg = bg(bgVar2, 0, -1, "HEAD");
        if (bgVarBg == null) {
            return null;
        }
        try {
            java.lang.String strBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg, false, false);
            if (strBg != null) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX(strBg + ", rawKey: " + this.iR + ", url: " + bgVar2);
            }
            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg2 = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg, this.IL, this.Kg, this.WR.bX.bg);
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.w("TAG_PROXY_ProxyTask", "get header from network");
            }
            byte[] bytes = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2, il.IL()).getBytes(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg);
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg.eqN());
            return bytes;
        } catch (java.lang.Throwable th) {
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg.eqN());
            throw th;
        }
    }

    private void bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar, java.io.File file, com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il, com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar2) throws java.lang.Throwable {
        final com.bytedance.sdk.component.Kg.iR iRVar;
        com.bykv.vk.openvk.bg.bg.IL.IL.IL il2;
        if (!il.bg()) {
            byte[] bArrBg = bg(bgVar, il, bgVar2);
            zx();
            if (bArrBg == null) {
                return;
            } else {
                il.bg(bArrBg, 0, bArrBg.length);
            }
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.Kg kg = null;
        if (bgVar == null && (bgVar = this.IL.bg(this.Kg, this.WR.bX.bg)) == null) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_ProxyTask", "failed to get video header info from db");
            }
            bg(null, il, bgVar2);
            bgVar = this.IL.bg(this.Kg, this.WR.bX.bg);
            if (bgVar == null) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX("failed to get header, rawKey: " + this.iR + ", url: " + bgVar2);
            }
        }
        if (file.length() >= bgVar.bX || !((il2 = this.vb) == null || il2.IL() || il2.eqN())) {
            iRVar = null;
        } else {
            com.bykv.vk.openvk.bg.bg.IL.IL.IL ilBg = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg().bg(this.bg).bg(this.IL).bg(this.iR).IL(this.Kg).bg(new com.bykv.vk.openvk.bg.bg.IL.IL.PX(bgVar2.bg)).bg(this.ldr).bg(this.WR).bg(new com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.iR.1
                @Override // com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL
                public void bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL il3) {
                    com.bykv.vk.openvk.bg.bg.IL.IL.iR.this.bX.addAndGet(il3.bX.get());
                    com.bykv.vk.openvk.bg.bg.IL.IL.iR.this.eqN.addAndGet(il3.eqN.get());
                    synchronized (il3.Ta) {
                        il3.Ta.notifyAll();
                    }
                    if (il3.eqN()) {
                        com.bykv.vk.openvk.bg.bg.IL.IL.iR.this.Lq.bg(com.bykv.vk.openvk.bg.bg.IL.IL.iR.this.iR(), null);
                    }
                }
            }).bg();
            this.vb = ilBg;
            iRVar = new com.bytedance.sdk.component.Kg.iR(ilBg, null, 10, 1);
            com.bytedance.sdk.component.Kg.ldr.IL(new com.bytedance.sdk.component.Kg.Kg("processCacheNetWorkConcurrent") { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.iR.2
                @Override // java.lang.Runnable
                public void run() {
                    iRVar.run();
                }
            });
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_ProxyTask", "fire download in process cache task");
            }
        }
        byte[] bArr = new byte[8192];
        try {
            com.bykv.vk.openvk.bg.bg.IL.IL.Kg kg2 = new com.bykv.vk.openvk.bg.bg.IL.IL.Kg(file, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            try {
                kg2.bg(il.IL());
                int iMin = this.WR.bX.zx > 0 ? java.lang.Math.min(bgVar.bX, this.WR.bX.zx) : bgVar.bX;
                while (il.IL() < iMin) {
                    zx();
                    int iBg = kg2.bg(bArr);
                    if (iBg <= 0) {
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL il3 = this.vb;
                        if (il3 != null) {
                            com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL ilWR = il3.WR();
                            if (ilWR != null) {
                                throw ilWR;
                            }
                            com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg bgVarKg = il3.Kg();
                            if (bgVarKg != null) {
                                throw bgVarKg;
                            }
                        }
                        if (il3 != null && !il3.IL() && !il3.eqN()) {
                            zx();
                            synchronized (il3.Ta) {
                                try {
                                    il3.Ta.wait(1000L);
                                } catch (java.lang.InterruptedException unused) {
                                }
                            }
                        }
                        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                            android.util.Log.e("TAG_PROXY_ProxyTask", "download task has finished!!!");
                        }
                        throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX("illegal state download task has finished, rawKey: " + this.iR + ", url: " + bgVar2);
                    }
                    il.IL(bArr, 0, iBg);
                    zx();
                }
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_ProxyTask", "read cache file complete: " + il.IL() + ", " + iMin);
                }
                bX();
                kg2.bg();
                if (iRVar != null) {
                    try {
                        iRVar.get();
                    } catch (java.lang.Throwable unused2) {
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                kg = kg2;
                if (kg != null) {
                    kg.bg();
                }
                if (iRVar != null) {
                    try {
                        iRVar.get();
                    } catch (java.lang.Throwable unused3) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private void eqN(com.bykv.vk.openvk.bg.bg.IL.IL.iR.IL il, com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar) throws java.lang.Throwable {
        com.bykv.vk.openvk.bg.bg.IL.IL.Kg kg;
        WR();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int iIL = il.IL();
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVarBg = bg(bgVar, iIL, this.WR.bX.zx, "GET");
        if (bgVarBg == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.Kg kg2 = null;
        int i = 0;
        try {
            java.lang.String strBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg, false, true);
            if (strBg != null) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX(strBg + ", rawKey: " + this.iR + ", url: " + bgVar);
            }
            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg2 = this.IL.bg(this.Kg, ldr());
            int iBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg);
            if (bgVarBg2 != null && bgVarBg2.bX != iBg) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_ProxyTask", "Content-Length not match, old: " + bgVarBg2.bX + ", " + iBg + ", key: " + this.Kg);
                }
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL("Content-Length not match, old length: " + bgVarBg2.bX + ", new length: " + iBg + ", rawKey: " + this.iR + ", currentUrl: " + bgVar + ", previousInfo: " + bgVarBg2.zx);
            }
            if (!il.bg()) {
                java.lang.String strBg2 = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg, iIL);
                zx();
                byte[] bytes = strBg2.getBytes(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg);
                il.bg(bytes, 0, bytes.length);
            }
            zx();
            java.io.File fileEqN = this.bg.eqN(this.Kg);
            if (this.xxp && fileEqN != null && fileEqN.length() >= il.IL()) {
                com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg, this.IL, this.Kg, this.WR.bX.bg);
                try {
                    kg = new com.bykv.vk.openvk.bg.bg.IL.IL.Kg(fileEqN, "rwd");
                    try {
                        kg.bg(il.IL());
                    } catch (java.lang.Throwable th) {
                        th = th;
                        kg2 = kg;
                    }
                } catch (com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg unused) {
                    kg = null;
                }
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_ProxyTask", "can write to cache file in network task, cache file size: " + fileEqN.length() + ", from: " + il.IL());
                }
            } else {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.w("TAG_PROXY_ProxyTask", "can't write to cache file in network task, cache file size: " + fileEqN.length() + ", from: " + il.IL());
                }
                kg = null;
            }
            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg3 = this.IL.bg(this.Kg, ldr());
            int i2 = bgVarBg3 == null ? 0 : bgVarBg3.bX;
            byte[] bArr = new byte[8192];
            java.io.InputStream inputStreamEqN = bgVarBg.eqN();
            int i3 = 0;
            while (true) {
                try {
                    int i4 = inputStreamEqN.read(bArr);
                    if (i4 < 0) {
                        break;
                    }
                    zx();
                    if (i4 > 0) {
                        il.IL(bArr, 0, i4);
                        i3 += i4;
                        if (kg != null) {
                            try {
                                kg.bg(bArr, 0, i4);
                            } catch (java.lang.Throwable th2) {
                                kg.bg();
                                try {
                                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                                        android.util.Log.e("TAG_PROXY_ProxyTask", "append to cache file error in network task!!! " + android.util.Log.getStackTraceString(th2));
                                    }
                                    kg = null;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                        bg(i2, il.IL());
                    }
                    zx();
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    kg2 = kg;
                }
                th = th4;
                kg2 = kg;
                i = i3;
                com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg.eqN());
                if (kg2 != null) {
                    kg2.bg();
                }
                this.bX.addAndGet(i);
                this.eqN.addAndGet(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
                throw th;
            }
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_ProxyTask", "read from net complete!");
            }
            bX();
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg.eqN());
            if (kg != null) {
                kg.bg();
            }
            this.bX.addAndGet(i3);
            this.eqN.addAndGet(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.bg
    public void bg() {
        super.bg();
        WR();
    }

    private void WR() {
        com.bykv.vk.openvk.bg.bg.IL.IL.IL il = this.vb;
        this.vb = null;
        if (il != null) {
            il.bg();
        }
    }

    private static class IL {
        private int IL;
        private boolean bX;
        private final java.io.OutputStream bg;

        IL(java.io.OutputStream outputStream, int i) {
            this.bg = outputStream;
            this.IL = i;
        }

        boolean bg() {
            return this.bX;
        }

        void bg(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.bg.bg.IL.IL.bX.eqN {
            if (this.bX) {
                return;
            }
            try {
                this.bg.write(bArr, i, i2);
                this.bX = true;
            } catch (java.io.IOException e) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.eqN(e);
            }
        }

        void IL(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.bg.bg.IL.IL.bX.eqN {
            try {
                this.bg.write(bArr, i, i2);
                this.IL += i2;
            } catch (java.io.IOException e) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.eqN(e);
            }
        }

        int IL() {
            return this.IL;
        }
    }

    static final class bg {
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX IL;
        java.net.Socket bX;
        com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg bg;
        com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX eqN;

        bg() {
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.iR.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar) {
            if (bXVar == null) {
                throw new java.lang.IllegalArgumentException("db == null");
            }
            this.IL = bXVar;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.iR.bg bg(java.net.Socket socket) {
            if (socket == null) {
                throw new java.lang.IllegalArgumentException("socket == null");
            }
            this.bX = socket;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.iR.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX bXVar) {
            this.eqN = bXVar;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.iR bg() {
            if (this.IL == null || this.bX == null) {
                throw new java.lang.IllegalArgumentException();
            }
            return new com.bykv.vk.openvk.bg.bg.IL.IL.iR(this);
        }
    }
}
