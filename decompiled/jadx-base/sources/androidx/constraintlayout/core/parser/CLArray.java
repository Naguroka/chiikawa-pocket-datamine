package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLArray extends androidx.constraintlayout.core.parser.CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getDebugName() + com.ironsource.y8.i.d);
        boolean z = true;
        for (int i = 0; i < this.mElements.size(); i++) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i).toJSON());
        }
        return ((java.lang.Object) sb) + com.ironsource.y8.i.e;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String json = toJSON();
        if (i2 <= 0 && json.length() + i < MAX_LINE) {
            sb.append(json);
        } else {
            sb.append("[\n");
            boolean z = true;
            for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
                if (z) {
                    z = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, BASE_INDENT + i);
                sb.append(cLElement.toFormattedJSON(BASE_INDENT + i, i2 - 1));
            }
            sb.append("\n");
            addIndent(sb, i);
            sb.append(com.ironsource.y8.i.e);
        }
        return sb.toString();
    }
}
