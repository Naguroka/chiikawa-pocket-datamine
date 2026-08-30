package com.apm.insight.l;

/* JADX INFO: compiled from: App.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f438a = null;
    private static java.lang.Class<?> b = null;
    private static java.lang.reflect.Field c = null;
    private static java.lang.reflect.Field d = null;
    private static boolean e = false;

    private static long a(int i) {
        if (i < 0) {
            return 0L;
        }
        return ((long) i) << 10;
    }

    public static boolean a(android.content.Context context) {
        if (context == null) {
            return com.apm.insight.runtime.a.b.d().f();
        }
        return com.apm.insight.runtime.a.b.d().f() || g(context);
    }

    private static boolean g(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.lang.String packageName = context.getPackageName();
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        return packageName.equals(runningAppProcessInfo.pkgList[0]);
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static android.app.ActivityManager.ProcessErrorStateInfo b(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int iMyPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            for (android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                    return processErrorStateInfo;
                }
            }
        }
        return null;
    }

    public static boolean c(android.content.Context context) {
        java.lang.String strD = d(context);
        if (strD != null && strD.contains(":")) {
            return false;
        }
        if (strD == null || !strD.equals(context.getPackageName())) {
            return strD != null && strD.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    public static void a(java.lang.String str) {
        f438a = str;
    }

    public static java.lang.String d(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(f438a)) {
            return f438a;
        }
        try {
            int iMyPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        java.lang.String str = runningAppProcessInfo.processName;
                        f438a = str;
                        return str;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String strA = a();
        f438a = strA;
        return strA == null ? "" : strA;
    }

    private static java.lang.String a() {
        java.io.BufferedReader bufferedReader;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + android.os.Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    int i = bufferedReader.read();
                    if (i > 0) {
                        sb.append((char) i);
                    } else {
                        java.lang.String string = sb.toString();
                        com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                        return string;
                    }
                }
            } catch (java.lang.Throwable unused) {
                com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                return null;
            }
        } catch (java.lang.Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static java.lang.String e(android.content.Context context) {
        java.lang.Class<?> clsH = h(context);
        if (c == null && clsH != null) {
            try {
                c = clsH.getDeclaredField("VERSION_NAME");
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        java.lang.reflect.Field field = c;
        if (field == null) {
            return "";
        }
        try {
            return java.lang.String.valueOf(field.get(null));
        } catch (java.lang.Throwable unused2) {
            return "";
        }
    }

    public static int f(android.content.Context context) {
        java.lang.Class<?> clsH = h(context);
        if (d == null && clsH != null) {
            try {
                d = clsH.getDeclaredField("VERSION_CODE");
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        java.lang.reflect.Field field = d;
        if (field == null) {
            return -1;
        }
        try {
            return ((java.lang.Integer) field.get(null)).intValue();
        } catch (java.lang.Throwable unused2) {
            return -1;
        }
    }

    private static java.lang.Class<?> h(android.content.Context context) {
        if (b == null && !e) {
            try {
                b = java.lang.Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (java.lang.ClassNotFoundException unused) {
            }
            e = true;
        }
        return b;
    }

    public static void a(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
            android.os.Debug.getMemoryInfo(memoryInfo);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
            jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
            jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
            jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
            jSONObject2.put("nativePss", a(memoryInfo.nativePss));
            jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
            jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
            jSONObject2.put("otherPss", a(memoryInfo.otherPss));
            jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
            try {
                java.lang.String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!android.text.TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", a(java.lang.Integer.parseInt(memoryStat)));
                }
            } catch (java.lang.Throwable unused) {
            }
            jSONObject2.put("totalPrivateClean", com.apm.insight.l.c.a(memoryInfo));
            jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
            jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
            jSONObject2.put("totalSharedClean", com.apm.insight.l.c.b(memoryInfo));
            jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
            jSONObject2.put("totalSwappablePss", a(com.apm.insight.l.c.c(memoryInfo)));
            jSONObject.put("memory_info", jSONObject2);
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                android.app.ActivityManager.MemoryInfo memoryInfo2 = new android.app.ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo2);
                jSONObject3.put("availMem", memoryInfo2.availMem);
                jSONObject3.put("lowMemory", memoryInfo2.lowMemory);
                jSONObject3.put("threshold", memoryInfo2.threshold);
                jSONObject3.put("totalMem", com.apm.insight.l.i.a(memoryInfo2));
                jSONObject.put("sys_memory_info", jSONObject3);
            }
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            boolean z = true;
            com.apm.insight.entity.a.a(jSONObject, "filters", "native_heap_leak", java.lang.String.valueOf(android.os.Debug.getNativeHeapAllocatedSize() > 209715200));
            jSONObject4.put("native_heap_size", android.os.Debug.getNativeHeapSize());
            jSONObject4.put("native_heap_alloc_size", android.os.Debug.getNativeHeapAllocatedSize());
            jSONObject4.put("native_heap_free_size", android.os.Debug.getNativeHeapFreeSize());
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            jSONObject4.put("max_memory", jMaxMemory);
            jSONObject4.put("free_memory", jFreeMemory);
            jSONObject4.put("total_memory", j);
            if (j - jFreeMemory <= jMaxMemory * 0.95f) {
                z = false;
            }
            com.apm.insight.entity.a.a(jSONObject, "filters", "java_heap_leak", java.lang.String.valueOf(z));
            if (activityManager != null) {
                jSONObject4.put("memory_class", activityManager.getMemoryClass());
                jSONObject4.put("large_memory_class", activityManager.getLargeMemoryClass());
            }
            jSONObject.put("app_memory_info", jSONObject4);
        } catch (java.lang.Throwable unused2) {
        }
    }
}
