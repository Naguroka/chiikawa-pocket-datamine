package com.bytedance.sdk.component.iR.bX;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private com.bytedance.sdk.component.iR.bX.zx Kg;
    private com.bytedance.sdk.component.iR.bX.bg bX;
    private boolean eqN;
    private android.content.Context iR;
    private int tuV;
    private com.bytedance.sdk.component.iR.bX.IL zx;
    private long IL = 0;
    private boolean ldr = false;
    private int WR = 0;
    private long eo = 19700101000L;
    private int VB = 0;
    private java.util.HashMap<java.lang.String, java.lang.Integer> PX = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, java.lang.Integer> Ta = new java.util.HashMap<>();
    private int yDt = 0;
    private java.util.HashMap<java.lang.String, java.lang.Integer> Lq = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, java.lang.Integer> vb = new java.util.HashMap<>();
    private boolean xxp = true;
    private java.util.Map<java.lang.String, java.lang.Integer> VzQ = new java.util.HashMap();
    android.os.Handler bg = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.iR.bX.ldr.1
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 10000) {
                return;
            }
            com.bytedance.sdk.component.iR.bX.ldr.this.IL(message.arg1 != 0);
        }
    };

    private boolean bg(int i) {
        return i >= 200 && i < 400;
    }

    private ldr() {
    }

    public ldr(int i) {
        this.tuV = i;
    }

    public java.lang.String bg() {
        return "ttnet_tnc_config" + this.tuV;
    }

    public com.bytedance.sdk.component.iR.bX.bg IL() {
        return this.bX;
    }

    public void bg(boolean z) {
        this.eqN = z;
    }

    public void bg(com.bytedance.sdk.component.iR.bX.IL il) {
        this.zx = il;
    }

    public boolean bX() {
        return this.eqN;
    }

    public com.bytedance.sdk.component.iR.bX.IL eqN() {
        return this.zx;
    }

    public void zx() {
        this.VzQ.clear();
    }

    public synchronized void bg(android.content.Context context, boolean z) {
        if (!this.ldr) {
            this.iR = context;
            this.xxp = z;
            this.Kg = new com.bytedance.sdk.component.iR.bX.zx(context, z, this.tuV);
            if (z) {
                WR();
            }
            this.bX = com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.tuV, this.iR);
            this.ldr = true;
        }
    }

    private void WR() {
        android.content.SharedPreferences sharedPreferences = this.iR.getSharedPreferences(bg(), 0);
        this.WR = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.eo = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    public com.bytedance.sdk.component.iR.bX.eqN ldr() {
        com.bytedance.sdk.component.iR.bX.zx zxVar = this.Kg;
        if (zxVar != null) {
            return zxVar.bX();
        }
        return null;
    }

    public java.util.Map<java.lang.String, java.lang.String> iR() {
        com.bytedance.sdk.component.iR.bX.eqN eqnLdr = ldr();
        if (eqnLdr != null) {
            return eqnLdr.eqN;
        }
        return null;
    }

    public com.bytedance.sdk.component.iR.bX.zx Kg() {
        return this.Kg;
    }

    public java.lang.String bg(java.lang.String str) {
        java.lang.String protocol;
        java.util.Map<java.lang.String, java.lang.String> mapIR;
        if (android.text.TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        java.lang.String host = null;
        try {
            java.net.URL url = new java.net.URL(str);
            protocol = url.getProtocol();
            try {
                host = url.getHost();
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            protocol = null;
        }
        if (android.text.TextUtils.isEmpty(protocol)) {
            return str;
        }
        if ((!androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol) && !"https".equals(protocol)) || android.text.TextUtils.isEmpty(host) || eqN(host) || (mapIR = iR()) == null || !mapIR.containsKey(host)) {
            return str;
        }
        java.lang.String str2 = mapIR.get(host);
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        java.lang.String str3 = protocol + "://" + host;
        return str.startsWith(str3) ? str.replaceFirst(str3, protocol + "://" + str2) : str;
    }

    public synchronized void bg(com.bytedance.sdk.component.IL.bg.Ta ta, com.bytedance.sdk.component.IL.bg.Lq lq) {
        java.net.URL urlBg;
        if (ta == null || lq == null) {
            return;
        }
        if (this.xxp) {
            if (com.bytedance.sdk.component.iR.eqN.zx.bg(this.iR)) {
                try {
                    urlBg = ta.IL().bg();
                } catch (java.lang.Exception unused) {
                    urlBg = null;
                }
                if (urlBg == null) {
                    return;
                }
                java.lang.String protocol = urlBg.getProtocol();
                java.lang.String host = urlBg.getHost();
                java.lang.String path = urlBg.getPath();
                java.lang.String strBg = bg(ta);
                int iBX = lq.bX();
                if (androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol) || "https".equals(protocol)) {
                    if (android.text.TextUtils.isEmpty(strBg)) {
                        return;
                    }
                    com.bytedance.sdk.component.iR.bX.eqN eqnLdr = ldr();
                    if (eqnLdr != null && eqnLdr.IL) {
                        bg(lq, host);
                    }
                    if (eqnLdr == null) {
                        return;
                    }
                    this.PX.size();
                    this.Ta.size();
                    this.Lq.size();
                    this.vb.size();
                    if (iBX > 0) {
                        if (bg(iBX)) {
                            if (this.VB > 0 || this.yDt > 0) {
                                eo();
                            }
                            bX(host);
                            return;
                        }
                        if (!IL(iBX)) {
                            this.yDt++;
                            this.Lq.put(path, 0);
                            this.vb.put(strBg, 0);
                            if (this.yDt >= eqnLdr.Kg && this.Lq.size() >= eqnLdr.WR && this.vb.size() >= eqnLdr.eo) {
                                bg(false, 0L);
                                eo();
                            }
                            IL(host);
                        }
                    }
                }
            }
        }
    }

    private java.lang.String bg(com.bytedance.sdk.component.IL.bg.Ta ta) {
        if (ta == null || ta.IL() == null || ta.IL().bg() == null) {
            return "";
        }
        try {
            return java.net.InetAddress.getByName(ta.IL().bg().getHost()).getHostAddress();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private void IL(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapIR;
        if (android.text.TextUtils.isEmpty(str) || (mapIR = iR()) == null || !mapIR.containsValue(str)) {
            return;
        }
        if (this.VzQ.get(str) == null) {
            this.VzQ.put(str, 1);
        } else {
            this.VzQ.put(str, java.lang.Integer.valueOf(this.VzQ.get(str).intValue() + 1));
        }
    }

    private void bX(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && this.VzQ.containsKey(str)) {
            this.VzQ.put(str, 0);
        }
    }

    private boolean eqN(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapIR = iR();
        if (mapIR == null) {
            return false;
        }
        java.lang.String str2 = mapIR.get(str);
        return (android.text.TextUtils.isEmpty(str2) || this.VzQ.get(str2) == null || this.VzQ.get(str2).intValue() < 3) ? false : true;
    }

    public synchronized void bg(com.bytedance.sdk.component.IL.bg.Ta ta, java.lang.Exception exc) {
        java.net.URL urlBg;
        if (ta != null) {
            if (ta.IL() != null && exc != null) {
                if (this.xxp) {
                    if (com.bytedance.sdk.component.iR.eqN.zx.bg(this.iR)) {
                        try {
                            urlBg = ta.IL().bg();
                        } catch (java.lang.Exception unused) {
                            urlBg = null;
                        }
                        if (urlBg == null) {
                            return;
                        }
                        java.lang.String protocol = urlBg.getProtocol();
                        java.lang.String host = urlBg.getHost();
                        java.lang.String path = urlBg.getPath();
                        java.lang.String strBg = bg(ta);
                        if (androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol) || "https".equals(protocol)) {
                            com.bytedance.sdk.component.iR.bX.eqN eqnLdr = ldr();
                            if (eqnLdr == null) {
                                return;
                            }
                            this.PX.size();
                            this.Ta.size();
                            this.Lq.size();
                            this.vb.size();
                            this.VB++;
                            this.PX.put(path, 0);
                            this.Ta.put(strBg, 0);
                            if (this.VB >= eqnLdr.zx && this.PX.size() >= eqnLdr.ldr && this.Ta.size() >= eqnLdr.iR) {
                                bg(false, 0L);
                                eo();
                            }
                            IL(host);
                        }
                    }
                }
            }
        }
    }

    private void bg(com.bytedance.sdk.component.IL.bg.Lq lq, java.lang.String str) {
        java.lang.String[] strArrSplit;
        int i;
        long j;
        com.bytedance.sdk.component.iR.bX.eqN eqnLdr;
        if (lq != null && this.xxp) {
            java.lang.String strBg = lq.bg("tnc-cmd", null);
            if (android.text.TextUtils.isEmpty(strBg) || (strArrSplit = strBg.split("@")) == null || strArrSplit.length != 2) {
                return;
            }
            try {
                i = java.lang.Integer.parseInt(strArrSplit[0]);
                try {
                    j = java.lang.Long.parseLong(strArrSplit[1]);
                } catch (java.lang.Throwable unused) {
                    j = 0;
                }
            } catch (java.lang.Throwable unused2) {
                i = 0;
            }
            if (j <= this.eo) {
                return;
            }
            this.WR = i;
            this.eo = j;
            this.iR.getSharedPreferences(bg(), 0).edit().putInt("tnc_probe_cmd", i).putLong("tnc_probe_version", j).apply();
            if (this.WR != 10000 || (eqnLdr = ldr()) == null) {
                return;
            }
            bg(true, eqnLdr.PX > 0 ? ((long) new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(eqnLdr.PX)) * 1000 : 0L);
        }
    }

    private void bg(boolean z, long j) {
        if (this.bg.hasMessages(10000)) {
            return;
        }
        android.os.Message messageObtainMessage = this.bg.obtainMessage();
        messageObtainMessage.what = 10000;
        messageObtainMessage.arg1 = z ? 1 : 0;
        if (j > 0) {
            this.bg.sendMessageDelayed(messageObtainMessage, j);
        } else {
            this.bg.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(boolean z) {
        com.bytedance.sdk.component.iR.bX.eqN eqnLdr = ldr();
        if (eqnLdr == null) {
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (z || this.IL + (((long) eqnLdr.VB) * 1000) <= jElapsedRealtime) {
            this.IL = jElapsedRealtime;
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.tuV, this.iR).bX();
        }
    }

    private void eo() {
        this.VB = 0;
        this.PX.clear();
        this.Ta.clear();
        this.yDt = 0;
        this.Lq.clear();
        this.vb.clear();
    }

    private boolean IL(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        com.bytedance.sdk.component.iR.bX.eqN eqnLdr = ldr();
        return (eqnLdr == null || android.text.TextUtils.isEmpty(eqnLdr.Ta) || !eqnLdr.Ta.contains(java.lang.String.valueOf(i))) ? false : true;
    }
}
