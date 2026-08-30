package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements java.io.FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return str.startsWith("adcfg-") && !str.endsWith("_SUCCESS");
    }
}
