package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreObjects {

    public static final class ToStringHelper {
        private final java.lang.String className;
        private final com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a holderHead;
        private com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a holderTail;
        private boolean omitNullValues;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.lang.String f536a;
            java.lang.Object b;
            com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a c;

            private a() {
            }
        }

        private com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a addHolder() {
            com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a aVar = new com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a();
            this.holderTail.c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
            return addHolder(str, obj);
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
            return addHolder(obj);
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public java.lang.String toString() {
            boolean z = this.omitNullValues;
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder(32).append(this.className).append('{');
            java.lang.String str = "";
            for (com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a aVar = this.holderHead.c; aVar != null; aVar = aVar.c) {
                java.lang.Object obj = aVar.b;
                if (!z || obj != null) {
                    sbAppend.append(str);
                    java.lang.String str2 = aVar.f536a;
                    if (str2 != null) {
                        sbAppend.append(str2).append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sbAppend.append(obj);
                    } else {
                        java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                        sbAppend.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            return sbAppend.append('}').toString();
        }

        private ToStringHelper(java.lang.String str) {
            com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a aVar = new com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (java.lang.String) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(str);
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, boolean z) {
            return addHolder(str, java.lang.String.valueOf(z));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(boolean z) {
            return addHolder(java.lang.String.valueOf(z));
        }

        private com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addHolder(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
            addHolder().b = obj;
            return this;
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, char c) {
            return addHolder(str, java.lang.String.valueOf(c));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(char c) {
            return addHolder(java.lang.String.valueOf(c));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, double d) {
            return addHolder(str, java.lang.String.valueOf(d));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(double d) {
            return addHolder(java.lang.String.valueOf(d));
        }

        private com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addHolder(java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
            com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper.a aVarAddHolder = addHolder();
            aVarAddHolder.b = obj;
            aVarAddHolder.f536a = (java.lang.String) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(str);
            return this;
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, float f) {
            return addHolder(str, java.lang.String.valueOf(f));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(float f) {
            return addHolder(java.lang.String.valueOf(f));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, int i) {
            return addHolder(str, java.lang.String.valueOf(i));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(int i) {
            return addHolder(java.lang.String.valueOf(i));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper add(java.lang.String str, long j) {
            return addHolder(str, java.lang.String.valueOf(j));
        }

        public com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper addValue(long j) {
            return addHolder(java.lang.String.valueOf(j));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new java.lang.NullPointerException("Both parameters are null");
    }

    public static com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper(obj.getClass().getSimpleName());
    }

    public static com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Class<?> cls) {
        return new com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper(cls.getSimpleName());
    }

    public static com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.String str) {
        return new com.applovin.exoplayer2.common.base.MoreObjects.ToStringHelper(str);
    }
}
