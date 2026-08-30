package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class z implements java.io.Closeable {
    private static final java.nio.charset.Charset b = java.nio.charset.StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.io.Writer f351a;
    private final java.io.File c;
    private final java.io.File d;
    private final java.io.File e;
    private final long g;
    private int k;
    private long i = 0;
    private final java.util.LinkedHashMap<java.lang.String, com.amoad.z.b> j = new java.util.LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    private final java.util.concurrent.ExecutorService m = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
    private final java.util.concurrent.Callable<java.lang.Void> n = new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.amoad.z.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() {
            synchronized (com.amoad.z.this) {
                if (com.amoad.z.this.f351a == null) {
                    return null;
                }
                com.amoad.z.this.f();
                if (com.amoad.z.this.d()) {
                    com.amoad.z.this.c();
                    com.amoad.z.e(com.amoad.z.this);
                }
                return null;
            }
        }
    };
    private final int f = 1;
    private final int h = 1;

    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.amoad.z.b f353a;
        boolean b;

        /* JADX INFO: renamed from: com.amoad.z$a$a, reason: collision with other inner class name */
        class C0017a extends java.io.FilterOutputStream {
            private C0017a(java.io.OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ C0017a(com.amoad.z.a aVar, java.io.OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (java.io.IOException unused) {
                    com.amoad.z.a.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (java.io.IOException unused) {
                    com.amoad.z.a.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (java.io.IOException unused) {
                    com.amoad.z.a.this.b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (java.io.IOException unused) {
                    com.amoad.z.a.this.b = true;
                }
            }
        }

        private a(com.amoad.z.b bVar) {
            this.f353a = bVar;
        }

        /* synthetic */ a(com.amoad.z zVar, com.amoad.z.b bVar, byte b) {
            this(bVar);
        }

        final java.io.InputStream a() {
            synchronized (com.amoad.z.this) {
                if (this.f353a.d != this) {
                    throw new java.lang.IllegalStateException();
                }
                if (!this.f353a.c) {
                    return null;
                }
                return new java.io.FileInputStream(this.f353a.a(0));
            }
        }

        final java.io.OutputStream b() {
            com.amoad.z.a.C0017a c0017a;
            synchronized (com.amoad.z.this) {
                if (this.f353a.d != this) {
                    throw new java.lang.IllegalStateException();
                }
                c0017a = new com.amoad.z.a.C0017a(this, new java.io.FileOutputStream(this.f353a.b(0)), (byte) 0);
            }
            return c0017a;
        }

        final void c() {
            if (!this.b) {
                com.amoad.z.this.a(this, true);
            } else {
                com.amoad.z.this.a(this, false);
                com.amoad.z.this.c(this.f353a.f355a);
            }
        }

        final void d() {
            com.amoad.z.this.a(this, false);
        }
    }

    final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f355a;
        final long[] b;
        boolean c;
        com.amoad.z.a d;
        long e;

        private b(java.lang.String str) {
            this.f355a = str;
            this.b = new long[com.amoad.z.this.h];
        }

        /* synthetic */ b(com.amoad.z zVar, java.lang.String str, byte b) {
            this(str);
        }

        private static java.io.IOException b(java.lang.String[] strArr) throws java.io.IOException {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(strArr));
        }

        final java.io.File a(int i) {
            return new java.io.File(com.amoad.z.this.c, this.f355a + "." + i);
        }

        final java.lang.String a() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (long j : this.b) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        final void a(java.lang.String[] strArr) throws java.io.IOException {
            if (strArr.length != com.amoad.z.this.h) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = java.lang.Long.parseLong(strArr[i]);
                } catch (java.lang.NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        final java.io.File b(int i) {
            return new java.io.File(com.amoad.z.this.c, this.f355a + "." + i + ".tmp");
        }
    }

    final class c implements java.io.Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f356a;
        final long b;
        final java.io.InputStream[] c;

        private c(java.lang.String str, long j, java.io.InputStream[] inputStreamArr) {
            this.f356a = str;
            this.b = j;
            this.c = inputStreamArr;
        }

        /* synthetic */ c(com.amoad.z zVar, java.lang.String str, long j, java.io.InputStream[] inputStreamArr, byte b) {
            this(str, j, inputStreamArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (java.io.InputStream inputStream : this.c) {
                com.amoad.z.a((java.io.Closeable) inputStream);
            }
        }
    }

    private z(java.io.File file, long j) {
        this.c = file;
        this.d = new java.io.File(file, "journal");
        this.e = new java.io.File(file, "journal.tmp");
        this.g = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized com.amoad.z.a a(java.lang.String str, long j) {
        e();
        d(str);
        com.amoad.z.b bVar = this.j.get(str);
        if (j != -1 && (bVar == null || bVar.e != j)) {
            return null;
        }
        byte b2 = 0;
        if (bVar == null) {
            bVar = new com.amoad.z.b(this, str, b2);
            this.j.put(str, bVar);
        } else if (bVar.d != null) {
            return null;
        }
        com.amoad.z.a aVar = new com.amoad.z.a(this, bVar, b2);
        bVar.d = aVar;
        this.f351a.write("DIRTY " + str + '\n');
        this.f351a.flush();
        return aVar;
    }

    static com.amoad.z a(java.io.File file, long j) throws java.io.IOException {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        com.amoad.z zVar = new com.amoad.z(file, j);
        if (zVar.d.exists()) {
            try {
                zVar.a();
                zVar.b();
                zVar.f351a = new java.io.BufferedWriter(new java.io.FileWriter(zVar.d, true), 8192);
                return zVar;
            } catch (java.io.IOException unused) {
                zVar.close();
                a(zVar.c);
            }
        }
        file.mkdirs();
        com.amoad.z zVar2 = new com.amoad.z(file, j);
        zVar2.c();
        return zVar2;
    }

    private static java.lang.String a(java.io.InputStream inputStream) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(80);
        while (true) {
            int i = inputStream.read();
            if (i == -1) {
                throw new java.io.EOFException();
            }
            if (i == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == '\r') {
                        sb.setLength(i2);
                    }
                }
                return sb.toString();
            }
            sb.append((char) i);
        }
    }

    private void a() {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(this.d), 8192);
        try {
            java.lang.String strA = a((java.io.InputStream) bufferedInputStream);
            java.lang.String strA2 = a((java.io.InputStream) bufferedInputStream);
            java.lang.String strA3 = a((java.io.InputStream) bufferedInputStream);
            java.lang.String strA4 = a((java.io.InputStream) bufferedInputStream);
            java.lang.String strA5 = a((java.io.InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !java.lang.Integer.toString(this.f).equals(strA3) || !java.lang.Integer.toString(this.h).equals(strA4) || !"".equals(strA5)) {
                throw new java.io.IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + com.ironsource.y8.i.e);
            }
            while (true) {
                try {
                    java.lang.String strA6 = a((java.io.InputStream) bufferedInputStream);
                    java.lang.String[] strArrSplit = strA6.split(" ");
                    if (strArrSplit.length < 2) {
                        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                    }
                    java.lang.String str = strArrSplit[1];
                    byte b2 = 0;
                    if (strArrSplit[0].equals("REMOVE") && strArrSplit.length == 2) {
                        this.j.remove(str);
                    } else {
                        com.amoad.z.b bVar = this.j.get(str);
                        if (bVar == null) {
                            bVar = new com.amoad.z.b(this, str, b2);
                            this.j.put(str, bVar);
                        }
                        if (strArrSplit[0].equals("CLEAN") && strArrSplit.length == this.h + 2) {
                            bVar.c = true;
                            bVar.d = null;
                            int length = strArrSplit.length;
                            int length2 = strArrSplit.length;
                            if (2 > length) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            if (2 > length2) {
                                throw new java.lang.ArrayIndexOutOfBoundsException();
                            }
                            int i = length - 2;
                            int iMin = java.lang.Math.min(i, length2 - 2);
                            java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(strArrSplit.getClass().getComponentType(), i);
                            java.lang.System.arraycopy(strArrSplit, 2, objArr, 0, iMin);
                            bVar.a((java.lang.String[]) objArr);
                        } else if (strArrSplit[0].equals("DIRTY") && strArrSplit.length == 2) {
                            bVar.d = new com.amoad.z.a(this, bVar, b2);
                        } else if (!strArrSplit[0].equals("READ") || strArrSplit.length != 2) {
                            throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                        }
                    }
                } catch (java.io.EOFException unused) {
                    a((java.io.Closeable) bufferedInputStream);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            a((java.io.Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(com.amoad.z.a aVar, boolean z) {
        com.amoad.z.b bVar = aVar.f353a;
        if (bVar.d != aVar) {
            throw new java.lang.IllegalStateException();
        }
        if (z && !bVar.c) {
            for (int i = 0; i < this.h; i++) {
                if (!bVar.b(i).exists()) {
                    aVar.d();
                    throw new java.lang.IllegalStateException("edit didn't create file ".concat(java.lang.String.valueOf(i)));
                }
            }
        }
        for (int i2 = 0; i2 < this.h; i2++) {
            java.io.File fileB = bVar.b(i2);
            if (!z) {
                b(fileB);
            } else if (fileB.exists()) {
                java.io.File fileA = bVar.a(i2);
                fileB.renameTo(fileA);
                long j = bVar.b[i2];
                long length = fileA.length();
                bVar.b[i2] = length;
                this.i = (this.i - j) + length;
            }
        }
        this.k++;
        bVar.d = null;
        if (bVar.c || z) {
            bVar.c = true;
            this.f351a.write("CLEAN " + bVar.f355a + bVar.a() + '\n');
            if (z) {
                long j2 = this.l;
                this.l = 1 + j2;
                bVar.e = j2;
            }
        } else {
            this.j.remove(bVar.f355a);
            this.f351a.write("REMOVE " + bVar.f355a + '\n');
        }
        if (this.i > this.g || d()) {
            this.m.submit(this.n);
        }
    }

    static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private static void a(java.io.File file) throws java.io.IOException {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new java.lang.IllegalArgumentException("not a directory: ".concat(java.lang.String.valueOf(file)));
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: ".concat(java.lang.String.valueOf(file2)));
            }
        }
    }

    private void b() throws java.io.IOException {
        b(this.e);
        java.util.Iterator<com.amoad.z.b> it = this.j.values().iterator();
        while (it.hasNext()) {
            com.amoad.z.b next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.h) {
                    this.i += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.h) {
                    b(next.a(i));
                    b(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private static void b(java.io.File file) throws java.io.IOException {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        java.io.Writer writer = this.f351a;
        if (writer != null) {
            writer.close();
        }
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(this.e), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(java.lang.Integer.toString(this.f));
        bufferedWriter.write("\n");
        bufferedWriter.write(java.lang.Integer.toString(this.h));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (com.amoad.z.b bVar : this.j.values()) {
            bufferedWriter.write(bVar.d != null ? "DIRTY " + bVar.f355a + '\n' : "CLEAN " + bVar.f355a + bVar.a() + '\n');
        }
        bufferedWriter.close();
        this.e.renameTo(this.d);
        this.f351a = new java.io.BufferedWriter(new java.io.FileWriter(this.d, true), 8192);
    }

    private static void d(java.lang.String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new java.lang.IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    static /* synthetic */ int e(com.amoad.z zVar) {
        zVar.k = 0;
        return 0;
    }

    private void e() {
        if (this.f351a == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        while (this.i > this.g) {
            c(this.j.entrySet().iterator().next().getKey());
        }
    }

    final synchronized com.amoad.z.c a(java.lang.String str) {
        e();
        d(str);
        com.amoad.z.b bVar = this.j.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.c) {
            return null;
        }
        java.io.InputStream[] inputStreamArr = new java.io.InputStream[this.h];
        for (int i = 0; i < this.h; i++) {
            try {
                inputStreamArr[i] = new java.io.FileInputStream(bVar.a(i));
            } catch (java.io.FileNotFoundException unused) {
                return null;
            }
        }
        this.k++;
        this.f351a.append((java.lang.CharSequence) ("READ " + str + '\n'));
        if (d()) {
            this.m.submit(this.n);
        }
        return new com.amoad.z.c(this, str, bVar.e, inputStreamArr, (byte) 0);
    }

    final com.amoad.z.a b(java.lang.String str) {
        return a(str, -1L);
    }

    final synchronized boolean c(java.lang.String str) {
        e();
        d(str);
        com.amoad.z.b bVar = this.j.get(str);
        if (bVar != null && bVar.d == null) {
            for (int i = 0; i < this.h; i++) {
                java.io.File fileA = bVar.a(i);
                if (!fileA.delete()) {
                    throw new java.io.IOException("failed to delete ".concat(java.lang.String.valueOf(fileA)));
                }
                this.i -= bVar.b[i];
                bVar.b[i] = 0;
            }
            this.k++;
            this.f351a.append((java.lang.CharSequence) ("REMOVE " + str + '\n'));
            this.j.remove(str);
            if (d()) {
                this.m.submit(this.n);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f351a == null) {
            return;
        }
        for (com.amoad.z.b bVar : new java.util.ArrayList(this.j.values())) {
            if (bVar.d != null) {
                bVar.d.d();
            }
        }
        f();
        this.f351a.close();
        this.f351a = null;
    }
}
