package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.IL.bg.IL {
    com.bytedance.sdk.component.IL.bg.eqN IL;
    private java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    com.bytedance.sdk.component.IL.bg.Ta bg;

    IL(com.bytedance.sdk.component.IL.bg.Ta ta, com.bytedance.sdk.component.IL.bg.eqN eqn) {
        this.bg = ta;
        this.IL = eqn;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL
    public com.bytedance.sdk.component.IL.bg.Ta bg() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL
    public com.bytedance.sdk.component.IL.bg.Lq IL() throws java.io.IOException {
        com.bytedance.sdk.component.IL.bg.Ta ta = this.bg;
        if (ta != null && ta.IL != null) {
            if (this.bg.IL.yDt() == 0) {
                this.bg.IL.Lq();
            }
            this.bg.IL.bg();
        }
        this.IL.bX().remove(this);
        this.IL.eqN().add(this);
        com.bytedance.sdk.component.IL.bg.eqN eqn = this.IL;
        if ((eqn instanceof com.bytedance.sdk.component.IL.bg.bg.bg.zx) && (eqn.bX().size() + this.IL.eqN().size() > this.IL.bg() || this.bX.get())) {
            this.IL.eqN().remove(this);
            return new com.bytedance.sdk.component.IL.bg.bg.bg.iR(com.bytedance.sdk.component.IL.bg.bg.bg.iR.bg, "Maximum number of requests exceeded", this.bg);
        }
        try {
            if (this.bg.bg != null && this.bg.bg.bg != null && this.bg.bg.bg.size() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.bg.bg.bg);
                arrayList.add(new com.bytedance.sdk.component.IL.bg.Kg() { // from class: com.bytedance.sdk.component.IL.bg.bg.bg.IL.1
                    @Override // com.bytedance.sdk.component.IL.bg.Kg
                    public com.bytedance.sdk.component.IL.bg.Lq bg(com.bytedance.sdk.component.IL.bg.Kg.bg bgVar) throws java.io.IOException {
                        return com.bytedance.sdk.component.IL.bg.bg.bg.IL.this.bg(bgVar.bg());
                    }
                });
                return ((com.bytedance.sdk.component.IL.bg.Kg) arrayList.get(0)).bg(new com.bytedance.sdk.component.IL.bg.bg.bg.bX(arrayList, this.bg));
            }
            return bg(this.bg);
        } catch (java.lang.Throwable th) {
            throw new java.io.IOException(th.getMessage());
        }
    }

    private boolean bg(com.bytedance.sdk.component.IL.bg.yDt ydt) {
        com.bytedance.sdk.component.IL.bg.Ta ta;
        return ydt != null && (ta = this.bg) != null && "POST".equalsIgnoreCase(ta.bX()) && ydt.ldr == com.bytedance.sdk.component.IL.bg.yDt.bg.BYTE_ARRAY_TYPE && ydt.zx != null && ydt.zx.length > 0;
    }

    private boolean IL(com.bytedance.sdk.component.IL.bg.yDt ydt) {
        com.bytedance.sdk.component.IL.bg.Ta ta;
        return (ydt == null || (ta = this.bg) == null || !"POST".equalsIgnoreCase(ta.bX()) || ydt.ldr != com.bytedance.sdk.component.IL.bg.yDt.bg.STRING_TYPE || android.text.TextUtils.isEmpty(ydt.eqN)) ? false : true;
    }

    public com.bytedance.sdk.component.IL.bg.Lq bg(com.bytedance.sdk.component.IL.bg.Ta ta) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection;
        java.lang.Exception e;
        java.lang.String message;
        int responseCode = com.bytedance.sdk.component.IL.bg.bg.bg.iR.bg;
        try {
            try {
                httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(ta.IL().bg().toString()).openConnection();
                try {
                    if (ta.eqN() != null && ta.eqN().size() > 0) {
                        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : ta.eqN().entrySet()) {
                            java.lang.String key = entry.getKey();
                            for (java.lang.String str : entry.getValue()) {
                                if ("_disable_retry".equals(key) && "1".equals(str)) {
                                    bg(httpURLConnection);
                                } else {
                                    httpURLConnection.addRequestProperty(key, str);
                                }
                            }
                        }
                    }
                    if (ta.bg != null) {
                        if (ta.bg.bX != null) {
                            httpURLConnection.setConnectTimeout((int) ta.bg.bX.toMillis(ta.bg.IL));
                        }
                        if (ta.bg.bX != null) {
                            httpURLConnection.setReadTimeout((int) ta.bg.zx.toMillis(ta.bg.eqN));
                        }
                    }
                    if (ta.Kg() == null) {
                        httpURLConnection.setRequestMethod("GET");
                    } else {
                        if (!zx() && ta.Kg().bX != null) {
                            httpURLConnection.addRequestProperty("Content-Type", ta.Kg().bX.bg());
                        }
                        httpURLConnection.setRequestMethod(ta.bX());
                        if ("POST".equalsIgnoreCase(ta.bX())) {
                            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                            if (bg(ta.Kg())) {
                                outputStream.write(ta.Kg().zx);
                            } else if (IL(ta.Kg())) {
                                outputStream.write(ta.Kg().eqN.getBytes());
                            }
                            outputStream.flush();
                            outputStream.close();
                        }
                    }
                    if (ta != null && ta.IL != null) {
                        ta.IL.IL();
                    }
                    httpURLConnection.connect();
                    if (ta != null && ta.IL != null) {
                        ta.IL.bX();
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    if (ta != null && ta.IL != null) {
                        ta.IL.zx();
                    }
                    if (!this.bX.get()) {
                        com.bytedance.sdk.component.IL.bg.bg.bg.iR iRVar = new com.bytedance.sdk.component.IL.bg.bg.bg.iR(httpURLConnection, ta);
                        this.IL.eqN().remove(this);
                        return iRVar;
                    }
                    httpURLConnection.disconnect();
                    this.IL.eqN().remove(this);
                    message = "internal error";
                    return new com.bytedance.sdk.component.IL.bg.bg.bg.iR(responseCode, message, ta);
                } catch (java.lang.Exception e2) {
                    e = e2;
                    try {
                        message = httpURLConnection.getErrorStream().toString();
                    } catch (java.lang.Throwable unused) {
                        message = e.getMessage();
                    }
                    this.IL.eqN().remove(this);
                }
            } catch (java.lang.Exception e3) {
                httpURLConnection = null;
                e = e3;
            }
        } catch (java.lang.Throwable th) {
            this.IL.eqN().remove(this);
            throw th;
        }
    }

    private static void bg(java.net.HttpURLConnection httpURLConnection) {
        try {
            java.lang.reflect.Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(httpURLConnection);
            java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", java.lang.Boolean.TYPE).invoke(obj2, java.lang.Boolean.FALSE);
        } catch (java.lang.Exception unused) {
        }
    }

    private boolean zx() {
        if (this.bg.eqN() == null) {
            return false;
        }
        return this.bg.eqN().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL
    public void bg(final com.bytedance.sdk.component.IL.bg.bX bXVar) {
        com.bytedance.sdk.component.IL.bg.Ta ta = this.bg;
        if (ta != null && ta.IL != null) {
            this.bg.IL.Lq();
        }
        this.IL.IL().submit(new com.bytedance.sdk.component.Kg.bX.IL(this.bg.iR(), this.bg.ldr()) { // from class: com.bytedance.sdk.component.IL.bg.bg.bg.IL.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.component.IL.bg.Lq lqIL = com.bytedance.sdk.component.IL.bg.bg.bg.IL.this.IL();
                    if (lqIL == null) {
                        bXVar.bg(com.bytedance.sdk.component.IL.bg.bg.bg.IL.this, new java.io.IOException("response is null"));
                    } else {
                        bXVar.bg(com.bytedance.sdk.component.IL.bg.bg.bg.IL.this, lqIL);
                    }
                } catch (java.io.IOException e) {
                    bXVar.bg(com.bytedance.sdk.component.IL.bg.bg.bg.IL.this, e);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.IL.bg.IL
    public void bX() {
        this.bX.set(true);
    }

    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.IL.bg.IL clone() {
        return new com.bytedance.sdk.component.IL.bg.bg.bg.IL(this.bg, this.IL);
    }
}
