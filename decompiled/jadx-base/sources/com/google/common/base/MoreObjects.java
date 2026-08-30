package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class MoreObjects {
    public static <T> T firstNonNull(@javax.annotation.CheckForNull T first, @javax.annotation.CheckForNull T second) {
        if (first != null) {
            return first;
        }
        if (second != null) {
            return second;
        }
        throw new java.lang.NullPointerException("Both parameters are null");
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Object self) {
        return new com.google.common.base.MoreObjects.ToStringHelper(self.getClass().getSimpleName());
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Class<?> clazz) {
        return new com.google.common.base.MoreObjects.ToStringHelper(clazz.getSimpleName());
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.String className) {
        return new com.google.common.base.MoreObjects.ToStringHelper(className);
    }

    public static final class ToStringHelper {
        private final java.lang.String className;
        private final com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderHead;
        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        private ToStringHelper(java.lang.String className) {
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolder = new com.google.common.base.MoreObjects.ToStringHelper.ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.omitEmptyValues = false;
            this.className = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(className);
        }

        public com.google.common.base.MoreObjects.ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, @javax.annotation.CheckForNull java.lang.Object value) {
            return addHolder(name, value);
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, boolean value) {
            return addUnconditionalHolder(name, java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, char value) {
            return addUnconditionalHolder(name, java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, double value) {
            return addUnconditionalHolder(name, java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, float value) {
            return addUnconditionalHolder(name, java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, int value) {
            return addUnconditionalHolder(name, java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String name, long value) {
            return addUnconditionalHolder(name, java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(@javax.annotation.CheckForNull java.lang.Object value) {
            return addHolder(value);
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(boolean value) {
            return addUnconditionalHolder(java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(char value) {
            return addUnconditionalHolder(java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(double value) {
            return addUnconditionalHolder(java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(float value) {
            return addUnconditionalHolder(java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(int value) {
            return addUnconditionalHolder(java.lang.String.valueOf(value));
        }

        public com.google.common.base.MoreObjects.ToStringHelper addValue(long value) {
            return addUnconditionalHolder(java.lang.String.valueOf(value));
        }

        private static boolean isEmpty(java.lang.Object value) {
            if (value instanceof java.lang.CharSequence) {
                return ((java.lang.CharSequence) value).length() == 0;
            }
            if (value instanceof java.util.Collection) {
                return ((java.util.Collection) value).isEmpty();
            }
            if (value instanceof java.util.Map) {
                return ((java.util.Map) value).isEmpty();
            }
            if (value instanceof com.google.common.base.Optional) {
                return !((com.google.common.base.Optional) value).isPresent();
            }
            return value.getClass().isArray() && java.lang.reflect.Array.getLength(value) == 0;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0032  */
        /* JADX WARN: Code duplicated, block: B:14:0x0039  */
        /* JADX WARN: Code duplicated, block: B:16:0x0046  */
        /* JADX WARN: Code duplicated, block: B:19:0x0063  */
        public java.lang.String toString() {
            boolean z = this.omitNullValues;
            boolean z2 = this.omitEmptyValues;
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder(32).append(this.className).append('{');
            java.lang.String str = "";
            for (com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                java.lang.Object obj = valueHolder.value;
                if (valueHolder instanceof com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder) {
                    sbAppend.append(str);
                    if (valueHolder.name != null) {
                        sbAppend.append(valueHolder.name).append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                        sbAppend.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sbAppend.append(obj);
                    }
                    str = ", ";
                } else if (obj == null) {
                    if (!z) {
                        sbAppend.append(str);
                        if (valueHolder.name != null) {
                            sbAppend.append(valueHolder.name).append('=');
                        }
                        if (obj == null) {
                            sbAppend.append(obj);
                        } else {
                            sbAppend.append(obj);
                        }
                        str = ", ";
                    }
                } else if (!z2 || !isEmpty(obj)) {
                    sbAppend.append(str);
                    if (valueHolder.name != null) {
                        sbAppend.append(valueHolder.name).append('=');
                    }
                    if (obj == null) {
                        sbAppend.append(obj);
                    } else {
                        sbAppend.append(obj);
                    }
                    str = ", ";
                }
            }
            return sbAppend.append('}').toString();
        }

        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder addHolder() {
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolder = new com.google.common.base.MoreObjects.ToStringHelper.ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(@javax.annotation.CheckForNull java.lang.Object value) {
            addHolder().value = value;
            return this;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(java.lang.String name, @javax.annotation.CheckForNull java.lang.Object value) {
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolderAddHolder = addHolder();
            valueHolderAddHolder.value = value;
            valueHolderAddHolder.name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(name);
            return this;
        }

        private com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder addUnconditionalHolder() {
            com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder unconditionalValueHolder = new com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder();
            this.holderTail.next = unconditionalValueHolder;
            this.holderTail = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addUnconditionalHolder(java.lang.Object value) {
            addUnconditionalHolder().value = value;
            return this;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addUnconditionalHolder(java.lang.String name, java.lang.Object value) {
            com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder unconditionalValueHolderAddUnconditionalHolder = addUnconditionalHolder();
            unconditionalValueHolderAddUnconditionalHolder.value = value;
            unconditionalValueHolderAddUnconditionalHolder.name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(name);
            return this;
        }

        static class ValueHolder {

            @javax.annotation.CheckForNull
            java.lang.String name;

            @javax.annotation.CheckForNull
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder next;

            @javax.annotation.CheckForNull
            java.lang.Object value;

            ValueHolder() {
            }
        }

        private static final class UnconditionalValueHolder extends com.google.common.base.MoreObjects.ToStringHelper.ValueHolder {
            private UnconditionalValueHolder() {
            }
        }
    }

    private MoreObjects() {
    }
}
