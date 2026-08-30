package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLObject extends androidx.constraintlayout.core.parser.CLContainer implements java.lang.Iterable<androidx.constraintlayout.core.parser.CLKey> {
    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLObject allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLObject(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toJSON() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getDebugName() + "{ ");
        boolean z = true;
        for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(cLElement.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    public java.lang.String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getDebugName());
        sb.append("{\n");
        boolean z = true;
        for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(cLElement.toFormattedJSON(BASE_INDENT + i, i2 - 1));
        }
        sb.append("\n");
        addIndent(sb, i);
        sb.append("}");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<androidx.constraintlayout.core.parser.CLKey> iterator() {
        return new androidx.constraintlayout.core.parser.CLObject.CLObjectIterator(this);
    }

    private class CLObjectIterator implements java.util.Iterator {
        int index = 0;
        androidx.constraintlayout.core.parser.CLObject myObject;

        public CLObjectIterator(androidx.constraintlayout.core.parser.CLObject cLObject) {
            this.myObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.myObject.size();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) this.myObject.mElements.get(this.index);
            this.index++;
            return cLKey;
        }
    }
}
