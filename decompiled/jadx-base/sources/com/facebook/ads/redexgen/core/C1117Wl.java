package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1117Wl implements com.facebook.ads.redexgen.core.HP {
    public static boolean A06;
    public static byte[] A07;
    public static java.lang.String[] A08 = {androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "OPKdUZ", "FA3afr", "VpzN4TRMQVrL1VTjAcAjDBVhYJ", "1", "v", "FJC", "ewZDjNMmwL0Ej173ZiyKA"};
    public static final java.util.HashSet<java.io.File> A09;
    public long A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1119Wn A02;
    public final com.facebook.ads.redexgen.core.HX A03;
    public final java.io.File A04;
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<com.facebook.ads.redexgen.core.HO>> A05;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 84);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{14, 33, 32, 59, 39, 42, kotlin.io.encoding.Base64.padSymbol, 111, 28, 38, 34, okio.Utf8.REPLACEMENT_BYTE, 35, 42, 12, 46, 44, 39, 42, 111, 38, 33, 60, 59, 46, 33, 44, 42, 111, 58, 60, 42, 60, 111, 59, 39, 42, 111, 41, 32, 35, 43, 42, kotlin.io.encoding.Base64.padSymbol, 117, 111, 115, 73, 77, 80, 76, 69, 99, 65, 67, 72, 69, 9, 51, 55, 42, 54, okio.Utf8.REPLACEMENT_BYTE, 25, 59, 57, 50, okio.Utf8.REPLACEMENT_BYTE, 116, 51, 52, 51, 46, 51, 59, 54, 51, 32, okio.Utf8.REPLACEMENT_BYTE, 114, 115, 123, 92, 71, 90, 65, 70, 79, 8, 65, 70, 76, 77, 80, 8, 78, 65, 68, 77, 8, 78, 73, 65, 68, 77, 76, 37, 39, 37, 46, 35, 34, 25, 37, 41, 40, 50, 35, 40, 50, 25, 47, 40, 34, 35, 62, 104, 35, 62, 47};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized void A4j(java.io.File file) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        com.facebook.ads.redexgen.core.C1116Wk c1116WkA00 = com.facebook.ads.redexgen.core.C1116Wk.A00(file, this.A03);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(c1116WkA00 != null);
        com.facebook.ads.redexgen.core.HW hwA09 = this.A03.A09(c1116WkA00.A04);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(hwA09);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(hwA09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA00 = com.facebook.ads.redexgen.core.AbstractC0725Ha.A00(hwA09.A05());
            if (jA00 != -1) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(c1116WkA00.A02 + c1116WkA00.A01 <= jA00);
            }
            A0A(c1116WkA00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized java.util.NavigableSet<com.facebook.ads.redexgen.core.HT> A6f(java.lang.String str) {
        com.facebook.ads.redexgen.core.HW hwA09;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        hwA09 = this.A03.A09(str);
        return (hwA09 == null || hwA09.A0C()) ? new java.util.TreeSet() : new java.util.TreeSet((java.util.Collection) hwA09.A08());
    }

    static {
        A06();
        A09 = new java.util.HashSet<>();
    }

    public C1117Wl(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1119Wn interfaceC1119Wn) {
        this(file, interfaceC1119Wn, null, false);
    }

    public C1117Wl(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1119Wn interfaceC1119Wn, com.facebook.ads.redexgen.core.HX hx) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC1119Wn;
            this.A03 = hx;
            this.A05 = new java.util.HashMap<>();
            android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
            new com.facebook.ads.redexgen.core.C0727Hc(this, A03(57, 24, 14), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new java.lang.IllegalStateException(A03(0, 46, 27) + file);
    }

    public C1117Wl(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1119Wn interfaceC1119Wn, byte[] bArr, boolean z) {
        this(file, interfaceC1119Wn, new com.facebook.ads.redexgen.core.HX(file, bArr, z));
    }

    private com.facebook.ads.redexgen.core.C1116Wk A00(java.lang.String str, long j) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.C1116Wk span;
        com.facebook.ads.redexgen.core.HW hwA09 = this.A03.A09(str);
        if (hwA09 == null) {
            return com.facebook.ads.redexgen.core.C1116Wk.A02(str, j);
        }
        while (true) {
            span = hwA09.A06(j);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.HP
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized com.facebook.ads.redexgen.core.C1116Wk AGw(java.lang.String str, long j) throws java.lang.InterruptedException, com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.C1116Wk span;
        while (true) {
            span = AGx(str, j);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.HP
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized com.facebook.ads.redexgen.core.C1116Wk AGx(java.lang.String str, long j) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        com.facebook.ads.redexgen.core.C1116Wk c1116WkA00 = A00(str, j);
        if (c1116WkA00.A05) {
            com.facebook.ads.redexgen.core.C1116Wk cacheSpan = this.A03.A09(str).A07(c1116WkA00);
            A0C(c1116WkA00, cacheSpan);
            return cacheSpan;
        }
        com.facebook.ads.redexgen.core.HW hwA0A = this.A03.A0A(str);
        if (hwA0A.A0D()) {
            return null;
        }
        hwA0A.A0B(true);
        return c1116WkA00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        java.io.File[] fileArrListFiles = this.A04.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (java.io.File file : fileArrListFiles) {
            if (!file.getName().equals(A03(106, 24, 18))) {
                com.facebook.ads.redexgen.core.C1116Wk c1116WkA00 = file.length() > 0 ? com.facebook.ads.redexgen.core.C1116Wk.A00(file, this.A03) : null;
                if (c1116WkA00 != null) {
                    A0A(c1116WkA00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (com.facebook.ads.redexgen.core.HN e) {
            android.util.Log.e(A03(46, 11, 116), A03(81, 25, 124), e);
        }
    }

    private void A05() throws com.facebook.ads.redexgen.core.HN {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.facebook.ads.redexgen.core.HW> it = this.A03.A0D().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            java.lang.String[] strArr = A08;
            if (strArr[4].length() == strArr[3].length()) {
                break;
            }
            A08[7] = "8RyyWH2sXbvtcybyvpgGuaSQPyMb";
            if (!zHasNext) {
                int i = 0;
                while (true) {
                    int size = arrayList.size();
                    int i2 = A08[7].length();
                    if (i2 == 7) {
                        java.lang.String[] strArr2 = A08;
                        strArr2[1] = "FKJgoO";
                        strArr2[2] = "R9ON5m";
                        if (i >= size) {
                            break;
                        }
                        A08((com.facebook.ads.redexgen.core.HT) arrayList.get(i), false);
                        i++;
                    } else {
                        A08[6] = "axYd4LGkVmpVYJMnCXpGOxz9igUktz";
                        if (i >= size) {
                            break;
                        }
                        A08((com.facebook.ads.redexgen.core.HT) arrayList.get(i), false);
                        i++;
                    }
                }
                this.A03.A0F();
                this.A03.A0G();
                return;
            }
            com.facebook.ads.redexgen.core.HW next = it.next();
            java.lang.String[] strArr3 = A08;
            if (strArr3[4].length() == strArr3[3].length()) {
                break;
            }
            java.lang.String[] strArr4 = A08;
            strArr4[5] = androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST;
            strArr4[0] = "2";
            for (com.facebook.ads.redexgen.core.C1116Wk c1116Wk : next.A08()) {
                if (!c1116Wk.A03.exists()) {
                    arrayList.add(c1116Wk);
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    private void A07(com.facebook.ads.redexgen.core.HT ht) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.HO> arrayList = this.A05.get(ht.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ADf(this, ht);
            }
        }
        this.A02.ADf(this, ht);
    }

    private void A08(com.facebook.ads.redexgen.core.HT ht, boolean z) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.HW hwA09 = this.A03.A09(ht.A04);
        if (hwA09 == null || !hwA09.A0E(ht)) {
            return;
        }
        long j = this.A00;
        java.lang.String[] strArr = A08;
        if (strArr[4].length() != strArr[3].length()) {
            A08[7] = "C0qeCah7HNN5stexeGpu3wCMBFxC7Qm";
            this.A00 = j - ht.A01;
            if (z) {
                try {
                    this.A03.A0H(hwA09.A03);
                    this.A03.A0G();
                } catch (java.lang.Throwable th) {
                    A07(ht);
                    throw th;
                }
            }
            A07(ht);
            if (A08[7].length() != 7) {
                java.lang.String[] strArr2 = A08;
                strArr2[1] = "Fhpc7L";
                strArr2[2] = "T7IVuP";
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    private void A0A(com.facebook.ads.redexgen.core.C1116Wk c1116Wk) {
        this.A03.A0A(c1116Wk.A04).A09(c1116Wk);
        this.A00 += c1116Wk.A01;
        A0B(c1116Wk);
    }

    private void A0B(com.facebook.ads.redexgen.core.C1116Wk c1116Wk) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.HO> arrayList = this.A05.get(c1116Wk.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ADe(this, c1116Wk);
            }
        }
        this.A02.ADe(this, c1116Wk);
    }

    private void A0C(com.facebook.ads.redexgen.core.C1116Wk c1116Wk, com.facebook.ads.redexgen.core.HT ht) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.HO> arrayList = this.A05.get(c1116Wk.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ADg(this, c1116Wk, ht);
            }
        }
        this.A02.ADg(this, c1116Wk, ht);
    }

    public static synchronized boolean A0D(java.io.File file) {
        if (A06) {
            return true;
        }
        return A09.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized void A3w(java.lang.String str, com.facebook.ads.redexgen.core.C0726Hb c0726Hb) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        this.A03.A0I(str, c0726Hb);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized long A6d() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized long A6e(java.lang.String str, long j, long j2) {
        com.facebook.ads.redexgen.core.HW cachedContent;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized long A6u(java.lang.String str) {
        return com.facebook.ads.redexgen.core.AbstractC0725Ha.A00(A6v(str));
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized com.facebook.ads.redexgen.core.HZ A6v(java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized void AF2(com.facebook.ads.redexgen.core.HT ht) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        com.facebook.ads.redexgen.core.HW hwA09 = this.A03.A09(ht.A04);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(hwA09);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(hwA09.A0D());
        hwA09.A0B(false);
        this.A03.A0H(hwA09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized void AFc(com.facebook.ads.redexgen.core.HT ht) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        A08(ht, true);
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized void AGN(java.lang.String str, long j) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.C0726Hb mutations = new com.facebook.ads.redexgen.core.C0726Hb();
        com.facebook.ads.redexgen.core.AbstractC0725Ha.A05(mutations, j);
        A3w(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.core.HP
    public final synchronized java.io.File AGu(java.lang.String str, long j, long j2) throws com.facebook.ads.redexgen.core.HN {
        com.facebook.ads.redexgen.core.HW hwA09;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A01);
        hwA09 = this.A03.A09(str);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(hwA09);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(hwA09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ADh(this, str, j, j2);
        return com.facebook.ads.redexgen.core.C1116Wk.A04(this.A04, hwA09.A02, j, java.lang.System.currentTimeMillis());
    }
}
