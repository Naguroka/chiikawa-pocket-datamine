package com.apm.insight.l;

/* JADX INFO: compiled from: Stack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.StackTraceElement f452a = new java.lang.StackTraceElement("", "", "", 0);

    public static java.lang.String a(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    public static java.lang.StringBuilder a(java.lang.StackTraceElement stackTraceElement, java.lang.StringBuilder sb) {
        sb.append("  at ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
        return sb;
    }

    public static java.lang.String a(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        try {
            a(th, printWriter);
            java.lang.String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (java.lang.Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    public static java.lang.StackTraceElement[] b(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            a(th, arrayList);
        } catch (java.lang.Throwable unused) {
        }
        return (java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[arrayList.size()]);
    }

    public static java.lang.String a(java.lang.Throwable th, java.io.PrintStream printStream, com.apm.insight.l.e.a aVar) {
        java.security.MessageDigest messageDigest;
        try {
            messageDigest = java.security.MessageDigest.getInstance("MD5");
        } catch (java.lang.Throwable unused) {
            messageDigest = null;
        }
        com.apm.insight.l.e eVar = new com.apm.insight.l.e(printStream, messageDigest, aVar);
        try {
            a(th, eVar);
        } catch (java.lang.Throwable unused2) {
        }
        eVar.close();
        if (messageDigest == null) {
            return null;
        }
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest == null || bArrDigest.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArrDigest.length << 1];
        int i = 0;
        for (byte b : bArrDigest) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new java.lang.String(cArr2);
    }

    public static java.lang.String a(java.lang.String str) {
        java.io.BufferedReader bufferedReader = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
            int i2 = 0;
            while (true) {
                try {
                    java.lang.String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if (i2 <= 256) {
                        linkedList.add(line);
                        sb.append(line).append('\n');
                    } else {
                        linkedList2.add(line);
                        if (linkedList2.size() > 256) {
                            linkedList2.poll();
                            i++;
                        }
                    }
                    i2++;
                } catch (java.lang.Throwable unused) {
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                }
            }
            com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
        } catch (java.lang.Throwable unused2) {
        }
        if (!linkedList2.isEmpty()) {
            if (i != 0) {
                sb.append("\t... skip ").append(i).append(" lines\n");
            }
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                sb.append((java.lang.String) it.next()).append('\n');
            }
        }
        return sb.toString();
    }

    public static org.json.JSONObject b(java.lang.String str) {
        boolean z;
        try {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : allStackTraces.entrySet()) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.Thread key = entry.getKey();
                java.lang.String name = key.getName();
                if (!c(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put("thread_name", key.getName() + "(" + key.getId() + ")");
                    java.lang.StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        for (java.lang.StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        z = jSONArray2.length() > 0;
                    }
                    if (z) {
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean c(java.lang.String str) {
        java.util.Set<java.lang.String> setA = com.apm.insight.l.g.a();
        if (setA.contains(str)) {
            return true;
        }
        for (java.lang.String str2 : setA) {
            if (!android.text.TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(java.lang.Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof java.lang.OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    public static boolean d(java.lang.Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof java.lang.OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (java.lang.Throwable unused) {
                return true;
            }
        }
        return false;
    }

    private static void b(java.lang.Throwable th, int i) {
        th.getClass().getName();
        java.lang.String localizedMessage = th.getLocalizedMessage();
        try {
            com.apm.insight.nativecrash.NativeImpl.a(i, th.getClass().getName());
            if (localizedMessage != null) {
                com.apm.insight.nativecrash.NativeImpl.a(i, ": ");
                com.apm.insight.nativecrash.NativeImpl.a(i, localizedMessage);
            }
            com.apm.insight.nativecrash.NativeImpl.a(i, "\n");
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void a(java.lang.Throwable th, java.util.List<java.lang.StackTraceElement> list) {
        if (th == null) {
            return;
        }
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        setNewSetFromMap.add(th);
        list.add(f452a);
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int i = 0;
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            if (z && i > 256) {
                list.add(f452a);
                break;
            } else {
                list.add(stackTraceElement);
                i++;
            }
        }
        if (z) {
            for (int length = stackTrace.length - 128; length < stackTrace.length; length++) {
                list.add(stackTrace[length]);
            }
        }
        for (java.lang.Throwable th2 : th.getSuppressed()) {
            a(th2, list, "\t", setNewSetFromMap, 128);
        }
        java.lang.Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, list, "", setNewSetFromMap, 128);
        }
    }

    private static void a(java.lang.Throwable th, java.util.List<java.lang.StackTraceElement> list, java.lang.String str, java.util.Set<java.lang.Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            int i2 = 0;
            boolean z = stackTrace.length > i;
            list.add(f452a);
            int i3 = 0;
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                if (z && i3 > i) {
                    list.add(f452a);
                    break;
                } else {
                    list.add(stackTraceElement);
                    i3++;
                }
            }
            if (z) {
                for (int length = stackTrace.length - (i / 2); length < stackTrace.length; length++) {
                    list.add(stackTrace[length]);
                }
            }
            java.lang.Throwable[] suppressed = th.getSuppressed();
            int length2 = suppressed.length;
            while (true) {
                int i4 = 10;
                if (i2 >= length2) {
                    break;
                }
                java.lang.Throwable th2 = suppressed[i2];
                java.lang.String str2 = str + "\t";
                int i5 = i / 2;
                if (i5 > 10) {
                    i4 = i5;
                }
                a(th2, list, str2, set, i4);
                i2++;
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
        }
        list.add(f452a);
    }

    private static void a(java.lang.Throwable th, java.io.PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        setNewSetFromMap.add(th);
        printWriter.println(th);
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int i = 0;
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            if (z && i > 256) {
                printWriter.println("\t... skip " + ((stackTrace.length - i) - 128) + " lines");
                break;
            } else {
                printWriter.println("\tat ".concat(java.lang.String.valueOf(stackTraceElement)));
                i++;
            }
        }
        if (z) {
            for (int length = stackTrace.length - 128; length < stackTrace.length; length++) {
                printWriter.println("\tat " + stackTrace[length]);
            }
        }
        for (java.lang.Throwable th2 : th.getSuppressed()) {
            a(th2, printWriter, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        java.lang.Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, printWriter, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    private static void a(java.lang.Throwable th, int i, java.lang.String str, java.lang.String str2) {
        while (true) {
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                com.apm.insight.nativecrash.NativeImpl.a(i, str2);
                com.apm.insight.nativecrash.NativeImpl.a(i, str);
            } catch (java.lang.Throwable unused) {
            }
            b(th, i);
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                a(stackTraceElement, i);
            }
            for (java.lang.Throwable th2 : th.getSuppressed()) {
                a(th2, i, "Suppressed: ", str2 + "\t");
            }
            th = th.getCause();
            if (th == null) {
                return;
            } else {
                str = "Caused by: ";
            }
        }
    }

    private static void a(java.lang.Throwable th, java.io.PrintWriter printWriter, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > i;
            printWriter.println(str2 + str + th);
            int i2 = 0;
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                if (z && i2 > i) {
                    printWriter.println("\t... skip " + ((stackTrace.length - i2) - (i / 2)) + " lines");
                    break;
                } else {
                    printWriter.println("\tat ".concat(java.lang.String.valueOf(stackTraceElement)));
                    i2++;
                }
            }
            if (z) {
                for (int length = stackTrace.length - (i / 2); length < stackTrace.length; length++) {
                    printWriter.println("\tat " + stackTrace[length]);
                }
            }
            for (java.lang.Throwable th2 : th.getSuppressed()) {
                int i3 = i / 2;
                a(th2, printWriter, "Suppressed: ", str2 + "\t", set, i3 > 10 ? i3 : 10);
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
            str = "Caused by: ";
        }
        printWriter.println("\t[CIRCULAR REFERENCE:" + th + com.ironsource.y8.i.e);
    }

    /* JADX INFO: compiled from: Stack.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f453a;
        public int b;

        public a(int i, int i2) {
            this.f453a = i;
            this.b = i2;
        }

        public final org.json.JSONObject a() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.START, this.f453a);
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.END, this.b);
            } catch (java.lang.Throwable unused) {
            }
            return jSONObject;
        }
    }

    private static boolean a(java.lang.String str, java.lang.String[] strArr) {
        if (strArr != null && !android.text.TextUtils.isEmpty(str)) {
            for (java.lang.String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static org.json.JSONArray a(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String[] strArr) {
        com.apm.insight.l.m.a aVar = new com.apm.insight.l.m.a(-1, -1);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            if (aVar.f453a == -1) {
                if (a(stackTraceElementArr[i].getClassName(), strArr)) {
                    aVar.f453a = i;
                    aVar.b = i;
                }
            } else if (!a(stackTraceElementArr[i].getClassName(), strArr)) {
                aVar.b = i;
                jSONArray.put(aVar.a());
                aVar = new com.apm.insight.l.m.a(-1, -1);
            }
        }
        if (aVar.f453a != -1) {
            aVar.b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static org.json.JSONArray a(java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.apm.insight.l.m.a aVar = new com.apm.insight.l.m.a(-1, -1);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < strArr.length; i++) {
            if (aVar.f453a == -1) {
                if (a(strArr[i], strArr2)) {
                    aVar.f453a = i;
                    aVar.b = i;
                }
            } else if (!a(strArr[i], strArr2)) {
                aVar.b = i;
                jSONArray.put(aVar.a());
                aVar = new com.apm.insight.l.m.a(-1, -1);
            }
        }
        if (aVar.f453a != -1) {
            aVar.b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static void a(java.lang.Throwable th, int i) {
        if (th == null || i <= 0) {
            return;
        }
        try {
            b(th, i);
            for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
                a(stackTraceElement, i);
            }
            for (java.lang.Throwable th2 : th.getSuppressed()) {
                a(th2, i, "Suppressed: ", "\t");
            }
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                a(cause, i, "Caused by: ", "");
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void a(java.lang.StackTraceElement stackTraceElement, int i) {
        try {
            com.apm.insight.nativecrash.NativeImpl.a(i, "\tat ");
            com.apm.insight.nativecrash.NativeImpl.a(i, stackTraceElement.getClassName());
            com.apm.insight.nativecrash.NativeImpl.a(i, ".");
            com.apm.insight.nativecrash.NativeImpl.a(i, stackTraceElement.getMethodName());
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        com.apm.insight.nativecrash.NativeImpl.a(i, "(");
                        com.apm.insight.nativecrash.NativeImpl.a(i, stackTraceElement.getFileName());
                        com.apm.insight.nativecrash.NativeImpl.a(i, ":");
                        com.apm.insight.nativecrash.NativeImpl.a(i, java.lang.String.valueOf(stackTraceElement.getLineNumber()));
                        com.apm.insight.nativecrash.NativeImpl.a(i, ")");
                    } else {
                        com.apm.insight.nativecrash.NativeImpl.a(i, "(");
                        com.apm.insight.nativecrash.NativeImpl.a(i, stackTraceElement.getFileName());
                        com.apm.insight.nativecrash.NativeImpl.a(i, ")");
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    com.apm.insight.nativecrash.NativeImpl.a(i, "(Unknown Source:");
                    com.apm.insight.nativecrash.NativeImpl.a(i, java.lang.String.valueOf(stackTraceElement.getLineNumber()));
                    com.apm.insight.nativecrash.NativeImpl.a(i, ")");
                } else {
                    com.apm.insight.nativecrash.NativeImpl.a(i, "(Unknown Source)");
                }
            } else {
                com.apm.insight.nativecrash.NativeImpl.a(i, "(Native Method)");
            }
            com.apm.insight.nativecrash.NativeImpl.a(i, "\n");
        } catch (java.lang.Throwable unused) {
        }
    }
}
