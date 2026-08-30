package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.io.FileFilter f3776a = new com.pgl.ssdk.a0.a();

    static class a implements java.io.FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            return java.util.regex.Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    private static java.lang.String a(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.io.FileReader fileReader;
        java.lang.String line = null;
        try {
            try {
                fileReader = new java.io.FileReader(str);
                try {
                    bufferedReader = new java.io.BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable unused) {
                        }
                    } catch (java.lang.Throwable unused2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.lang.Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        if (line == null) {
                            return "0";
                        }
                        return line.trim();
                    }
                } catch (java.lang.Throwable unused4) {
                    bufferedReader = null;
                }
            } catch (java.lang.Throwable unused5) {
                bufferedReader = null;
                fileReader = null;
            }
            fileReader.close();
        } catch (java.lang.Throwable unused6) {
        }
        if (line == null) {
            return "0";
        }
        return line.trim();
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> b() {
        java.io.FileReader fileReader;
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.io.BufferedReader bufferedReader = null;
        try {
            fileReader = new java.io.FileReader("/proc/cpuinfo");
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(fileReader);
                while (true) {
                    try {
                        java.lang.String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (java.lang.Throwable unused) {
                            }
                        } else {
                            java.lang.String[] strArrSplit = line.split(":", 2);
                            if (strArrSplit.length >= 2) {
                                java.lang.String strTrim = strArrSplit[0].trim();
                                java.lang.String strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (java.lang.Throwable unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.lang.Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        return map;
                    }
                }
                bufferedReader2.close();
            } catch (java.lang.Throwable unused4) {
            }
        } catch (java.lang.Throwable unused5) {
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (java.lang.Throwable unused6) {
        }
        return map;
    }

    public static java.lang.String c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.HashMap<java.lang.String, java.lang.String> mapB = b();
            jSONObject.put("core", a());
            jSONObject.put("hw", a(mapB, "Hardware"));
            jSONObject.put(com.applovin.sdk.AppLovinMediationProvider.MAX, a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", a(mapB, "Features"));
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String string = jSONObject.toString();
        return string == null ? com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON : string.trim();
    }

    private static java.lang.String a(java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = map.get(str);
        } catch (java.lang.Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    private static int a() {
        try {
            return new java.io.File("/sys/devices/system/cpu/").listFiles(f3776a).length;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }
}
