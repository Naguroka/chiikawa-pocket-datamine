package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLNumber extends androidx.constraintlayout.core.parser.CLElement {
    float value;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.value = Float.NaN;
    }

    public CLNumber(float f) {
        super(null);
        this.value = f;
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        float f = getFloat();
        int i = (int) f;
        if (i == f) {
            return "" + i;
        }
        return "" + f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        addIndent(sb, i);
        float f = getFloat();
        int i3 = (int) f;
        if (i3 == f) {
            sb.append(i3);
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    public boolean isInt() {
        float f = getFloat();
        return ((float) ((int) f)) == f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (java.lang.Float.isNaN(this.value)) {
            this.value = java.lang.Integer.parseInt(content());
        }
        return (int) this.value;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (java.lang.Float.isNaN(this.value)) {
            this.value = java.lang.Float.parseFloat(content());
        }
        return this.value;
    }

    public void putValue(float f) {
        this.value = f;
    }
}
