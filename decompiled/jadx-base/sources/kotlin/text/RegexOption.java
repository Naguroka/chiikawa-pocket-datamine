package kotlin.text;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IGNORE_CASE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "value", "", "mask", "(Ljava/lang/String;III)V", "getMask", "()I", "getValue", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RegexOption implements kotlin.text.FlagEnum {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.text.RegexOption[] $VALUES;
    public static final kotlin.text.RegexOption CANON_EQ;
    public static final kotlin.text.RegexOption COMMENTS;
    public static final kotlin.text.RegexOption DOT_MATCHES_ALL;
    public static final kotlin.text.RegexOption IGNORE_CASE;
    public static final kotlin.text.RegexOption LITERAL;
    public static final kotlin.text.RegexOption MULTILINE;
    public static final kotlin.text.RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ kotlin.text.RegexOption[] $values() {
        return new kotlin.text.RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static kotlin.enums.EnumEntries<kotlin.text.RegexOption> getEntries() {
        return $ENTRIES;
    }

    public static kotlin.text.RegexOption valueOf(java.lang.String str) {
        return (kotlin.text.RegexOption) java.lang.Enum.valueOf(kotlin.text.RegexOption.class, str);
    }

    public static kotlin.text.RegexOption[] values() {
        return (kotlin.text.RegexOption[]) $VALUES.clone();
    }

    private RegexOption(java.lang.String str, int i, int i2, int i3) {
        super(str, i);
        this.value = i2;
        this.mask = i3;
    }

    /* synthetic */ RegexOption(java.lang.String str, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    @Override // kotlin.text.FlagEnum
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.FlagEnum
    public int getValue() {
        return this.value;
    }

    static {
        int i = 2;
        IGNORE_CASE = new kotlin.text.RegexOption("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 0;
        int i3 = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        MULTILINE = new kotlin.text.RegexOption("MULTILINE", 1, 8, i2, i3, defaultConstructorMarker);
        int i4 = 0;
        int i5 = 2;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
        LITERAL = new kotlin.text.RegexOption("LITERAL", i, 16, i4, i5, defaultConstructorMarker2);
        UNIX_LINES = new kotlin.text.RegexOption("UNIX_LINES", 3, 1, i2, i3, defaultConstructorMarker);
        COMMENTS = new kotlin.text.RegexOption("COMMENTS", 4, 4, i4, i5, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new kotlin.text.RegexOption("DOT_MATCHES_ALL", 5, 32, i2, i3, defaultConstructorMarker);
        CANON_EQ = new kotlin.text.RegexOption("CANON_EQ", 6, 128, i4, i5, defaultConstructorMarker2);
        kotlin.text.RegexOption[] regexOptionArr$values = $values();
        $VALUES = regexOptionArr$values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(regexOptionArr$values);
    }
}
