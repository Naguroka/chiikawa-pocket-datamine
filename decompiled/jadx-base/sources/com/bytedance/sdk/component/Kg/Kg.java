package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Kg implements java.lang.Comparable<com.bytedance.sdk.component.Kg.Kg>, java.lang.Runnable {
    private java.lang.String IL;
    private int bg;

    public Kg(java.lang.String str, int i) {
        this.bg = 0;
        this.bg = i == 0 ? 5 : i;
        this.IL = str;
    }

    public Kg(java.lang.String str) {
        this.bg = 5;
        this.IL = str;
    }

    public void setPriority(int i) {
        this.bg = i;
    }

    public int getPriority() {
        return this.bg;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.bytedance.sdk.component.Kg.Kg kg) {
        if (getPriority() < kg.getPriority()) {
            return 1;
        }
        return getPriority() >= kg.getPriority() ? -1 : 0;
    }

    public java.lang.String getName() {
        return this.IL;
    }
}
