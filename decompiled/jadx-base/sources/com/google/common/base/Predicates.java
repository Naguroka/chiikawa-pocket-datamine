package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Predicates {

    enum ObjectPredicate implements com.google.common.base.Predicate<java.lang.Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(@javax.annotation.CheckForNull java.lang.Object o) {
                return true;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(@javax.annotation.CheckForNull java.lang.Object o) {
                return false;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public boolean apply(@javax.annotation.CheckForNull java.lang.Object o) {
                return o == null;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public boolean apply(@javax.annotation.CheckForNull java.lang.Object o) {
                return o != null;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.notNull()";
            }
        };

        <T> com.google.common.base.Predicate<T> withNarrowedType() {
            return this;
        }
    }

    private Predicates() {
    }

    public static <T> com.google.common.base.Predicate<T> alwaysTrue() {
        return com.google.common.base.Predicates.ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> alwaysFalse() {
        return com.google.common.base.Predicates.ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> isNull() {
        return com.google.common.base.Predicates.ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> notNull() {
        return com.google.common.base.Predicates.ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> not(com.google.common.base.Predicate<T> predicate) {
        return new com.google.common.base.Predicates.NotPredicate(predicate);
    }

    public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> components) {
        return new com.google.common.base.Predicates.AndPredicate(defensiveCopy(components));
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>... components) {
        return new com.google.common.base.Predicates.AndPredicate(defensiveCopy(components));
    }

    public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T> first, com.google.common.base.Predicate<? super T> second) {
        return new com.google.common.base.Predicates.AndPredicate(asList((com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(first), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(second)));
    }

    public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> components) {
        return new com.google.common.base.Predicates.OrPredicate(defensiveCopy(components));
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>... components) {
        return new com.google.common.base.Predicates.OrPredicate(defensiveCopy(components));
    }

    public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T> first, com.google.common.base.Predicate<? super T> second) {
        return new com.google.common.base.Predicates.OrPredicate(asList((com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(first), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(second)));
    }

    public static <T> com.google.common.base.Predicate<T> equalTo(@com.google.common.base.ParametricNullness T target) {
        if (target == null) {
            return isNull();
        }
        return new com.google.common.base.Predicates.IsEqualToPredicate(target).withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> instanceOf(java.lang.Class<?> clazz) {
        return new com.google.common.base.Predicates.InstanceOfPredicate(clazz);
    }

    public static com.google.common.base.Predicate<java.lang.Class<?>> subtypeOf(java.lang.Class<?> clazz) {
        return new com.google.common.base.Predicates.SubtypeOfPredicate(clazz);
    }

    public static <T> com.google.common.base.Predicate<T> in(java.util.Collection<? extends T> target) {
        return new com.google.common.base.Predicates.InPredicate(target);
    }

    public static <A, B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B> predicate, com.google.common.base.Function<A, ? extends B> function) {
        return new com.google.common.base.Predicates.CompositionPredicate(predicate, function);
    }

    public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String pattern) {
        return new com.google.common.base.Predicates.ContainsPatternFromStringPredicate(pattern);
    }

    public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern pattern) {
        return new com.google.common.base.Predicates.ContainsPatternPredicate(new com.google.common.base.JdkPattern(pattern));
    }

    private static class NotPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Predicate<T> predicate;

        NotPredicate(com.google.common.base.Predicate<T> predicate) {
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T t) {
            return !this.predicate.apply(t);
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.NotPredicate) {
                return this.predicate.equals(((com.google.common.base.Predicates.NotPredicate) obj).predicate);
            }
            return false;
        }

        public java.lang.String toString() {
            return "Predicates.not(" + this.predicate + ")";
        }
    }

    private static class AndPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.List<? extends com.google.common.base.Predicate<? super T>> components;

        private AndPredicate(java.util.List<? extends com.google.common.base.Predicate<? super T>> components) {
            this.components = components;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!this.components.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.AndPredicate) {
                return this.components.equals(((com.google.common.base.Predicates.AndPredicate) obj).components);
            }
            return false;
        }

        public java.lang.String toString() {
            return com.google.common.base.Predicates.toStringHelper("and", this.components);
        }
    }

    private static class OrPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.List<? extends com.google.common.base.Predicate<? super T>> components;

        private OrPredicate(java.util.List<? extends com.google.common.base.Predicate<? super T>> components) {
            this.components = components;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (this.components.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.OrPredicate) {
                return this.components.equals(((com.google.common.base.Predicates.OrPredicate) obj).components);
            }
            return false;
        }

        public java.lang.String toString() {
            return com.google.common.base.Predicates.toStringHelper("or", this.components);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String toStringHelper(java.lang.String methodName, java.lang.Iterable<?> components) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Predicates.").append(methodName).append('(');
        boolean z = true;
        for (java.lang.Object obj : components) {
            if (!z) {
                sbAppend.append(',');
            }
            sbAppend.append(obj);
            z = false;
        }
        return sbAppend.append(')').toString();
    }

    private static class IsEqualToPredicate implements com.google.common.base.Predicate<java.lang.Object>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Object target;

        <T> com.google.common.base.Predicate<T> withNarrowedType() {
            return this;
        }

        private IsEqualToPredicate(java.lang.Object target) {
            this.target = target;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@javax.annotation.CheckForNull java.lang.Object o) {
            return this.target.equals(o);
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.IsEqualToPredicate) {
                return this.target.equals(((com.google.common.base.Predicates.IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public java.lang.String toString() {
            return "Predicates.equalTo(" + this.target + ")";
        }
    }

    private static class InstanceOfPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<?> clazz;

        private InstanceOfPredicate(java.lang.Class<?> clazz) {
            this.clazz = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(clazz);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T o) {
            return this.clazz.isInstance(o);
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            return (obj instanceof com.google.common.base.Predicates.InstanceOfPredicate) && this.clazz == ((com.google.common.base.Predicates.InstanceOfPredicate) obj).clazz;
        }

        public java.lang.String toString() {
            return "Predicates.instanceOf(" + this.clazz.getName() + ")";
        }
    }

    private static class SubtypeOfPredicate implements com.google.common.base.Predicate<java.lang.Class<?>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<?> clazz;

        private SubtypeOfPredicate(java.lang.Class<?> clazz) {
            this.clazz = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(clazz);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(java.lang.Class<?> input) {
            return this.clazz.isAssignableFrom(input);
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            return (obj instanceof com.google.common.base.Predicates.SubtypeOfPredicate) && this.clazz == ((com.google.common.base.Predicates.SubtypeOfPredicate) obj).clazz;
        }

        public java.lang.String toString() {
            return "Predicates.subtypeOf(" + this.clazz.getName() + ")";
        }
    }

    private static class InPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.Collection<?> target;

        private InPredicate(java.util.Collection<?> target) {
            this.target = (java.util.Collection) com.google.common.base.Preconditions.checkNotNull(target);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T t) {
            try {
                return this.target.contains(t);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.InPredicate) {
                return this.target.equals(((com.google.common.base.Predicates.InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public java.lang.String toString() {
            return "Predicates.in(" + this.target + ")";
        }
    }

    private static class CompositionPredicate<A, B> implements com.google.common.base.Predicate<A>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Function<A, ? extends B> f;
        final com.google.common.base.Predicate<B> p;

        private CompositionPredicate(com.google.common.base.Predicate<B> p, com.google.common.base.Function<A, ? extends B> f) {
            this.p = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(p);
            this.f = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(f);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness A a2) {
            return this.p.apply(this.f.apply(a2));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Predicates.CompositionPredicate)) {
                return false;
            }
            com.google.common.base.Predicates.CompositionPredicate compositionPredicate = (com.google.common.base.Predicates.CompositionPredicate) obj;
            return this.f.equals(compositionPredicate.f) && this.p.equals(compositionPredicate.p);
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.p.hashCode();
        }

        public java.lang.String toString() {
            return this.p + "(" + this.f + ")";
        }
    }

    private static class ContainsPatternPredicate implements com.google.common.base.Predicate<java.lang.CharSequence>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.CommonPattern pattern;

        ContainsPatternPredicate(com.google.common.base.CommonPattern pattern) {
            this.pattern = (com.google.common.base.CommonPattern) com.google.common.base.Preconditions.checkNotNull(pattern);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(java.lang.CharSequence t) {
            return this.pattern.matcher(t).find();
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.pattern.pattern(), java.lang.Integer.valueOf(this.pattern.flags()));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Predicates.ContainsPatternPredicate)) {
                return false;
            }
            com.google.common.base.Predicates.ContainsPatternPredicate containsPatternPredicate = (com.google.common.base.Predicates.ContainsPatternPredicate) obj;
            return com.google.common.base.Objects.equal(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags();
        }

        public java.lang.String toString() {
            return "Predicates.contains(" + com.google.common.base.MoreObjects.toStringHelper(this.pattern).add("pattern", this.pattern.pattern()).add("pattern.flags", this.pattern.flags()).toString() + ")";
        }
    }

    private static class ContainsPatternFromStringPredicate extends com.google.common.base.Predicates.ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        ContainsPatternFromStringPredicate(java.lang.String string) {
            super(com.google.common.base.Platform.compilePattern(string));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public java.lang.String toString() {
            return "Predicates.containsPattern(" + this.pattern.pattern() + ")";
        }
    }

    private static <T> java.util.List<com.google.common.base.Predicate<? super T>> asList(com.google.common.base.Predicate<? super T> first, com.google.common.base.Predicate<? super T> second) {
        return java.util.Arrays.asList(first, second);
    }

    private static <T> java.util.List<T> defensiveCopy(T... array) {
        return defensiveCopy(java.util.Arrays.asList(array));
    }

    static <T> java.util.List<T> defensiveCopy(java.lang.Iterable<T> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.common.base.Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }
}
