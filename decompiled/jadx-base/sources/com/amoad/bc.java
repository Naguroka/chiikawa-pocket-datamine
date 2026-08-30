package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f270a = "bc";

    private bc() {
    }

    static void a(long j) {
        try {
            java.lang.Thread.sleep(j);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    static void a(android.content.Context context, java.lang.Runnable runnable) {
        if (a(context)) {
            runnable.run();
        } else {
            new android.os.Handler(context.getMainLooper()).post(runnable);
        }
    }

    @java.lang.Deprecated
    static void a(android.os.Handler handler, java.lang.Runnable runnable) {
        handler.post(runnable);
    }

    static void a(android.os.Handler handler, java.lang.Runnable runnable, long j) {
        handler.postDelayed(runnable, j);
    }

    static void a(java.lang.Object obj) {
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.IllegalMonitorStateException unused) {
            }
        }
    }

    static void a(java.lang.Runnable runnable) {
        a(runnable, 1);
    }

    private static void a(java.lang.Runnable runnable, int i) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setPriority(i);
        thread.start();
    }

    static void a(java.util.concurrent.ExecutorService executorService, java.lang.Runnable runnable) {
        executorService.execute(runnable);
    }

    static boolean a(android.content.Context context) {
        return context.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    static void b(java.lang.Object obj) {
        synchronized (obj) {
            try {
                obj.wait(1000L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    static void b(java.lang.Runnable runnable) {
        a(runnable, 5);
    }

    static void c(java.lang.Object obj) {
        synchronized (obj) {
            try {
                obj.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
