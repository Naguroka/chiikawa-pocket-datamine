package com.bytedance.sdk.component.zx.bX.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public final class bg implements java.io.Closeable {
    final java.util.concurrent.ExecutorService IL;
    private final int Kg;
    private java.io.Writer PX;
    private long WR;
    private final int eo;
    private final java.io.File eqN;
    private final java.io.File iR;
    private final java.io.File ldr;
    private int yDt;
    private final java.io.File zx;
    static final java.util.regex.Pattern bg = java.util.regex.Pattern.compile("[a-z0-9_-]{1,120}");
    public static final java.io.OutputStream bX = new java.io.OutputStream() { // from class: com.bytedance.sdk.component.zx.bX.bg.bg.bg.2
        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
        }
    };
    private long VB = 0;
    private final java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL> Ta = new java.util.LinkedHashMap<>(0, 0.75f, true);
    private long Lq = -1;
    private long vb = 0;
    private final java.util.concurrent.Callable<java.lang.Void> xxp = new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.bytedance.sdk.component.zx.bX.bg.bg.bg.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() throws java.lang.Exception {
            synchronized (com.bytedance.sdk.component.zx.bX.bg.bg.bg.this) {
                if (com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.PX == null) {
                    return null;
                }
                com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.Kg();
                if (com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.ldr()) {
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.zx();
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.yDt = 0;
                }
                return null;
            }
        }
    };

    private bg(java.io.File file, int i, int i2, long j, java.util.concurrent.ExecutorService executorService) {
        this.eqN = file;
        this.Kg = i;
        this.zx = new java.io.File(file, "journal");
        this.ldr = new java.io.File(file, "journal.tmp");
        this.iR = new java.io.File(file, "journal.bkp");
        this.eo = i2;
        this.WR = j;
        this.IL = executorService;
    }

    public static com.bytedance.sdk.component.zx.bX.bg.bg.bg bg(java.io.File file, int i, int i2, long j, java.util.concurrent.ExecutorService executorService) throws java.io.IOException {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0");
        }
        java.io.File file2 = new java.io.File(file, "journal.bkp");
        if (file2.exists()) {
            java.io.File file3 = new java.io.File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                bg(file2, file3, false);
            }
        }
        com.bytedance.sdk.component.zx.bX.bg.bg.bg bgVar = new com.bytedance.sdk.component.zx.bX.bg.bg.bg(file, i, i2, j, executorService);
        if (bgVar.zx.exists()) {
            try {
                bgVar.bX();
                bgVar.eqN();
                return bgVar;
            } catch (java.io.IOException e) {
                android.util.Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                bgVar.IL();
            }
        }
        file.mkdirs();
        com.bytedance.sdk.component.zx.bX.bg.bg.bg bgVar2 = new com.bytedance.sdk.component.zx.bX.bg.bg.bg(file, i, i2, j, executorService);
        bgVar2.zx();
        return bgVar2;
    }

    private void bX() throws java.io.IOException {
        com.bytedance.sdk.component.zx.bX.bg.bg.bX bXVar = new com.bytedance.sdk.component.zx.bX.bg.bg.bX(new java.io.FileInputStream(this.zx), com.bytedance.sdk.component.zx.bX.bg.bg.eqN.bg);
        try {
            java.lang.String strBg = bXVar.bg();
            java.lang.String strBg2 = bXVar.bg();
            java.lang.String strBg3 = bXVar.bg();
            java.lang.String strBg4 = bXVar.bg();
            java.lang.String strBg5 = bXVar.bg();
            if (!"libcore.io.DiskLruCache".equals(strBg) || !"1".equals(strBg2) || !java.lang.Integer.toString(this.Kg).equals(strBg3) || !java.lang.Integer.toString(this.eo).equals(strBg4) || !"".equals(strBg5)) {
                throw new java.io.IOException("unexpected journal header: [" + strBg + ", " + strBg2 + ", " + strBg4 + ", " + strBg5 + com.ironsource.y8.i.e);
            }
            int i = 0;
            while (true) {
                try {
                    eqN(bXVar.bg());
                    i++;
                } catch (java.io.EOFException unused) {
                    this.yDt = i - this.Ta.size();
                    if (bXVar.IL()) {
                        zx();
                    } else {
                        this.PX = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.zx, true), com.bytedance.sdk.component.zx.bX.bg.bg.eqN.bg));
                    }
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(bXVar);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(bXVar);
            throw th;
        }
    }

    private void eqN(java.lang.String str) throws java.io.IOException {
        java.lang.String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(str)));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.Ta.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il = this.Ta.get(strSubstring);
        if (il == null) {
            il = new com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL(strSubstring);
            this.Ta.put(strSubstring, il);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            java.lang.String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            il.eqN = true;
            il.zx = null;
            il.bg(strArrSplit);
            return;
        }
        if (iIndexOf2 != -1 || iIndexOf != 5 || !str.startsWith("DIRTY")) {
            if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(str)));
            }
            return;
        }
        il.zx = new com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg(il);
    }

    private void eqN() throws java.io.IOException {
        bg(this.ldr);
        java.util.Iterator<com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL> it = this.Ta.values().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL next = it.next();
            int i = 0;
            if (next.zx == null) {
                while (i < this.eo) {
                    this.VB += next.bX[i];
                    i++;
                }
            } else {
                next.zx = null;
                while (i < this.eo) {
                    bg(next.bg(i));
                    bg(next.IL(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zx() throws java.io.IOException {
        try {
            java.io.Writer writer = this.PX;
            if (writer != null) {
                writer.close();
            }
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.ldr), com.bytedance.sdk.component.zx.bX.bg.bg.eqN.bg));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(java.lang.Integer.toString(this.Kg));
                bufferedWriter.write("\n");
                bufferedWriter.write(java.lang.Integer.toString(this.eo));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il : this.Ta.values()) {
                    if (il.zx != null) {
                        bufferedWriter.write("DIRTY " + il.IL + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + il.IL + il.bg() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.zx.exists()) {
                    bg(this.zx, this.iR, true);
                }
                bg(this.ldr, this.zx, false);
                this.iR.delete();
                this.PX = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.zx, true), com.bytedance.sdk.component.zx.bX.bg.bg.eqN.bg));
            } catch (java.lang.Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }

    private static void bg(java.io.File file) throws java.io.IOException {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    private static void bg(java.io.File file, java.io.File file2, boolean z) throws java.io.IOException {
        if (z) {
            bg(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    public synchronized com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX bg(java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStream;
        iR();
        zx(str);
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il = this.Ta.get(str);
        if (il == null) {
            return null;
        }
        if (!il.eqN) {
            return null;
        }
        java.io.InputStream[] inputStreamArr = new java.io.InputStream[this.eo];
        for (int i = 0; i < this.eo; i++) {
            try {
                inputStreamArr[i] = new java.io.FileInputStream(il.bg(i));
            } catch (java.io.FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.eo && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                }
                return null;
            }
        }
        this.yDt++;
        this.PX.append((java.lang.CharSequence) ("READ " + str + '\n'));
        if (ldr()) {
            this.IL.submit(this.xxp);
        }
        return new com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX(str, il.ldr, inputStreamArr, il.bX);
    }

    public com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg IL(java.lang.String str) throws java.io.IOException {
        return bg(str, -1L);
    }

    private synchronized com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg bg(java.lang.String str, long j) throws java.io.IOException {
        iR();
        zx(str);
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il = this.Ta.get(str);
        if (j != -1 && (il == null || il.ldr != j)) {
            return null;
        }
        if (il == null) {
            il = new com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL(str);
            this.Ta.put(str, il);
        } else if (il.zx != null) {
            return null;
        }
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg c0119bg = new com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg(il);
        il.zx = c0119bg;
        this.PX.write("DIRTY " + str + '\n');
        this.PX.flush();
        return c0119bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg c0119bg, boolean z) throws java.io.IOException {
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il = c0119bg.IL;
        if (il.zx != c0119bg) {
            throw new java.lang.IllegalStateException();
        }
        if (z && !il.eqN) {
            for (int i = 0; i < this.eo; i++) {
                if (!c0119bg.bX[i]) {
                    c0119bg.IL();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index ".concat(java.lang.String.valueOf(i)));
                }
                if (!il.IL(i).exists()) {
                    c0119bg.IL();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.eo; i2++) {
            java.io.File fileIL = il.IL(i2);
            if (z) {
                if (fileIL.exists()) {
                    java.io.File fileBg = il.bg(i2);
                    fileIL.renameTo(fileBg);
                    long j = il.bX[i2];
                    long length = fileBg.length();
                    il.bX[i2] = length;
                    this.VB = (this.VB - j) + length;
                }
            } else {
                bg(fileIL);
            }
        }
        this.yDt++;
        il.zx = null;
        if (il.eqN | z) {
            il.eqN = true;
            this.PX.write("CLEAN " + il.IL + il.bg() + '\n');
            if (z) {
                long j2 = this.vb;
                this.vb = 1 + j2;
                il.ldr = j2;
            }
        } else {
            this.Ta.remove(il.IL);
            this.PX.write("REMOVE " + il.IL + '\n');
        }
        this.PX.flush();
        if (this.VB > this.WR || ldr()) {
            this.IL.submit(this.xxp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ldr() {
        int i = this.yDt;
        return i >= 2000 && i >= this.Ta.size();
    }

    public synchronized boolean bX(java.lang.String str) throws java.io.IOException {
        iR();
        zx(str);
        com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il = this.Ta.get(str);
        if (il != null && il.zx == null) {
            for (int i = 0; i < this.eo; i++) {
                java.io.File fileBg = il.bg(i);
                if (fileBg.exists() && !fileBg.delete()) {
                    throw new java.io.IOException("failed to delete ".concat(java.lang.String.valueOf(fileBg)));
                }
                this.VB -= il.bX[i];
                il.bX[i] = 0;
            }
            this.yDt++;
            this.PX.append((java.lang.CharSequence) ("REMOVE " + str + '\n'));
            this.Ta.remove(str);
            if (ldr()) {
                this.IL.submit(this.xxp);
            }
            return true;
        }
        return false;
    }

    private void iR() {
        if (this.PX == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    public synchronized void bg() throws java.io.IOException {
        iR();
        Kg();
        this.PX.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        if (this.PX == null) {
            return;
        }
        for (com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il : new java.util.ArrayList(this.Ta.values())) {
            if (il.zx != null) {
                il.zx.IL();
            }
        }
        Kg();
        this.PX.close();
        this.PX = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kg() throws java.io.IOException {
        long j = this.WR;
        long j2 = this.Lq;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.VB > j) {
            bX(this.Ta.entrySet().iterator().next().getKey());
        }
        this.Lq = -1L;
    }

    public void IL() throws java.io.IOException {
        close();
        com.bytedance.sdk.component.zx.bX.bg.bg.eqN.bg(this.eqN);
    }

    private void zx(java.lang.String str) {
        if (!bg.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final class bX implements java.io.Closeable {
        private final java.lang.String IL;
        private final long bX;
        private final java.io.InputStream[] eqN;
        private final long[] zx;

        private bX(java.lang.String str, long j, java.io.InputStream[] inputStreamArr, long[] jArr) {
            this.IL = str;
            this.bX = j;
            this.eqN = inputStreamArr;
            this.zx = jArr;
        }

        public java.io.InputStream bg(int i) {
            return this.eqN[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (java.io.InputStream inputStream : this.eqN) {
                com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg$bg, reason: collision with other inner class name */
    public final class C0119bg {
        private final com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL IL;
        private final boolean[] bX;
        private boolean eqN;
        private boolean zx;

        private C0119bg(com.bytedance.sdk.component.zx.bX.bg.bg.bg.IL il) {
            this.IL = il;
            this.bX = il.eqN ? null : new boolean[com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eo];
        }

        public java.io.OutputStream bg(int i) throws java.io.IOException {
            java.io.FileOutputStream fileOutputStream;
            com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg.C0120bg c0120bg;
            if (i < 0 || i >= com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eo) {
                throw new java.lang.IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eo);
            }
            synchronized (com.bytedance.sdk.component.zx.bX.bg.bg.bg.this) {
                if (this.IL.zx != this) {
                    throw new java.lang.IllegalStateException();
                }
                if (!this.IL.eqN) {
                    this.bX[i] = true;
                }
                java.io.File fileIL = this.IL.IL(i);
                try {
                    fileOutputStream = new java.io.FileOutputStream(fileIL);
                } catch (java.io.FileNotFoundException unused) {
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eqN.mkdirs();
                    try {
                        fileOutputStream = new java.io.FileOutputStream(fileIL);
                    } catch (java.io.FileNotFoundException unused2) {
                        return com.bytedance.sdk.component.zx.bX.bg.bg.bg.bX;
                    }
                }
                c0120bg = new com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg.C0120bg(fileOutputStream);
            }
            return c0120bg;
        }

        public void bg() throws java.io.IOException {
            if (this.eqN) {
                com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.bg(this, false);
                com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.bX(this.IL.IL);
            } else {
                com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.bg(this, true);
            }
            this.zx = true;
        }

        public void IL() throws java.io.IOException {
            com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.bg(this, false);
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg$bg$bg, reason: collision with other inner class name */
        private class C0120bg extends java.io.FilterOutputStream {
            private C0120bg(java.io.OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (java.io.IOException unused) {
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg.this.eqN = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (java.io.IOException unused) {
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg.this.eqN = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (java.io.IOException unused) {
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg.this.eqN = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (java.io.IOException unused) {
                    com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg.this.eqN = true;
                }
            }
        }
    }

    private final class IL {
        private final java.lang.String IL;
        private final long[] bX;
        private boolean eqN;
        private long ldr;
        private com.bytedance.sdk.component.zx.bX.bg.bg.bg.C0119bg zx;

        private IL(java.lang.String str) {
            this.IL = str;
            this.bX = new long[com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eo];
        }

        public java.lang.String bg() throws java.io.IOException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (long j : this.bX) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bg(java.lang.String[] strArr) throws java.io.IOException {
            if (strArr.length != com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eo) {
                throw IL(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.bX[i] = java.lang.Long.parseLong(strArr[i]);
                } catch (java.lang.NumberFormatException unused) {
                    throw IL(strArr);
                }
            }
        }

        private java.io.IOException IL(java.lang.String[] strArr) throws java.io.IOException {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(strArr));
        }

        public java.io.File bg(int i) {
            return new java.io.File(com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eqN, this.IL + "." + i);
        }

        public java.io.File IL(int i) {
            return new java.io.File(com.bytedance.sdk.component.zx.bX.bg.bg.bg.this.eqN, this.IL + "." + i + ".tmp");
        }
    }
}
