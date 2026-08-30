package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public final class zx extends com.bytedance.sdk.component.IL.bg.yDt {
    java.util.List<java.lang.String> IL;
    java.util.List<java.lang.String> bg;

    zx(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.bg = list;
        this.IL = list2;
    }

    public static final class bg {
        private final java.util.List<java.lang.String> bg = new java.util.ArrayList();
        private final java.util.List<java.lang.String> IL = new java.util.ArrayList();

        public com.bytedance.sdk.component.IL.bg.zx.bg bg(java.lang.String str, java.lang.String str2) {
            this.bg.add(str);
            this.IL.add(str2);
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.zx bg() {
            return new com.bytedance.sdk.component.IL.bg.zx(this.bg, this.IL);
        }
    }
}
