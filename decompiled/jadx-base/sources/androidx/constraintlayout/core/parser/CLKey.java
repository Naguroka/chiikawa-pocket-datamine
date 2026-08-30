package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLKey extends androidx.constraintlayout.core.parser.CLContainer {
    private static java.util.ArrayList<java.lang.String> sections;

    static {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        sections = arrayList;
        arrayList.add("ConstraintSets");
        sections.add("Variables");
        sections.add("Generate");
        sections.add(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.NAME);
        sections.add("KeyFrames");
        sections.add(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.NAME);
        sections.add("KeyPositions");
        sections.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLKey(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) {
        androidx.constraintlayout.core.parser.CLKey cLKey = new androidx.constraintlayout.core.parser.CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }

    public java.lang.String getName() {
        return content();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        if (this.mElements.size() > 0) {
            return getDebugName() + content() + ": " + this.mElements.get(0).toJSON();
        }
        return getDebugName() + content() + ": <> ";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getDebugName());
        addIndent(sb, i);
        java.lang.String strContent = content();
        if (this.mElements.size() > 0) {
            sb.append(strContent);
            sb.append(": ");
            if (sections.contains(strContent)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(this.mElements.get(0).toFormattedJSON(i, i2 - 1));
            } else {
                java.lang.String json = this.mElements.get(0).toJSON();
                if (json.length() + i < MAX_LINE) {
                    sb.append(json);
                } else {
                    sb.append(this.mElements.get(0).toFormattedJSON(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        return strContent + ": <> ";
    }

    public void set(androidx.constraintlayout.core.parser.CLElement cLElement) {
        if (this.mElements.size() > 0) {
            this.mElements.set(0, cLElement);
        } else {
            this.mElements.add(cLElement);
        }
    }

    public androidx.constraintlayout.core.parser.CLElement getValue() {
        if (this.mElements.size() > 0) {
            return this.mElements.get(0);
        }
        return null;
    }
}
