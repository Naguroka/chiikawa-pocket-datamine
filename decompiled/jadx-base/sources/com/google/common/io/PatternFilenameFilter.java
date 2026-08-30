package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class PatternFilenameFilter implements java.io.FilenameFilter {
    private final java.util.regex.Pattern pattern;

    public PatternFilenameFilter(java.lang.String patternStr) {
        this(java.util.regex.Pattern.compile(patternStr));
    }

    public PatternFilenameFilter(java.util.regex.Pattern pattern) {
        this.pattern = (java.util.regex.Pattern) com.google.common.base.Preconditions.checkNotNull(pattern);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File dir, java.lang.String fileName) {
        return this.pattern.matcher(fileName).matches();
    }
}
