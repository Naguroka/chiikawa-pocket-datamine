package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    public static int bg() {
        return java.lang.Math.max(java.lang.Runtime.getRuntime().availableProcessors(), 0);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.iR$1, reason: invalid class name */
    static class AnonymousClass1 implements java.io.FilenameFilter {
        private final java.util.regex.Pattern bg = java.util.regex.Pattern.compile("^cpu[0-9]+$");

        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return this.bg.matcher(str).matches();
        }
    }

    public static int bg(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("cpu_count", 0);
    }

    public static int IL(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("cpu_max_frequency", 0);
    }

    public static int bX(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("cpu_min_frequency", 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #6 {Exception -> 0x0062, blocks: (B:22:0x005a, B:24:0x005f), top: B:48:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #1 {Exception -> 0x006f, blocks: (B:28:0x0067, B:30:0x006c), top: B:38:0x0067 }] */
    public static int bg(int i) {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th;
        int i2;
        int i3 = 0;
        java.io.FileReader fileReader = null;
        java.io.BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                java.io.FileReader fileReader2 = new java.io.FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    java.io.BufferedReader bufferedReader3 = new java.io.BufferedReader(fileReader2);
                    try {
                        java.lang.String line = bufferedReader3.readLine();
                        if (!android.text.TextUtils.isEmpty(line) && (i2 = java.lang.Integer.parseInt(line)) > i3) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (java.lang.Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.PX.bg("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (java.lang.Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (java.lang.Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (java.lang.Exception unused3) {
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    java.io.BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (java.lang.Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #4 {Exception -> 0x0065, blocks: (B:24:0x005d, B:26:0x0062), top: B:46:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006f A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #5 {Exception -> 0x0072, blocks: (B:30:0x006a, B:32:0x006f), top: B:48:0x006a }] */
    public static int IL(int i) {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th;
        int i2;
        int i3 = 0;
        java.io.FileReader fileReader = null;
        java.io.BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                java.io.FileReader fileReader2 = new java.io.FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                try {
                    java.io.BufferedReader bufferedReader3 = new java.io.BufferedReader(fileReader2);
                    try {
                        java.lang.String line = bufferedReader3.readLine();
                        if (!android.text.TextUtils.isEmpty(line) && ((i2 = java.lang.Integer.parseInt(line)) < i3 || i3 == 0)) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (java.lang.Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.PX.bg("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (java.lang.Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (java.lang.Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (java.lang.Exception unused3) {
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    java.io.BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (java.lang.Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }
}
