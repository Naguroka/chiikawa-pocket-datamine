package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
class IL extends com.bykv.vk.openvk.bg.bg.IL.IL.bg {
    private final int Lq;
    final java.lang.Object Ta;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL VzQ;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL vb;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg xxp;
    final java.lang.Object yDt;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.IL$IL, reason: collision with other inner class name */
    public interface InterfaceC0065IL {
        void bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL il);
    }

    IL(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar) {
        super(bgVar.eqN, bgVar.zx);
        this.Lq = bgVar.iR;
        this.vb = bgVar.WR;
        this.Ta = this;
        this.iR = bgVar.bg;
        this.Kg = bgVar.IL;
        this.ldr = bgVar.ldr;
        this.eo = bgVar.bX;
        this.WR = bgVar.Kg;
        this.yDt = bgVar.eo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.bg.bg(this.Kg);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            eo();
        } catch (java.lang.Throwable unused) {
        }
        this.eqN.set(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.bg.IL(this.Kg);
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL interfaceC0065IL = this.vb;
        if (interfaceC0065IL != null) {
            interfaceC0065IL.bg(this);
        }
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg Kg() {
        return this.xxp;
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL WR() {
        return this.VzQ;
    }

    private boolean eo() throws com.bykv.vk.openvk.bg.bg.IL.IL.bX.bg {
        while (this.eo.bg()) {
            zx();
            com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVarIL = this.eo.IL();
            try {
                bg(bgVarIL);
                return true;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.Kg.bg e) {
                this.xxp = e;
                java.lang.Boolean.valueOf(iR());
                java.lang.String str = this.iR;
                return false;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL e2) {
                this.VzQ = e2;
                return false;
            } catch (com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX unused) {
                bgVarIL.bg();
                java.lang.Boolean.valueOf(iR());
                java.lang.String str2 = this.iR;
            } catch (java.io.IOException e3) {
                if (e3 instanceof java.net.SocketTimeoutException) {
                    bgVarIL.IL();
                }
                if (!IL()) {
                    java.lang.Boolean.valueOf(iR());
                    java.lang.String str3 = this.iR;
                }
            } catch (java.lang.Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    private void bg(com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar) throws java.lang.Throwable {
        java.io.File fileBX = this.bg.bX(this.Kg);
        long length = fileBX.length();
        int i = this.Lq;
        if (i > 0 && length >= i) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_DownloadTask", "no necessary to download for " + this.Kg + ", cache file size: " + length + ", max: " + this.Lq);
                return;
            }
            return;
        }
        int iLdr = ldr();
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg = this.IL.bg(this.Kg, iLdr);
        if (bgVarBg != null && length >= bgVarBg.bX) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.i("TAG_PROXY_DownloadTask", "file download complete, key: " + this.Kg);
                return;
            }
            return;
        }
        zx();
        int i2 = (int) length;
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVarBg2 = bg(bgVar, i2, this.Lq, "GET");
        if (bgVarBg2 == null) {
            return;
        }
        boolean z = true;
        com.bykv.vk.openvk.bg.bg.IL.IL.Kg kg = null;
        try {
            zx();
            java.lang.String strBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2, this.WR == null && com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx, true);
            if (strBg != null) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.bX(strBg + ", rawKey: " + this.iR + ", url: " + bgVar);
            }
            int iBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2);
            if (bgVarBg != null && bgVarBg.bX != iBg) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_DownloadTask", "Content-Length not match, old: " + bgVarBg.bX + ", " + iBg + ", key: " + this.Kg);
                }
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.IL("Content-Length not match, old length: " + bgVarBg.bX + ", new length: " + iBg + ", rawKey: " + this.iR + ", currentUrl: " + bgVar + ", previousInfo: " + bgVarBg.zx);
            }
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2, this.IL, this.Kg, iLdr);
            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg3 = this.IL.bg(this.Kg, iLdr);
            int i3 = bgVarBg3 == null ? 0 : bgVarBg3.bX;
            java.io.InputStream inputStreamEqN = bgVarBg2.eqN();
            com.bykv.vk.openvk.bg.bg.IL.IL.Kg kg2 = new com.bykv.vk.openvk.bg.bg.IL.IL.Kg(fileBX, com.bykv.vk.openvk.bg.bg.IL.IL.zx.eqN ? "rwd" : "rw");
            try {
                kg2.bg(length);
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.i("TAG_PROXY_DownloadTask", "preload start from: ".concat(java.lang.String.valueOf(length)));
                }
                byte[] bArr = new byte[8192];
                while (true) {
                    int i4 = inputStreamEqN.read(bArr);
                    if (i4 >= 0) {
                        zx();
                        if (i4 > 0) {
                            kg2.bg(bArr, 0, i4);
                            i2 += i4;
                            if (this.WR != null) {
                                synchronized (this.Ta) {
                                    this.Ta.notifyAll();
                                }
                            }
                            this.bX.addAndGet(i4);
                            bg(i3, i2);
                        }
                        int i5 = this.Lq;
                        if (i5 > 0 && i2 >= i5) {
                            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                                android.util.Log.w("TAG_PROXY_DownloadTask", "download, more data received, currentCacheFileSize: " + i2 + ", max: " + this.Lq);
                            }
                            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2.eqN());
                            kg2.bg();
                            bg();
                            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                                android.util.Log.w("TAG_PROXY_DownloadTask", "cancel call");
                                return;
                            }
                            return;
                        }
                        zx();
                    } else {
                        try {
                            bX();
                            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                                android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
                            }
                            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2.eqN());
                            kg2.bg();
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            kg = kg2;
                            z = false;
                        }
                    }
                    com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(bgVarBg2.eqN());
                    if (kg != null) {
                        kg.bg();
                    }
                    if (z) {
                        bg();
                        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                            android.util.Log.w("TAG_PROXY_DownloadTask", "cancel call");
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                kg = kg2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    static final class bg {
        java.lang.String IL;
        com.bykv.vk.openvk.bg.bg.IL.IL.WR Kg;
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL WR;
        com.bykv.vk.openvk.bg.bg.IL.IL.PX bX;
        java.lang.String bg;
        java.lang.Object eo;
        com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg eqN;
        int iR;
        java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> ldr;
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX zx;

        bg() {
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("rawKey == null");
            }
            this.bg = str;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg IL(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("key == null");
            }
            this.IL = str;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.PX px) {
            if (px == null) {
                throw new java.lang.IllegalArgumentException("urls is empty");
            }
            this.bX = px;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg bgVar) {
            if (bgVar == null) {
                throw new java.lang.IllegalArgumentException("cache == null");
            }
            this.eqN = bgVar;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar) {
            if (bXVar == null) {
                throw new java.lang.IllegalArgumentException("db == null");
            }
            this.zx = bXVar;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list) {
            this.ldr = list;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(int i) {
            this.iR = i;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.InterfaceC0065IL interfaceC0065IL) {
            this.WR = interfaceC0065IL;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.WR wr) {
            this.Kg = wr;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(java.lang.Object obj) {
            this.eo = obj;
            return this;
        }

        com.bykv.vk.openvk.bg.bg.IL.IL.IL bg() {
            if (this.eqN == null || this.zx == null || android.text.TextUtils.isEmpty(this.bg) || android.text.TextUtils.isEmpty(this.IL) || this.bX == null) {
                throw new java.lang.IllegalArgumentException();
            }
            return new com.bykv.vk.openvk.bg.bg.IL.IL.IL(this);
        }
    }
}
