package com.bytedance.sdk.openadsdk.LZ;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private com.bytedance.sdk.openadsdk.LZ.IL IL;
    private com.bytedance.sdk.openadsdk.LZ.eqN bX;
    private com.bytedance.sdk.openadsdk.LZ.bg eqN;
    private final java.lang.String bg = "StrategyCenter";
    private int zx = 0;
    private java.lang.Runnable ldr = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.LZ.bX.2
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.LZ.bX.this.IL();
        }
    };

    public bX(com.bytedance.sdk.openadsdk.LZ.eqN eqn) {
        this.IL = null;
        com.bytedance.sdk.openadsdk.LZ.zx zxVar = new com.bytedance.sdk.openadsdk.LZ.zx(eqn);
        this.bX = zxVar;
        java.lang.String strBX = zxVar.bX();
        if (!android.text.TextUtils.isEmpty(strBX) && !strBX.startsWith("pag")) {
            strBX = "pag_".concat(java.lang.String.valueOf(strBX));
        }
        this.IL = new com.bytedance.sdk.openadsdk.LZ.IL(this.bX.IL(), strBX);
    }

    public void bg(com.bytedance.sdk.openadsdk.LZ.bg bgVar) {
        this.eqN = bgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.bX;
        if (eqn == null || eqn.zx() == null || this.bX.ldr() == null) {
            return;
        }
        this.bX.bg().execute(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.LZ.bX.1
            @Override // java.lang.Runnable
            public void run() {
                java.io.OutputStream outputStream;
                com.bytedance.sdk.openadsdk.LZ.bX.this.zx++;
                try {
                    if (com.bytedance.sdk.openadsdk.LZ.bX.this.eqN != null) {
                        com.bytedance.sdk.openadsdk.LZ.bX.this.eqN.bg();
                    }
                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(com.bytedance.sdk.openadsdk.LZ.bX.this.bX.zx()).openConnection();
                    if (com.bytedance.sdk.openadsdk.LZ.bX.this.bX.iR() != null && com.bytedance.sdk.openadsdk.LZ.bX.this.bX.iR().size() > 0) {
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : com.bytedance.sdk.openadsdk.LZ.bX.this.bX.iR().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", com.json.zb.L);
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(com.bytedance.sdk.openadsdk.LZ.bX.this.bX.ldr().toString().getBytes());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            android.util.Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode != 200) {
                                if (com.bytedance.sdk.openadsdk.LZ.bX.this.eqN != null) {
                                    com.bytedance.sdk.openadsdk.LZ.bX.this.eqN.bg(responseCode, httpURLConnection.getResponseMessage());
                                }
                            } else {
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                                while (true) {
                                    java.lang.String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.LZ.bX.this.bX.bg(new org.json.JSONObject(stringBuffer.toString()));
                                com.bytedance.sdk.openadsdk.LZ.bX.this.IL.bg();
                                com.bytedance.sdk.openadsdk.LZ.bX.this.IL.bg(jSONObjectBg);
                                if (com.bytedance.sdk.openadsdk.LZ.bX.this.eqN != null) {
                                    com.bytedance.sdk.openadsdk.LZ.bX.this.eqN.IL();
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (java.lang.Throwable th3) {
                    android.util.Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (com.bytedance.sdk.openadsdk.LZ.bX.this.eqN != null) {
                        com.bytedance.sdk.openadsdk.LZ.bX.this.eqN.bg(-1, th3.getMessage());
                    }
                }
                com.bytedance.sdk.openadsdk.LZ.bX.this.IL.bg("local_last_update_time", java.lang.System.currentTimeMillis());
                com.bytedance.sdk.openadsdk.LZ.bX.this.bg();
            }
        });
    }

    public void bg() {
        if (this.bX != null) {
            com.bytedance.sdk.openadsdk.LZ.IL il = this.IL;
            int i = com.adjust.sdk.Constants.ONE_HOUR;
            int iBg = il.bg("req_interval", com.adjust.sdk.Constants.ONE_HOUR);
            long j = 0;
            long jIL = this.IL.IL("local_last_update_time", 0L);
            if (iBg >= 600000 && iBg <= 86400000) {
                i = iBg;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - jIL;
            android.util.Log.i("StrategyCenter", "before  realInterval=".concat(java.lang.String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j2 = i;
                if (jCurrentTimeMillis <= j2) {
                    j = j2 - jCurrentTimeMillis;
                }
            }
            android.util.Log.i("StrategyCenter", "after  realInterval=".concat(java.lang.String.valueOf(j)));
            this.bX.eqN().removeCallbacks(this.ldr);
            if (this.zx > 24) {
                return;
            }
            this.bX.eqN().postDelayed(this.ldr, j);
        }
    }

    public int bg(java.lang.String str, int i) {
        com.bytedance.sdk.openadsdk.LZ.IL il = this.IL;
        return il == null ? i : il.bg(str, i);
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.LZ.IL il = this.IL;
        return il == null ? str2 : il.bg(str, str2);
    }

    public boolean bg(java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.LZ.IL il = this.IL;
        return il == null ? z : il.bg(str, z);
    }
}
