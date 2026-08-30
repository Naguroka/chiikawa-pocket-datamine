package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZF<T> implements com.facebook.ads.redexgen.core.C9C<T> {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public com.facebook.ads.redexgen.core.AnonymousClass94 A00;
    public com.facebook.ads.redexgen.core.AnonymousClass94 A01;
    public java.util.List<com.facebook.ads.redexgen.core.ZF<T>.RecordFileBasedFetch> A02 = new java.util.ArrayList();
    public boolean A03;
    public final com.facebook.ads.redexgen.core.AnonymousClass93 A04;
    public final com.facebook.ads.redexgen.core.C9J A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {68, 102, 105, 39, 104, 105, 107, 126, 39, 99, 98, 107, 98, 115, 98, 39, 100, 114, 117, 116, 104, 117, 116, 39, 119, 104, 110, 105, 115, 110, 105, 96, 39, 102, 115, 39, 115, 111, 98, 39, 99, 102, 115, 102, 101, 102, 116, 98, 39, 116, 115, 102, 117, 115, 87, 97, 102, 103, 123, 102, 52, 100, 123, 103, 125, 96, 125, 123, 122, 52, 125, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, kotlin.io.encoding.Base64.padSymbol, 56, 52, 117, 122, 112, 52, 102, 113, 119, 123, 102, 112, 52, 114, 125, 120, 113, 52, 103, 113, 101, 97, 113, 122, 119, 113, 52, 103, 96, 117, 102, 96, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, kotlin.io.encoding.Base64.padSymbol, 46, 52, 112, 117, 96, 117, 52, 124, 117, 103, 52, 100, 102, 123, 118, 117, 118, 120, 109, 52, 118, 113, 113, 122, 52, 120, 123, 103, 96, 28, 42, 45, 44, 48, 45, 127, 47, 48, 44, 54, 43, 54, 48, 49, 127, 54, 44, 127, 62, 43, 127, 119, 122, 59, 115, 122, 59, 118, 115, 127, kotlin.io.encoding.Base64.padSymbol, 42, 43, 127, 45, 58, 60, 48, 45, 59, 127, 57, 54, 51, 58, 127, 44, 58, 46, 42, 58, 49, 60, 58, 127, 48, 49, 51, 38, 127, 55, 62, 44, 127, 57, 54, 51, 58, 127, 122, 59, 101, 127, 59, 62, 43, 62, 127, 55, 62, 44, 127, 47, 45, 48, kotlin.io.encoding.Base64.padSymbol, 62, kotlin.io.encoding.Base64.padSymbol, 51, 38, 127, kotlin.io.encoding.Base64.padSymbol, 58, 58, 49, 127, 51, 48, 44, 43, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 70, 67, 67, 7, 67, 70, 83, 70, 7, 83, 72, 7, 75, 72, 64, 8, 47, 39, 34, 43, 42, 110, 58, 33, 110, 45, 34, 43, 47, 60, 110, 42, 47, 58, 47, 44, 47, kotlin.io.encoding.Base64.padSymbol, 43, 11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 43, 40, 57, 46, 37, 109, 41, 44, 57, 44, 109, 43, okio.Utf8.REPLACEMENT_BYTE, 34, 32, 109, 33, 34, 42, 102, 65, 73, 76, 69, 68, 0, 84, 79, 0, 71, 69, 84, 0, 82, 69, 67, 79, 82, 68, 0, 67, 79, 85, 78, 84, 73, 110, 102, 99, 106, 107, 47, 123, 96, 47, 122, 127, 107, 110, 123, 106, 47, 105, 102, 99, 106, 47, 124, 106, 126, 122, 106, 97, 108, 106, 48, 7, 1, 13, 16, 6, 36, 11, 14, 7, 32, 3, 17, 7, 6, 48, 7, 1, 13, 16, 6, 38, 3, 22, 3, 0, 3, 17, 7, 66, 1, 14, 13, 17, 7, 6, 119, 64, 70, 74, 87, 65, 99, 76, 73, 64, 103, 68, 86, 64, 65, 119, 64, 70, 74, 87, 65, 97, 68, 81, 68, 71, 68, 86, 64, 5, 76, 86, 5, 70, 73, 74, 86, 64, 65, 119, 76, 73, 76, 77, 85, 76, 2, 112, 71, 65, 77, 80, 70, 100, 75, 78, 71, 96, 67, 81, 71, 70, 112, 71, 65, 77, 80, 70, 102, 67, 86, 67, 64, 67, 81, 71, 2, 68, 71, 86, 65, 74, 70, 80, 87, 86, 74, 87, 26, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/ZF<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(com.facebook.ads.redexgen.core.ZG zg) {
        if (!this.A02.remove(zg)) {
            return false;
        }
        if (zg.A62() > 0 && zg.A01().A02.A05(zg.A01().A01).equals(this.A01)) {
            this.A01 = zg.A00().A02;
        }
        return true;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public ZF(com.facebook.ads.redexgen.core.AnonymousClass99 anonymousClass99, com.facebook.ads.redexgen.core.C9H c9h) throws java.io.IOException {
        this.A05 = new com.facebook.ads.redexgen.core.C9J(anonymousClass99.A04(A00(com.json.mediationsdk.utils.IronSourceConstants.SDK_INIT_FAILED, 4, 103)), c9h);
        this.A04 = new com.facebook.ads.redexgen.core.AnonymousClass93(new java.io.File(anonymousClass99.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(c9h);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws java.io.IOException {
        this.A00 = new com.facebook.ads.redexgen.core.AnonymousClass94(i, i2);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/ZF<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(com.facebook.ads.redexgen.core.ZG zg) throws com.facebook.ads.redexgen.core.C9L {
        if (!this.A03) {
            if (A06(zg)) {
                if (zg.A62() == 0) {
                    return;
                }
                if (this.A00.A04(zg.A00().A02) == 0) {
                    try {
                        java.util.Iterator<com.facebook.ads.redexgen.core.C9G> it = zg.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), zg.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (java.io.IOException e) {
                        throw new com.facebook.ads.redexgen.core.C9L(A00(361, 30, 22), e);
                    }
                }
                throw new com.facebook.ads.redexgen.core.C9L(A00(0, 54, 30));
            }
            throw new com.facebook.ads.redexgen.core.C9L(A00(466, 43, 59));
        }
        throw new com.facebook.ads.redexgen.core.C9L(A00(427, 39, 60));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A05(com.facebook.ads.redexgen.core.C9H c9h) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AnonymousClass94 anonymousClass94 = new com.facebook.ads.redexgen.core.AnonymousClass94(this.A05.A06(), 0);
        com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart = this.A00;
        if (anonymousClass94.A04(recordSequenceStart) > 0) {
            java.util.Locale locale = java.util.Locale.US;
            com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart2 = this.A00;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(recordSequenceStart2.A02());
            com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart3 = this.A00;
            c9h.AFj(java.lang.String.format(locale, A00(54, 102, 13), numValueOf, java.lang.Integer.valueOf(recordSequenceStart3.A03()), java.lang.Integer.valueOf(anonymousClass94.A02()), java.lang.Integer.valueOf(anonymousClass94.A03())));
            this.A00 = anonymousClass94;
            return;
        }
        while (iA02 < recordSequenceStart.A02()) {
            if (this.A05.A0D()) {
                anonymousClass94 = new com.facebook.ads.redexgen.core.AnonymousClass94(this.A05.A06(), 0);
            } else {
                java.util.Locale locale2 = java.util.Locale.US;
                com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart4 = this.A00;
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(recordSequenceStart4.A02());
                com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart5 = this.A00;
                c9h.AFj(java.lang.String.format(locale2, A00(156, 101, 70), numValueOf2, java.lang.Integer.valueOf(recordSequenceStart5.A03()), java.lang.Integer.valueOf(anonymousClass94.A02())));
                com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart6 = new com.facebook.ads.redexgen.core.AnonymousClass94(this.A05.A06(), this.A05.A07());
                this.A00 = recordSequenceStart6;
                com.facebook.ads.redexgen.core.AnonymousClass93 anonymousClass93 = this.A04;
                com.facebook.ads.redexgen.core.AnonymousClass94 recordSequenceStart7 = this.A00;
                anonymousClass93.A04(recordSequenceStart7);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.C9C
    public final synchronized com.facebook.ads.redexgen.core.C9B A61(byte[] bArr, int[] iArr) throws com.facebook.ads.redexgen.core.C9L {
        com.facebook.ads.redexgen.core.ZF<T>.RecordFileBasedFetch zg;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    com.facebook.ads.redexgen.core.AnonymousClass97 anonymousClass97A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i2);
                    int iA00 = anonymousClass97A0A.A01().A00();
                    int storageOffset = anonymousClass97A0A.A01().A01();
                    int i3 = iA00 - storageOffset;
                    int storageOffset2 = anonymousClass97A0A.A01().A02();
                    i += storageOffset2;
                    i2 += i3;
                    if (anonymousClass97A0A.A01().A03() == com.facebook.ads.redexgen.core.AnonymousClass95.A03) {
                        arrayList.add(anonymousClass97A0A);
                    }
                    if (anonymousClass97A0A.A01().A03() == com.facebook.ads.redexgen.core.AnonymousClass95.A04) {
                        break;
                    }
                    if (anonymousClass97A0A.A01().A03() == com.facebook.ads.redexgen.core.AnonymousClass95.A05) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new com.facebook.ads.redexgen.core.AnonymousClass94(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i3);
                    }
                }
                zg = new com.facebook.ads.redexgen.core.ZG(this, arrayList, mayHaveMoreData);
                this.A02.add(zg);
                if (!arrayList.isEmpty()) {
                    com.facebook.ads.redexgen.core.AnonymousClass94 anonymousClass94 = zg.A01().A02;
                    int storageOffset6 = zg.A01().A01;
                    this.A01 = anonymousClass94.A05(storageOffset6);
                }
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.C9L(A00(306, 29, 84), e);
            }
        } else {
            throw new com.facebook.ads.redexgen.core.C9L(A00(391, 36, 123));
        }
        return zg;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.C9C
    public final synchronized int A8B() throws com.facebook.ads.redexgen.core.C9L {
        int iA09;
        if (!this.A03) {
            try {
                iA09 = this.A05.A09();
                int iA02 = this.A00.A02();
                int count = this.A05.A06();
                if (iA02 == count) {
                    int count2 = this.A00.A03();
                    iA09 -= count2;
                }
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.C9L(A00(335, 26, 57), e);
            }
        } else {
            throw new com.facebook.ads.redexgen.core.C9L(A00(427, 39, 60));
        }
        return iA09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.C9C
    public final synchronized void AH3(byte[] bArr) throws com.facebook.ads.redexgen.core.C9L {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.C9L(A00(257, 25, 62), e);
            }
        } else {
            throw new com.facebook.ads.redexgen.core.C9L(A00(427, 39, 60));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.C9C
    public final synchronized void clear() throws com.facebook.ads.redexgen.core.C9L {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C9L(A00(282, 24, 87), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
