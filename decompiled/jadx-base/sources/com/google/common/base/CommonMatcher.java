package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
abstract class CommonMatcher {
    public abstract int end();

    public abstract boolean find();

    public abstract boolean find(int index);

    public abstract boolean matches();

    public abstract java.lang.String replaceAll(java.lang.String replacement);

    public abstract int start();

    CommonMatcher() {
    }
}
