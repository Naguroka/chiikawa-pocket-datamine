package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05067s {
    public static byte[] A04;
    public static final java.lang.String A05;
    public static final java.util.concurrent.locks.Lock A06;
    public static final java.util.concurrent.locks.Lock A07;
    public static final java.util.concurrent.locks.ReentrantReadWriteLock A08;
    public android.database.sqlite.SQLiteOpenHelper A00;
    public final com.facebook.ads.redexgen.core.C1198Zr A01;
    public final com.facebook.ads.redexgen.core.C1196Zp A03 = new com.facebook.ads.redexgen.core.C1196Zp(this);
    public final com.facebook.ads.redexgen.core.C1197Zq A02 = new com.facebook.ads.redexgen.core.C1197Zq(this);

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A04 = new byte[]{-82, -53, -82, 109, -117, 109, -116, 85, 118, -120, 120, -102, -64, -52, -55, -57, -102, 127, -87, -82, -88, -83, 127, 94, -118, -121, -117, -121, -110, 94, -93, -46, -47, -93, 87, -122, -119, 123, 124, -119, 87, 121, -112, 87, 85, -120, 122, -119, 85, -115, -60, -75, -78, -65, -78, -115, 110, 116, -82, -94, 94, 110, -101, -99, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -19, -21, -6, -54, -25, -6, -25, -24, -25, -7, -21, -90, -20, -8, -11, -13, -90, -6, -18, -21, -90, -37, -49, -90, -6, -18, -8, -21, -25, -22, -89, -112, -126, -119, -126, -128, -111, 93, -79, -84, -88, -94, -85, -80, 107, -64, -69, -81, -84, -65, -80, -117, -29, -32, -13, -32, -31, -32, -14, -28, -112, -95, -112, -103, -97, -98, -116, -121, -125, 125, -122, -117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i = 0; i < A0M().length; i++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A05(107, 14, 44)).append(com.facebook.ads.redexgen.core.C1196Zp.A03.A01);
        java.lang.String strA05 = A05(58, 2, 113);
        java.lang.StringBuilder sbAppend2 = sbAppend.append(strA05);
        java.lang.String strA06 = A05(org.objectweb.asm.Opcodes.D2I, 6, 7);
        java.lang.StringBuilder sbAppend3 = sbAppend2.append(strA06);
        java.lang.String strA07 = A05(60, 1, 31);
        java.lang.StringBuilder sbAppend4 = sbAppend3.append(strA07).append(com.facebook.ads.redexgen.core.C1196Zp.A02.A01).append(strA05);
        java.lang.String strA08 = A05(136, 6, 26);
        A05 = sbAppend4.append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A04.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A05.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A0A.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A08.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A07.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A06.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A03.A01).append(strA05).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A02.A01).append(A05(11, 6, 105)).append(strA08).append(A05(17, 6, 78)).append(strA06).append(A05(30, 4, 114)).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A09.A01).append(A05(0, 3, 125)).append(strA06).append(strA07).append(com.facebook.ads.redexgen.core.C1196Zp.A03.A01).append(A05(34, 10, 38)).append(strA08).append(strA07).append(com.facebook.ads.redexgen.core.C1197Zq.A08.A01).append(A05(7, 4, 36)).toString();
        A08 = new java.util.concurrent.locks.ReentrantReadWriteLock();
        A06 = A08.readLock();
        A07 = A08.writeLock();
    }

    public C05067s(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A01 = c1198Zr;
    }

    private synchronized android.database.sqlite.SQLiteDatabase A00() {
        if (this.A00 == null) {
            final com.facebook.ads.redexgen.core.C1198Zr c1198Zr = this.A01;
            this.A00 = new android.database.sqlite.SQLiteOpenHelper(c1198Zr, this) { // from class: com.facebook.ads.redexgen.X.7t
                public static byte[] A01;
                public static java.lang.String[] A02 = {"XfAyR2vU0BibGbkW5sl", "72EQRqCB7z", "pQj0Q1BmcNSJNmsLpeVJ6qN75i73IOus", "lsxje2C6xdGld5UPkxYO", "GgAbEVzt1AOENmbxI3KXH96Z5ccDQ2lY", "3OXRqiMUeM1s", "WQkJsHQStWfxe", "yOid3ecrxpkgxviYKYk6NUThnYl"};
                public static final java.lang.String A03;
                public final com.facebook.ads.redexgen.core.C05067s A00;

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 67);
                    }
                    return new java.lang.String(bArrCopyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{-105, 101, -119, -118, -117, -122, -102, -111, -103, 101, 117, 0, 11, 19, 4, 17, -33, 19, 0, 1, 11, 4, -33, 36, 53, 36, 45, 51, 50, -33, 0, 3, 3, -33, 2, 14, 11, 20, 12, 13, -33, -122, -87, -119, -90, -71, -90, -89, -90, -72, -86, -115, -86, -79, -75, -86, -73, 101, -88, -90, -77, 101, -77, -76, -71, 101, -89, -86, 101, -77, -70, -79, -79, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, 15, 30, 13, 31, 20, 17, 31, -10, -8, -25, -19, -13, -25, -58, 12, 21, 24, 11, 15, 13, 20, 5, 17, 11, 31, 25, -58, -29, -58, -11, -12, -31, -51, -48, -33, -111, -33, -102, -48, -50};
                    if (A02[7].length() == 23) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A02;
                    strArr[4] = "z4ETzKVSWwABxmvmOp0bWtQm6ZVGd83i";
                    strArr[2] = "IiBR5v01IEKLzmVqyabUzMw7zaZ4VOx3";
                }

                static {
                    A02();
                    A03 = com.facebook.ads.redexgen.core.C7t.class.getSimpleName();
                }

                {
                    super(c1198Zr, A01(c1198Zr), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new java.lang.IllegalArgumentException(A00(41, 32, 2));
                }

                public static java.lang.String A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr2) {
                    java.util.Locale locale = java.util.Locale.US;
                    java.lang.Object[] objArr = {A00(0, 0, 19)};
                    java.lang.String strA00 = A00(126, 8, 41);
                    java.lang.String str = java.lang.String.format(locale, strA00, objArr);
                    if (!com.facebook.ads.redexgen.core.C0762Im.A2X(c1198Zr2)) {
                        return str;
                    }
                    java.lang.String defaultDbName = c1198Zr2.getPackageName();
                    java.lang.String processName = com.facebook.ads.internal.util.process.ProcessUtils.getProcessName(c1198Zr2);
                    if (!defaultDbName.equals(processName) && !android.text.TextUtils.isEmpty(processName)) {
                        java.lang.String defaultDbName2 = java.lang.String.format(java.util.Locale.US, strA00, '_' + processName);
                        return defaultDbName2;
                    }
                    return str;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    for (com.facebook.ads.redexgen.core.AbstractC05097w abstractC05097w : this.A00.A0M()) {
                        abstractC05097w.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    for (com.facebook.ads.redexgen.core.AbstractC05097w abstractC05097w : this.A00.A0M()) {
                        abstractC05097w.A08(sQLiteDatabase);
                        abstractC05097w.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 99));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    if (i == 2 && i2 >= 3) {
                        sQLiteDatabase.execSQL(A00(73, 28, 105));
                    }
                    if (i <= 3 && i2 >= 4) {
                        com.facebook.ads.redexgen.core.C7q c7q = com.facebook.ads.redexgen.core.C1197Zq.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 124) + c7q.A01 + A00(0, 1, 52) + c7q.A02 + A00(1, 10, 2));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized android.database.sqlite.SQLiteDatabase A01() {
        android.database.sqlite.SQLiteException e = null;
        for (int i = 0; i < 10; i++) {
            try {
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
        this.A01.A07().AA0(A05(128, 8, 110), com.facebook.ads.redexgen.core.C8E.A0v, new com.facebook.ads.redexgen.core.C8F(e));
        throw e;
        return A00();
    }

    public final int A08(int i) {
        A07.lock();
        try {
            return A0E().delete(A05(136, 6, 26), com.facebook.ads.redexgen.core.C1197Zq.A02.A01 + A05(3, 4, 60), new java.lang.String[]{java.lang.String.valueOf(i - 1)});
        } finally {
            A07.unlock();
        }
    }

    public final android.database.Cursor A09() {
        A06.lock();
        try {
            return this.A02.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0A() {
        A06.lock();
        try {
            return this.A02.A0C();
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0B() {
        A06.lock();
        try {
            return this.A03.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0C(int i) {
        A06.lock();
        try {
            return A0E().rawQuery(A05 + A05(23, 7, 45) + java.lang.String.valueOf(i), null);
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0D(java.lang.String str) {
        A06.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A06.unlock();
        }
    }

    public final android.database.sqlite.SQLiteDatabase A0E() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            return A01();
        }
        throw new java.lang.IllegalStateException(A05(64, 43, 117));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7v != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> android.os.AsyncTask A0F(final com.facebook.ads.redexgen.core.AbstractC05087v<T> abstractC05087v, final com.facebook.ads.redexgen.core.AbstractC05358y<T> abstractC05358y) {
        java.util.concurrent.Executor executor = com.facebook.ads.redexgen.core.M8.A07;
        final com.facebook.ads.redexgen.core.C1198Zr c1198Zr = this.A01;
        return com.facebook.ads.redexgen.core.M5.A00(executor, new android.os.AsyncTask<java.lang.Void, java.lang.Void, T>(c1198Zr, abstractC05087v, abstractC05358y) { // from class: com.facebook.ads.redexgen.X.7r
            public static byte[] A04;
            public com.facebook.ads.redexgen.core.EnumC05077u A00;
            public final com.facebook.ads.redexgen.core.C1198Zr A01;
            public final com.facebook.ads.redexgen.core.AbstractC05087v<T> A02;
            public final com.facebook.ads.redexgen.core.AbstractC05358y<T> A03;

            static {
                A02();
            }

            public static java.lang.String A01(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7v != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = abstractC05087v;
                this.A03 = abstractC05358y;
                this.A01 = c1198Zr;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(java.lang.Void... voidArr) throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return null;
                }
                T tA03 = null;
                try {
                    try {
                        tA03 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return tA03;
                    } catch (java.lang.Exception e) {
                        this.A01.A07().AA0(A01(0, 8, 89), com.facebook.ads.redexgen.core.C8E.A0w, new com.facebook.ads.redexgen.core.C8F(e));
                        this.A00 = com.facebook.ads.redexgen.core.EnumC05077u.A08;
                        return tA03;
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Void[] voidArr) throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(this.A00.A03(), this.A00.A04());
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                }
            }
        }, new java.lang.Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final android.os.AsyncTask A0G(java.lang.String str, int i, java.lang.String str2, double d, double d2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> data, com.facebook.ads.redexgen.core.AbstractC05358y<java.lang.String> abstractC05358y) {
        return A0F(new com.facebook.ads.redexgen.core.Eh(this, str2, str, i, d, d2, str3, data), abstractC05358y);
    }

    public final void A0H() {
        A07.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A07.unlock();
        }
    }

    public final void A0I() {
        A07.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0K(java.lang.String str) {
        A07.lock();
        try {
            return this.A02.A0F(str);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0L(java.lang.String str) {
        boolean z;
        A07.lock();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(A05(121, 7, 90)).append(A05(136, 6, 26)).append(A05(44, 5, 36)).append(com.facebook.ads.redexgen.core.C1197Zq.A02.A01).append(A05(61, 1, 32)).append(com.facebook.ads.redexgen.core.C1197Zq.A02.A01).append(A05(56, 2, 50)).append(A05(49, 7, 92)).append(com.facebook.ads.redexgen.core.C1197Zq.A04.A01).append(A05(62, 2, 77));
            A0E().execSQL(sb.toString(), new java.lang.String[]{str});
            z = true;
        } catch (android.database.sqlite.SQLiteException unused) {
            z = false;
        }
        A07.unlock();
        return z;
    }

    public final com.facebook.ads.redexgen.core.AbstractC05097w[] A0M() {
        return new com.facebook.ads.redexgen.core.AbstractC05097w[]{this.A03, this.A02};
    }
}
