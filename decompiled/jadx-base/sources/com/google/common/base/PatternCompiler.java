package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
interface PatternCompiler {
    com.google.common.base.CommonPattern compile(java.lang.String pattern);

    boolean isPcreLike();
}
