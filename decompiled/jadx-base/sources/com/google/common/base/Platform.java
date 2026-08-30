package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
final class Platform {
    private static final com.google.common.base.PatternCompiler patternCompiler = loadPatternCompiler();

    static java.lang.String nullToEmpty(@javax.annotation.CheckForNull java.lang.String string) {
        return string == null ? "" : string;
    }

    private Platform() {
    }

    static com.google.common.base.CharMatcher precomputeCharMatcher(com.google.common.base.CharMatcher matcher) {
        return matcher.precomputedInternal();
    }

    static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getEnumIfPresent(java.lang.Class<T> enumClass, java.lang.String value) {
        java.lang.ref.WeakReference<? extends java.lang.Enum<?>> weakReference = com.google.common.base.Enums.getEnumConstants(enumClass).get(value);
        return weakReference == null ? com.google.common.base.Optional.absent() : com.google.common.base.Optional.of(enumClass.cast(weakReference.get()));
    }

    static java.lang.String formatCompact4Digits(double value) {
        return java.lang.String.format(java.util.Locale.ROOT, "%.4g", java.lang.Double.valueOf(value));
    }

    static boolean stringIsNullOrEmpty(@javax.annotation.CheckForNull java.lang.String string) {
        return string == null || string.isEmpty();
    }

    @javax.annotation.CheckForNull
    static java.lang.String emptyToNull(@javax.annotation.CheckForNull java.lang.String string) {
        if (stringIsNullOrEmpty(string)) {
            return null;
        }
        return string;
    }

    static com.google.common.base.CommonPattern compilePattern(java.lang.String pattern) {
        com.google.common.base.Preconditions.checkNotNull(pattern);
        return patternCompiler.compile(pattern);
    }

    static boolean patternCompilerIsPcreLike() {
        return patternCompiler.isPcreLike();
    }

    private static com.google.common.base.PatternCompiler loadPatternCompiler() {
        return new com.google.common.base.Platform.JdkPatternCompiler();
    }

    private static final class JdkPatternCompiler implements com.google.common.base.PatternCompiler {
        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
            return true;
        }

        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public com.google.common.base.CommonPattern compile(java.lang.String pattern) {
            return new com.google.common.base.JdkPattern(java.util.regex.Pattern.compile(pattern));
        }
    }
}
