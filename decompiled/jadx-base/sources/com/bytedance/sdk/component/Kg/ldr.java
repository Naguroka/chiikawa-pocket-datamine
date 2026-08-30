package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.Kg.zx {
    public static com.bytedance.sdk.component.Kg.bX IL;
    private static volatile java.util.concurrent.ThreadPoolExecutor Kg;
    private static volatile java.util.concurrent.ScheduledExecutorService VB;
    private static volatile java.util.concurrent.ThreadPoolExecutor WR;
    private static volatile java.util.concurrent.ThreadPoolExecutor eo;
    private static volatile java.util.concurrent.ThreadPoolExecutor iR;
    private static volatile java.util.concurrent.ThreadPoolExecutor ldr;
    private static volatile java.util.concurrent.ThreadPoolExecutor zx;
    public static final int bg = java.lang.Runtime.getRuntime().availableProcessors();
    public static int bX = 120;
    public static boolean eqN = true;

    public static java.util.concurrent.ExecutorService IL() {
        if (zx == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (zx == null) {
                    zx = new com.bytedance.sdk.component.Kg.bg.C0099bg().bg(com.ironsource.y8.a.f).bg(0).IL(10).bg(5L).bg(java.util.concurrent.TimeUnit.SECONDS).bg(new java.util.concurrent.SynchronousQueue()).bg(Kg()).bg(bg().createThreadFactory(10, com.ironsource.y8.a.f)).bg();
                }
            }
        }
        return zx;
    }

    public static void bg(com.bytedance.sdk.component.Kg.Kg kg) {
        if (zx == null) {
            IL();
        }
        if (kg == null || zx == null) {
            return;
        }
        zx.execute(kg);
    }

    public static java.util.concurrent.ExecutorService bX() {
        return bg(10);
    }

    public static java.util.concurrent.ExecutorService bg(int i) {
        if (ldr == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (ldr == null) {
                    com.bytedance.sdk.component.Kg.bg bgVarBg = new com.bytedance.sdk.component.Kg.bg.C0099bg().bg("io").bg(2).IL(i).bg(20L).bg(java.util.concurrent.TimeUnit.SECONDS).bg(new java.util.concurrent.LinkedBlockingQueue()).bg(Kg()).bg(bg().createThreadFactory(i, "io")).bg();
                    ldr = bgVarBg;
                    bgVarBg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return ldr;
    }

    public static void IL(com.bytedance.sdk.component.Kg.Kg kg) {
        if (ldr == null) {
            bX();
        }
        if (ldr != null) {
            ldr.execute(kg);
        }
    }

    public static void bg(com.bytedance.sdk.component.Kg.Kg kg, int i) {
        IL(kg);
    }

    public static void bg(com.bytedance.sdk.component.Kg.Kg kg, int i, int i2) {
        if (ldr == null) {
            bg(i2);
        }
        if (kg == null || ldr == null) {
            return;
        }
        kg.setPriority(i);
        ldr.execute(kg);
    }

    public static java.util.concurrent.ExecutorService eqN() {
        if (Kg == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (Kg == null) {
                    com.bytedance.sdk.component.Kg.bg bgVarBg = new com.bytedance.sdk.component.Kg.bg.C0099bg().bg("log").IL(10).bg(4).bg(20L).bg(java.util.concurrent.TimeUnit.SECONDS).bg(new java.util.concurrent.PriorityBlockingQueue()).bg(Kg()).bg(bg().createThreadFactory(10, "log")).bg();
                    Kg = bgVarBg;
                    bgVarBg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return Kg;
    }

    public static void bX(com.bytedance.sdk.component.Kg.Kg kg) {
        if (Kg == null) {
            eqN();
        }
        if (kg == null || Kg == null) {
            return;
        }
        Kg.execute(kg);
    }

    public static void IL(com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg != null) {
            kg.setPriority(i);
        }
        bX(kg);
    }

    public static java.util.concurrent.ExecutorService zx() {
        if (eo == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (eo == null) {
                    com.bytedance.sdk.component.Kg.bg bgVarBg = new com.bytedance.sdk.component.Kg.bg.C0099bg().bg("aidl").IL(10).bg(2).bg(30L).bg(java.util.concurrent.TimeUnit.SECONDS).bg(new java.util.concurrent.PriorityBlockingQueue()).bg(Kg()).bg(bg().createThreadFactory(10, "aidl")).bg();
                    eo = bgVarBg;
                    bgVarBg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return eo;
    }

    public static void eqN(com.bytedance.sdk.component.Kg.Kg kg) {
        if (eo == null) {
            zx();
        }
        if (kg == null || eo == null) {
            return;
        }
        eo.execute(kg);
    }

    public static void bX(com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg != null) {
            kg.setPriority(i);
        }
        eqN(kg);
    }

    public static java.util.concurrent.ScheduledExecutorService ldr() {
        if (VB == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (VB == null) {
                    VB = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(bg().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return VB;
    }

    public static boolean iR() {
        return eqN;
    }

    public static void bg(boolean z) {
        eqN = z;
    }

    public static java.util.concurrent.RejectedExecutionHandler Kg() {
        return new java.util.concurrent.RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.Kg.ldr.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static com.bytedance.sdk.component.Kg.bX WR() {
        return IL;
    }

    public static void bg(com.bytedance.sdk.component.Kg.bX bXVar) {
        IL = bXVar;
    }

    public static java.util.concurrent.ExecutorService IL(int i) {
        if (iR == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (iR == null) {
                    com.bytedance.sdk.component.Kg.bg bgVarBg = new com.bytedance.sdk.component.Kg.bg.C0099bg().bg("ad").bg(2).IL(i).bg(20L).bg(java.util.concurrent.TimeUnit.SECONDS).bg(new java.util.concurrent.LinkedBlockingQueue()).bg(Kg()).bg(bg().createThreadFactory(i, "ad")).bg();
                    iR = bgVarBg;
                    bgVarBg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return iR;
    }

    public static void zx(com.bytedance.sdk.component.Kg.Kg kg) {
        if (iR == null) {
            IL(5);
        }
        if (kg == null || iR == null) {
            return;
        }
        iR.execute(kg);
    }

    public static java.util.concurrent.ExecutorService eo() {
        if (WR == null) {
            synchronized (com.bytedance.sdk.component.Kg.ldr.class) {
                if (WR == null) {
                    com.bytedance.sdk.component.Kg.bg bgVarBg = new com.bytedance.sdk.component.Kg.bg.C0099bg().bg("computation").bg(3).IL(10).bg(20L).bg(java.util.concurrent.TimeUnit.SECONDS).bg(new java.util.concurrent.PriorityBlockingQueue()).bg(Kg()).bg(bg().createThreadFactory(10, "computation")).bg();
                    WR = bgVarBg;
                    bgVarBg.allowCoreThreadTimeOut(true);
                }
            }
        }
        return WR;
    }

    public static void bX(int i) {
        bX = i;
    }
}
