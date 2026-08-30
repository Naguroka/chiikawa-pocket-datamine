package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
final class Java8Compatibility {
    static void clear(java.nio.Buffer b) {
        b.clear();
    }

    static void flip(java.nio.Buffer b) {
        b.flip();
    }

    static void limit(java.nio.Buffer b, int limit) {
        b.limit(limit);
    }

    static void mark(java.nio.Buffer b) {
        b.mark();
    }

    static void position(java.nio.Buffer b, int position) {
        b.position(position);
    }

    static void reset(java.nio.Buffer b) {
        b.reset();
    }

    private Java8Compatibility() {
    }
}
