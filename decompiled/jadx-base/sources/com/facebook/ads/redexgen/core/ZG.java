package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZG implements com.facebook.ads.redexgen.core.C9B {
    public final java.util.List<com.facebook.ads.redexgen.core.C9G> A00 = new java.util.ArrayList();
    public final boolean A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.ZF A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C9B
    public final synchronized int A62() {
        int i;
        i = 0;
        java.util.Iterator<com.facebook.ads.redexgen.core.C9G> it = this.A00.iterator();
        while (it.hasNext()) {
            i += it.next().A01;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public ZG(com.facebook.ads.redexgen.core.ZF zf, java.util.List<com.facebook.ads.redexgen.core.AnonymousClass97> list, boolean z) throws java.io.IOException {
        this.A02 = zf;
        this.A01 = z;
        for (com.facebook.ads.redexgen.core.AnonymousClass97 fetch : list) {
            com.facebook.ads.redexgen.core.AnonymousClass96 anonymousClass96A01 = fetch.A01();
            this.A00.add(new com.facebook.ads.redexgen.core.C9G(new com.facebook.ads.redexgen.core.AnonymousClass94(fetch.A00(), anonymousClass96A01.A01()), anonymousClass96A01.A00() - anonymousClass96A01.A01(), anonymousClass96A01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final com.facebook.ads.redexgen.core.C9G A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final com.facebook.ads.redexgen.core.C9G A01() {
        return this.A00.get(this.A00.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.C9B
    public final void A5O() throws com.facebook.ads.redexgen.core.C9L {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.C9B
    public final boolean AAk() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.A02.A06(this);
    }
}
