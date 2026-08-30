package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
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

    static void position(java.nio.Buffer b, int position) {
        b.position(position);
    }

    private Java8Compatibility() {
    }
}
