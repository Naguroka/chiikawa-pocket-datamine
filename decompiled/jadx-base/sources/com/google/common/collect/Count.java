package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Count implements java.io.Serializable {
    private int value;

    Count(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }

    public void add(int delta) {
        this.value += delta;
    }

    public int addAndGet(int delta) {
        int i = this.value + delta;
        this.value = i;
        return i;
    }

    public void set(int newValue) {
        this.value = newValue;
    }

    public int getAndSet(int newValue) {
        int i = this.value;
        this.value = newValue;
        return i;
    }

    public int hashCode() {
        return this.value;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return (obj instanceof com.google.common.collect.Count) && ((com.google.common.collect.Count) obj).value == this.value;
    }

    public java.lang.String toString() {
        return java.lang.Integer.toString(this.value);
    }
}
