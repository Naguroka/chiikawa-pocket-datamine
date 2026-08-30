package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    private static java.lang.ClassLoader zza;
    private static java.lang.Thread zzb;

    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[Catch: all -> 0x00d5, PHI: r1
  0x00a6: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:45:0x00a1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:44:0x009f, B:57:0x00cc, B:12:0x001f, B:48:0x00a5, B:49:0x00a6, B:60:0x00d0, B:61:0x00d1, B:50:0x00a7, B:56:0x00cb, B:55:0x00b1, B:13:0x0020, B:15:0x002d, B:21:0x0042, B:22:0x0049, B:24:0x0054, B:30:0x0069, B:31:0x0070, B:41:0x0083, B:42:0x009d, B:18:0x003c), top: B:67:0x0003, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized java.lang.ClassLoader zza() {
        java.lang.SecurityException e;
        java.lang.Thread thread;
        java.lang.ThreadGroup threadGroup;
        if (zza == null) {
            java.lang.Thread thread2 = zzb;
            java.lang.ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = zzb.getContextClassLoader();
                    } catch (java.lang.SecurityException e2) {
                        android.util.Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e2.getMessage());
                    }
                }
                zza = contextClassLoader;
            } else {
                java.lang.ThreadGroup threadGroup2 = android.os.Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (java.lang.Void.class) {
                        try {
                            int iActiveGroupCount = threadGroup2.activeGroupCount();
                            java.lang.ThreadGroup[] threadGroupArr = new java.lang.ThreadGroup[iActiveGroupCount];
                            threadGroup2.enumerate(threadGroupArr);
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= iActiveGroupCount) {
                                    threadGroup = null;
                                    break;
                                }
                                threadGroup = threadGroupArr[i2];
                                if ("dynamiteLoader".equals(threadGroup.getName())) {
                                    break;
                                }
                                i2++;
                            }
                            if (threadGroup == null) {
                                threadGroup = new java.lang.ThreadGroup(threadGroup2, "dynamiteLoader");
                            }
                            int iActiveCount = threadGroup.activeCount();
                            java.lang.Thread[] threadArr = new java.lang.Thread[iActiveCount];
                            threadGroup.enumerate(threadArr);
                            while (true) {
                                if (i >= iActiveCount) {
                                    thread = null;
                                    break;
                                }
                                thread = threadArr[i];
                                if ("GmsDynamite".equals(thread.getName())) {
                                    break;
                                }
                                i++;
                            }
                            if (thread == null) {
                                try {
                                    com.google.android.gms.dynamite.zza zzaVar = new com.google.android.gms.dynamite.zza(threadGroup, "GmsDynamite");
                                    try {
                                        zzaVar.setContextClassLoader(null);
                                        zzaVar.start();
                                        thread = zzaVar;
                                    } catch (java.lang.SecurityException e3) {
                                        e = e3;
                                        thread = zzaVar;
                                        android.util.Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                    }
                                } catch (java.lang.SecurityException e4) {
                                    e = e4;
                                }
                            }
                        } catch (java.lang.SecurityException e5) {
                            e = e5;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                zzb = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = zzb.getContextClassLoader();
                    }
                }
                zza = contextClassLoader;
            }
        }
        return zza;
    }
}
