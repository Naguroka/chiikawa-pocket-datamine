package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
interface LongAddable {
    void add(long x);

    void increment();

    long sum();
}
