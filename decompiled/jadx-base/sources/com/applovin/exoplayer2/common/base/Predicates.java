package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Predicates {

    private static class b implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f538a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            for (int i = 0; i < this.f538a.size(); i++) {
                if (!((com.applovin.exoplayer2.common.base.Predicate) this.f538a.get(i)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.applovin.exoplayer2.common.base.Predicates.b) {
                return this.f538a.equals(((com.applovin.exoplayer2.common.base.Predicates.b) obj).f538a);
            }
            return false;
        }

        public int hashCode() {
            return this.f538a.hashCode() + 306654252;
        }

        public java.lang.String toString() {
            return com.applovin.exoplayer2.common.base.Predicates.toStringHelper("and", this.f538a);
        }

        private b(java.util.List list) {
            this.f538a = list;
        }
    }

    private static class c implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.Predicate f539a;
        final com.applovin.exoplayer2.common.base.Function b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            return this.f539a.apply(this.b.apply(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.applovin.exoplayer2.common.base.Predicates.c)) {
                return false;
            }
            com.applovin.exoplayer2.common.base.Predicates.c cVar = (com.applovin.exoplayer2.common.base.Predicates.c) obj;
            return this.b.equals(cVar.b) && this.f539a.equals(cVar.f539a);
        }

        public int hashCode() {
            return this.b.hashCode() ^ this.f539a.hashCode();
        }

        public java.lang.String toString() {
            return this.f539a + "(" + this.b + ")";
        }

        private c(com.applovin.exoplayer2.common.base.Predicate predicate, com.applovin.exoplayer2.common.base.Function function) {
            this.f539a = (com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate);
            this.b = (com.applovin.exoplayer2.common.base.Function) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(function);
        }
    }

    private static class d implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Collection f540a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            try {
                return this.f540a.contains(obj);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.applovin.exoplayer2.common.base.Predicates.d) {
                return this.f540a.equals(((com.applovin.exoplayer2.common.base.Predicates.d) obj).f540a);
            }
            return false;
        }

        public int hashCode() {
            return this.f540a.hashCode();
        }

        public java.lang.String toString() {
            return "Predicates.in(" + this.f540a + ")";
        }

        private d(java.util.Collection collection) {
            this.f540a = (java.util.Collection) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection);
        }
    }

    private static class e implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Class f541a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            return this.f541a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.applovin.exoplayer2.common.base.Predicates.e) && this.f541a == ((com.applovin.exoplayer2.common.base.Predicates.e) obj).f541a;
        }

        public int hashCode() {
            return this.f541a.hashCode();
        }

        public java.lang.String toString() {
            return "Predicates.instanceOf(" + this.f541a.getName() + ")";
        }

        private e(java.lang.Class cls) {
            this.f541a = (java.lang.Class) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(cls);
        }
    }

    private static class f implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f542a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            return this.f542a.equals(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.applovin.exoplayer2.common.base.Predicates.f) {
                return this.f542a.equals(((com.applovin.exoplayer2.common.base.Predicates.f) obj).f542a);
            }
            return false;
        }

        public int hashCode() {
            return this.f542a.hashCode();
        }

        public java.lang.String toString() {
            return "Predicates.equalTo(" + this.f542a + ")";
        }

        private f(java.lang.Object obj) {
            this.f542a = obj;
        }
    }

    private static class g implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.Predicate f543a;

        g(com.applovin.exoplayer2.common.base.Predicate predicate) {
            this.f543a = (com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            return !this.f543a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.applovin.exoplayer2.common.base.Predicates.g) {
                return this.f543a.equals(((com.applovin.exoplayer2.common.base.Predicates.g) obj).f543a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f543a.hashCode();
        }

        public java.lang.String toString() {
            return "Predicates.not(" + this.f543a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class h implements com.applovin.exoplayer2.common.base.Predicate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.applovin.exoplayer2.common.base.Predicates.h f544a = new com.applovin.exoplayer2.common.base.Predicates.h.a("ALWAYS_TRUE", 0);
        public static final com.applovin.exoplayer2.common.base.Predicates.h b = new com.applovin.exoplayer2.common.base.Predicates.h.b("ALWAYS_FALSE", 1);
        public static final com.applovin.exoplayer2.common.base.Predicates.h c = new com.applovin.exoplayer2.common.base.Predicates.h.c("IS_NULL", 2);
        public static final com.applovin.exoplayer2.common.base.Predicates.h d = new com.applovin.exoplayer2.common.base.Predicates.h.d("NOT_NULL", 3);
        private static final /* synthetic */ com.applovin.exoplayer2.common.base.Predicates.h[] f = a();

        final enum a extends com.applovin.exoplayer2.common.base.Predicates.h {
            a(java.lang.String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(java.lang.Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        final enum b extends com.applovin.exoplayer2.common.base.Predicates.h {
            b(java.lang.String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(java.lang.Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        final enum c extends com.applovin.exoplayer2.common.base.Predicates.h {
            c(java.lang.String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(java.lang.Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.isNull()";
            }
        }

        final enum d extends com.applovin.exoplayer2.common.base.Predicates.h {
            d(java.lang.String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(java.lang.Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "Predicates.notNull()";
            }
        }

        private h(java.lang.String str, int i) {
            super(str, i);
        }

        private static /* synthetic */ com.applovin.exoplayer2.common.base.Predicates.h[] a() {
            return new com.applovin.exoplayer2.common.base.Predicates.h[]{f544a, b, c, d};
        }

        public static com.applovin.exoplayer2.common.base.Predicates.h valueOf(java.lang.String str) {
            return (com.applovin.exoplayer2.common.base.Predicates.h) java.lang.Enum.valueOf(com.applovin.exoplayer2.common.base.Predicates.h.class, str);
        }

        public static com.applovin.exoplayer2.common.base.Predicates.h[] values() {
            return (com.applovin.exoplayer2.common.base.Predicates.h[]) f.clone();
        }

        com.applovin.exoplayer2.common.base.Predicate b() {
            return this;
        }
    }

    private static class i implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f545a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            for (int i = 0; i < this.f545a.size(); i++) {
                if (((com.applovin.exoplayer2.common.base.Predicate) this.f545a.get(i)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.applovin.exoplayer2.common.base.Predicates.i) {
                return this.f545a.equals(((com.applovin.exoplayer2.common.base.Predicates.i) obj).f545a);
            }
            return false;
        }

        public int hashCode() {
            return this.f545a.hashCode() + 87855567;
        }

        public java.lang.String toString() {
            return com.applovin.exoplayer2.common.base.Predicates.toStringHelper("or", this.f545a);
        }

        private i(java.util.List list) {
            this.f545a = list;
        }
    }

    private static class j implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Class f546a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.applovin.exoplayer2.common.base.Predicates.j) && this.f546a == ((com.applovin.exoplayer2.common.base.Predicates.j) obj).f546a;
        }

        public int hashCode() {
            return this.f546a.hashCode();
        }

        public java.lang.String toString() {
            return "Predicates.subtypeOf(" + this.f546a.getName() + ")";
        }

        private j(java.lang.Class cls) {
            this.f546a = (java.lang.Class) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Class cls) {
            return this.f546a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> alwaysFalse() {
        return com.applovin.exoplayer2.common.base.Predicates.h.b.b();
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> alwaysTrue() {
        return com.applovin.exoplayer2.common.base.Predicates.h.f544a.b();
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> and(java.lang.Iterable<? extends com.applovin.exoplayer2.common.base.Predicate<? super T>> iterable) {
        return new com.applovin.exoplayer2.common.base.Predicates.b(defensiveCopy(iterable));
    }

    private static <T> java.util.List<com.applovin.exoplayer2.common.base.Predicate<? super T>> asList(com.applovin.exoplayer2.common.base.Predicate<? super T> predicate, com.applovin.exoplayer2.common.base.Predicate<? super T> predicate2) {
        return java.util.Arrays.asList(predicate, predicate2);
    }

    public static <A, B> com.applovin.exoplayer2.common.base.Predicate<A> compose(com.applovin.exoplayer2.common.base.Predicate<B> predicate, com.applovin.exoplayer2.common.base.Function<A, ? extends B> function) {
        return new com.applovin.exoplayer2.common.base.Predicates.c(predicate, function);
    }

    private static <T> java.util.List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(java.util.Arrays.asList(tArr));
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> equalTo(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        return t == null ? isNull() : new com.applovin.exoplayer2.common.base.Predicates.f(t);
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> in(java.util.Collection<? extends T> collection) {
        return new com.applovin.exoplayer2.common.base.Predicates.d(collection);
    }

    public static com.applovin.exoplayer2.common.base.Predicate<java.lang.Object> instanceOf(java.lang.Class<?> cls) {
        return new com.applovin.exoplayer2.common.base.Predicates.e(cls);
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> isNull() {
        return com.applovin.exoplayer2.common.base.Predicates.h.c.b();
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> not(com.applovin.exoplayer2.common.base.Predicate<T> predicate) {
        return new com.applovin.exoplayer2.common.base.Predicates.g(predicate);
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> notNull() {
        return com.applovin.exoplayer2.common.base.Predicates.h.d.b();
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> or(java.lang.Iterable<? extends com.applovin.exoplayer2.common.base.Predicate<? super T>> iterable) {
        return new com.applovin.exoplayer2.common.base.Predicates.i(defensiveCopy(iterable));
    }

    public static com.applovin.exoplayer2.common.base.Predicate<java.lang.Class<?>> subtypeOf(java.lang.Class<?> cls) {
        return new com.applovin.exoplayer2.common.base.Predicates.j(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String toStringHelper(java.lang.String str, java.lang.Iterable<?> iterable) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Predicates.").append(str).append('(');
        boolean z = true;
        for (java.lang.Object obj : iterable) {
            if (!z) {
                sbAppend.append(',');
            }
            sbAppend.append(obj);
            z = false;
        }
        return sbAppend.append(')').toString();
    }

    @java.lang.SafeVarargs
    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> and(com.applovin.exoplayer2.common.base.Predicate<? super T>... predicateArr) {
        return new com.applovin.exoplayer2.common.base.Predicates.b(defensiveCopy(predicateArr));
    }

    static <T> java.util.List<T> defensiveCopy(java.lang.Iterable<T> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    @java.lang.SafeVarargs
    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> or(com.applovin.exoplayer2.common.base.Predicate<? super T>... predicateArr) {
        return new com.applovin.exoplayer2.common.base.Predicates.i(defensiveCopy(predicateArr));
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> and(com.applovin.exoplayer2.common.base.Predicate<? super T> predicate, com.applovin.exoplayer2.common.base.Predicate<? super T> predicate2) {
        return new com.applovin.exoplayer2.common.base.Predicates.b(asList((com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate), (com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate2)));
    }

    public static <T> com.applovin.exoplayer2.common.base.Predicate<T> or(com.applovin.exoplayer2.common.base.Predicate<? super T> predicate, com.applovin.exoplayer2.common.base.Predicate<? super T> predicate2) {
        return new com.applovin.exoplayer2.common.base.Predicates.i(asList((com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate), (com.applovin.exoplayer2.common.base.Predicate) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(predicate2)));
    }
}
