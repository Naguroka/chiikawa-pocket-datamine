package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f341a = "t";
    private static com.amoad.t b;
    private final com.amoad.y c;
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> d;
    private final java.util.Set<java.lang.String> e;
    private final java.util.List<com.amoad.t.b> f;
    private final java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.amoad.t.a>> g;
    private final java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.amoad.d>> h;
    private final java.util.concurrent.ThreadPoolExecutor i;
    private final java.util.concurrent.ExecutorService j;
    private final android.os.Handler k;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f345a;

        a(byte[] bArr) {
            this.f345a = bArr;
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.amoad.af f346a;

        b(com.amoad.af afVar) {
            this.f346a = afVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    com.amoad.t.a(com.amoad.t.this, this.f346a);
                } catch (java.lang.OutOfMemoryError e) {
                    if (this.f346a.c != null) {
                        com.amoad.t.a(com.amoad.t.this.k, this.f346a, null, new com.amoad.AMoAdError(com.amoad.AMoAdError.OUT_OF_MEMORY, "メモリ不足のため広告を表示できません。", e));
                    }
                }
            } finally {
                com.amoad.t.this.a(this.f346a.b);
            }
        }

        public final java.lang.String toString() {
            return new java.lang.StringBuilder().append(this.f346a.a()).toString();
        }
    }

    private t(android.content.Context context) {
        com.amoad.ax axVar = new com.amoad.ax();
        this.d = axVar;
        this.e = new java.util.HashSet();
        this.f = new java.util.ArrayList();
        this.g = new java.util.HashMap();
        this.h = new java.util.HashMap();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(4, 4, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, axVar);
        this.i = threadPoolExecutor;
        this.j = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.k = new android.os.Handler(context.getMainLooper());
        this.c = com.amoad.y.a(context);
        threadPoolExecutor.setRejectedExecutionHandler(new java.util.concurrent.RejectedExecutionHandler() { // from class: com.amoad.t.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2) {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.InterruptedException unused) {
                }
                com.amoad.bc.a(threadPoolExecutor2, runnable);
            }
        });
    }

    static synchronized com.amoad.t a(android.content.Context context) {
        if (b == null) {
            b = new com.amoad.t(context);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(android.os.Handler handler, final com.amoad.af afVar, final com.amoad.d dVar, final com.amoad.AMoAdError aMoAdError) {
        if (afVar.c != null) {
            com.amoad.bc.a(handler, new java.lang.Runnable() { // from class: com.amoad.t.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (afVar.b()) {
                        afVar.c.a(dVar, aMoAdError);
                    }
                }
            });
        }
    }

    private synchronized void a(com.amoad.t.b bVar) {
        if (this.e.contains(bVar.f346a.b)) {
            this.f.add(bVar);
        } else {
            this.e.add(bVar.f346a.b);
            com.amoad.bc.a(this.i, bVar);
        }
    }

    static /* synthetic */ void a(com.amoad.t tVar, com.amoad.af afVar) throws java.lang.Throwable {
        boolean z;
        com.amoad.t.a aVar;
        if (afVar.c == null || !tVar.b(afVar)) {
            boolean z2 = true;
            if (afVar.c != null) {
                java.lang.ref.WeakReference<com.amoad.t.a> weakReference = tVar.g.get(afVar.b);
                byte[] bArr = (weakReference == null || (aVar = weakReference.get()) == null) ? null : aVar.f345a;
                if (bArr != null) {
                    a(tVar.k, afVar, new com.amoad.d(bArr), null);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (afVar.c != null) {
                com.amoad.d dVarA = tVar.c.a(afVar.b);
                if (dVarA == null || !dVarA.a()) {
                    z2 = false;
                } else {
                    tVar.a(afVar.b, dVarA);
                    a(tVar.k, afVar, dVarA, null);
                }
                if (z2) {
                    return;
                }
            }
            final byte[] bArrC = c(afVar.b);
            java.lang.String str = afVar.b;
            if (bArrC != null) {
                tVar.g.put(str, new java.lang.ref.WeakReference<>(new com.amoad.t.a(bArrC)));
            }
            if (afVar.c == null || bArrC == null) {
                a(tVar.k, afVar, new com.amoad.d(null, null), null);
            } else {
                com.amoad.d dVar = new com.amoad.d(bArrC);
                tVar.a(afVar.b, dVar);
                a(tVar.k, afVar, dVar, null);
            }
            final java.lang.String str2 = afVar.b;
            if (bArrC != null) {
                com.amoad.bc.a(tVar.j, new java.lang.Runnable() { // from class: com.amoad.t.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.amoad.y yVar = com.amoad.t.this.c;
                        java.lang.String str3 = str2;
                        byte[] bArr2 = bArrC;
                        if (str3 == null || bArr2 == null) {
                            return;
                        }
                        synchronized (yVar.b) {
                            if (yVar.f349a != null) {
                                java.lang.String strC = com.amoad.y.c(str3);
                                java.io.OutputStream outputStreamB = null;
                                try {
                                    try {
                                        com.amoad.z.c cVarA = yVar.f349a.a(strC);
                                        if (cVarA == null) {
                                            com.amoad.z.a aVarB = yVar.f349a.b(strC);
                                            if (aVarB != null) {
                                                outputStreamB = aVarB.b();
                                                outputStreamB.write(bArr2);
                                                aVarB.c();
                                                outputStreamB.close();
                                            }
                                        } else {
                                            cVarA.c[0].close();
                                        }
                                        if (outputStreamB != null) {
                                            try {
                                                outputStreamB.close();
                                            } catch (java.io.IOException unused) {
                                            }
                                        }
                                    } catch (java.io.IOException e) {
                                        com.amoad.AMoAdLogger.getInstance().e("addBitmapToCache - ".concat(java.lang.String.valueOf(e)));
                                        if (0 != 0) {
                                        }
                                    } catch (java.lang.Exception e2) {
                                        com.amoad.AMoAdLogger.getInstance().e("addBitmapToCache - ".concat(java.lang.String.valueOf(e2)));
                                        if (0 != 0) {
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (0 != 0) {
                                        try {
                                            outputStreamB.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(java.lang.String str) {
        this.e.remove(str);
        java.util.Iterator<com.amoad.t.b> it = this.f.iterator();
        while (it.hasNext()) {
            com.amoad.t.b next = it.next();
            if (android.text.TextUtils.equals(str, next.f346a.b)) {
                it.remove();
                if (next.f346a.c != null) {
                    this.d.add(next);
                } else {
                    continue;
                }
            }
        }
    }

    private void a(java.lang.String str, com.amoad.d dVar) {
        if (dVar.a()) {
            this.h.put(str, new java.lang.ref.WeakReference<>(dVar));
        }
    }

    private com.amoad.d b(java.lang.String str) {
        java.lang.ref.WeakReference<com.amoad.d> weakReference = this.h.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean b(com.amoad.af afVar) {
        com.amoad.d dVarB = b(afVar.b);
        if (dVarB == null) {
            return false;
        }
        a(this.k, afVar, dVarB, null);
        return true;
    }

    private static byte[] c(java.lang.String str) throws java.lang.Throwable {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();
            try {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    byte[] bArr = new byte[com.google.android.gms.nearby.messages.Message.MAX_CONTENT_SIZE_BYTES];
                    while (true) {
                        int i = inputStream.read(bArr, 0, com.google.android.gms.nearby.messages.Message.MAX_CONTENT_SIZE_BYTES);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        throw th;
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return byteArray;
                } catch (java.lang.Exception e) {
                    e = e;
                    com.amoad.Logger.w(f341a, e);
                    com.amoad.AMoAdLogger.getInstance().w(java.text.MessageFormat.format("画像の取得に失敗しました。（url={0}）", str));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    final void a(com.amoad.af afVar) {
        if (b(afVar)) {
            return;
        }
        a(new com.amoad.t.b(afVar));
    }
}
