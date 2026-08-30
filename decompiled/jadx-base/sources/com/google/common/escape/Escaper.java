package com.google.common.escape;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@com.google.common.escape.ElementTypesAreNonnullByDefault
public abstract class Escaper {
    private final com.google.common.base.Function<java.lang.String, java.lang.String> asFunction = new com.google.common.base.Function() { // from class: com.google.common.escape.Escaper$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return this.f$0.escape((java.lang.String) obj);
        }
    };

    public abstract java.lang.String escape(java.lang.String string);

    protected Escaper() {
    }

    public final com.google.common.base.Function<java.lang.String, java.lang.String> asFunction() {
        return this.asFunction;
    }
}
