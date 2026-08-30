package javax.annotation;

/* JADX INFO: loaded from: classes6.dex */
@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.String.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface MatchesPattern {
    int flags() default 0;

    @javax.annotation.RegEx
    java.lang.String value();

    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.MatchesPattern> {
        @Override // javax.annotation.meta.TypeQualifierValidator
        public javax.annotation.meta.When forConstantValue(javax.annotation.MatchesPattern matchesPattern, java.lang.Object obj) {
            if (java.util.regex.Pattern.compile(matchesPattern.value(), matchesPattern.flags()).matcher((java.lang.String) obj).matches()) {
                return javax.annotation.meta.When.ALWAYS;
            }
            return javax.annotation.meta.When.NEVER;
        }
    }
}
