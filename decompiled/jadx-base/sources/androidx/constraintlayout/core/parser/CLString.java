package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLString extends androidx.constraintlayout.core.parser.CLElement {
    public CLString(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLString(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        return "'" + content() + "'";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        addIndent(sb, i);
        sb.append("'");
        sb.append(content());
        sb.append("'");
        return sb.toString();
    }
}
