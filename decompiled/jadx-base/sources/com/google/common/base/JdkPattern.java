package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
final class JdkPattern extends com.google.common.base.CommonPattern implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.regex.Pattern pattern;

    JdkPattern(java.util.regex.Pattern pattern) {
        this.pattern = (java.util.regex.Pattern) com.google.common.base.Preconditions.checkNotNull(pattern);
    }

    @Override // com.google.common.base.CommonPattern
    public com.google.common.base.CommonMatcher matcher(java.lang.CharSequence t) {
        return new com.google.common.base.JdkPattern.JdkMatcher(this.pattern.matcher(t));
    }

    @Override // com.google.common.base.CommonPattern
    public java.lang.String pattern() {
        return this.pattern.pattern();
    }

    @Override // com.google.common.base.CommonPattern
    public int flags() {
        return this.pattern.flags();
    }

    @Override // com.google.common.base.CommonPattern
    public java.lang.String toString() {
        return this.pattern.toString();
    }

    private static final class JdkMatcher extends com.google.common.base.CommonMatcher {
        final java.util.regex.Matcher matcher;

        JdkMatcher(java.util.regex.Matcher matcher) {
            this.matcher = (java.util.regex.Matcher) com.google.common.base.Preconditions.checkNotNull(matcher);
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean matches() {
            return this.matcher.matches();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find() {
            return this.matcher.find();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find(int index) {
            return this.matcher.find(index);
        }

        @Override // com.google.common.base.CommonMatcher
        public java.lang.String replaceAll(java.lang.String replacement) {
            return this.matcher.replaceAll(replacement);
        }

        @Override // com.google.common.base.CommonMatcher
        public int end() {
            return this.matcher.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public int start() {
            return this.matcher.start();
        }
    }
}
