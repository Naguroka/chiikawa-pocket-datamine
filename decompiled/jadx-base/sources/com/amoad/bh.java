package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f276a = "bh";
    private static com.amoad.bh b;
    private final com.amoad.y c;
    private final android.os.Handler d;
    private final java.util.Set<java.lang.String> e;
    private final java.util.List<com.amoad.bh.a> f;
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> g;
    private final java.util.concurrent.RejectedExecutionHandler h;
    private final java.util.concurrent.ThreadPoolExecutor i;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.amoad.bi f280a;

        a(com.amoad.bi biVar) {
            this.f280a = biVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    com.amoad.bh.a(com.amoad.bh.this, this.f280a);
                } catch (java.lang.OutOfMemoryError e) {
                    if (this.f280a.c != null) {
                        com.amoad.bh.a(com.amoad.bh.this.d, this.f280a, null, new com.amoad.AMoAdError(com.amoad.AMoAdError.OUT_OF_MEMORY, "メモリ不足のため広告を表示できません。", e));
                    }
                }
            } finally {
                com.amoad.bh.this.a(this.f280a.b);
            }
        }

        public final java.lang.String toString() {
            return new java.lang.StringBuilder().append(this.f280a.a()).toString();
        }
    }

    private bh(android.content.Context context) {
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue(256, new java.util.Comparator<java.lang.Runnable>() { // from class: com.amoad.bh.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
                return ((com.amoad.bh.a) runnable2).f280a.a() - ((com.amoad.bh.a) runnable).f280a.a();
            }
        });
        this.g = priorityBlockingQueue;
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler = new java.util.concurrent.RejectedExecutionHandler() { // from class: com.amoad.bh.2
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.InterruptedException unused) {
                }
                threadPoolExecutor.execute(runnable);
            }
        };
        this.h = rejectedExecutionHandler;
        this.i = new java.util.concurrent.ThreadPoolExecutor(4, 4, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, priorityBlockingQueue, rejectedExecutionHandler);
        this.c = com.amoad.y.a(context);
        this.d = new android.os.Handler(context.getMainLooper());
        this.e = new java.util.HashSet();
        this.f = new java.util.ArrayList();
    }

    static synchronized com.amoad.bh a(android.content.Context context) {
        if (b == null) {
            b = new com.amoad.bh(context);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(android.os.Handler handler, final com.amoad.bi biVar, final android.media.MediaPlayer mediaPlayer, final com.amoad.AMoAdError aMoAdError) {
        if (biVar.c != null) {
            com.amoad.bc.a(handler, new java.lang.Runnable() { // from class: com.amoad.bh.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (biVar.b()) {
                        biVar.c.a(mediaPlayer, aMoAdError);
                    }
                }
            });
        }
    }

    private synchronized void a(com.amoad.bh.a aVar) {
        if (this.e.contains(aVar.f280a.b)) {
            this.f.add(aVar);
        } else {
            this.e.add(aVar.f280a.b);
            com.amoad.bc.a(this.i, aVar);
        }
    }

    static /* synthetic */ void a(com.amoad.bh bhVar, com.amoad.bi biVar) throws java.lang.Throwable {
        boolean z;
        if (biVar.c != null) {
            android.media.MediaPlayer mediaPlayerB = bhVar.c.b(biVar.b);
            if (mediaPlayerB != null) {
                a(bhVar.d, biVar, mediaPlayerB, null);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        a(bhVar.d, biVar, bhVar.c.a(biVar.b, b(biVar.b)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(java.lang.String str) {
        this.e.remove(str);
        java.util.Iterator<com.amoad.bh.a> it = this.f.iterator();
        while (it.hasNext()) {
            com.amoad.bh.a next = it.next();
            if (android.text.TextUtils.equals(str, next.f280a.b)) {
                it.remove();
                if (next.f280a.c != null) {
                    this.g.add(next);
                } else {
                    continue;
                }
            }
        }
    }

    private static byte[] b(java.lang.String str) throws java.lang.Throwable {
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
                    com.amoad.Logger.w(f276a, e);
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

    final void a(com.amoad.bi biVar) {
        a(new com.amoad.bh.a(biVar));
    }
}
