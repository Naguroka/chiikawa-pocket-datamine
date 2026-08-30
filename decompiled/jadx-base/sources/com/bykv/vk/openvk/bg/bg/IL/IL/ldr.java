package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private static volatile com.bykv.vk.openvk.bg.bg.IL.IL.ldr eqN;
    private volatile int IL;
    private final android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.bg.bg.IL.IL.iR>> Kg;
    private final java.lang.Runnable PX;
    private final java.util.concurrent.atomic.AtomicBoolean Ta;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bX VB;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX WR;
    private final java.util.concurrent.atomic.AtomicInteger bX = new java.util.concurrent.atomic.AtomicInteger(0);
    private volatile java.net.ServerSocket bg;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bX eo;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.IL iR;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX ldr;
    private volatile com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX zx;

    static /* synthetic */ void bg(java.lang.String str, java.lang.String str2) {
    }

    boolean bg(int i, java.lang.String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.Kg) {
            java.util.Set<com.bykv.vk.openvk.bg.bg.IL.IL.iR> set = this.Kg.get(i);
            if (set != null) {
                for (com.bykv.vk.openvk.bg.bg.IL.IL.iR iRVar : set) {
                    if (iRVar != null && str.equals(iRVar.Kg)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.ldr bg() {
        if (eqN == null) {
            synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.class) {
                if (eqN == null) {
                    eqN = new com.bykv.vk.openvk.bg.bg.IL.IL.ldr();
                }
            }
        }
        return eqN;
    }

    private ldr() {
        android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.bg.bg.IL.IL.iR>> sparseArray = new android.util.SparseArray<>(2);
        this.Kg = sparseArray;
        this.WR = new com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.ldr.1
            @Override // com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX
            public void bg(com.bykv.vk.openvk.bg.bg.IL.IL.iR iRVar) {
                synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.Kg) {
                    java.util.Set set = (java.util.Set) com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.Kg.get(iRVar.ldr());
                    if (set != null) {
                        set.add(iRVar);
                    }
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.IL.IL.iR.bX
            public void IL(com.bykv.vk.openvk.bg.bg.IL.IL.iR iRVar) {
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.d("ProxyServer", "afterExecute, ProxyTask: ".concat(java.lang.String.valueOf(iRVar)));
                }
                int iLdr = iRVar.ldr();
                synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.Kg) {
                    java.util.Set set = (java.util.Set) com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.Kg.get(iLdr);
                    if (set != null) {
                        set.remove(iRVar);
                    }
                }
            }
        };
        this.PX = new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.ldr.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i = 0;
                    com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.bg = new java.net.ServerSocket(0, 50, java.net.InetAddress.getByName(com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.WR()));
                    com.bykv.vk.openvk.bg.bg.IL.IL.ldr ldrVar = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this;
                    ldrVar.IL = ldrVar.bg.getLocalPort();
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.IL != -1) {
                        com.bykv.vk.openvk.bg.bg.IL.IL.eo.bg(com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.WR(), com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.IL);
                        if (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.iR()) {
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            java.util.concurrent.atomic.AtomicInteger unused = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.bX;
                            if (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.bX.compareAndSet(0, 1)) {
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                java.util.concurrent.atomic.AtomicInteger unused2 = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.bX;
                                boolean z = com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX;
                                while (com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.bX.get() == 1) {
                                    try {
                                        try {
                                            java.net.Socket socketAccept = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.bg.accept();
                                            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.zx;
                                            if (bXVar != null) {
                                                final com.bykv.vk.openvk.bg.bg.IL.IL.iR iRVarBg = new com.bykv.vk.openvk.bg.bg.IL.IL.iR.bg().bg(bXVar).bg(socketAccept).bg(com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.WR).bg();
                                                com.bytedance.sdk.component.Kg.ldr.bX().execute(new com.bytedance.sdk.component.Kg.Kg("ProxyTask", 10) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.ldr.2.1
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        iRVarBg.run();
                                                    }
                                                });
                                            } else {
                                                com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(socketAccept);
                                            }
                                        } catch (java.io.IOException e) {
                                            com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg("accept error", android.util.Log.getStackTraceString(e));
                                            i++;
                                            if (i > 3) {
                                                boolean z2 = com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX;
                                                com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.zx();
                                                return;
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        java.lang.String stackTraceString = android.util.Log.getStackTraceString(th);
                                        android.util.Log.e("ProxyServer", "proxy server crashed!  ".concat(java.lang.String.valueOf(stackTraceString)));
                                        com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg("error", stackTraceString);
                                    }
                                }
                                boolean z3 = com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX;
                                com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.zx();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg("socket not bound", "");
                    com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.zx();
                } catch (java.io.IOException e2) {
                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                        android.util.Log.e("ProxyServer", "create ServerSocket error!  " + android.util.Log.getStackTraceString(e2));
                    }
                    com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg("create ServerSocket error", android.util.Log.getStackTraceString(e2));
                    com.bykv.vk.openvk.bg.bg.IL.IL.ldr.this.zx();
                }
            }
        };
        this.Ta = new java.util.concurrent.atomic.AtomicBoolean();
        sparseArray.put(0, new java.util.HashSet());
        sparseArray.put(1, new java.util.HashSet());
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.bX IL() {
        return this.eo;
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.bX bX() {
        return this.VB;
    }

    void bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar) {
        this.zx = bXVar;
    }

    void bg(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX bXVar) {
        this.ldr = bXVar;
    }

    public java.lang.String bg(boolean z, boolean z2, java.lang.String str, java.lang.String... strArr) {
        java.lang.String str2;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        if (this.zx == null) {
            return strArr[0];
        }
        if ((z ? this.iR : this.ldr) == null) {
            return strArr[0];
        }
        if (this.bX.get() != 1) {
            return strArr[0];
        }
        java.util.List<java.lang.String> listBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(strArr);
        if (listBg == null) {
            return strArr[0];
        }
        java.lang.String strBg = com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg(str, z2 ? str : com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(str), listBg);
        if (strBg == null) {
            return strArr[0];
        }
        if (z) {
            str2 = "https://" + WR() + ":" + this.IL + "?f=1&" + strBg;
        } else {
            str2 = "https://" + WR() + ":" + this.IL + "?" + strBg;
        }
        return str2.replaceFirst(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "");
    }

    public void eqN() {
        if (this.Ta.compareAndSet(false, true)) {
            java.lang.Thread thread = new java.lang.Thread(this.PX);
            thread.setName("csj_proxy_server");
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zx() {
        if (this.bX.compareAndSet(1, 2) || this.bX.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(this.bg);
            ldr();
        }
    }

    private void ldr() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.Kg) {
            int size = this.Kg.size();
            for (int i = 0; i < size; i++) {
                android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.bg.bg.IL.IL.iR>> sparseArray = this.Kg;
                java.util.Set<com.bykv.vk.openvk.bg.bg.IL.IL.iR> set = sparseArray.get(sparseArray.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.bykv.vk.openvk.bg.bg.IL.IL.iR) it.next()).bg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean iR() {
        com.bytedance.sdk.component.Kg.iR iRVar = new com.bytedance.sdk.component.Kg.iR(new com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg(WR(), this.IL), 5, 1);
        com.bytedance.sdk.component.Kg.ldr.bX().submit(iRVar);
        Kg();
        try {
            if (!((java.lang.Boolean) iRVar.get()).booleanValue()) {
                android.util.Log.e("ProxyServer", "Ping error");
                zx();
                return false;
            }
            boolean z = com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX;
            return true;
        } catch (java.lang.Throwable th) {
            android.util.Log.getStackTraceString(th);
            zx();
            return false;
        }
    }

    private static final class bg implements java.util.concurrent.Callable<java.lang.Boolean> {
        private final int IL;
        private final java.lang.String bg;

        bg(java.lang.String str, int i) {
            this.bg = str;
            this.IL = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean call() {
            java.net.Socket socket;
            java.lang.Throwable th;
            try {
                socket = new java.net.Socket(this.bg, this.IL);
                try {
                    socket.setSoTimeout(2000);
                    java.io.OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg));
                    outputStream.flush();
                    if ("OK".equals(new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream())).readLine())) {
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(socket);
                        return bool;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        th.getMessage();
                        com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg("ping error", android.util.Log.getStackTraceString(th));
                    } finally {
                        com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(socket);
                    }
                }
            } catch (java.lang.Throwable th3) {
                socket = null;
                th = th3;
            }
            return java.lang.Boolean.FALSE;
        }
    }

    private void Kg() {
        java.net.Socket socketAccept = null;
        try {
            socketAccept = this.bg.accept();
            socketAccept.setSoTimeout(2000);
            if ("Ping".equals(new java.io.BufferedReader(new java.io.InputStreamReader(socketAccept.getInputStream())).readLine())) {
                java.io.OutputStream outputStream = socketAccept.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg));
                outputStream.flush();
            }
        } catch (java.io.IOException e) {
            android.util.Log.getStackTraceString(e);
        } finally {
            com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(socketAccept);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String WR() {
        return new java.lang.String(android.util.Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
