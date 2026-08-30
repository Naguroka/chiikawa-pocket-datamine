package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public interface Predicate<T> {
    boolean test(T t);

    default androidx.core.util.Predicate<T> and(final androidx.core.util.Predicate<? super T> predicate) {
        java.util.Objects.requireNonNull(predicate);
        return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.util.Predicate.lambda$and$0(this.f$0, predicate, obj);
            }
        };
    }

    static /* synthetic */ boolean lambda$and$0(androidx.core.util.Predicate _this, androidx.core.util.Predicate predicate, java.lang.Object obj) {
        return _this.test(obj) && predicate.test(obj);
    }

    static /* synthetic */ boolean lambda$negate$1(androidx.core.util.Predicate _this, java.lang.Object obj) {
        return !_this.test(obj);
    }

    default androidx.core.util.Predicate<T> negate() {
        return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda4
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.util.Predicate.lambda$negate$1(this.f$0, obj);
            }
        };
    }

    default androidx.core.util.Predicate<T> or(final androidx.core.util.Predicate<? super T> predicate) {
        java.util.Objects.requireNonNull(predicate);
        return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.util.Predicate.lambda$or$2(this.f$0, predicate, obj);
            }
        };
    }

    static /* synthetic */ boolean lambda$or$2(androidx.core.util.Predicate _this, androidx.core.util.Predicate predicate, java.lang.Object obj) {
        return _this.test(obj) || predicate.test(obj);
    }

    static <T> androidx.core.util.Predicate<T> isEqual(final java.lang.Object obj) {
        if (obj == null) {
            return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj2) {
                    return java.util.Objects.isNull(obj2);
                }
            };
        }
        return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    static <T> androidx.core.util.Predicate<T> not(androidx.core.util.Predicate<? super T> predicate) {
        java.util.Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
