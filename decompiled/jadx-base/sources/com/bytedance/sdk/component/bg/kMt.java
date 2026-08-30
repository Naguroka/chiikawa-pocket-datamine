package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public enum kMt {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override // java.lang.Enum
    public java.lang.String toString() {
        if (this == PRIVATE) {
            return "private";
        }
        return this == PROTECTED ? "protected" : "public";
    }
}
