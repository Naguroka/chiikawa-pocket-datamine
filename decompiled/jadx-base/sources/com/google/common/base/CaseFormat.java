package com.google.common.base;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class CaseFormat {
    public static final com.google.common.base.CaseFormat LOWER_CAMEL;
    public static final com.google.common.base.CaseFormat LOWER_UNDERSCORE;
    public static final com.google.common.base.CaseFormat UPPER_CAMEL;
    public static final com.google.common.base.CaseFormat UPPER_UNDERSCORE;
    private final com.google.common.base.CharMatcher wordBoundary;
    private final java.lang.String wordSeparator;
    public static final com.google.common.base.CaseFormat LOWER_HYPHEN = new com.google.common.base.CaseFormat("LOWER_HYPHEN", 0, com.google.common.base.CharMatcher.is(org.objectweb.asm.signature.SignatureVisitor.SUPER), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        java.lang.String normalizeWord(java.lang.String word) {
            return com.google.common.base.Ascii.toLowerCase(word);
        }

        @Override // com.google.common.base.CaseFormat
        java.lang.String convert(com.google.common.base.CaseFormat format, java.lang.String s) {
            if (format == LOWER_UNDERSCORE) {
                return s.replace(org.objectweb.asm.signature.SignatureVisitor.SUPER, '_');
            }
            if (format == UPPER_UNDERSCORE) {
                return com.google.common.base.Ascii.toUpperCase(s.replace(org.objectweb.asm.signature.SignatureVisitor.SUPER, '_'));
            }
            return super.convert(format, s);
        }
    };
    private static final /* synthetic */ com.google.common.base.CaseFormat[] $VALUES = $values();

    abstract java.lang.String normalizeWord(java.lang.String word);

    private static /* synthetic */ com.google.common.base.CaseFormat[] $values() {
        return new com.google.common.base.CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    public static com.google.common.base.CaseFormat valueOf(java.lang.String name) {
        return (com.google.common.base.CaseFormat) java.lang.Enum.valueOf(com.google.common.base.CaseFormat.class, name);
    }

    public static com.google.common.base.CaseFormat[] values() {
        return (com.google.common.base.CaseFormat[]) $VALUES.clone();
    }

    static {
        java.lang.String str = "_";
        LOWER_UNDERSCORE = new com.google.common.base.CaseFormat("LOWER_UNDERSCORE", 1, com.google.common.base.CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            java.lang.String normalizeWord(java.lang.String word) {
                return com.google.common.base.Ascii.toLowerCase(word);
            }

            @Override // com.google.common.base.CaseFormat
            java.lang.String convert(com.google.common.base.CaseFormat format, java.lang.String s) {
                if (format == LOWER_HYPHEN) {
                    return s.replace('_', org.objectweb.asm.signature.SignatureVisitor.SUPER);
                }
                if (format == UPPER_UNDERSCORE) {
                    return com.google.common.base.Ascii.toUpperCase(s);
                }
                return super.convert(format, s);
            }
        };
        java.lang.String str2 = "";
        LOWER_CAMEL = new com.google.common.base.CaseFormat("LOWER_CAMEL", 2, com.google.common.base.CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            java.lang.String normalizeWord(java.lang.String word) {
                return com.google.common.base.CaseFormat.firstCharOnlyToUpper(word);
            }

            @Override // com.google.common.base.CaseFormat
            java.lang.String normalizeFirstWord(java.lang.String word) {
                return com.google.common.base.Ascii.toLowerCase(word);
            }
        };
        UPPER_CAMEL = new com.google.common.base.CaseFormat("UPPER_CAMEL", 3, com.google.common.base.CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            java.lang.String normalizeWord(java.lang.String word) {
                return com.google.common.base.CaseFormat.firstCharOnlyToUpper(word);
            }
        };
        UPPER_UNDERSCORE = new com.google.common.base.CaseFormat("UPPER_UNDERSCORE", 4, com.google.common.base.CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            java.lang.String normalizeWord(java.lang.String word) {
                return com.google.common.base.Ascii.toUpperCase(word);
            }

            @Override // com.google.common.base.CaseFormat
            java.lang.String convert(com.google.common.base.CaseFormat format, java.lang.String s) {
                if (format == LOWER_HYPHEN) {
                    return com.google.common.base.Ascii.toLowerCase(s.replace('_', org.objectweb.asm.signature.SignatureVisitor.SUPER));
                }
                if (format == LOWER_UNDERSCORE) {
                    return com.google.common.base.Ascii.toLowerCase(s);
                }
                return super.convert(format, s);
            }
        };
    }

    private CaseFormat(java.lang.String $enum$name, int $enum$ordinal, com.google.common.base.CharMatcher wordBoundary, java.lang.String wordSeparator) {
        super($enum$name, $enum$ordinal);
        this.wordBoundary = wordBoundary;
        this.wordSeparator = wordSeparator;
    }

    public final java.lang.String to(com.google.common.base.CaseFormat format, java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(format);
        com.google.common.base.Preconditions.checkNotNull(str);
        return format == this ? str : convert(format, str);
    }

    java.lang.String convert(com.google.common.base.CaseFormat format, java.lang.String s) {
        java.lang.StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.wordBoundary.indexIn(s, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new java.lang.StringBuilder(s.length() + (format.wordSeparator.length() * 4));
                sb.append(format.normalizeFirstWord(s.substring(length, iIndexIn)));
            } else {
                ((java.lang.StringBuilder) java.util.Objects.requireNonNull(sb)).append(format.normalizeWord(s.substring(length, iIndexIn)));
            }
            sb.append(format.wordSeparator);
            length = this.wordSeparator.length() + iIndexIn;
        }
        if (length == 0) {
            return format.normalizeFirstWord(s);
        }
        return ((java.lang.StringBuilder) java.util.Objects.requireNonNull(sb)).append(format.normalizeWord(s.substring(length))).toString();
    }

    public com.google.common.base.Converter<java.lang.String, java.lang.String> converterTo(com.google.common.base.CaseFormat targetFormat) {
        return new com.google.common.base.CaseFormat.StringConverter(this, targetFormat);
    }

    private static final class StringConverter extends com.google.common.base.Converter<java.lang.String, java.lang.String> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.CaseFormat sourceFormat;
        private final com.google.common.base.CaseFormat targetFormat;

        StringConverter(com.google.common.base.CaseFormat sourceFormat, com.google.common.base.CaseFormat targetFormat) {
            this.sourceFormat = (com.google.common.base.CaseFormat) com.google.common.base.Preconditions.checkNotNull(sourceFormat);
            this.targetFormat = (com.google.common.base.CaseFormat) com.google.common.base.Preconditions.checkNotNull(targetFormat);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doForward(java.lang.String s) {
            return this.sourceFormat.to(this.targetFormat, s);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public java.lang.String doBackward(java.lang.String s) {
            return this.targetFormat.to(this.sourceFormat, s);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof com.google.common.base.CaseFormat.StringConverter)) {
                return false;
            }
            com.google.common.base.CaseFormat.StringConverter stringConverter = (com.google.common.base.CaseFormat.StringConverter) object;
            return this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat);
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public java.lang.String toString() {
            return this.sourceFormat + ".converterTo(" + this.targetFormat + ")";
        }
    }

    java.lang.String normalizeFirstWord(java.lang.String word) {
        return normalizeWord(word);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String firstCharOnlyToUpper(java.lang.String word) {
        return word.isEmpty() ? word : com.google.common.base.Ascii.toUpperCase(word.charAt(0)) + com.google.common.base.Ascii.toLowerCase(word.substring(1));
    }
}
