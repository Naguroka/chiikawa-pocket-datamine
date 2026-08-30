package com.apm.insight.nativecrash;

/* JADX INFO: compiled from: Tombstone.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final java.util.regex.Pattern i = java.util.regex.Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final java.util.regex.Pattern j = java.util.regex.Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
    private static final java.util.regex.Pattern k = java.util.regex.Pattern.compile("^Abort message: (.*)$");
    private static final java.util.regex.Pattern l = java.util.regex.Pattern.compile("^Crash message: (.*)$");
    private static final java.util.regex.Pattern m = java.util.regex.Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f461a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.util.Map<java.lang.String, java.lang.String> h = new java.util.HashMap();

    public final java.lang.String a() {
        return this.g;
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        return this.h;
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.e;
        if (str != null) {
            sb.append(str);
        }
        java.lang.String str2 = this.f;
        if (str2 != null) {
            sb.append(str2);
        }
        java.lang.String str3 = this.g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public final void a(java.io.File file) {
        java.io.File fileB = com.apm.insight.l.j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new java.io.File(fileB.getAbsoluteFile() + ".old"));
        }
        com.apm.insight.nativecrash.NativeImpl.a(file);
        c(com.apm.insight.l.j.b(file));
    }

    public final void b(java.io.File file) {
        c(com.apm.insight.l.j.b(file));
    }

    private void c(java.io.File file) {
        if (!file.exists() || file.length() == 0) {
            return;
        }
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
            int i2 = 0;
            while (true) {
                try {
                    java.lang.String line = bufferedReader2.readLine();
                    if (line == null || i2 >= 64) {
                        break;
                    }
                    if (this.f461a == null && line.startsWith("pid: ")) {
                        java.util.regex.Matcher matcher = i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f461a = matcher.group(1);
                            this.b = matcher.group(2);
                            this.d = matcher.group(3);
                            this.c = matcher.group(4);
                        }
                    } else if (this.e == null && line.startsWith("signal ")) {
                        java.util.regex.Matcher matcher2 = j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            java.lang.String strReplace = matcher2.group(1).replace(" ", "");
                            java.lang.String strReplace2 = matcher2.group(2).replace(" ", "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.e = "Signal " + strReplace + ", Code " + strReplace2 + "\n";
                        }
                    } else if (this.f == null && line.startsWith("Abort ")) {
                        java.util.regex.Matcher matcher3 = k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            this.f = "abort message: " + matcher3.group(1) + "\n";
                        }
                    } else if (this.f == null && line.startsWith("Crash ")) {
                        java.util.regex.Matcher matcher4 = l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            this.f = "crash message: " + matcher4.group(1) + "\n";
                        }
                    } else if (this.g == null && line.startsWith("backtrace:")) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        while (true) {
                            java.lang.String line2 = bufferedReader2.readLine();
                            if (line2 == null || !line2.startsWith("    #")) {
                                break;
                            } else {
                                sb.append(line2.substring(4)).append('\n');
                            }
                        }
                        i2++;
                        this.g = sb.toString();
                    } else if (this.h.isEmpty() && line.startsWith("build id:")) {
                        while (true) {
                            java.lang.String line3 = bufferedReader2.readLine();
                            if (line3 == null || !line3.contains("BuildId:")) {
                                break;
                            }
                            java.util.regex.Matcher matcher5 = m.matcher(line3);
                            if (matcher5.find()) {
                                java.lang.String strGroup = matcher5.group(1);
                                java.lang.String strGroup2 = matcher5.group(2);
                                java.lang.String strGroup3 = matcher5.group(3);
                                if (strGroup.equals("data")) {
                                    this.h.put(strGroup2, strGroup3);
                                }
                            }
                        }
                    }
                    i2++;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                        return;
                    } finally {
                        com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                    }
                }
            }
            com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public c(java.io.File file) {
        c(com.apm.insight.l.j.b(file));
    }
}
