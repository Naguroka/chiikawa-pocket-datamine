package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final com.google.common.collect.ComparisonChain ACTIVE = new com.google.common.collect.ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right) {
            return classify(left.compareTo(right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> com.google.common.collect.ComparisonChain compare(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right, java.util.Comparator<T> comparator) {
            return classify(comparator.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(int left, int right) {
            return classify(com.google.common.primitives.Ints.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(long left, long right) {
            return classify(com.google.common.primitives.Longs.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(float left, float right) {
            return classify(java.lang.Float.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(double left, double right) {
            return classify(java.lang.Double.compare(left, right));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareTrueFirst(boolean left, boolean right) {
            return classify(com.google.common.primitives.Booleans.compare(right, left));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareFalseFirst(boolean left, boolean right) {
            return classify(com.google.common.primitives.Booleans.compare(left, right));
        }

        com.google.common.collect.ComparisonChain classify(int result) {
            if (result < 0) {
                return com.google.common.collect.ComparisonChain.LESS;
            }
            return result > 0 ? com.google.common.collect.ComparisonChain.GREATER : com.google.common.collect.ComparisonChain.ACTIVE;
        }
    };
    private static final com.google.common.collect.ComparisonChain LESS = new com.google.common.collect.ComparisonChain.InactiveComparisonChain(-1);
    private static final com.google.common.collect.ComparisonChain GREATER = new com.google.common.collect.ComparisonChain.InactiveComparisonChain(1);

    public abstract com.google.common.collect.ComparisonChain compare(double left, double right);

    public abstract com.google.common.collect.ComparisonChain compare(float left, float right);

    public abstract com.google.common.collect.ComparisonChain compare(int left, int right);

    public abstract com.google.common.collect.ComparisonChain compare(long left, long right);

    public abstract com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right);

    public abstract <T> com.google.common.collect.ComparisonChain compare(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right, java.util.Comparator<T> comparator);

    public abstract com.google.common.collect.ComparisonChain compareFalseFirst(boolean left, boolean right);

    public abstract com.google.common.collect.ComparisonChain compareTrueFirst(boolean left, boolean right);

    public abstract int result();

    private ComparisonChain() {
    }

    public static com.google.common.collect.ComparisonChain start() {
        return ACTIVE;
    }

    private static final class InactiveComparisonChain extends com.google.common.collect.ComparisonChain {
        final int result;

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(double left, double right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(float left, float right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(int left, int right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(long left, long right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> left, java.lang.Comparable<?> right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> com.google.common.collect.ComparisonChain compare(@com.google.common.collect.ParametricNullness T left, @com.google.common.collect.ParametricNullness T right, java.util.Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareFalseFirst(boolean left, boolean right) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareTrueFirst(boolean left, boolean right) {
            return this;
        }

        InactiveComparisonChain(int result) {
            super();
            this.result = result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }
    }

    @java.lang.Deprecated
    public final com.google.common.collect.ComparisonChain compare(java.lang.Boolean left, java.lang.Boolean right) {
        return compareFalseFirst(left.booleanValue(), right.booleanValue());
    }
}
