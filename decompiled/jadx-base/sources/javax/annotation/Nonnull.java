package javax.annotation;

/* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network.dex
  classes6.dex
 */
/* JADX INFO: loaded from: classes6.dex */
@javax.annotation.meta.TypeQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Nonnull {
    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;

    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnull> {
        @Override // javax.annotation.meta.TypeQualifierValidator
        public javax.annotation.meta.When forConstantValue(javax.annotation.Nonnull nonnull, java.lang.Object obj) {
            if (obj == null) {
                return javax.annotation.meta.When.NEVER;
            }
            return javax.annotation.meta.When.ALWAYS;
        }
    }
}
