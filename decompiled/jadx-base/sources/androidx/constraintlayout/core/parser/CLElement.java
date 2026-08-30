package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    private int line;
    protected androidx.constraintlayout.core.parser.CLContainer mContainer;
    private final char[] mContent;
    protected long start = -1;
    protected long end = Long.MAX_VALUE;

    protected java.lang.String toFormattedJSON(int i, int i2) {
        return "";
    }

    protected java.lang.String toJSON() {
        return "";
    }

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public boolean notStarted() {
        return this.start == -1;
    }

    public void setLine(int i) {
        this.line = i;
    }

    public int getLine() {
        return this.line;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public long getStart() {
        return this.start;
    }

    public long getEnd() {
        return this.end;
    }

    public void setEnd(long j) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j;
        if (androidx.constraintlayout.core.parser.CLParser.DEBUG) {
            java.lang.System.out.println("closing " + hashCode() + " -> " + this);
        }
        androidx.constraintlayout.core.parser.CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    protected void addIndent(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    public java.lang.String toString() {
        long j = this.start;
        long j2 = this.end;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
        }
        return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new java.lang.String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
    }

    protected java.lang.String getStrClass() {
        java.lang.String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    protected java.lang.String getDebugName() {
        return androidx.constraintlayout.core.parser.CLParser.DEBUG ? getStrClass() + " -> " : "";
    }

    public java.lang.String content() {
        java.lang.String str = new java.lang.String(this.mContent);
        long j = this.end;
        if (j != Long.MAX_VALUE) {
            long j2 = this.start;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.start;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public boolean isDone() {
        return this.end != Long.MAX_VALUE;
    }

    public void setContainer(androidx.constraintlayout.core.parser.CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public androidx.constraintlayout.core.parser.CLElement getContainer() {
        return this.mContainer;
    }

    public boolean isStarted() {
        return this.start > -1;
    }

    public int getInt() {
        if (this instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return ((androidx.constraintlayout.core.parser.CLNumber) this).getInt();
        }
        return 0;
    }

    public float getFloat() {
        if (this instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return ((androidx.constraintlayout.core.parser.CLNumber) this).getFloat();
        }
        return Float.NaN;
    }
}
