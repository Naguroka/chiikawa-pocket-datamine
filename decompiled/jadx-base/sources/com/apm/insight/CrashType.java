package com.apm.insight;

/* JADX INFO: loaded from: classes3.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL(androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL);

    private java.lang.String mName;

    CrashType(java.lang.String str) {
        this.mName = str;
    }

    public final java.lang.String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return getName();
    }
}
